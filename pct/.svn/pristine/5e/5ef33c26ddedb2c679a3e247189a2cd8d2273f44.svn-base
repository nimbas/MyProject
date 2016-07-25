<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<style>
	/*
	 * Glyphicons
	 *
	 * Special styles for displaying the icons and their classes in the docs.
	 */

	.bs-glyphicons {
		padding-left: 0;
		padding-bottom: 1px;
		margin-bottom: 1px;
		list-style: none;
	}
	.bs-glyphicons li {
		float: center;
		width: 50px;
		height: 50px;
		padding: 2px;
		margin: 0 -1px 0px -1px;
		font-size: 12px;
		line-height: 1.4;
		text-align: center;
		border: 1px solid #ddd;
	}
	.bs-glyphicons .glyphicon {
		margin-top: 5px;
		margin-bottom: 10px;
		font-size: 24px;
	}
	.bs-glyphicons .glyphicon-class {
		display: block;
		text-align: center;
	}
	.bs-glyphicons li:hover {
		background-color: rgba(86,61,124,.2);
		cursor:pointer;
	}

</style>

<!-- widget grid -->
<section id="widget-grid" class="">

	<!-- row -->
	<div class="row">

		<!-- NEW WIDGET START -->
		<article class="col-sm-12 col-md-12 col-lg-12">
			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-1" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">
				<header>
					<span class="widget-icon"> <i class="fa fa-list"></i>
					</span>
					<h2>Profile List</h2>
					<div class="widget-toolbar" role="menu">
						<div id="btn-group-profilelist" class="btn-group">
							<button class="btn btn-default btn-xs" type="button" id="btn-trash-profilelist">
								<i class="fa fa-trash-o"></i>
							</button>
							<button class="btn btn-default btn-xs" type="button" id="btn-search-profilelist">
								<i class="fa fa-search"></i>
							</button>
							<button class="btn btn-default btn-xs" type="button" id="btn-refresh-profilelist">
								<i class="fa fa-refresh"></i>
							</button>
							<button class="btn btn-default btn-xs" type="button" id="btn-plus-profilelist">
								<i class="fa fa-plus"></i>
							</button>
							<button class="btn btn-default btn-xs" type="button" id="btn-edit-profilelist">
								<i class="fa fa-edit"></i>
							</button>
							<button class="btn btn-default btn-xs" type="button" id="btn-save-profilelist">
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
						<ul id="profilelistTab" class="nav nav-tabs bordered">
							<li id="all" profile="" class="active"><a href="#profilelist" data-toggle="tab">All</a></li>
							<code:list codeType="ProfileType" var="profiles"/>
							<c:forEach items="${profiles }" var="profile">
								<li id="profileType${profile.code }" profile="${profile.code }"><a href="#profilelist" data-toggle="tab">${profile.meaning }</a></li>
							</c:forEach>
						</ul>

						<div id="profilelistContent" class="tab-content padding-10">
							<div id="profilelist" class="tab-pane fade in active">
								<table id="jqProfileList"></table>
								<div id="jqProfilePage"></div>
							</div>
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
		<article class="col-sm-12 col-md-12 col-lg-12">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-1" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">
				<header>
					<span class="widget-icon"> <i class="fa fa-edit"></i>
					</span>
					<h2>Security Elements of Selected Profile</h2>
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
						<div class="row">
							<!-- NEW WIDGET START -->
							<article class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
								<table id="selectableObjectsGrid"></table>
								<div id="pagerOfselectableObjectsGrid"></div>
							</article>
							<article class="col-xs-1 col-sm-1 col-md-1 col-lg-1">
								<div class="row">
									<div class="widget-body col-xs-12 col-sm-12 col-md-12 col-lg-12">
										<ul class="bs-glyphicons" >
											<li id="appendProfileElementsBtn">
											<span class="glyphicon glyphicon-chevron-right"></span>
											</li>
										</ul>
									</div>
									<div class="widget-body col-xs-12 col-sm-12 col-md-12 col-lg-12">
										<ul class="bs-glyphicons">
											<li id="removeProfileElementsBtn">
											<span class="glyphicon glyphicon-chevron-left"></span>
											</li>
										</ul>
									</div>
								</div>
							</article>
							<article class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
								<table id="selectedObjectsGrid"></table>
								<div id="pagerOfselectedObjectsGrid"></div>
							</article>
							<article class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
								<div class="form-actions">
									<div class="row">
										<div class="col-md-12">
											<customTag:button label="Select Menu to view" id="treeMenuViewBtn" css="success" size="xs"/>
											<customTag:button label="Add" id="addAuthBtn" css="success" size="xs"/>
											<customTag:button label="Delete" id="delAuthBtn" css="success" size="xs"/>
										</div>
									</div>	
								</div>
							</article>
							<%-- <article class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
								<div class="form-actions">
									<div class="row">
										<div class="col-md-12">
											<customTag:button label="Save" id="saveProfileElementsBtn" css="success" size="xs"/>
										</div>
									</div>	
								</div>
							</article> --%>
						</div>

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


</section>
<!-- end widget grid -->


<script type="text/javascript">
	
	pageSetUp();

	var MODE = {
		ADD: "ADD",
		UPDATE: "UPDATE"
	}; //+버튼은 ADD, edit버튼은 UPDATE
	var orgCurrentMode = "";
	var userCurrentMode = "";

	// PAGE RELATED SCRIPTS
	// pagefunction
	
	function callBackTreeMenu(menuId){
		//alert(menuId);
		var profile = $("#jqProfileList").selGridData();
		var filterMap = {'objectId': profile.profileId, 'objectType' : profile.profileType, 'menuId' : menuId};
		var postData = {'filterMaps': JSON.stringify(filterMap)}; 
		jQuery("#selectableObjectsGrid")[0].clearToolbar();
		jQuery("#selectableObjectsGrid").setColProp('objectId', {index : 'security_no'});					
		jQuery("#selectableObjectsGrid").setCaption("Selectable Element List [Menu]");
		jQuery("#selectableObjectsGrid").jqGrid('setGridParam',{url:'profile/menu/'+menuId, postData : postData});
		//jQuery("#selectableObjectsGrid").clearGrid();
		//alert(1);
		setTimeout(function(){jQuery("#selectableObjectsGrid").trigger('reloadGrid');},300);
	}
	//authority 저장후 selectable grid 리프레시
	function refreshSelectableGrid(){
		jQuery("#selectableObjectsGrid").trigger('reloadGrid');
	}
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

		CODE.sync('ProfileType'); //jqgrid에 쓰이는 코드그룹을 미리 가져옴.
		console.log("code=\n" + CODE.codeList);
		var typeName_val = function() {
			var selval = "";
			for (var i = 0; i < CODE.retCodeList.ProfileType.length; i++) {
				console.log(CODE.retCodeList.ProfileType[i]);
				if (CODE.retCodeList.ProfileType[i].codeGroup == "ProfileType") {
					selval += CODE.retCodeList.ProfileType[i].code + ":" + CODE.retCodeList.ProfileType[i].meaning + ";";
				}
			}

			selval = selval.replace(/\;$/, "");
			console.log("selval=[" + selval + "]");
			return selval;
		}

		run_jqProfileListGrid();
		
		var cellOfProfile = {};
		function run_jqProfileListGrid() {
			console.log("===run_selectedProfileGrid==start");
			var urlString = "profiles/search";

			$("#jqProfileList").jqGrid({
				url: urlString,
				mtype: 'POST',
				datatype: 'json',
				colNames: ['WorkType', 'Profile ID', 'Profile Name', 'TypeId', 'Profile Type'],
				colModel: [
					{name: 'workType', 			index: 'workType', 		align: 'center', 	hidden: true},  
					{name: 'profileId', 		index: 'profile_id', 	align: 'left', 		width   : 150, sortable: true, editable: true}, 
					{name: 'description', 		index: 'description', 	align: 'left', 		sortable: true, 	editable: true, width   : 200}, 
					{name: 'profileType', 		index: 'profile_Type', 	align: 'center', 	hidden: true}, 
					{name: 'profileTypeName', 	index: 'profile_Type', 	align: 'left', 		editable: true, 	width   : 150, 	edittype: "select",
						editoptions: { value: typeName_val }
					}
				],
				sortname: 'profile_id',
				toolbarfilter: true,
				viewrecords : true,	
				autowidth: true,
				shrinktofit: true,
				height : '270', //10개:330px, 15개 : 490px 
				rowNum: -1,
				multiselect: false,
				autoencode: true,
				pager: "#jqProfilePage",
				loadError: loadErrorCallback, // error handler; add/edit/delete errors
				loadComplete: loadCompleteCallback, // is called after loading all
				editurl:'clientArray',
				beforeProcessing: function(data, status, xhr) {
					var rows = data.rows;
					for (var i = 0; i < rows.length; i++) {
						rows[i].profileTypeName = CODE.name('ProfileType', rows[i].profileType);
					}
				},
				onSelectRow: function(ids) {
			   		var profile = $("#jqProfileList").getGridDataByRowId(ids);
			   		var object = '';
			   		var objectType = profile.profileType;
			   		$('#addAuthBtn').attr('disabled', true);
			   		$('#delAuthBtn').attr('disabled', true);
			   		$('#treeMenuViewBtn').attr('disabled', true);
			   		//alert('before clear tool bar!');
			   		jQuery("#selectableObjectsGrid")[0].clearToolbar();
			   		jQuery("#selectedObjectsGrid")[0].clearToolbar();
			   		jQuery("#selectableObjectsGrid").setColProp('description', {index : 'description'});
			   		jQuery("#selectedObjectsGrid").setColProp('description', {index : 'description'});
			   		jQuery("#selectableObjectsGrid").hideCol("actionBtn");
			   		jQuery("#selectedObjectsGrid").hideCol("actionBtn");
			   		if(profile.profileType == 'A'){//security mask auth
			   			object = 'authorities';
			   			$('#addAuthBtn').attr('disabled', false);
			   			$('#delAuthBtn').attr('disabled', false);
			   			jQuery("#selectableObjectsGrid").setColProp('objectId', {index : 'auth_name'});
			   		}else if(profile.profileType == 'O'){//mask auth
			   			object = 'authorities';
			   			$('#addAuthBtn').attr('disabled', false);
			   			$('#delAuthBtn').attr('disabled', false);
			   			jQuery("#selectableObjectsGrid").setColProp('objectId', {index : 'auth_name'});
			   			jQuery("#selectedObjectsGrid").setColProp('objectId', {index : 'auth_name'});
			   		}else if(profile.profileType == 'C'){//Button Ojbect
			   			object = 'objects';
			   			$('#treeMenuViewBtn').attr('disabled', false);
			   			jQuery("#selectableObjectsGrid").setColProp('objectId', {index : 'security_no'});
			   			jQuery("#selectedObjectsGrid").setColProp('objectId', {index : 'security_no'});
			   		}else if(profile.profileType == 'M'){//Menu
			   			object = 'objects';
			   			$('#treeMenuViewBtn').attr('disabled', false);
			   			jQuery("#selectableObjectsGrid").setColProp('objectId', {index : 'security_no'});
			   			jQuery("#selectedObjectsGrid").setColProp('objectId', {index : 'security_no'});
			   		}else if(profile.profileType == 'D'){
			   			object = 'channels';//100:sale channel, 200:discount, 300:employees recommended, 400 : cug channel
			   			objectType = '200';
			   			jQuery("#selectableObjectsGrid").setColProp('objectId', {index : 'sale_chnl_cd'});
			   			jQuery("#selectableObjectsGrid").setColProp('description', {index : 'sale_chnl_dscr'});
			   			jQuery("#selectedObjectsGrid").setColProp('objectId', {index : 'sale_chnl_cd'});
			   			jQuery("#selectedObjectsGrid").setColProp('description', {index : 'sale_chnl_dscr'});
			   			jQuery("#selectableObjectsGrid").showCol("actionBtn");
				   		jQuery("#selectedObjectsGrid").showCol("actionBtn");
			   		}else if(profile.profileType == 'S'){
			   			object = 'channels';//100:sale channel, 200:discount, 300:employees recommended, 400 : cug channel
			   			objectType = '100';
			   			jQuery("#selectableObjectsGrid").setColProp('objectId', {index : 'sale_chnl_cd'});
			   			jQuery("#selectableObjectsGrid").setColProp('description', {index : 'sale_chnl_dscr'});
			   			jQuery("#selectedObjectsGrid").setColProp('objectId', {index : 'sale_chnl_cd'});
			   			jQuery("#selectedObjectsGrid").setColProp('description', {index : 'sale_chnl_dscr'});
			   			jQuery("#selectableObjectsGrid").showCol("actionBtn");
				   		jQuery("#selectedObjectsGrid").showCol("actionBtn");
			   		}
			   		
			   		$('#selectableObjectsGrid').resizeGridWidth();
					$('#selectedObjectsGrid').resizeGridWidth();
					
			   		var filterMap = {'objectId': profile.profileId, 'objectType' : objectType};
					var postData = {'filterMaps': JSON.stringify(filterMap)}; 
										
					jQuery("#selectableObjectsGrid").setCaption("Selectable Element List ["+profile.profileTypeName+"]");
					jQuery("#selectableObjectsGrid").jqGrid('setGridParam',{url:'profile/'+object+'/available', postData : postData});
					//alert('before clear grid!');
					//jQuery("#selectableObjectsGrid").clearGrid();
					//alert('before reload grid!');
					setTimeout(function(){jQuery("#selectableObjectsGrid").trigger('reloadGrid');},200);
					
					filterMap = {'objectId': profile.profileId, 'objectType' : objectType};
					postData = {'filterMaps': JSON.stringify(filterMap)}; 
					jQuery("#selectedObjectsGrid").setCaption("Selected Element List ["+profile.profileTypeName+"]");
					jQuery("#selectedObjectsGrid").jqGrid('setGridParam',{url:'profile/'+object+'/selected', postData : postData});
					//jQuery("#selectedObjectsGrid").clearGrid();
					setTimeout(function(){jQuery("#selectedObjectsGrid").trigger('reloadGrid');},200);
				}

			});
			jQuery("#jqProfileList").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			$("#jqProfileList").jqGrid("navGrid", "#jqProfilePage", {
				edit: false,
				add: false,
				del: false,
				refresh: false,
				search: false
			}, {
				closeOnEscape: true,
				sopt: ["cn"]
			});

			$("#jqProfileList").jqGrid('inlineNav', "#jqProfileList");
			
			
			jQuery("#selectableObjectsGrid").jqGrid({
				url : '<s:url value="/profile/authorities/notwork"/>',
			    mtype: 'POST',
				datatype : 'json',
				height : '330px',//10개:330px, 15개 : 490px 
				colNames : [ "Element ID"	
				            , "Description"		
				            , "Element Type"		
				            , "Element Type"		
				            , "View Products"		
				            ],
				colModel : [
					{ name : 'objectId', 		index : 'objectId',			align : 'left',	width : 150}, 
					{ name : 'description', 	index : 'description',		align : 'left' ,	width : 150}, 
					{ name : 'objectType', 		index : 'objectType',	 	hidden: true},
					{ name : 'objectTypeName', 	index : 'objectTypeName',	align : 'center' ,	width : 150,	search:false, sortable:false},
					{ name : 'actionBtn', 		index : 'actionBtn',		align : 'center' ,	width : 150,	search:false, sortable:false},
					],
				rowNum : 10, //-1 : all data
				rowList : [10, 20, 50, 100],
				pager : '#pagerOfselectableObjectsGrid',
				caption : "Selectable Element List",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : true,
				autowidth : false,
			   	shrinkToFit: true,
			   	hidegrid: true,
				beforeProcessing: function(data, status, xhr) {
					var rows = data.rows;
					var objectTypeName = '';
					var profile = $("#jqProfileList").selGridData();
					if(rows != null)
					for (var i = 0; i < rows.length; i++) {
						
				   		if(profile.profileType == 'A' || profile.profileType == 'O'){
				   			if(rows[i].objectType == 'A'){
				   				objectTypeName = 'Auth';	
				   			}else{
				   				objectTypeName = 'Object';
				   			}
				   			
				   		}else if(profile.profileType == 'C'){
				   			objectTypeName = CODE.name('ProfileType', profile.profileType);
				   		}else if(profile.profileType == 'M'){
				   			objectTypeName = CODE.name('ProfileType', profile.profileType);
				   		}else if(profile.profileType == 'S' || profile.profileType == 'D'){
				   			rows[i].objectType = profile.profileType;
				   			if(rows[i].objectType == 'S'){
				   				objectTypeName = 'Sale Channel';	
				   			}else{
				   				objectTypeName = 'Discount Channel';
				   			}
				   		}
				   		
						rows[i].objectTypeName = objectTypeName;
						var btn = "<input style='height:22px; width : 140px' type='button' value='Products' onclick=\"viewProductOfChannel('"+rows[i].objectId+"');\"  />";
						rows[i].actionBtn = btn ; 
					}
				}
			});
			
			jQuery("#selectableObjectsGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			jQuery("#selectedObjectsGrid").jqGrid({
				url : '<s:url value="/profile/authorities/notwork"/>',
			    mtype: 'POST',
				datatype : 'json',
				//postData : {page : 1},
				height : '330px', //10개:330px, 15개 : 490px 
				colNames : [ "Element ID"	
					            , "Description"		
					            , "Element Type"		
					            , "Element Type"
					            , "View Products"		
					            ],
					colModel : [
						{ name : 'objectId', 		index : 'objectId',			align : 'left',	width : 150}, 
						{ name : 'description', 	index : 'description',		align : 'left' ,	width : 150}, 
						{ name : 'objectType', 		index : 'objectType',	 	hidden: true},
						{ name : 'objectTypeName', 	index : 'objectTypeName',	align : 'center' ,	width : 150,	search:false, sortable:false},
						{ name : 'actionBtn', 		index : 'actionBtn',		align : 'center' ,	width : 150,	search:false, sortable:false},
						],
				rowNum : 10, //-1 : all data
				rowList : [10, 20, 50, 100],
				pager : '#pagerOfselectedObjectsGrid',
				caption : "Selected Element List",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : true,
				autowidth : true,
			   	shrinkToFit: true, 
			   	hidegrid: true,
			   	beforeProcessing: function(data, status, xhr) {
			   		var rows = data.rows;
					var objectTypeName = '';
					var profile = $("#jqProfileList").selGridData();
					if(rows != null)
					for (var i = 0; i < rows.length; i++) {
						
				   		if(profile.profileType == 'A' || profile.profileType == 'O'){
				   			if(rows[i].objectType == 'A'){
				   				objectTypeName = 'Auth';	
				   			}else{
				   				objectTypeName = 'Object';
				   			}
				   		}else if(profile.profileType == 'C'){
				   			objectTypeName = CODE.name('ProfileType', profile.profileType);
				   		}else if(profile.profileType == 'M'){
				   			objectTypeName = CODE.name('ProfileType', profile.profileType);
				   		}else if(profile.profileType == 'S' || profile.profileType == 'D'){
				   			rows[i].objectType = profile.profileType;
				   			if(rows[i].objectType == 'S'){
				   				objectTypeName = 'Sale Channel';	
				   			}else{
				   				objectTypeName = 'Discount Channel';
				   			}
				   		}
				   		
						rows[i].objectTypeName = objectTypeName;
						var btn = "<input style='height:22px; width : 140px' type='button' value='Products' onclick=\"viewProductOfChannel('"+rows[i].objectId+"');\"  />";
						rows[i].actionBtn = btn ; 
					}
				},
				gridComplete : function(data){
					/* var ids = jQuery("#selectableObjectsGrid").jqGrid('getDataIDs');
					if(ids != null){
						jQuery("#selectableObjectsGrid").jqGrid('setSelection', 1);
					} */
				}
			});
			
			jQuery("#selectedObjectsGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			$(window).bind('resize', function() {
				$('#jqProfileList').resizeGridWidth();
				$('#selectableObjectsGrid').resizeGridWidth();
				$('#selectedObjectsGrid').resizeGridWidth();
			});
		}
		
		$("#btn-search-profilelist").click(function() {
			$("#jqProfileList").jqGrid('searchGrid', {
				sopt: ['cn']
			});
		});

		$("#btn-refresh-profilelist").click(function() {
			console.log("refresh - click");
			refreshProfileList();

		});

		$("#profilelistTab > li").click(function(e) {
			var urlString = selectedTab($(this).attr("profile"));
			reloadTab($(this).attr("profile"));
		});

		function refreshProfileList() {

			var profileType = "" ;
			var tab = $("#profilelistTab > li").each(function(i, e){
				if ($(e).hasClass("active")) {
					profileType = $(this).attr("profile");
				}
			});

			reloadTab(profileType);
		}

		function selectedTab(profile) {

			var urlString = "";
			var profileUrl = "";
			if(profile != ''){
				profileUrl = "?type=" + profile ;
			}	

			return "profiles" + profileUrl;
		}

		function reloadTab(type) {
			var rules = new Array();
			rules.push({'field':'profile_type', 'op':'eq', 'data': type}); 		
			var searchJson = {'groupOp':'AND', 'rules':rules };
			var postData = {'rows' :-1, 'filters':JSON.stringify(searchJson), 'sidx' : 'profile_id', 'sord' : 'asc', 'page':1};
			jQuery("#jqProfileList").jqGrid('setGridParam',{postData : postData}).trigger('reloadGrid');
		}
	
		
		$("#btn-trash-profilelist").click(function() {
			MessageBox.confirm('Delete list?', function(){
				var data = $('#jqProfileList').selGridData();
				data.workType = 'DELETE' ;			
				console.log("sending data === "+JSON.stringify(data));
				$("#content").processing();
				$.ajax({
					type : 'POST',
					async : true,
					url : '<s:url value="/profiles"/>', 
					contentType: "application/json",
					dataType : 'json',
					data : JSON.stringify([data]),
					success : function(data) { 
						if(data.resultCode == 'SUCCESS'){
							MessageBox.alert('Saved!', function(){
								$('#jqProfileList').reloadGrid();
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
		
		$("#btn-edit-profilelist").click(function() {
			var data = $('#jqProfileList').selGridData();
			if(data != null){
				if(data.workType == 'CREATE'){
					jQuery("#jqProfileList").setColProp('profileId',{editable:true});
					jQuery("#jqProfileList").setColProp('profileTypeName',{editable:true});
				}else{
					jQuery("#jqProfileList").setColProp('profileId',{editable:false});
					jQuery("#jqProfileList").setColProp('profileTypeName',{editable:false});
				}
				
          		if(data.workType != 'CREATE'){
          			$("#jqProfileList").updateGridData(data.keyId, {workType : 'UPDATE'});		                      			
          		}
				$('#jqProfileList').editRow(data.keyId, true);
				cellOfProfile = {irow : data.keyId};
			}
		});
		
		$("#btn-plus-profilelist").click(function() {
			//$("#jqProfileList").jqGrid('addRow');
			
			var profileType = "" ;
			var tab = $("#profilelistTab > li").each(function(i, e){
				if ($(e).hasClass("active")) {
					profileType = $(this).attr("profile");
				}
			});
			jQuery("#jqProfileList").setColProp('profileId',{editable:true});
			jQuery("#jqProfileList").setColProp('profileTypeName',{editable:true});
			$('#jqProfileList').addGridData({workType : 'CREATE', profileId:'', description:'', profileType: profileType, profileTypeName : CODE.name('ProfileType', profileType)});
			var data = $('#jqProfileList').selGridData();
			$('#jqProfileList').editRow(data.keyId, true);
			cellOfProfile = {irow : data.keyId};
			//this.disabled = true;
		});

		$("#btn-save-profilelist").click(function() {

			$('#jqProfileList').saveRow(cellOfProfile.irow);			
			var data = $('#jqProfileList').allGridData();
			$.each(data, function(i, e){
				if(e.workType == 'CREATE'){
					e.profileType = CODE.codeByName('ProfileType', e.profileTypeName);
				}
			});
			
			console.log("sending data === "+JSON.stringify(data));
			$("#content").processing();
			$.ajax({
				type : 'POST',
				async : true,
				url : '<s:url value="/profiles"/>', 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(data),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						MessageBox.alert('Saved!', function(){
							$('#jqProfileList').reloadGrid();
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
		
		$('#appendProfileElementsBtn').click(function(e){
			e.preventDefault();
			var data = $("#selectableObjectsGrid").selGridData();
			var profileData = $('#jqProfileList').selGridData();
			$.each(data, function(i, e){
				e.profileId = profileData.profileId ;
			});
			processProfileElemnt(data, 'POST');
		});
		
		function processProfileElemnt(data, method){
			
			console.log("sending data === "+JSON.stringify(data));
			$("#content").processing();
			$.ajax({
				type : method,
				async : true,
				url : '<s:url value="/profileElements"/>', 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(data),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						MessageBox.alert('Saved!', function(){
							jQuery("#selectableObjectsGrid").reloadGrid();
							jQuery("#selectedObjectsGrid").reloadGrid();
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
		}
		
		$('#removeProfileElementsBtn').click(function(e){
			e.preventDefault();
			var data = $("#selectedObjectsGrid").selGridData();
			var profileData = $('#jqProfileList').selGridData();
			$.each(data, function(i, e){
				e.profileId = profileData.profileId ;
			});
			processProfileElemnt(data, 'DELETE');
			
		});
		
		$('#treeMenuViewBtn').click(function(e){
			//전체 메뉴는 너무 많으니 특정 메뉴의 하위 메뉴만 보고 싶을떄 사용
			e.preventDefault();
			var data = $("#jqProfileList").selGridData();
			if(data != null){
				Dialog.open({
					div : 'profileAuthorityRegForm', 
					url : '<s:url value="/tree/menu"/>?callBack=callBackTreeMenu',  
					title :'Select Menu Object', 
					width : 560, 
					height : 380
				}); 
			}else{
				MessageBox.alert("Select Profile!");
			}
			
		});
		
		$('#addAuthBtn').click(function(e){
			e.preventDefault();
			var data = $("#jqProfileList").selGridData();
			if(data != null){
				Dialog.open({
					div : 'profileAuthorityRegForm', 
					url : '<s:url value="/authority"/>?callBack=refreshSelectableGrid&profileType='+data.profileType,  
					title :'Authority Registration', 
					width : 500, 
					height : 320
				}); 
			}else{
				MessageBox.alert("Select Profile!");
			}
			
		});
		
		$('#delAuthBtn').click(function(e){
			e.preventDefault();
			var data = $("#selectableObjectsGrid").selGridData();
			if(data != null){
				console.log("sending data === "+JSON.stringify(data));
				MessageBox.confirm('Do you delete?', function(){
					$("#content").processing();
					$.ajax({
						type : 'DELETE',
						async : true,
						url : '<s:url value="/authorities"/>', 
						contentType: "application/json",
						dataType : 'json',
						data : JSON.stringify(data),
						success : function(data) { 
							if(data.resultCode == 'SUCCESS'){
								MessageBox.alert('Saved!', function(){
									jQuery("#selectableObjectsGrid").reloadGrid();
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
				
			}else{
				MessageBox.alert("Select Profile!");
			}
			
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
		}

	}

	// end pagefunction


	var pagedestroy = function() {


	}

	// end destroy

	// run pagefunction on load

	pagefunction();
</script>
