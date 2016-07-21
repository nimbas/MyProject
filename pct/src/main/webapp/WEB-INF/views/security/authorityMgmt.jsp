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
		<article class="col-sm-12 col-md-12 col-lg-3">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget jarviswidget-color-orange" id="wid-id-0" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">

				<header>
					<span class="widget-icon"> <i class="fa fa-lg fa-list"></i>
					</span>
					<h2>Authority Group</h2>

				</header>

				<!-- widget div-->
				<div>

					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->

					</div>
					<!-- end widget edit box -->

					<!-- widget content -->
					<div>
						<form class="form-inline" role="form" id="groupSearchForm" name="groupSearchForm">
							<div class="form-group">
								<input type="text" class="form-control input-sm" id="groupSearch" placeholder="group name">
							</div>
						</form>
					</div>
					<div class="widget-body" style="max-height:700px;overflow: auto;">
						<div id="groupTree"></div>
					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
			<!-- end widget -->

		</article>
		<!-- WIDGET END -->

		<!-- NEW WIDGET START -->
		<article class="col-sm-12 col-md-12 col-lg-9">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-1" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">
	
				<header>
					<span class="widget-icon"> <i class="fa fa-edit"></i>
					</span>
					<h2>Authority Group Information</h2>
					<div class="widget-toolbar" role="menu">
						<div id="btn-group-profilelist" class="btn-group">
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-trash-group-org"><i class="fa fa-trash-o"></i></button>
							<button class="btn btn-default btn-xs" type="button" id="btn-plus-group-org"><i class="fa fa-plus"></i></button>
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-edit-group-org"><i class="fa fa-pencil"></i></button>
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-cancel-group-org"><i class="fa fa-chevron-down"></i></button>
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-save-group-org"><i class="fa fa-save"></i></button>
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
						<form class="form-horizontal" id="groupForm">
							<fieldset>
								<div class="row">
									<div class="col-sm-12 col-md-12 col-lg-6 ">
										<customTag:inputbox label="Group seq" id="groupSeq" disabled="disabled" />
									</div>
									<div class="col-sm-12 col-md-12 col-lg-6">
										<customTag:inputbox label="Group Name" id="groupName" disabled="disabled" />
									</div>

								</div>
								<div class="row">
									<div class="col-sm-12 col-md-12 col-lg-6">
										<customTag:selectbox label="Group Level" id="groupLevel" codeType="CosBizbrLvlDvCd" disabled="disabled" />
									</div>
									<div class="col-sm-12 col-md-12 col-lg-6">
										<customTag:inputbox label="description" id="description" disabled="disabled" />
										<div class="col-sm-12 col-md-12 col-lg-12"></div>
									</div>
								</div>
							</fieldset>
						</form>

					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
			<!-- end widget -->

			<div class="row">
				<div class="col-sm-12 col-md-12 col-lg-12">
					<!-- Widget ID (each widget will need unique ID)-->
					<div class="jarviswidget " id="wid-id-2" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
						data-widget-fullscreenbutton="false">
						<header>
							<span class="widget-icon"> <i class="fa fa-edit"></i>
							</span>
							<h2>Department & User</h2>
						</header>
						
						<div>

							<!-- widget edit box -->
							<div class="jarviswidget-editbox">
								<!-- This area used as dropdown edit box -->
		
							</div>
							<!-- end widget edit box -->
		
							<!-- widget content -->
							<div class="widget-body">
								<div class="col-sm-12 col-md-12 col-lg-12 ">
									
									<article class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
										<div>
											<form class="form-inline" id="deptSearchForm" name="deptSearchForm">
											<div class="form-group">
												<input type="text" class="form-control input-sm" id="deptTreeSearch" placeholder="Dept or User Name" style="height:24px;">
											</div>
											</form>
										</div>
										<div id="departmentTree" style="height:300px; overflow:auto;"></div>
									<br>
									
									</article>
									
									<div class="col-sm-12 col-md-12 col-md-1 col-lg-1 text-center">
										<div class="row">
											<button type="button" class="btn btn-default btn-md" id="appendUserLink">
												<span class="glyphicon glyphicon-chevron-right"></span>
											</button>
										</div>
										&nbsp;
										<div class="row">
											<button type="button" class="btn btn-default btn-md" id="removeUserLink">
												<span class="glyphicon glyphicon-chevron-left"></span>
											</button>
										</div>
									</div>
		
									<article class="col-xs-12 col-sm-12 col-md-5 col-lg-5">
										<table id="selectedUserListGrid"></table>
										<br>
									</article>
		
								</div>
							</div>
							<!-- end widget content -->
		
						</div>


					</div>
					<!-- end widget -->
				</div>
			</div>

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-2" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">

				<header>
					<span class="widget-icon"> <i class="fa fa-edit"></i>
					</span>
					<h2>Setting profiles of Authority Group</h2>
					
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
						<div class="col-sm-12 col-md-12 col-lg-12 ">
							
							<article class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
								<table id="allProfileGrid"></table>
								<div id="pagerOfallProfileGrid"></div>
							<br>
							</article>
							
							<div class="col-sm-12 col-md-12 col-md-1 col-lg-1 text-center">
								<div class="row">
									<button type="button" class="btn btn-default btn-md" id="appendProfileLink">
										<span class="glyphicon glyphicon-chevron-right"></span>
									</button>
								</div>
								&nbsp;
								<div class="row">
									<button type="button" class="btn btn-default btn-md" id="removeProfileLink">
										<span class="glyphicon glyphicon-chevron-left"></span>
									</button>
								</div>
							</div>

							<article class="col-xs-12 col-sm-12 col-md-5 col-lg-5">
								<table id="selectedProfileGrid"></table>
								<br>
							</article>

						</div>
					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
			<!-- end widget -->




			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-1" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">
				<header>
					<span class="widget-icon"> <i class="fa fa-edit"></i>
					</span>
					<h2 id="profileTitle">Profile Elements</h2>
					<div class="widget-toolbar" role="menu">
						<div class="btn-group" data-toggle="buttons">
							<label class="btn btn-default btn-xs"> <input type="radio" name="btn-trash-org" id="btn-trash-org"> <i class="fa fa-trash-o"></i>
							</label> <label class="btn btn-default btn-xs"> <input type="radio" name="btn-search-org" id="btn-search-org"> <i class="fa fa-search"></i>
							</label> <label class="btn btn-default btn-xs"> <input type="radio" name="btn-refresh-org" id="btn-refresh-org"> <i class="fa fa-refresh"></i>
							</label> <label class="btn btn-default btn-xs"> <input type="radio" name="btn-plus-org" id="btn-plus-org"> <i class="fa fa-plus"></i>
							</label> <label class="btn btn-default btn-xs"> <input type="radio" name="btn-edit-org" id="btn-edit-org"> <i class="fa fa-edit"></i>
							</label> <label class="btn btn-default btn-xs"> <input type="radio" name="btn-save-org" id="btn-save-org"> <i class="fa fa-save"></i>
							</label>
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
						<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
							<table id="selectedProfileElementGrid"></table>
							<div id="pagerOfselectedProfileElementGrid"></div>
						</article>
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

	pageSetUp();
	
	// PAGE RELATED SCRIPTS
	// pagefunction

	function viewProductOfChannel(channelId){
		Dialog.open({
			div : 'productOfChannelDlg', 
			url : '<s:url value="/profile/channel/product"/>?channelId=' + channelId,  
			title :'Products of channel', 
			width : 630, 
			height : 580
		}); 
	}

	var pagefunction = function() {
	
		var selDeptTree = [];
		
		CODE.sync('ProfileType', 'E0003'); //jqgrid에 쓰이는 코드그룹을 미리 가져옴.
		
		/* group Tree*/
		loadScript("${BOOT_JS}/plugin/jstree/jstree.min.js", function(){
			run_groupTree();
			run_authorityGrid();
		});
		
		function clickAuthorityGroupInfo(groupSeq){
			if(groupSeq == '' || groupSeq == null){
				groupSeq = '0';
			}
			$("#departmentTree").jstree("refresh" , "#100000");
			
			var filterMap = {'groupSeq': groupSeq};
			var postData = {'filterMaps': JSON.stringify(filterMap)};	
			
			jQuery("#selectedUserListGrid").jqGrid('setGridParam',{url:'group/user/'+ groupSeq, postData : postData});
			jQuery("#selectedUserListGrid").trigger('reloadGrid');
			
			jQuery("#allProfileGrid").jqGrid('setGridParam',{url:'group/profile_'+ groupSeq +'/available', postData : postData});
			jQuery("#allProfileGrid").trigger('reloadGrid');
			
			jQuery("#selectedProfileGrid").jqGrid('setGridParam',{url:'group/profile_'+ groupSeq +'/selected', postData : postData});
			jQuery("#selectedProfileGrid").trigger('reloadGrid');
			
			jQuery("#selectedProfileElementGrid").jqGrid('setGridParam',{url:'group/profileElements/' + groupSeq, postData : postData});
			jQuery("#selectedProfileElementGrid").trigger('reloadGrid');
			selDeptTree = null ;
			if(groupSeq != '0'){
				$('#btn-trash-group-org').removeClass('disabled');
				$('#btn-edit-group-org').removeClass('disabled');	
			}
		}
		
		function run_groupTree() {
			
			console.log("===run_groupTree==")
			$.jstree.defaults.search.show_only_matches = true;
			console.log("show_only_matches=" + $.jstree.defaults.search.show_only_matches);
			// AJAX
			$('#groupTree').jstree({
				'core': {
					'data': {
						'url': 'groupTree',
						'dataType': 'json',
						'data' : function (node) {
							return { 'id' : node.id };
					    },
					},
					"multiple": false,
				},
				"plugins": ["search", "wholerow", "contextmenu"],
				"contextmenu" : {items: customGroupContextMenu},
			}).on('changed.jstree', function(e, data) {
				console.log("===click node ==")
				console.log(data);
				if (data && data.selected && data.selected.length) {
					var groupInfo = null ;
					var i, j, r = [];
					for (i = 0, j = data.selected.length; i < j; i++) {
						groupInfo = data.instance.get_node(data.selected[i]).original ;
						console.log('selected group : ' + JSON.stringify(groupInfo));
					}
					if(groupInfo.leapMode == 'D' && groupInfo.id != 'root'){
						$('#groupSeq').val(groupInfo.id);	
						$('#groupName').val(groupInfo.text);	
						$('#groupLevel').val(groupInfo.level);	
						$('#description').val(groupInfo.descr);	
						clickAuthorityGroupInfo(groupInfo.id);						
					}
				} else {
					console.log("===not selected==")
				}
			}).on("ready.jstree", function(e, data) {
			    $("#groupTree").jstree("open_node", "#root");
			});
			
			
			function customGroupContextMenu(group) {
				
				var tree = $("#groupTree").jstree(true);
				var groupInfo = group.original ;
				var items = null ;
				if(groupInfo.leapMode == 'D'){//GROUP
				    items = {
			    		refreshGroup: { 
				            label: "Refresh",
				            "separator_after": true,
				            "icon":"glyphicon glyphicon-refresh",
				            action: function (obj) {
				            	$("#groupTree").jstree("refresh_node", '#'+groupInfo.id);
				            	return { 'id' : groupInfo.id };
				            }
				        },
				        addGroup: { 
				            label: "Add Group",
				            "icon":"glyphicon glyphicon-plus-sign",
				            action: function (obj) {
				            	$('#btn-plus-group-org').trigger('click');
				            }
				        },
				        modifyGroup: {
				            label: "Modify Group",
				            "icon":"glyphicon glyphicon-pencil",
				            action: function (node) {
				            	var sel = tree.get_selected();
								if(!sel.length) { return false; }
								tree.edit(sel);
								$('#btn-edit-group-org').trigger('click');
				            }
				        },
				        deleteGroup: {
				            label: "Delete Group",
				            "icon":"glyphicon glyphicon-trash",
				            action: function (node) {
								var sel = tree.get_selected();
								if(!sel.length) { return false; }
								tree.delete_node(sel);
								removeAuthorityGroup(sel);
				            }
				        },
				    };
				
					if(groupInfo.id == 'root'){
						delete items['modifyGroup']; 
						delete items['deleteGroup']; 
					}
				}else{//USER
					items = {
					        deleteUser: { // The "rename" menu item
					            label: "Remove User",
					            action: function (node) {
					            		
				            		var groupSeq = groupInfo.parent;
				            		var userId = groupInfo.id.split('.')[1];//userId는 groupSeq_userId 형태임..
				            		var users = new Array();
				            		users.push({userId : userId});
				            		var data = {groupSeq : groupSeq, users : users};
				            		
				            		/* var sel = tree.get_selected();
				            		tree.delete_node(sel);
				            		$("#groupTree").jstree("delete_node", '#'+sel);
				            		return ; */
				    				console.log("sending data === "+JSON.stringify(data)); 
				    				$("#content").processing();
				    				$.ajax({
				    					type : 'DELETE',
				    					async : true,
				    					url : '<s:url value="/group/user/"/>' + groupSeq, 
				    					contentType: "application/json",
				    					dataType : 'json',
				    					data : JSON.stringify(data),
				    					success : function(data) { 
				    						if(data.resultCode == 'SUCCESS'){
				    							$("#groupTree").jstree("refresh_node", "#"+groupSeq);
			    								clickAuthorityGroupInfo(groupSeq);
				    							
				    						}else{
				    							MessageBox.error(data.resultMsg);
				    						}
				    					},	error:function(data){
				    						MessageBox.error(data, "<s:message code="err.500"/>");
				    					}, complete:function(jqXHR, textStatus){
				    						$("#content").complete();
				    					}
				    				});	
					            }
					        }
					    };
				}
				

			    /* if ($(node).hasClass("folder")) {
			        // Delete the "delete" menu item
			        delete items.deleteItem;
			    } */

			    return items;
			}
			
			$('#groupSearchForm').submit(function(e) {
				e.preventDefault();
				var v = $('#groupSearch').val();
				$('#groupTree').jstree(true).search(v);
			});
			
			$('#deptSearchForm').submit(function(e) {
				e.preventDefault(); 
				var v = $('#deptTreeSearch').val();
				$('#departmentTree').jstree(true).search(v);
			});
			
			$('#departmentTree').jstree({
				'core': {
					'data': {
						'url': 'orgTree',
						'type' : 'POST',
						'dataType': 'json',
						'data' : function (node) {
							return { 'id' : node.id, 'groupSeq' : $('#groupSeq').val() };
					    },
					},
					"multiple": true,
				},
				"plugins": ["search", "wholerow", "contextmenu"],
				"contextmenu" : {items: customDealerContextMenu}

			}).on('changed.jstree', function(e, data) {
				if (data && data.selected && data.selected.length) {
					
					selDeptTree = new Array();
					//$('.widget-toolbar button').removeClass('disabled');
					
					var i, j, r = [];
					for (i = 0, j = data.selected.length; i < j; i++) {
						r.push(data.instance.get_node(data.selected[i]).original);
					}
					console.log('Selected id: ' + r.join(', '));
					
					selDeptTree = r ;
					//alert('selected='+id); 
				} else {
					console.log("===not selected==")
				}
			}).on("ready.jstree", function(e, data) {
			    $("#departmentTree").jstree("open_node", "#100000");
			}).on("open_node.jstree",function(e, data) {
				/* alert(1);
				var i, j, r = [];
				for (i = 0, j = data.selected.length; i < j; i++) {
					r.push(data.instance.get_node(data.selected[i]).id);
				}
				console.log('Selected id: ' + r.join(', '));
				var id = r.join(', ');
				alert('opened='+ id); */
			});

		} //end of tree group
		
		function customDealerContextMenu(org) {
			console.log('customOrgContextMenu='+JSON.stringify(org.original)); 
			
			var orgInfo = org.original ;
			var items = null ;
			
			var tree = $("#departmentTree").jstree(true);
			var sel = tree.get_selected();
			if(sel.length && sel.length == 1 ) {
				if(orgInfo.leapMode == 'D'){//DEALER
				    items = {
				        addSingleDealer: { 
				            label: "Add all users of the selected dealer ",
				            "separator_before": true,
				            "icon":"glyphicon glyphicon-plus",
				            action: function (obj) {
				            	appendUserToGroup(false);
				            }
				        },
				        addSubDealer: { 
				            label: "Add all users of the selected dealer(with sub dealer)",
				            "separator_before": true,
				            "icon":"glyphicon glyphicon-plus-sign",
				            action: function (obj) {
				            	appendUserToGroup(true);
				            }
				        },
				    };
				}else{//USER
					items = {
						addUser: { 
				            label: "Add user ",
				            "separator_before": true,
				            "icon":"glyphicon glyphicon-plus",
				            action: function (obj) {
				            	appendUserToGroup(false);
				            }
				        },
				    };
				}
			}else if(sel.length > 1){
				
				var dealerEx = false ;
				var userEx = false ;
				for(var k=0; k<sel.length ; k++){
					var selOrg = tree.get_node(sel[k]).original ;
					console.log('selected org info == '+JSON.stringify(selOrg));
					if(selOrg.leapMode == 'D') dealerEx = true ;
					if(selOrg.leapMode == 'U') userEx = true ;
				}
				
				if(dealerEx){
					items = {
						addSingleDealer: { 
				            label: "Add all users of the selected dealer ",
				            "separator_before": true,
				            "icon":"glyphicon glyphicon-user",
				            action: function (obj) {
				            	appendUserToGroup(false);
				            }
				        },
				        addSubDealer: { 
				            label: "Add all users of the selected dealer(with sub dealer)",
				            "separator_before": true,
				            "icon":"glyphicon glyphicon-user",
				            action: function (obj) {
				            	appendUserToGroup(true);
				            }
				        },
			        }
				}else if(!dealerEx && userEx){
					items = {
						addUser: { 
				            label: "Add user ",
				            "separator_before": true,
				            "icon":"glyphicon glyphicon-user",
				            action: function (obj) {
				            	appendUserToGroup(false);
				            }
				        },
				    }
				}
			}
			
		    return items;
		}
		function run_authorityGrid() {
			console.log("===run_selectedUserListGrid==start");

			//사용자그룹에 맵핑된 사용자 목록
			$("#selectedUserListGrid").jqGrid({
				url: '<s:url value="/group/user/0"/>',
				mtype: 'POST',
				datatype: 'json',
				colNames: ['User ID', 'User Name', 'H_DlrCd', 'Dealer Name', 'Status', 'H_Status', 'H_Level', 'Level'],
				colModel: [
					{name: 'userId', 	 		index: 'a.user_id', 		align: 'left',	sortable: true,		search:true,	width: 120 }, 
					{name: 'userName', 	 		index: 'a.user_name', 	align: 'left',	sortable: true,		search:true,	width: 140 }, 
					{name: 'dlrCd', 	 		index: 'b.dlr_cd', 		hidden: true,	align: 'center',	sortable: true,	search:true,	width: 120 }, 
					{name: 'dlrName', 	 		index: 'b.dlr_nm',    	align: 'left',	sortable: true,		search:true,	width: 120 },
					{name: 'status', 			index: 'a.status', 		align: 'center',	sortable: true,		search:false,	width: 80 }, 
					{name: 'statusName', 		index: 'a.status', 		hidden: true}, 
					{name: 'userLevel',  		index: 'a.user_level', 	hidden: true},
					{name: 'userLevelName',  	index: 'a.user_level', 	align: 'center',	sortable: true,		search:false,	width: 80 },
				],
				sortname: 'user_name',
				rowNum : -1, //-1 : all data
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : true,
				autowidth : true,
			   	shrinkToFit: false,
			   	hidegrid: true,
				height: '260px',
				beforeProcessing: function(data, status, xhr) {
					var rows = data.rows;
					if(rows != null)
					for (var i = 0; i < rows.length; i++) {
						rows[i].userLevelName = CODE.name('E0003', rows[i].userLevel);
					}
				},

			});
			jQuery("#selectedUserListGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			var curProfileType = null;
			//선택가능한 프로파일 목록
			$("#allProfileGrid").jqGrid({
				url: 'group/profile_0/available',
				mtype: 'POST',
				datatype: 'json',
				colNames: ['WorkType', 'Profile ID', 'Profile Name', 'TypeId', 'Profile Type'],
				colModel: [
					{name: 'workType', 			index: 'workType', 		align: 'center', 	hidden: true},  
					{name: 'profileId', 		index: 'profile_id', 	align: 'left', 		width   : 150, sortable: true}, 
					{name: 'description', 		index: 'description', 	align: 'left', 		sortable: true, 	width   : 200}, 
					{name: 'profileType', 		index: 'profile_Type', 	align: 'center', 	hidden: true}, 
					{name: 'profileTypeName', 	index: 'profile_Type', 	align: 'left', 		width   : 150}
				],
				sortname: 'profile_id',
				rowNum : -1, //-1 : all data
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : true,
				autowidth : true,
			   	shrinkToFit: true,
			   	hidegrid: true,
				height: '260px',
				caption : "All Profile list",
				loadError: loadErrorCallback, // error handler; add/edit/delete errors
				loadComplete: loadCompleteCallback, // is called after loading all
				beforeProcessing: function(data, status, xhr) {
					var rows = data.rows;
					if(rows != null)
					for (var i = 0; i < rows.length; i++) {
						rows[i].profileTypeName = CODE.name('ProfileType', rows[i].profileType);
					}
				},
				onSelectRow: function(ids) {
			   		
				}

			});
			jQuery("#allProfileGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			//선택한 프로파일 목록
			$("#selectedProfileGrid").jqGrid({
				url: 'group/profile_0/selected',
				mtype: 'POST',
				datatype: 'json',
				colNames: ['WorkType', 'Profile ID', 'Profile Name', 'TypeId', 'Profile Type'],
				colModel: [
					{name: 'workType', 			index: 'workType', 		align: 'center', 	hidden: true},  
					{name: 'profileId', 		index: 'profile_id', 	align: 'left', 		width   : 150, sortable: true}, 
					{name: 'description', 		index: 'description', 	align: 'left', 		sortable: true, 	width   : 200}, 
					{name: 'profileType', 		index: 'profile_Type', 	align: 'center', 	hidden: true}, 
					{name: 'profileTypeName', 	index: 'profile_Type', 	align: 'left', 		width   : 150}
				],
				sortname: 'profile_id',
				rowNum : -1, //-1 : all data
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : true,
				autowidth : true,
			   	shrinkToFit: true,
			   	hidegrid: true,
				height: '260px',
				caption : "Selected Profile list",
				loadError: loadErrorCallback, // error handler; add/edit/delete errors
				loadComplete: loadCompleteCallback, // is called after loading all
				beforeProcessing: function(data, status, xhr) {
					var rows = data.rows;
					if(rows != null)
					for (var i = 0; i < rows.length; i++) {
						rows[i].profileTypeName = CODE.name('ProfileType', rows[i].profileType);
					}
				},
				onSelectRow: function(ids) {
			   		
				}

			});
			jQuery("#selectedProfileGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			jQuery("#selectedProfileElementGrid").jqGrid({
				url : '<s:url value="/group/profileElements/0"/>',
			    mtype: 'POST',
				datatype : 'json',
				//postData : {page : 1},
				height : '330px', //10개:330px, 15개 : 490px 
				colNames : 
					[ "H_Profile ID", "H_Profile Type", "Profile Name", "Element ID", "Description", "Element Type", "Element Type", "View Products"],
				colModel : [
					{ name : 'profileId', 		index : 'profileId',		hidden: true}, 
					{ name : 'profileType', 	index : 'profileType',		hidden: true}, 
					{ name : 'profileTypeName', index : 'profileTypeName',	align : 'left',		width : 150}, 
					{ name : 'objectId', 		index : 'objectId',			align : 'left',		width : 150}, 
					{ name : 'description', 	index : 'description',		align : 'left' ,	width : 150}, 
					{ name : 'objectType', 		index : 'objectType',	 	hidden: true},
					{ name : 'objectTypeName', 	index : 'objectType',		align : 'center' ,	width : 150,	search:false},
					{ name : 'actionBtn', 		index : 'actionBtn',		align : 'center' ,	width : 150,	search:false, sortable:false},
					],
				rowNum : -1, //-1 : all data
				//rowList : [10, 20, 50, 100],
				//pager : '#pagerOfselectedProfileGrid',
				//caption : "Profile Elements",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : false,
				autowidth : true,
			   	shrinkToFit: true, 
			   	hidegrid: true,
			   	beforeProcessing: function(data, status, xhr) {
			   		var rows = data.rows;
					if(rows != null)
					for (var i = 0; i < rows.length; i++) {
						var objectTypeName = '';
						var profileType = rows[i].profileType ;
						if(profileType == 'A' || profileType == 'O'){
				   			if(rows[i].objectType == 'A'){
				   				objectTypeName = 'Auth';	
				   			}else{
				   				objectTypeName = 'Object';
				   			}
				   		}else if(profileType == 'C'){
				   			objectTypeName = CODE.name('ProfileType', profileType);
				   		}else if(profileType == 'M'){
				   			objectTypeName = CODE.name('ProfileType', profileType);
				   		}else if(profileType == 'S' || profileType == 'D'){
				   			rows[i].objectType = profileType;
				   			if(rows[i].objectType == 'S'){
				   				objectTypeName = 'Sale Channel';	
				   			}else{
				   				objectTypeName = 'Discount Channel';
				   			}
				   		}
				   		
						rows[i].objectTypeName = objectTypeName;
						rows[i].profileTypeName = CODE.name('ProfileType', profileType);
						if(rows[i].profileType == 'S' || rows[i].profileType == 'D'){
							var btn = "<input style='height:22px; width : 140px' type='button' value='Products' onclick=\"viewProductOfChannel('"+rows[i].objectId+"');\"  />";
							rows[i].actionBtn = btn ; 
						}
					}
				},
				gridComplete : function(data){
					/* var ids = jQuery("#selectableObjectsGrid").jqGrid('getDataIDs');
					if(ids != null){
						jQuery("#selectableObjectsGrid").jqGrid('setSelection', 1);
					} */
				}
			});
			
			jQuery("#selectedProfileElementGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			$(window).bind('resize', function() {
				$('#selectedUserListGrid').resizeGridWidth();
				$('#selectedProfileGrid').resizeGridWidth();
				$('#allProfileGrid').resizeGridWidth();
				$('#selectedProfileElementGrid').resizeGridWidth();
			});
			
		}//end of jqgrid
		
		function removeAuthorityGroup(groupSeq){
			MessageBox.confirm("Do you want to remove the authority group?", function(){
				$("#content").processing();
				$.ajax({
					type : 'DELETE',
					async : true,
					url : '<s:url value="/group/"/>' + groupSeq, 
					//contentType: "application/json",
					dataType : 'json',
					//data : JSON.stringify(data),
					success : function(data) { 
						if(data.resultCode == 'SUCCESS'){
							MessageBox.alert('Removed!', function(){
								$('#groupSeq').val('');	
								$('#groupName').val('');	
								$('#groupLevel').val('');
								$('#description').val('');
								$('#btn-trash-group-org').addClass('disabled');
								$('#btn-plus-group-org').removeClass('disabled');
								$('#btn-edit-group-org').addClass('disabled');
								$('#btn-cancel-group-org').addClass('disabled');
								$('#btn-save-group-org').addClass('disabled');
								$("#groupTree").jstree("refresh");
								clickAuthorityGroupInfo(null);
							});
							
						}else{
							MessageBox.error(data.resultMsg);
						}
					},	error:function(data){
						MessageBox.error(data, "<s:message code="err.500"/>");
					}, complete:function(jqXHR, textStatus){
						$("#content").complete();
					}
				});	
			});
		}
		
		function changeGroupField(val, disabled){
			if(val == true && $('#groupSeq').val() == ''){
				$('#groupSeq').val('');
				$('#groupName').val('');
				$('#groupLevel').val('');
				$('#description').val('');
			}
			//$('#groupSeq').attr('disabled', disabled);	
			$('#groupName').attr('disabled', disabled);
			$('#groupLevel').attr('disabled', disabled);
			$('#description').attr('disabled', disabled);
			
		}
		$('#btn-trash-group-org').click(function(e){
			e.preventDefault(); 
			var groupSeq = $('#groupSeq').val();
			if(groupSeq == ''){
				MessageBox.alert("Select Authority Group!");
				return;
			}
			removeAuthorityGroup(groupSeq);
		});
		$('#btn-plus-group-org').click(function(e){
			e.preventDefault();
			$('#btn-trash-group-org').addClass('disabled');
			$('#btn-plus-group-org').addClass('disabled');
			$('#btn-edit-group-org').addClass('disabled');
			$('#btn-cancel-group-org').removeClass('disabled');
			$('#btn-save-group-org').removeClass('disabled');
			$('#groupSeq').val('');
			changeGroupField(true, false);
		});
		$('#btn-edit-group-org').click(function(e){
			e.preventDefault();
			$('#btn-trash-group-org').addClass('disabled');
			$('#btn-plus-group-org').addClass('disabled');
			$('#btn-edit-group-org').addClass('disabled');
			$('#btn-cancel-group-org').removeClass('disabled');
			$('#btn-save-group-org').removeClass('disabled');
			changeGroupField(false, false);
		});
		$('#btn-cancel-group-org').click(function(e){
			e.preventDefault();
			$('#btn-trash-group-org').removeClass('disabled');
			$('#btn-plus-group-org').removeClass('disabled');
			$('#btn-edit-group-org').removeClass('disabled');
			$('#btn-cancel-group-org').addClass('disabled');
			$('#btn-save-group-org').addClass('disabled');
			changeGroupField(true, true);
		});
		$('#btn-save-group-org').click(function(e){
			e.preventDefault();
			var method = "PUT";
			var groupSeq = $('#groupSeq').val();
			if(groupSeq == ''){
				groupSeq = '0';
				method = 'POST';
			}
			var data = {
				  groupSeq : groupSeq
				, groupName : $('#groupName').val()
				, groupLevel : $('#groupLevel').val()
				, description : $('#description').val()
			};
			console.log("sending data === "+JSON.stringify(data)); 
			$("#content").processing();
			$.ajax({
				type : method,
				async : true,
				url : '<s:url value="/group/"/>' + groupSeq, 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(data),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						MessageBox.alert('Saved!', function(){
							
							$('#btn-trash-group-org').removeClass('disabled');
							$('#btn-plus-group-org').removeClass('disabled');
							$('#btn-edit-group-org').removeClass('disabled');
							$('#btn-cancel-group-org').addClass('disabled');
							$('#btn-save-group-org').addClass('disabled');
							changeGroupField(false, true);
							
							$("#groupTree").jstree("refresh");
							clickAuthorityGroupInfo(null);
						});
						
					}else{
						MessageBox.error(data.resultMsg);
					}
				},	error:function(data){
					MessageBox.error(data, "<s:message code="err.500"/>");
				}, complete:function(jqXHR, textStatus){
					$("#content").complete();
				}
			});	
			
		});
		//append group user
		$('#appendUserLink').click(function(e){
			e.preventDefault();
			appendUserToGroup(false);
		});
		
		function appendUserToGroup(appendWithSubDealer){
			var groupSeq = $('#groupSeq').val();
			if(groupSeq == ''){
				MessageBox.alert("Select Authority Group!");
				return;
			}
			
			if(selDeptTree == null ){
				MessageBox.alert("Select Dealer or User!");
				return;
			}
			MessageBox.confirm("Do you want to append the dealers or users in authority group?", function(){
				var data = new Array();
				for(var i=0; i<selDeptTree.length;i++){
					var map = {leapMode : selDeptTree[i].leapMode, id : selDeptTree[i].id};
					data.push(map);
				}
				
				console.log("sending data === "+JSON.stringify(data)); 
				$("#content").processing();
				$.ajax({
					type : 'POST',
					async : true,
					url : '<s:url value="/group/user/"/>' + groupSeq + '/'+appendWithSubDealer, 
					contentType: "application/json",
					dataType : 'json',
					data : JSON.stringify(data),
					success : function(data) { 
						if(data.resultCode == 'SUCCESS'){
							MessageBox.alert('Saved!', function(){
								$("#groupTree").jstree("refresh");
								clickAuthorityGroupInfo(groupSeq);
								//jQuery("#selectableObjectsGrid").reloadGrid();
							});
							
						}else{
							MessageBox.error(data.resultMsg);
						}
					},	error:function(data){
						MessageBox.error(data, "<s:message code="err.500"/>");
					}, complete:function(jqXHR, textStatus){
						$("#content").complete();
					}
				});	
			});
		}
		//remove group user
		$('#removeUserLink').click(function(e){
			e.preventDefault();
			var groupSeq = $('#groupSeq').val();
			if(groupSeq == ''){
				MessageBox.alert("Select Authority Group!");
				return;
			}
			var data = {groupSeq : groupSeq, users : null};			
			var users = $('#selectedUserListGrid').selGridData();
			/* for(var i=0; i<user.length;i++){
				var map = {userId : user[i].userId};
				data.push(map);
			} */
			
			if(users == null || users.length == 0 ){
				MessageBox.alert("Select user list!");
				return;
			}
			data.users = users;
			MessageBox.confirm("Do you want to remove the users in authority group?", function(){
				
				console.log("sending data === "+JSON.stringify(data)); 
				$("#content").processing();
				$.ajax({
					type : 'DELETE',
					async : true,
					url : '<s:url value="/group/user/"/>' + groupSeq, 
					contentType: "application/json",
					dataType : 'json',
					data : JSON.stringify(data),
					success : function(data) { 
						if(data.resultCode == 'SUCCESS'){
							MessageBox.alert('Saved!', function(){
								//$("#groupTree").jstree("refresh");
								$("#groupTree").jstree("refresh_node", "#"+groupSeq);
								clickAuthorityGroupInfo(groupSeq);
							});
							
						}else{
							MessageBox.error(data.resultMsg);
						}
					},	error:function(data){
						MessageBox.error(data, "<s:message code="err.500"/>");
					}, complete:function(jqXHR, textStatus){
						$("#content").complete();
					}
				});	
			});
		});
		
		//append profile link
		$('#appendProfileLink').click(function(e){
			e.preventDefault();
			var groupSeq = $('#groupSeq').val();
			if(groupSeq == ''){
				MessageBox.alert("Select Authority Group!");
				return;
			}
			var data = jQuery("#allProfileGrid").selGridData();
			if(data == null){
				MessageBox.alert("Select profiles to append!");
				return;
			}
			
			MessageBox.confirm("Do you want to append the profiles in authority group?", function(){
				var group = {groupSeq : groupSeq, profiles : data};
				console.log("sending data === "+JSON.stringify(group)); 
				$("#content").processing();
				$.ajax({
					type : 'POST',
					async : true,
					url : '<s:url value="/group/profile/"/>', 
					contentType: "application/json",
					dataType : 'json',
					data : JSON.stringify(group),
					success : function(data) { 
						if(data.resultCode == 'SUCCESS'){
							MessageBox.alert('Appended!', function(){
								//$("#groupTree").jstree("refresh");
								clickAuthorityGroupInfo(groupSeq);
							});
							
						}else{
							MessageBox.error(data.resultMsg);
						}
					},	error:function(data){
						MessageBox.error(data, "<s:message code="err.500"/>");
					}, complete:function(jqXHR, textStatus){
						$("#content").complete();
					}
				});	
			});
		});

		//remove profile link		
		$('#removeProfileLink').click(function(e){
			e.preventDefault();
			var groupSeq = $('#groupSeq').val();
			if(groupSeq == ''){
				MessageBox.alert("Select Authority Group!");
				return;
			}
			var data = jQuery("#selectedProfileGrid").selGridData();
			if(data == null){
				MessageBox.alert("Select profiles to remove!");
				return;
			}
			MessageBox.confirm("Do you want to remove the profiles in authority group?", function(){
				var group = {groupSeq : groupSeq, profiles : data};
				console.log("sending data === "+JSON.stringify(group)); 
				$("#content").processing();
				$.ajax({
					type : 'DELETE',
					async : true,
					url : '<s:url value="/group/profile/"/>', 
					contentType: "application/json",
					dataType : 'json',
					data : JSON.stringify(group),
					success : function(data) { 
						if(data.resultCode == 'SUCCESS'){
							MessageBox.alert('Removed!', function(){
								//$("#groupTree").jstree("refresh");
								clickAuthorityGroupInfo(groupSeq);
							});
							
						}else{
							MessageBox.error(data.resultMsg);
						}
					},	error:function(data){
						MessageBox.error(data, "<s:message code="err.500"/>");
					}, complete:function(jqXHR, textStatus){
						$("#content").complete();
					}
				});	
			});
		});
		
		function loadErrorCallback(xhr, st, err) {

			if (xhr.responseJSON != null && xhr.responseJSON.localErrorMessage != null) {
				// #error-message is a <span> tag in the HTML page
				$("#error-message").html(xhr.responseJSON.localErrorMessage);
			}
		}

		function loadCompleteCallback(data) {
			//console.log(data);
			// clean the error message (#error-message is a <span> tag in the HTML page)
			$("#error-message").html("");
		}

	}

	// end pagefunction

	// destroy generated instances 
	// pagedestroy is called automatically before loading a new page
	// only usable in AJAX version!

	var pagedestroy = function() {

		$('#groupTree').jstree("destroy").empty();
		$('#departmentTree').jstree("destroy").empty();

	}

	// end destroy

	// run pagefunction on load

	pagefunction();
</script>
