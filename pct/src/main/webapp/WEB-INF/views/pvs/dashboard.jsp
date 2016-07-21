<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<!-- widget grid -->
<section id="widget-grid" class="">

	<!-- row -->
	<div class="row">
		<article class="col-sm-12 col-md-12 col-lg-6">
			<!-- new widget -->
			<div class="jarviswidget jarviswidget-color-blueDark" id="wid-id-0" data-widget-editbutton="false" data-widget-colorbutton="false">
				<!-- widget options:
				usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">

				data-widget-colorbutton="false"
				data-widget-editbutton="false"
				data-widget-togglebutton="false"
				data-widget-deletebutton="false"
				data-widget-fullscreenbutton="false"
				data-widget-custombutton="false"
				data-widget-collapsed="true"
				data-widget-sortable="false"

				-->
				<header>
					<span class="widget-icon"> <i
						class="glyphicon glyphicon-stats txt-color-white"></i>
					</span>
					<h2>CPU</h2>
				</header>

				<!-- widget div-->
				<div class="no-padding">
					<div class="widget-body">
						<!-- content -->
						<div class="chart-container">
							<div id="cpuChart" class="chart"></div>
						</div>
						<!-- end content -->
					</div>

				</div>
				<!-- end widget div -->
			</div>
			<!-- end widget -->

		</article>

		<article class="col-sm-12 col-md-12 col-lg-6">
			<!-- new widget -->
			<div class="jarviswidget jarviswidget-color-blueDark" id="wid-id-1"	data-widget-editbutton="false" data-widget-colorbutton="false">
				<!-- widget options:
				usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">

				data-widget-colorbutton="false"
				data-widget-editbutton="false"
				data-widget-togglebutton="false"
				data-widget-deletebutton="false"
				data-widget-fullscreenbutton="false"
				data-widget-custombutton="false"
				data-widget-collapsed="true"
				data-widget-sortable="false"

				-->
				<header>
					<span class="widget-icon"> <i
						class="glyphicon glyphicon-stats txt-color-white"></i>
					</span>
					<h2>Memory</h2>

				</header>

				<!-- widget div-->
				<div class="no-padding">
					<div class="widget-body">
						<!-- content -->
						<div class="chart-container">
							<div id="memoryChart" class="chart"></div>
						</div>
						<!-- end content -->
					</div>

				</div>
				<!-- end widget div -->
			</div>
			<!-- end widget -->

		</article>
	</div>

	<!-- end row -->

	<!-- row -->
	<div class="row">
		<article class="col-sm-12">
			<!-- new widget -->
			<div class="jarviswidget" id="wid-id-2" data-widget-editbutton="false" data-widget-colorbutton="false">
				<!-- widget options:
				usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">

				data-widget-colorbutton="false"
				data-widget-editbutton="false"
				data-widget-togglebutton="false"
				data-widget-deletebutton="false"
				data-widget-fullscreenbutton="false"
				data-widget-custombutton="false"
				data-widget-collapsed="true"
				data-widget-sortable="false"

				-->
				<header>
					<span class="widget-icon"> <i
						class="glyphicon glyphicon-stats txt-color-darken"></i>
					</span>
					<h2>Process Status</h2>
				</header>

				<!-- widget div-->
				<div class="no-padding">
					<div class="widget-body">
						<!-- content -->
						<table id="treeGrid"></table>
						<!-- end content -->
					</div>

				</div>
				<!-- end widget div -->
			</div>
			<!-- end widget -->

		</article>
	</div>

	<!-- end row -->



</section>
<!-- end widget grid -->

<script type="text/javascript">
    /* DO NOT REMOVE : GLOBAL FUNCTIONS!
     *
     * pageSetUp(); WILL CALL THE FOLLOWING FUNCTIONS
     *
     * // activate tooltips
     * $("[rel=tooltip]").tooltip();
     *
     * // activate popovers
     * $("[rel=popover]").popover();
     *
     * // activate popovers with hover states
     * $("[rel=popover-hover]").popover({ trigger: "hover" });
     *
     * // activate inline charts
     * runAllCharts();
     *
     * // setup widgets
     * setup_widgets_desktop();
     *
     * // run form elements
     * runAllForms();
     *
     ********************************
     *
     * pageSetUp() is needed whenever you load a page.
     * It initializes and checks for all basic elements of the page
     * and makes rendering easier.
     *
     */

    pageSetUp();

    /*
     * PAGE RELATED SCRIPTS
     */

    // pagefunction
    var pagefunction = function() {

	run_jqgrid_function();
	run_cpu_chart();
	run_memory_chart();

	function run_jqgrid_function() {
	    console.log("===run_jqgrid_function==start");
	    //Tree Grid
	    $("#treeGrid").jqGrid({
		url : '<s:url value="/view/monitor/processStatus/polling"/>.json',
		mtype : 'GET',
		datatype : 'json',
		colNames : [ 'Process Name', 'Status', 'Collected Time', 'Last Execution Time' ],
		colModel : [ {
		    name : 'processName',
		    align : 'center',
		    sortable : false
		}, {
		    name : 'status',
		    align : 'center',
		    formatter : formatters["processColor"]
		}, {
		    name : 'dateTime',
		    align : 'center',
		    formatter : formatters['dateTimeString'],

		}, {
		    name : 'statusDt',
		    align : 'center',
		    formatter : formatters['dateTimeString']
		} ],
		sortname : 'id',
		gridview : true,
		treeGrid : true,
		loadonce : true,
		treeGridModel : 'adjacency',
		treedatatype : 'json',
		ExpandColumn : 'processName',
		ExpandColClick : true,
		treeIcons : {
		    plus : 'ui-icon-circle-plus',
		    minus : 'ui-icon-circle-minus',
		    leaf : 'ui-icon-minus'
		},
		autowidth : true,
		shrinktofit : true,
		height : 'auto',
		loadError : loadErrorCallback, // error handler; add/edit/delete errors
		loadComplete : loadCompleteCallback, // is called after loading all

	    });

	    $(window).bind('resize', function() {
		$('#treeGrid').setGridWidth($('#wid-id-2').width()); //Resized to new width as per window
	    });
	}

	function loadErrorCallback(xhr, st, err) {

	    if (xhr.responseJSON != null && xhr.responseJSON.localErrorMessage != null) {
		// #error-message is a <span> tag in the HTML page
		$("#error-message").html(xhr.responseJSON.localErrorMessage);
	    }
	}

	function loadCompleteCallback(data) {
	    console.log(data);
	    // clean the error message (#error-message is a <span> tag in the HTML page)
	    $("#error-message").html("");
	}

	function run_cpu_chart() {
	    $.ajax({
		//timeout : 5000,
		type : 'GET',
		url : '<s:url value="/view/monitor/sysResources/polling/cpu"/>.json',
		dataType : 'json',
		success : function(res) {

		    console.log("==cpu chart=\n" + JSON.stringify(res));

		    if ($("#cpuChart").length) {
			new Morris.Bar({
			    element : 'cpuChart',
			    axes : true,
			    grid : true,
			    data : res,
			    xkey : 'hostName',
			    ykeys : [ 'use', 'unuse' ],
			    labels : [ 'use', 'unuse' ],
			    stacked : true,
			    resize: true
			});

		    }

		},

		error : function(error) {

		    console.log("====startBtn error===>" + JSON.stringify(error));
		},

		complete : function(jqXHR, textStatus) {

		}
	    });

	}

	function run_memory_chart() {
	    $.ajax({
		//timeout : 5000,
		type : 'GET',
		url : '<s:url value="/view/monitor/sysResources/polling/memory"/>.json',
		dataType : 'json',
		success : function(res) {

		    console.log("==memory chart=\n" + JSON.stringify(res));

		    if ($("#memoryChart").length) {
			new Morris.Bar({
			    element : 'memoryChart',
			    axes : true,
			    grid : true,
			    data : res,
			    xkey : 'hostName',
			    ykeys : [ 'ratio', 'unusedratio' ],
			    labels : [ 'use', 'unuse' ],
			    stacked : true,
			    resize: true
			});

		    }

		},

		error : function(error) {

		    console.log("====startBtn error===>" + JSON.stringify(error));
		},

		complete : function(jqXHR, textStatus) {

		}
	    });

	}

    }

    // end pagefunction

    // destroy generated instances 
    // pagedestroy is called automatically before loading a new page
    // only usable in AJAX version!

    var pagedestroy = function() {

    }

    // end destroy

    // load all flot plugins
    // Load morris dependencies and run pagefunction
    loadScript("${BOOT_JS}/plugin/morris/raphael.min.js", function() {
	loadScript("${BOOT_JS}/plugin/morris/morris.min.js", pagefunction);
    });
</script>
