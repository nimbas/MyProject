<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<!-- widget grid -->
<section id="widget-grid" class="">
	<!-- row -->

	<div class="row">
		<!-- NEW WIDGET START -->
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<form class="form-horizontal">
					<div class="form-group" style="display: flex; align-items: center;">
						<label class="control-label col-xs-6 col-sm-3 col-sm-offset-5 col-md-3 col-md-offset-5 col-lg-3 col-lg-offset-5"><h5>
								<i class="fa fa-clock-o"></i> Refresh Time(seconds) :
							</h5></label>
						<div class="col-xs-6 col-sm-3 col-md-3 col-lg-3">
							<input id="ion-slider-1" type="text" name="range_1" value="">
						</div>
					</div>
				</form>
			</div>

			<table id="treeGrid"></table>

		</article>
		<!-- WIDGET END -->
	</div>
	<!-- end row -->
</section>
<!-- end widget grid -->

<script type="text/javascript">
	pageSetUp(); //Default Call function

	var pagefunction = function pagefunction() {

		//initial slider polling time setting
		var processPollingTime = 1000; // milliseconds.
		var processStatus_second = 10; // init interval_time(seconds)
		var processStatusInterval = setInterval(processFunc, processStatus_second * processPollingTime);
		console.log("[processStatus]==polling==start" + formatters.dateTime(new Date()));
		console.log("[processStatus]==initial polling time==" + processStatus_second * processPollingTime);

		var track = function(data) {
			delete data.input;
			delete data.slider;

			console.log("[processStatus]==now==" + data.from_value);

			if (data.from_value == 'Stop') {
				clearInterval(processStatusInterval);
				processStatusInterval = null;
				console.log("[processStatus]==polling==stop" + formatters.dateTime(new Date()));
				return;
			}

			clearInterval(processStatusInterval);

			var num = parseInt(data.from_value);
			var seconds = num < 50 ? (num == 1 ? 1 : Math.ceil(num * 0.1)) : Math.floor(num * 0.1);

			processStatusInterval = setInterval(processFunc, (num * processPollingTime));

			console.log("[processStatus]==after polling time==" + num * processPollingTime);

		};

		run_jqgrid_function();

		/*
		 * ION SLIDER
		 */
		loadScript("${BOOT_JS}/plugin/ion-slider/ion.rangeSlider.min.js", ion_slider);

		function ion_slider() {

			//* ion Range Sliders

			$("#ion-slider-1").ionRangeSlider({
				from: 5,
				postfix: " sec",
				grid: true,
				values: ['Stop', 1, 3, 5, 7, 10],
				keyboard: true,
				onChange: track
			});
		}

		function run_jqgrid_function() {
			console.log("===run_jqgrid_function==start");
			//Tree Grid
			$("#treeGrid").jqGrid({
				url: '<s:url value="/view/monitor/processStatus/polling"/>.json',
				mtype: 'GET',
				datatype: 'json',
				width: 'auto',
				colNames: ['Process Name', 'Status', 'Collected Time', 'Last Execution Time', 'Startup', 'Shutdown', 'operator'],
				colModel: [{
					name: 'processName',
					width: '15%',
					align: 'center',
					sortable: false
				}, {
					name: 'status',
					width: '10%',
					align: 'center',
					formatter: formatters["processColor"]
				}, {
					name: 'dateTime',
					width: '10%',
					align: 'center',
					formatter: formatters['dateTimeString'],

				}, {
					name: 'statusDt',
					width: '10%',
					align: 'center',
					formatter: formatters['dateTimeString']

				}, {
					name: 'startCmd',
					width: '10%',
					align: 'center'
				}, {
					name: 'stopCmd',
					width: '10%',
					align: 'center'
				}, {
					name: 'operatorId',
					width: '10%',
					align: 'center'
				}],
				sortname: 'id',
				gridview: true,
				treeGrid: true,
				loadonce: true,
				treeGridModel: 'adjacency',
				treedatatype: 'json',
				ExpandColumn: 'processName',
				ExpandColClick: true,
				treeIcons: {
					plus: 'ui-icon-circle-plus',
					minus: 'ui-icon-circle-minus',
					leaf: 'ui-icon-minus'
				},
				autowidth: true,
				shrinktofit: true,
				height: 'auto',
				caption: "Process Status",
				loadError: loadErrorCallback, // error handler; add/edit/delete errors
				loadComplete: loadCompleteCallback, // is called after loading all

			});

			$(window).bind('resize', function() {
				$('#treeGrid').setGridWidth($('#content').width()); //Resized to new width as per window
			});

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
				startBtnInGrid();
				stopBtnInGrid();
			}

			function startBtnInGrid() {
				console.log("==============startBtnInGrid==========");
				var rows = jQuery("#treeGrid").jqGrid('getDataIDs');

				for (var i = 0; i < rows.length; i++) {
					var rowdata = $("#treeGrid").getRowData(rows[i]);
					if (rowdata.startCmd != '') {
						jQuery("#treeGrid").setRowData(rows[i], {
							startCmd: '<a href="javascript:startBtn(\'' + rowdata.startCmd + '\');" class="btn btn-default btn-circle" title="start"><i class="glyphicon glyphicon-ok"></i></a>'
						});
					}
				}
			}

			function stopBtnInGrid() {
				console.log("==============stopBtnInGrid==========");
				var rows = jQuery("#treeGrid").jqGrid('getDataIDs');

				for (var i = 0; i < rows.length; i++) {
					var rowdata = $("#treeGrid").getRowData(rows[i]);
					if (rowdata.stopCmd != '') {
						jQuery("#treeGrid").setRowData(rows[i], {
							stopCmd: '<a href="javascript:stopBtn(\'' + rowdata.stopCmd + '\');" class="btn btn-default btn-circle" title="stop"><i class="glyphicon glyphicon-ok"></i></a>'
						});
					}
				}
			}

		}

	}

	function processFunc() {
		console.log("[processStatus]==polling==start" + formatters.dateTime(new Date()));
		$("#treeGrid").trigger('reloadGrid');
	}

	function startBtn(cmd) {
		console.log("==============startBtn==========:" + cmd);

		$("#widget-grid").loading();
		$.ajax({
			//timeout : 5000,
			type: 'GET',
			url: '<s:url value="/view/monitor/processStatus/processHandling"/>.json',
			data: {
				command: cmd
			},
			dataType: 'json',
			success: function(response) {

				if (response.resultCode == "SUCCESS") {
					$.smallBox({
						title: response.resultMsg,
						content: "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
						color: "#296191",
						iconSmall: "fa fa-thumbs-up bounce animated",
						timeout: 4000
					});
				} else {
					$.smallBox({
						title: "Execution failure",
						content: response.resultMsg,
						color: "#5384AF",
						timeout: 4000,
						icon: "fa fa-bell"
					});
				}
				pagefunction.processFunc();

			},

			error: function(error) {

				console.log("====startBtn error===>" + JSON.stringify(error));
			},

			complete: function(jqXHR, textStatus) {
				$("#widget-grid").complete();
			}

		});

		return false;

	}

	function stopBtn(cmd) {
		console.log("==============stopBtn==========:" + cmd);
		$.ajax({
			//timeout : 5000,
			type: 'GET',
			url: '<s:url value="/view/monitor/processStatus/processHandling"/>.json',
			data: {
				command: cmd
			},
			dataType: 'json',
			success: function(response) {

				if (response.resultCode == "SUCCESS") {
					$.smallBox({
						title: response.resultMsg,
						content: "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
						color: "#296191",
						iconSmall: "fa fa-thumbs-up bounce animated",
						timeout: 4000
					});
				} else {
					$.smallBox({
						title: "Execution failure",
						content: response.resultMsg,
						color: "#5384AF",
						timeout: 4000,
						icon: "fa fa-bell"
					});
				}
				pagefunction.processFunc();

			},
			error: function(error) {

				console.log("====startBtn error===>" + JSON.stringify(error));
			}
		});

	}

	pagefunction();
</script>
