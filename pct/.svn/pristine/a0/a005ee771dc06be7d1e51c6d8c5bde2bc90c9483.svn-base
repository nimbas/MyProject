<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<s:url value="/resources/bootstrap/js" var="BOOT_JS" scope="session" />
<link rel="stylesheet" type="text/css" media="screen" href="${BOOT_JS}/plugin/jstree/themes/default/style.min.css">
<!-- widget grid -->
<section id="orgMgmtSection" class="">

	<!-- row -->
	<div class="row">

		<!-- NEW WIDGET START -->
		<article class="col-sm-12 col-md-12 col-lg-4">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget jarviswidget-color-orange" id="wid-id-0" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">
				<header>
					<span class="widget-icon"> <i class="fa fa-lg fa-building"></i>
					</span>
					<h2>Department & user</h2>

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

						<div>
							<form class="form-inline" role="form" id="orgSearchForm">
								<div class="form-group">
									<input type="text" class="form-control input-sm" id="orgSearch" placeholder="Department name">
								</div>
							</form>
						</div>
						<div id="orgTree" style="height:760px; max-height:760px;overflow:auto;"></div>

					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
			<!-- end widget -->

		</article>
		<!-- WIDGET END -->

		<!-- NEW WIDGET START -->
		<article class="col-sm-12 col-md-12 col-lg-8" id="departmentArticle">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-1" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">
				
				<header>
					<span class="widget-icon"> <i class="fa fa-sitemap"></i>
					</span>
					<h2>Dealer Information</h2>
					<div class="widget-toolbar" role="menu">
						<div id="btn-group-dealer" class="btn-group">
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-save-dealer"><i class="fa fa-save"></i></button>
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
					<div class="widget-body" style="height:805px; max-height:805px; overflow-x:hidden; overflow-y:auto;">
						<div class="row">
							<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
								<form class="form-horizontal" id="orgForm" method="post">
									<fieldset>
										<customTag:inputbox label="Dealer Code" id="dlrCd" disabled="disabled" required="required"/>
										<customTag:inputbox label="Dealer Name" id="dlrNm" required="required" />
										<customTag:inputbox label="Parent Code" id="hposBizbrCd" placeHolder="Parent Code" disabled="disabled"/>
										<customTag:inputbox label="Parent Name" id="hposBizbrNm" disabled="disabled" />
										<customTag:selectbox label="Dealer Level" id="bizbrLvlDvCd" codeType="CosBizbrLvlDvCd" required="required"/>
										<customTag:inputbox label="Open Date" id="openDt" disabled="disabled" />
										<customTag:inputWithDate label="Expiry Date" id="expryDt" required="required"/>
										<customTag:inputbox label="Last Change Date" id="lastChngDt" disabled="disabled" />
										<customTag:selectbox label="Dealer Status" id="dlrSttsDvCd" codeType="CosDlrSttsDvCd" required="required"/>
										<customTag:selectbox label="Dealer Group" id="dlrGrpCd" codeType="CosDlrGrpCd" required="required" />
										<customTag:selectbox label="Dealer Location" id="dlrLocCd" codeType="DlrLocCd" required="required" />
										<customTag:selectbox label="Internal Y/N" id="hqIntrbrYn" codeType="YesOrNo01" required="required" />
										<customTag:selectbox label="Commission Y/N" id="commPayYn" codeType="YesOrNo01" required="required" />
										<customTag:selectbox label="Market" id="mrktCd" codeType="CosMarket" required="required" />
										
										<div class="form-group">
											<label class="control-label col-xs-3 col-sm-3 col-md-3 col-lg-3" for="prepend">Comm Manage Division Code</label>
											<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
												<div class="col-xs-8 col-sm-8 col-md-8 col-lg-8 no-padding-left">
													<div class="input-group">
														<input type="text" id="costRvrtOrgNm" name="costRvrtOrgNm" class="form-control" placeHolder="Comm Manage Division Code" disabled="disabled">
														<div class="input-group-btn">
															<button class="btn btn-md btn-primary" type="button" id="costRvrtOrgSearchBtn">
																<i class="fa fa-search"></i>
															</button>
														</div>
													</div>
												</div>
												<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 no-padding">
													<input type="text" id="costRvrtOrgCd" name="costRvrtOrgCd" class="form-control" disabled="disabled">
												</div>
		
											</div>
										</div>
									</fieldset>
								</form>
							</article>
						</div>
					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
			<!-- end widget -->

		</article>
		<!-- WIDGET END -->
		<!-- NEW WIDGET START -->
		<article class="col-sm-12 col-md-12 col-lg-8" id="userArticle" style="display:none;">

			<!-- Widget ID (each widget will need unique ID)-->
			
			<div class="jarviswidget" id="wid-id-1" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">
				<header>
					<span class="widget-icon"> <i class="fa fa-user"></i>
					</span>
					<h2>User Information</h2>
					<div class="widget-toolbar" role="menu">
						<div id="btn-group-user" class="btn-group">
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-save-user"><i class="fa fa-save"></i></button>
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
					<form class="form-horizontal" id="userForm">
					<input type="hidden" id="userId" name="userId"/>
					<input type="hidden" id="checkedUserId" value="false"/>
					<!-- widget content -->
					<div class="widget-body" style="height:805px; max-height:805px; overflow-x:hidden; overflow-y:auto;">
						<div class="row">
							<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
								<fieldset>
									<customTag:inputWithButton label="Login ID" id="loginId" placeHolder="Login ID" buttonId="checkUserIdBtn" buttonText="Check" required="required" disabled="disabled"/>
									<div class="form-group">
										<label class="control-label col-xs-3 col-sm-3 col-md-3 col-lg-3" for="prepend">User Name</label>
										<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
											<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 no-padding-left">
												<input type="text" id="userName" name="userName" placeholder="First Name" class="form-control required"  required="required">
											</div>
											<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 no-padding">
												<input type="text" id="userName2" name="userName2" placeholder="Last Name" class="form-control required" required="required">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-xs-3 col-sm-3 col-md-3 col-lg-3 " for="prepend">Organization</label>
										<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
											<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 no-padding-left">
												<select class="form-control required" id="marketCode" name="marketCode" disabled="disabled">
													<option value="">::: Select :::</option>
													<code:out codeType="CosMarket" value="" option="listbox" />
												</select>
											</div>
											<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
												<!-- <div class="input-group"> -->
													<input type="text" id="dlrCd" name="dlrCd" class="form-control required" disabled="disabled" required="required">
													<!-- <div class="input-group-btn">
														<button class="btn btn-default btn-primary" type="button" id="orgSearchBtn">
															<i class="fa fa-search"></i>
														</button>
													</div> -->
												<!-- </div> -->
											</div>
											<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
												<input type="text" id="dlrName" name="dlrName" class="form-control" disabled="disabled">
											</div>
	
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-xs-3 col-sm-3 col-md-3 col-lg-3" for="prepend">Other Market User</label>
										<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
											<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 no-padding-left">
												<select class="form-control" id="" name="" disabled="disabled">
													<option value="">::: Select :::</option>
													<code:out codeType="CosMarket" value="" option="listbox" />
												</select>
											</div>
											<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
												<!-- <div class="input-group"> -->
													<input type="text" id="otherOrgCode" name="otherOrgCode" class="form-control" disabled="disabled">
													<!-- <div class="input-group-btn">
														<button class="btn btn-default btn-primary" type="button" id="otherOrgSearchBtn">
															<i class="fa fa-search"></i>
														</button>
													</div> -->
												<!-- </div> -->
											</div>
											<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
												<input type="text" id="otherOrgName" name="otherOrgName" class="form-control" disabled="disabled">
											</div>
	
										</div>
									</div>
									<customTag:inputWithDate label="Start Date" id="effectiveDate8" required="required"/>
									<customTag:inputWithDate label="End Date" id="expirationDate8" required="required"/>
									<customTag:inputbox label="Mobile No" id="mobileTelno" required="required" />
									<div class="form-group">
										<label class="control-label col-xs-3 col-sm-3 col-md-3 col-lg-3">Status</label>
										<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
											<select class="form-control required" id="status" name="status" required="required">
												<option value="">::: Select :::</option>
												<option value="Locked">Locked</option>
												<option value="Valid">Valid</option>
												<option value="Active">Active</option>
												<option value="Close">Close</option>
											</select>
										</div>
									</div>
									<customTag:selectbox label="User Level" id="userLevel" codeType="E0003"/>
									<div class="form-group">
										<label class="control-label col-xs-3 col-sm-3 col-md-3 col-lg-3">Group</label>
										<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
											<select class="form-control" id="usergroup" name="usergroup">
												<option value="">::: Select :::</option>
												<c:forEach items="${groupList }" var="group">
												<option value="${group.groupSeq }">${group.groupName }</option>
												</c:forEach>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-xs-3 col-sm-3 col-md-3 col-lg-3" for="prepend">Email</label>
										<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
											<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 no-padding">
												<div class="input-group">
													<input type="hidden" id="emailAddress" name="emailAddress" class="form-control required">
													<input type="text" id="emailId" class="form-control required" required="required">
													<span class="input-group-addon">@</span>
												</div>
											</div>
											<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 no-padding">
												<input type="text" id="emailDomain" class="form-control required" required="required">
											</div>
											<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 no-padding">
												<select class="form-control" id="emailDomainSelector">
													<code:out codeType="EMAILDOMAIN" value="" option="listbox" />
												</select>
											</div>
										</div>
									</div>
									<customTag:inputWithDate label="Birth Day" id="birthday"/>
									<customTag:inputbox label="Age" id="age" />
									<customTag:selectbox label="Gender" id="gender" codeType="E0002" />
									<customTag:selectbox label="Marriage Y/N" id="userMerryYn" codeType="YesOrNo01" />
									<customTag:inputbox label="Home Phone" id="homeTelno" />
									<customTag:inputbox label="Office Phone" id="workTelno" />
									<div class="form-group">
										<label class="control-label col-xs-3 col-sm-3 col-md-3 col-lg-3" for="prepend">Address</label>
										<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
											<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 no-padding-left">
												<input type="text" id="zipCode" name="zipCode" class="form-control" placeholder="Input zip code">
												<!-- <div class="input-group">
													<input type="text" id="zipCode" name="zipCode" class="form-control" placeholder="Input zip code">
													<div class="input-group-btn">
														<button class="btn btn-default btn-primary" type="button" id="addressSearchBtn">
															<i class="fa fa-search"></i>
														</button>
													</div>
												</div> -->
											</div>
											<div class="col-xs-8 col-sm-8 col-md-8 col-lg-8 no-padding-right">
												<input type="text" id="vilgAbvAddr" name="vilgAbvAddr" class="form-control" placeholder="Input Vilage above address">
											</div>
											<hr>
											<input type="text" id="vilgBlwAddr" name="vilgBlwAddr" class="form-control" placeholder="Input Vilage below address">	
										</div>
	
	
									</div>
									<customTag:inputWithButton label="IP Address" id="ipAddress" buttonId="ipSelectBtn" buttonText="Select" disabled="disabled"/>
									<customTag:selectbox label="IP Scan Y/N" id="ipScanYn" codeType="YesOrNo01" />
								</fieldset>
							</article>
						</div>
					</div>
					</form>
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

<script src="${BOOT_JS}/plugin/masked-input/jquery.maskedinput.min.js"></script>
<script type="text/javascript">
	
	pageSetUp();

	// PAGE RELATED SCRIPTS
	// pagefunction
	var callbackOrgTreeMoveDealer = function (moveTrgtDlr){
		//alert(JSON.stringify(moveTrgtDlr));
		
		var tree = $("#orgTree").jstree(true);
		var selDlrCd = tree.get_selected();
		var dlrCd = tree.get_node(selDlrCd).original.id ;
		if(dlrCd == moveTrgtDlr.id){
			MessageBox.alert('The target dealer is same!');
			return ;
		}
		MessageBox.confirm('Do you want to move as child of ' + moveTrgtDlr.text, function(){
			$.ajax({
				type: 'POST',
				url: 'dealer/move',
				contentType: "application/json", 
				dataType: 'json',
				data : JSON.stringify({dlrCd : dlrCd, hposBizbrCd : moveTrgtDlr.id}),
				success: function(data) {
					console.log(data);
					if(data.resultCode == 'SUCCESS'){
						$("#orgTree").jstree("refresh");
						$('#orgForm').trigger('reset');
						$('#btn-save-dealer').addClass('disabled');
						$('#btn-save-user').addClass('disabled');
					}else{
						MessageBox.error(data.resultMsg);
					}
				},
				error: function(error) {
					MessageBox.error("500 Err : Server Error");
				}
			});
		});
	};
	var callbackOrgTreeMoveUser = function (moveTrgtDlr){
		//alert(JSON.stringify(moveTrgtDlr));
		
		var tree = $("#orgTree").jstree(true);
		var selUsers = tree.get_selected();
		var dlrCd = tree.get_node(tree.get_node(selUsers[0]).parent).original.id ;
		if(dlrCd == moveTrgtDlr.id){
			MessageBox.alert('The target dealer is same!');
			return ;
		}
		MessageBox.confirm('Do you want to move to the ' + moveTrgtDlr.text, function(){
			var users = new Array();
			for(var i=0 ; i < selUsers.length; i++){
				users.push({userId : selUsers[i], dlrCd : moveTrgtDlr.id});
			}
			$.ajax({
				type: 'POST',
				url: 'user/move/' +  moveTrgtDlr.id,
				contentType: "application/json", 
				dataType: 'json',
				data : JSON.stringify(users),
				success: function(data) {
					console.log(data);
					if(data.resultCode == 'SUCCESS'){
						$("#orgTree").jstree("refresh");
						$('#orgForm').trigger('reset');
						$('#btn-save-dealer').addClass('disabled');
						$('#btn-save-user').addClass('disabled');
					}else{
						MessageBox.error(data.resultMsg);
					}
				},
				error: function(error) {
					MessageBox.error("500 Err : Server Error");
				}
			});
		});
	};
	var callbackOrgTreeCostRvrtOrg = function(trgtDlr){
		$('#costRvrtOrgCd').val(trgtDlr.id);
		$('#costRvrtOrgNm').val(trgtDlr.text);
	}
	
	var callbackIpAddress = function(ip){
		$('#ipAddress').val(ip);
	}
	var pagefunction = function() {

		/* object Tree*/
		loadScript("${BOOT_JS}/plugin/jstree/jstree.min.js", run_orgTree);
		loadScript("${JS}/co/form.custom.validator.js");

		function run_orgTree() {
			console.log("===run_orgTree==")
			$.jstree.defaults.search.show_only_matches = true;
			console.log("show_only_matches=" + $.jstree.defaults.search.show_only_matches);
			// AJAX
			$('#orgTree').jstree({
				'core': {
					'data': {
						'url': 'orgTree',
						'type': 'POST',
						'dataType': 'json',
						'data' : function (node) {
							return { 'id' : node.id, 'groupSeq' : null };
					    },
					},
					"check_callback" : function(operation, node, node_parent, node_position, more) {
						console.log(operation);
						console.log(node);
						console.log(node_position);
						// operation can be 'create_node', 'rename_node', 'delete_node', 'move_node' or 'copy_node'
	                    // in case of 'rename_node' node_position is filled with the new node name

	                    if (operation === "move_node") {
	                        //return node_parent.original.type === "Parent"; //only allow dropping inside nodes of type 'Parent'
	                    }
						if(node.original.leapMode == 'U'){
							return false ;
						}
						return true ;
					}
				},
				"plugins": ["search", "wholerow", "contextmenu", "dnd"],
				"contextmenu" : {items: customOrgContextMenu},
			}).on('changed.jstree', function(e, data) {
				if (data && data.selected && data.selected.length) {

					var i, j, r = [];
					for (i = 0, j = data.selected.length; i < j; i++) {
						r.push(data.instance.get_node(data.selected[i]).original);
					}
					if(r.length == 1){
						var url = "" ;
						url = '<s:url value="/dealer/"/>' + r[0].id ;
						if(r[0].leapMode =='D'){
							$('#departmentArticle').show();
							$('#userArticle').hide();
							$('#orgForm').trigger('reset');
							$('#orgForm').attr('method', 'PUT');
							$('#orgForm #dealerName').val(r[0].text);
							
							$('#btn-save-dealer').removeClass('disabled');
							
						}else{
							$('#departmentArticle').hide();
							$('#userArticle').show();
							$('#userForm').trigger('reset');
							$('#userForm').attr('method', 'PUT');
							$('#btn-save-user').removeClass('disabled');
							url = '<s:url value="/user/"/>' + r[0].id ;
							$('#userForm #loginId').attr('disabled', true);
							$('#userForm #effectiveDate8').attr('disabled', true);
						}
						$('#orgMgmtSection').loading();
						$.ajax({
							type : 'GET',
							async : true,
							url : url, 
							dataType : 'json',
							success : function(data) { 
								console.log('ret data = '  + JSON.stringify(data));
								if(r[0].leapMode =='D'){
									$('#orgForm').bindingFormData(data);
									//시작/종료 발짜 포맷팅
									$('#orgForm #openDt').val(formatters["dateString"](data.openDt));
									$('#orgForm #expryDt').val(formatters["dateString"](data.expryDt));
									$('#orgForm #lastChngDt').val(formatters["dateString"](data.lastChngDt));
								}else{
									$('#userForm').bindingFormData(data);
									//email 분리
									//시작/종료 발짜 포맷팅
									$('#userForm #effectiveDate8').val(formatters["dateString"](data.effectiveDate8));
									$('#userForm #expirationDate8').val(formatters["dateString"](data.expirationDate8));
									var email = data.emailAddress.split('@');
									$('#userForm #emailId').val(email[0]);
									$('#userForm #emailDomain').val(email[1]);
									$('#userForm #checkUserIdBtn').attr('disabled', true);
									$('#userForm #checkedUserId').val('true');
									
								}
							},	error:function(data){
								MessageBox.error(data, "<s:message code="err.500"/>");
							}, complete:function(jqXHR, textStatus){
								$("#orgMgmtSection").complete();
							}
						});	
					}else{
						
					}
					console.log('Selected id: ' + JSON.stringify(r));
					var id = r.join(', ');
					//클릭정보 세팅.

				} else {
					console.log("===not selected==")
				}
			}).on("ready.jstree", function(e, data) {
			    $("#orgTree").jstree("open_node", "#100000");
			});

		}
		
		function customOrgContextMenu(org) {
			console.log('customOrgContextMenu='+JSON.stringify(org.original)); 
			
			var orgInfo = org.original ;
			var items = null ;
			
			var tree = $("#orgTree").jstree(true);
			var sel = tree.get_selected();
			if(sel.length && sel.length == 1 ) {
				if(orgInfo.leapMode == 'D'){//DEALER
				    items = {
			    		refreshGroup: { 
				            label: "Refresh",
				            "separator_after": true,
				            "icon":"glyphicon glyphicon-refresh",
				            action: function (obj) {
				            	$("#orgTree").jstree("refresh_node" , '#'+orgInfo.id);
				            	return { 'id' : orgInfo.id };
				            }
				        },
				        addEqLevelDealer: { 
				            label: "New Dealer(Same level)",
				            "icon":"glyphicon glyphicon-plus",
				            action: function (obj) {
				            	newDealerForm('SAME');
				            }
				        },
				        addSubLevelDealer: { 
				            label: "New Dealer(As a child)",
				            "icon":"glyphicon glyphicon-plus-sign",
				            action: function (obj) {
				            	newDealerForm('CHILD');
				            }
				        },
				        deleteDealer: {
				            label: "Remove Dealer",
				            "icon":"glyphicon glyphicon-trash",
				            action: function (node) {
				            	
				            	MessageBox.confirm("Do you remove the dealer (with users)?", function(){
				            		var sel = tree.get_selected();
									if(!sel.length) { return false; }
									tree.delete_node(sel);
									//removeAuthorityGroup(sel);
									console.log('send data :: ' + sel);
									$.ajax({
										type: 'DELETE',
										url: 'dealer/'+ sel,
										contentType: "application/json", 
										data: JSON.stringify({dlrCd : sel}),
										dataType: 'json',
										success: function(data) {
											console.log(data);
				    						if(data.resultCode == 'SUCCESS'){
				    							$("#orgTree").jstree("refresh");
				    							$('#orgForm').trigger('reset');
				    							$('#btn-save-dealer').addClass('disabled');
				    							$('#btn-save-user').addClass('disabled');
				    						}else{
				    							MessageBox.error(data.resultMsg);
				    						}
										},
										error: function(error) {
											MessageBox.error("500 Err : Server Error");
										}
									});
				            	});
				            }
				        },
				        moveOrg: { 
				            label: "Move Delaer",
				            "icon":"glyphicon glyphicon-move",
				            action: function (obj) {
				            	var tree = $("#orgTree").jstree(true);
				    			var dlrCd = tree.get_selected();
				            	openOrgTree('callbackOrgTreeMoveDealer', dlrCd);
				            }
				        },
				        addUser: { 
				            label: "New User",
				            "separator_before": true,
				            "icon":"glyphicon glyphicon-user",
				            action: function (obj) {
				            	newUserForm();
				            }
				        },
				    };
				}else{//USER
					items = {
						moveUser: { 
				            label: "Move User",
				            "icon":"glyphicon glyphicon-move",
				            action: function (obj) {
				            	var tree = $("#orgTree").jstree(true);
				    			var userId = tree.get_selected();
				    			var dealerId = tree.get_node(userId[0]).parent ;
				            	openOrgTree('callbackOrgTreeMoveUser', dealerId);
				            }
				        },
				        deleteUser: {
				            label: "Remove User",
				            "icon":"glyphicon glyphicon-trash",
				            action: function (node) {
			    				$("#content").processing();
			    				$.ajax({
			    					type : 'DELETE',
			    					async : true,
			    					url : '<s:url value="/user/"/>' + orgInfo.id, 
			    					//contentType: "application/json",
			    					dataType : 'json',
			    					//data : JSON.stringify(user),
			    					success : function(data) { 
			    						console.log(data);
			    						if(data.resultCode == 'SUCCESS'){
			    							var userInfo = tree.get_node(orgInfo.id).original ;
			    							var dealerInfo = tree.get_node(userInfo.parent).original ;
			    							$("#orgTree").jstree("refresh_node" , '#'+dealerInfo.id);
			    							$('#userForm').trigger('reset');
			    							$('#btn-save-user').addClass('disabled');
			    							
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
			}else if(sel.length > 1){
				
				var dealerEx = false ;
				var userEx = false ;
				var data = new Array();
				for(var k=0; k<sel.length ; k++){
					var selOrg = tree.get_node(sel[k]).original ;
					console.log('selected org info == '+JSON.stringify(selOrg));
					if(selOrg.leapMode == 'D') {
						dealerEx = true ;
						data.push({dlrCd : sel[k]});
					}
					if(selOrg.leapMode == 'U') {
						userEx = true ;
						data.push({userId : sel[k]});
					}
				}
				
				/* if(dealerEx && userEx){
					items = {
						removeAll: {
				            label: "Remove all (Dealer and User)",
				            "icon":"glyphicon glyphicon-pencil",
				            action: function (node) {
				            	
				            }
				        },
			        }
				}else  */
				if(dealerEx && !userEx){
					items = {
							removeAll: {
					            label: "Remove Dealers",
					            "icon":"glyphicon glyphicon-pencil",
					            action: function (node) {
					            	
					            	MessageBox.confirm("Do you remove the dealer (with users)?", function(){
					            		$("#content").processing();
					    				$.ajax({
					    					type : 'DELETE',
					    					async : true,
					    					url : '<s:url value="/dealers"/>', 
					    					contentType: "application/json",
					    					dataType : 'json',
					    					data : JSON.stringify(data),
					    					success : function(data) { 
					    						console.log(data);
					    						if(data.resultCode == 'SUCCESS'){
					    							var userInfo = tree.get_node(orgInfo.id).original ;
					    							var dealerInfo = tree.get_node(userInfo.parent).original ;
					    							$("#orgTree").jstree("refresh_node" , '#'+dealerInfo.id);
					    							$('#userForm').trigger('reset');
					    							$('#btn-save-user').addClass('disabled');
					    							
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
					        },
				        }
				}else if(!dealerEx && userEx){
					items = {
							moveUser: { 
					            label: "Move User",
					            "icon":"glyphicon glyphicon-user",
					            action: function (obj) {
					            	var tree = $("#orgTree").jstree(true);
					    			var userId = tree.get_selected()[0];
					    			//alert(tree.get_selected());
					    			var dealerId = tree.get_node(userId).parent ;
					            	openOrgTree('callbackOrgTreeMoveUser', dealerId);
					            }
					        },
							removeAll: {
					            label: "Remove Users",
					            "icon":"glyphicon glyphicon-pencil",
					            action: function (node) {
					            	$("#content").processing();
				    				$.ajax({
				    					type : 'DELETE',
				    					async : true,
				    					url : '<s:url value="/users"/>', 
				    					contentType: "application/json",
				    					dataType : 'json',
				    					data : JSON.stringify(data),
				    					success : function(data) { 
				    						console.log(data);
				    						if(data.resultCode == 'SUCCESS'){
				    							var userInfo = tree.get_node(orgInfo.id).original ;
				    							var dealerInfo = tree.get_node(userInfo.parent).original ;
				    							$("#orgTree").jstree("refresh_node" , '#'+dealerInfo.id);
				    							$('#userForm').trigger('reset');
				    							$('#btn-save-user').addClass('disabled');
				    							
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
					        },
				        }
				}
			}
			
		    return items;
		}

		//department이름으로 찾기
		var to = false;
		$('#orgSearch').keyup(function() {
			if (to) {
				clearTimeout(to);
			}
			to = setTimeout(function() {
				var v = $('#orgSearch').val();
				$('#orgTree').jstree(true).search(v);
			}, 250);
		});

		//parentcode로 찾기
		$('#parentCode').keypress(function() {
			if (event.which == 13) {
				event.preventDefault();
				console.log(this.value);

				var urlString = "orgInfoByCode/";

				$.ajax({
					type: 'GET',
					url: urlString,
					contentType: "application/json",
					data: {
						code: this.value
					},
					dataType: 'json',
					success: function(res) {
						console.log(res);
						$("#parentName").attr("value", res.dlrNm);
						$("#dealerGroup > option[value='" + res.dlrGrpCd + "']").attr("selected", "true");
						$("#dealerLevel > option[value='" + (parseInt(res.bizbrLvlDvCd) + 1) + "']").attr("selected", "true");

					},
					error: function(error) {
						MessageBox.error("500 Err : Server Error");
					}
				});

			}
		});

		function newDealerForm(newMode){
			var orgTree = $("#orgTree").jstree(true);
			$('#orgForm').attr('method', 'POST');
			if(!orgTree.get_selected()){
				MessageBox.alert('Select dealer!');
				return ;
			}
			var selDealer = orgTree.get_node(orgTree.get_selected()).original;
			var parentDealer = orgTree.get_node(selDealer.parent).original;
			$('#orgForm').trigger('reset');
			$('#orgForm #openDt').val('<fmt:formatDate pattern="yyyy-MM-dd" value="${curDate}"/>');
			$('#orgForm #expryDt').val('9999-12-31');
			$('#orgForm #lastChngDt').val('<fmt:formatDate pattern="yyyy-MM-dd" value="${curDate}"/>');

			if(newMode == 'SAME'){//현 선택된 부서와 동일 레벨
				$('#orgForm #hposBizbrCd').val(parentDealer.id);
				$('#orgForm #hposBizbrNm').val(parentDealer.text);
			}else if(newMode = 'CHILD'){//현 선택된 부서 아래로 추가
				$('#orgForm #hposBizbrCd').val(selDealer.id);
				$('#orgForm #hposBizbrNm').val(selDealer.text);
			}
			$('#orgForm #dlrCd').attr('disabled', false).val('');
		}
		
		function openOrgTree(callback, dlrCd){
			Dialog.open({
				div : 'productOfChannelDlg', 
				url : '<s:url value="/orgTree"/>?callBack='+callback+'&srcDlrCd=' + dlrCd,  
				title :'Select Dealer', 
				width : 630, 
				height : 580
			});
		}
		$('#btn-save-dealer').click(function(e){
			e.preventDefault();
			
			if(!$('#orgForm').formValidate()){
				return ;
			}
			
			$('#btn-save-dealer').addClass('disabled');
			var disabledObj = $('#orgForm [disabled=disabled]');
			disabledObj.each(function(e){
				$(this).attr('disabled', false);
			});
			var dealerInfos = $('#orgForm').serializeArray();
			disabledObj.each(function(e){
				$(this).attr('disabled', true);
			});
			var dealer = {};
			$.each(dealerInfos, function(i,e){
				var value= e.value;
				if(e.name == 'openDt' || e.name == 'expryDt' || e.name == 'lastChngDt' ){
					value = value.replace(/-/g, '');
				}
				dealer[e.name] = value; 
			});
			var method = $('#orgForm').attr('method');
			console.log('send data ::' + JSON.stringify(dealer));
			$.ajax({
				type: method,
				url: 'dealer/'+$('#dlrCd').val(),
				contentType: "application/json", 
				data: JSON.stringify(dealer),
				dataType: 'json',
				success: function(res) {
					$("#orgTree").jstree("refresh");
					$('#btn-save-dealer').addClass('disabled');
					$('#orgForm').trigger('reset');
				},
				error: function(error) {
					MessageBox.error("500 Err : Server Error");
				}
			});
		});
		
		$('#costRvrtOrgSearchBtn').click(function(e){
			e.preventDefault();
			var tree = $("#orgTree").jstree(true);
			var dlrCd = tree.get_selected();
        	openOrgTree('callbackOrgTreeCostRvrtOrg', '');
		});
		
		$('#userForm #loginId').keyup(function(e){
			$('#userForm #checkedUserId').val('false');
		});
		
		$('#checkUserIdBtn').click(function(e){
			e.preventDefault();
			$.ajax({
				type: 'POST',
				url: 'checkUserId/'+$('#userForm #loginId').val(),
				//contentType: "application/json", 
				//data: JSON.stringify(dealer),
				dataType: 'json',
				success: function(data) {
					if(data.resultCode == 'SUCCESS'){
						$('#userForm #checkedUserId').val('true');
						MessageBox.alert("You can use the login id.");
					}else{
						$('#userForm #checkedUserId').val('false');
						MessageBox.alert("The login id is already in use.");
					}
				},
				error: function(error) {
					MessageBox.error("500 Err : Server Error");
				}
			});
		});
		$('#btn-save-user').click(function(e){
			e.preventDefault();
			
			if(!$('#userForm').formValidate()){
				return ;
			}
			
			if($('#userForm #checkedUserId').val() == 'false'){
				MessageBox.alert('Check your login ID!');
				return;
			}
			
			$('#btn-save-user').addClass('disabled');
			$('#userForm #emailAddress').val($('#userForm #emailId').val()+"@"+$('#userForm #emailDomain').val());
			var disabledObj = $('#userForm [disabled=disabled]');
			disabledObj.each(function(e){
				$(this).attr('disabled', false);
			});
			var userInfos = $('#userForm').serializeArray();
			disabledObj.each(function(e){
				$(this).attr('disabled', true);
			});
			
			var user = {};
			$.each(userInfos, function(i,e){
				var value= e.value;
				if(e.name == 'effectiveDate8' || e.name == 'expirationDate8' || e.name == 'birthday'){
					value = value.replace(/-/g, '');
				}
				user[e.name] = value; 
			});
			var method = $('#userForm').attr('method');
			console.log('send data ::' + JSON.stringify(user));
			$.ajax({
				type: method,
				url: 'user/'+$('#userForm #loginId').val(),
				contentType: "application/json", 
				data: JSON.stringify(user),
				dataType: 'json',
				success: function(res) {
					$("#orgTree").jstree("refresh_node" , '#'+$('#userForm #dlrCd').val());
					$('#btn-save-user').addClass('disabled');
					$('#userForm').trigger('reset');
				},
				error: function(error) {
					MessageBox.error("500 Err : Server Error");
				}
			});
		});
		
		function newUserForm(){
			var orgTree = $("#orgTree").jstree(true);
			if(!orgTree.get_selected()){
				MessageBox.alert('Select dealer to add!');
				return ;
			}
			var selDealer = orgTree.get_node(orgTree.get_selected()).original;
			if(selDealer.leapMode == 'U'){
				selDealer = orgTree.get_node(selDealer.parent).original;
			}
			$('#departmentArticle').hide();
			$('#userArticle').show();
			$('#userForm').trigger('reset');
			$('#userForm').attr('method', 'POST');
			$('#btn-save-user').removeClass('disabled');
			$('#userForm #loginId').attr('disabled', false);
			$('#userForm #dlrCd').val(selDealer.id);
			$('#userForm #dlrName').val(selDealer.text);
			$('#userForm #effectiveDate8').val('<fmt:formatDate pattern="yyyyMMdd" value="${curDate}"/>');
			$('#userForm #expirationDate8').val('9999-12-31'); 
			$('#userForm #loginId').attr('disabled', false);
			$('#userForm #effectiveDate8').attr('disabled', false);
			$('#userForm #checkUserIdBtn').attr('disabled', false); 
			$('#userForm #checkedUserId').val('false'); 
		}
		
		$('#userForm #emailDomainSelector').change(function(e){
			if($(this).val() != 'direct'){
				$('#emailDomain').val($(this).val());	
			}			
		});
		
		$('#ipSelectBtn').click(function(e){
			e.preventDefault();
			var orgTree = $("#orgTree").jstree(true);
			if(!orgTree.get_selected()){
				MessageBox.alert('Not selected user');
				return ;
			}
			var selDealer = orgTree.get_node(orgTree.get_selected()).original;
			if(selDealer.leapMode == 'U'){
				selDealer = orgTree.get_node(selDealer.parent).original;
			}
			Dialog.open({
				div : 'productOfChannelDlg', 
				url : '<s:url value="/user/availableIp"/>?callBack=callbackIpAddress&dlrCd=' + selDealer.id,  
				title :'Available IP List', 
				width : 320, 
				height : 500
			});
		});

		/* end of org information */

	}

	// end pagefunction

	var pagedestroy = function() {

		

	}

	// end destroy

	// run pagefunction on load

	pagefunction();
</script>
