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
		<article class="col-sm-12 col-md-12 col-lg-6">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget jarviswidget-color-orange" id="wid-id-0" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">
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
					<span class="widget-icon"> <i class="fa fa-list"></i>
					</span>
					<h2>Object List</h2>
					<div class="widget-toolbar" role="menu">
						<div class="btn-group">
							<button class="btn btn-default btn-xs" type="button" id="btn-refresh-objlst">
								<i class="fa fa-refresh"></i>
							</button>
						</div>
					</div>
				</header>

				<!-- widget div-->
				<div>

					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->

					</div>
					<!-- end widget edit box -->

					<!-- widget content -->
					<div class="widget-body">

						<div class="widget-body-toolbar bg-color-white">
							<form class="form-inline" role="form">
								<div class="row">
									<div class="col-sm-12 col-md-12">

										<div class="form-group">
											<input type="text" class="form-control input-sm" id="object" placeholder="object name">
										</div>

									</div>

								</div>

							</form>

						</div>
						<div id="objectTree"></div>
					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
			<!-- end widget -->

		</article>
		<!-- WIDGET END -->

		<!-- NEW WIDGET START -->
		<article class="col-sm-12 col-md-12 col-lg-6">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-1" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">
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
					<span class="widget-icon"> <i class="fa fa-edit"></i>
					</span>
					<h2>Object Information</h2>
					<div class="widget-toolbar" role="menu">
						<div id="btn-group-objinfo" class="btn-group">
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-trash-objinfo" >
								<i class="fa fa-trash-o"></i>
							</button>
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-refresh-objinfo">
								<i class="fa fa-refresh"></i>
							</button>
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-plus-objinfo">
								<i class="fa fa-plus"></i>
							</button>
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-edit-objinfo">
								<i class="fa fa-edit"></i>
							</button>
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-save-objinfo">
								<i class="fa fa-save"></i>
							</button>
						</div>
					</div>
				</header>

				<!-- widget div-->
				<div>

					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->

					</div>
					<!-- end widget edit box -->

					<!-- widget content -->
					<div class="widget-body">
						<form class="form-horizontal" id="objectForm">
							<fieldset>
								<customTag:inputbox label="Security No" id="securityNo" disabled="disabled" />
								<customTag:selectbox label="Record Type" id="recordType" codeType="ObjectRecordType" disabled="disabled" required="required" />
								<customTag:selectbox label="Menu Type" id="menuType" codeType="MenuType" disabled="disabled" required="required" />
								<customTag:inputbox label="Object Name" id="description" disabled="disabled" />
								<customTag:inputbox label="Object Id" id="objectId" disabled="disabled" />
								<customTag:inputbox label="Parent Object Id" id="parentObjectId" disabled="disabled" />
								<customTag:inputbox label="Object Order" id="objectOrder" disabled="disabled" />
								<customTag:inputbox label="Detail Description" id="detailDescription" disabled="disabled" />
								<customTag:inputbox label="Icon Class" id="iconClass" disabled="disabled" />
								<customTag:inputbox label="Access Url" id="accessUrl" disabled="disabled" />
							</fieldset>
						</form>

					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
			<!-- end widget -->



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

	var MODE = {
		ADD: "ADD",
		UPDATE: "UPDATE",
		SELECT: "SELECT",
		NONE: ""
	}; //+버튼은 ADD, edit버튼은 UPDATE

	var objInfoCurrentMode = MODE.NONE;

	// PAGE RELATED SCRIPTS
	// pagefunction

	var pagefunction = function() {

		/* Object List button */
		$("#btn-refresh-objlst").click(function() {
			console.log("===btn-refresh-objlst==clicked");

			$('#objectTree').jstree('refresh');
		});

		var to = false;
		$('#object').keyup(function() {
			if (to) {
				clearTimeout(to);
			}
			to = setTimeout(function() {
				var v = $('#object').val();
				$('#objectTree').jstree(true).search(v);
			}, 250);
		});

		/* Object Information button */
		$("#btn-trash-objinfo").click(function() {
			console.log("===btn-trash-objinfo==clicked");
			if ($("#securityNo").val() == '') { return; }

			var urlString = "object";

			console.log("===securityNo====" + $("#securityNo").val());

			var data = {
				id: $("#securityNo").val()
			};

			$.ajax({
				type: 'DELETE',
				url: urlString + "?id=" + $("#securityNo").val(),
				//data: {id:$("#securityNo").val()},
				dataType: 'json',
				success: function(res) {
					console.log(res);
					if (res.resultCode == 'SUCCESS') {
						$.smallBox({
							title: res.resultMsg,
							content: "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
							color: "#296191",
							iconSmall: "fa fa-thumbs-up bounce animated",
							timeout: 4000
						});

						objInfoCurrentMode = MODE.NONE;
						$('#objectForm').find('input').attr('value', '');
						$("#recordType > option[value='']").attr("selected", "true");
						$("#menuType > option[value='']").attr("selected", "true");
						$('#objectForm').find('input,select').attr('disabled', 'disabled');
						$('#objectTree').jstree('refresh');

					} else {
						$.smallBox({
							title: "Execution failure",
							content: res.resultMsg,
							color: "#5384AF",
							timeout: 4000,
							icon: "fa fa-bell"
						});
					}

				},
				error: function(error) {
					MessageBox.error("500 Err : Server Error");
				}
			});

		});

		$("#btn-refresh-objinfo").click(function() {
			console.log("===btn-refresh-objinfo==clicked");

			var id = $("#securityNo").val();

			if (id == '') { return; }

			getObjectInfo(id);

		});

		$("#btn-plus-objinfo").click(function() {
			console.log("===btn-plus-objInfo==clicked");

			if ($("#securityNo").val() == '') { return; }

			var parentId = $("#securityNo").val();
			$('#objectForm').find('input,select').removeAttr('disabled');
			$('#securityNo').val('');
			$('#securityNo').attr('disabled', 'disabled');
			$('#objectForm').find('input,select').attr('value', '');
			$('#parentObjectId').attr('value', parentId);

			if (objInfoCurrentMode != MODE.ADD) {
				objInfoCurrentMode = MODE.ADD; //추가상태로 변경     
			}

			console.log("objInfoCurrentMode = " + objInfoCurrentMode);
		});

		$("#btn-edit-objinfo").click(function() {
			console.log("===btn-eidt-objInfo==clicked");

			if ($("#securityNo").val() == '') { return; }

			$('#objectForm').find('input,select').removeAttr('disabled');
			$('#securityNo').attr('disabled', 'disabled');

			if (objInfoCurrentMode != MODE.UPDATE) {
				objInfoCurrentMode = MODE.UPDATE; //편집상태로 변경               
			}

			console.log("objInfoCurrentMode = " + objInfoCurrentMode);
		});

		$("#btn-save-objinfo").click(function() {
			console.log("===btn-save-objInfo==clicked");

			var obj = {
				securityNo: $("#securityNo").val(),
				recordType: $("#recordType").val(),
				menuType: $("#menuType").val(),
				menuId: $("#objectId").val(),
				topMenuId: $("#parentObjectId").val(),
				menuOrd: $("#objectOrder").val(),
				description: $("#description").val(),
				descriptionMsg: $("#detailDescription").val(),
				iconClass: $("#iconClass").val(),
				accessUrl: $("#accessUrl").val()
			}

			if ((objInfoCurrentMode != MODE.ADD) && (objInfoCurrentMode != MODE.UPDATE)) {
				console.log("This mode is not allowed");
				return;
			}

			console.log("=====obj value\n" + JSON.stringify(obj));
			console.log("======================================");
			var urlString = "object/";

			if (objInfoCurrentMode == MODE.UPDATE) {
				$.ajax({
					type: 'PUT',
					url: urlString,
					contentType: "application/json",
					data: JSON.stringify(obj),
					dataType: 'json',
					success: function(res) {
						console.log(res);
						if (res.resultCode == 'SUCCESS') {
							$.smallBox({
								title: res.resultMsg,
								content: "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
								color: "#296191",
								iconSmall: "fa fa-thumbs-up bounce animated",
								timeout: 4000
							});

							objInfoCurrentMode = MODE.NONE;
							$('#objectForm').find('input,select').attr('disabled', 'disabled');
							$('#objectTree').jstree('refresh');

						} else {
							$.smallBox({
								title: "Execution failure",
								content: res.resultMsg,
								color: "#5384AF",
								timeout: 4000,
								icon: "fa fa-bell"
							});
						}

					},
					error: function(error) {
						MessageBox.error("500 Err : Server Error");
					}
				});

			}

			if (objInfoCurrentMode == MODE.ADD) {
				$.ajax({
					type: 'POST',
					url: urlString,
					contentType: "application/json",
					data: JSON.stringify(obj),
					dataType: 'json',
					success: function(res) {
						console.log(res);
						if (res.resultCode == 'FAIL') {
							$.smallBox({
								title: "Execution failure",
								content: res.resultMsg,
								color: "#5384AF",
								timeout: 4000,
								icon: "fa fa-bell"
							});

						} else {
							$.smallBox({
								title: "저장되었습니다.",
								content: "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
								color: "#296191",
								iconSmall: "fa fa-thumbs-up bounce animated",
								timeout: 4000
							});

							objInfoCurrentMode = MODE.NONE;
							$('#objectForm').find('input,select').attr('disabled', 'disabled');
							getObjectInfo(res);
							$('#objectTree').jstree('refresh');

						}

					},
					error: function(error) {
						MessageBox.error("500 Err : Server Error");
					}
				});
			}

			console.log("objInfoCurrentMode = " + objInfoCurrentMode);
		});

		$("#recordType").change(function(e) {
	    	var recordType = $(this).val();
	    	if(recordType == 'C'){
	    		$('#menuType').removeClass('required').attr('disabled', true).attr('required', 'required');
	    	}else {
	    		$('#menuType').addClass('required').attr('disabled', false).attr('required', '');
	    	}
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
					}
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
					getObjectInfo(id);

				} else {
					console.log("===not selected==")
				}
			});

		}

		//object정보가져오기
		function getObjectInfo(id) {

			objInfoCurrentMode = MODE.SELECT;

			$('#objectForm').find('input,select').attr('disabled', 'disabled');

			var urlString = "object/";

			$.ajax({
				type: 'GET',
				url: urlString + id,
				contentType: "application/json",
				dataType: 'json',
				success: function(res) {
					console.log(res);
					if (res.resultCode == 'FAIL') {
						$.smallBox({
							title: "Execution failure",
							content: res.resultMsg,
							color: "#5384AF",
							timeout: 4000,
							icon: "fa fa-bell"
						});

					} else {
						$("#securityNo").val(res.securityNo);
						$("#recordType > option[value='" + res.recordType + "']").attr("selected", "true");
						$("#menuType > option[value='" + res.menuType + "']").attr("selected", "true");
						$("#objectId").val(res.menuId);
						$("#parentObjectId").val(res.topMenuId);
						$("#objectOrder").val(res.menuOrd);
						$("#description").val(res.description);
						$("#detailDescription").val(res.descriptionMsg);
						$("#iconClass").val(res.iconClass);
						$("#accessUrl").val(res.accessUrl);
					}

				},
				error: function(error) {
					MessageBox.error("500 Err : Server Error");
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
