<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<s:url value="/resources/bootstrap/js" var="BOOT_JS" scope="session" />
<link rel="stylesheet" type="text/css" media="screen" href="${BOOT_JS}/plugin/jstree/themes/default/style.min.css">
<!-- widget grid -->
<section id="widget-grid" class="">

	<!-- row -->
	<div class="row">

		<!-- NEW WIDGET START -->
		<article class="col-sm-12 col-md-12 col-lg-12">


				<!-- widget div-->
				<div>

					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->

					</div>
					<!-- end widget edit box -->

					<!-- widget content -->

					<form class="form-inline" role="form" id="objectSearchForm" name="objectSearchForm">
						<div class="row">
							<div class="col-sm-12 col-md-12">

								<div class="form-group">
									<input type="text" class="form-control input-sm" id="objectSearch" placeholder="object name" style="height:24px;">
								</div>
								<div class="btn-group">
									<button class="btn btn-default btn-xs" type="button" id="btn-refresh-objlst">
										<i class="fa fa-refresh" style="margin-botton:5px;"></i>
									</button>
								</div>

							</div>

						</div>

					</form>

					<div id="objectTree"></div>

				</div>

		</article>
		<!-- WIDGET END -->
	</div>

	<!-- end row -->

	<!-- row -->

	<div class="row"></div>

	<!-- end row -->

</section>
<!-- end widget grid -->


<script type="text/javascript">
	
	pageSetUp();
	var pagefunction = function() {

		/* Object List button */
		$("#btn-refresh-objlst").click(function() {
			console.log("===btn-refresh-objlst==clicked");

			$('#objectTree').jstree('refresh');
		});

		$('#objectSearchForm').submit(function(e) {
			e.preventDefault();
			var v = $('#objectSearch').val();
			$('#objectTree').jstree(true).search(v);
		});

				
		/* object Tree*/
		loadScript("${BOOT_JS}/plugin/jstree/jstree.min.js", run_objectTree);

		function run_objectTree() {
			console.log("===run_ObjectTree==")
			$.jstree.defaults.search.show_only_matches = true;
			console.log("show_only_matches=" + $.jstree.defaults.search.show_only_matches);
			// AJAX
			$('#objectTree').jstree({
				'core': {
					'data': {
						'url': 'objectTree',
						'dataType': 'json'
					},
					"multiple": false,
				},
				"plugins": ["search", "wholerow"]

			}).on('changed.jstree', function(e, data) {
				if (data && data.selected && data.selected.length) {

					$('.widget-toolbar button').removeClass('disabled');
					
					var i, j, r = [];
					for (i = 0, j = data.selected.length; i < j; i++) {
						r.push(data.instance.get_node(data.selected[i]).id);
					}
					console.log('Selected id: ' + r.join(', '));
					var id = r.join(', ');
					if('${param.callBack}' != '' && eval("window.${param.callBack}") != null){
						var funcName = eval("window.${param.callBack}");
						funcName(id);
						Dialog.close('#${param.dialogName}');
					}else{
						alert('${param.callBack} function is not defined!');
					}

				} else {
					console.log("===not selected==")
				}
			});
		}

	}

	// end pagefunction

	// destroy generated instances 
	// pagedestroy is called automatically before loading a new page
	// only usable in AJAX version!

	var pagedestroy = function() {

		/*
		Example below:

		$("#calednar").fullCalendar( 'destroy' );
		if (debugState){
			root.console.log("✔ Calendar destroyed");
		} 

		For common instances, such as Jarviswidgets, Google maps, and Datatables, are automatically destroyed through the app.js loadURL mechanic

		 */

		$("#objectTree").jstree('destroy');
		if (debugState) {
			root.console.log("✔ jstree  destroyed");
		}

	}

	// end destroy

	// run pagefunction on load

	pagefunction();
</script>
