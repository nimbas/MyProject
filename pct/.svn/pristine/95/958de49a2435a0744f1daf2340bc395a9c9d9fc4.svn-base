<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>

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
	<div class="row">
		
		<article class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
			<table id="commandListGrid"></table>
			<div id="pagerOfcommandListGrid"></div>
			<br>
		</article>
		<article class="col-sm-6 col-md-6 col-lg-6">
			<div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false">
				<header>
					<span class="widget-icon"> <i class="fa fa-eye"></i> </span>
					<h2>Command Information</h2>

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

						<form class="form-horizontal" id="commandRegForm">
							<fieldset>
								<customTag:inputbox label="Command" id="cmd" required="required"/>
								<customTag:textbox label="Description" id="descr" rows="3" />
								<customTag:inputsearch label="NE ID" id="neId" required="required"/>
								<customTag:selectbox id="sendRecvInd" label="Send/Recevie" codeType="PvsSendReceive" required="required"/>
								<customTag:selectbox id="syncAsyncInd" label="Synch/Asynch" codeType="PvsSyncAsync" required="required"/>
								<customTag:selectbox id="actionCd" label="Action Code" codeType="EventCd"/>
								<customTag:inputbox label="Creation Date" id="sysCreationDate" disabled="disabled" value=""/>
								<customTag:inputbox label="Changed Date" id="sysUpdateDate" disabled="disabled"/>
								<customTag:inputbox label="Operator ID" id="operatorId" disabled="disabled"/>
							</fieldset>
							
						</form>
						
						<div class="form-actions">
							<div class="row">
								<div class="col-md-12">
									<customTag:button label="Upload" id="uploadCmdBtn" css="success" size="xs" userDefine="method='POST'"/>
									<customTag:button label="New" id="newCommandBtn" css="success" size="xs" userDefine="method='POST'"/>
									<customTag:button label="Delete" id="delCommandBtn" css="success" size="xs" userDefine="method='DELETE'"/>
									<customTag:button label="Save" id="saveCommandBtn" css="success" size="xs" userDefine="method='POST'"/>
								</div>
							</div>
						</div>		
	
					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
			<br>
		</article>
		
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<div class="jarviswidget" id="wid-id-7" data-widget-editbutton="false" data-widget-fullscreenbutton="false" data-widget-custombutton="false" data-widget-sortable="false">
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
					<ul class="nav nav-tabs pull-left in">

						<li class="active">

							<a data-toggle="tab" href="#selectedInputParamTab" id="selectedInputParamTabLink"> <i class="fa fa-lg fa-arrow-circle-o-down"></i> <span class="hidden-mobile hidden-tablet"> Command Input Parameter Information </span> </a>

						</li>

						<li>
							<a data-toggle="tab" href="#selectedOutputParamTab" id="selectedOutputParamTabLink"> <i class="fa fa-lg fa-arrow-circle-o-up"></i> <span class="hidden-mobile hidden-tablet"> Command Output Parameter Information </span> </a>
						</li>

					</ul>
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

						<div class="tab-content">
							<div class="tab-pane active" id="selectedInputParamTab">

								<div class="row">
									<!-- NEW WIDGET START -->
									<article class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
										<table id="selectableInputParamListGrid"></table>
										<div id="pagerOfselectableInputParamListGrid"></div>
									</article>
									<article class="col-xs-1 col-sm-1 col-md-1 col-lg-1">
										<div class="row">
											<div class="widget-body col-xs-12 col-sm-12 col-md-12 col-lg-12">
												<ul class="bs-glyphicons" >
													<li id="appendInputParameterBtn">
													<span class="glyphicon glyphicon-chevron-right"></span>
													</li>
												</ul>
											</div>
											<div class="widget-body col-xs-12 col-sm-12 col-md-12 col-lg-12">
												<ul class="bs-glyphicons">
													<li id="removeInputParameterBtn">
													<span class="glyphicon glyphicon-chevron-left"></span>
													</li>
												</ul>
											</div>
										</div>
									</article>
									<article class="col-xs-7 col-sm-7 col-md-7 col-lg-7">
										<table id="selectedInputParamListGrid"></table>
										<div id="pagerOfselectedInputParamListGrid"></div>
									</article>
									<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
										<div class="form-actions">
											<div class="row">
												<div class="col-md-12">
													<customTag:button label="Upload" id="uploadCmdParamBtn" css="success" size="xs" userDefine="method='POST'"/>
													<customTag:button label="Save" id="saveCommandParamBtn" userDefine="reqResInd='I'" css="success" size="xs"/>
												</div>
											</div>	
										</div>
									</article>
								</div>

							</div>
							<div class="tab-pane" id="selectedOutputParamTab">

								<div class="row">
									<!-- NEW WIDGET START -->
									<article class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
										<table id="selectableOutputParamListGrid"></table>
										<div id="pagerOfselectableOutputParamListGrid"></div>
									</article>
									<article class="col-xs-1 col-sm-1 col-md-1 col-lg-1">
										<div class="row">
											<div class="widget-body col-xs-12 col-sm-12 col-md-12 col-lg-12">
												<ul class="bs-glyphicons" >
													<li id="appendOutputParameterBtn">
													<span class="glyphicon glyphicon-chevron-right"></span>
													</li>
												</ul>
											</div>
											<div class="widget-body col-xs-12 col-sm-12 col-md-12 col-lg-12">
												<ul class="bs-glyphicons">
													<li id="removeOutputParameterBtn">
													<span class="glyphicon glyphicon-chevron-left"></span>
													</li>
												</ul>
											</div>
										</div>
									</article>
									<article class="col-xs-7 col-sm-7 col-md-7 col-lg-7">
										<table id="selectedOutputParamListGrid"></table>
										<div id="pagerOfselectedOutputParamListGrid"></div>
									</article>
									<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
										<div class="form-actions">
											<div class="row">
												<div class="col-md-12">
													<customTag:button label="Save" id="saveCommandParamBtn" userDefine="reqResInd='O'" css="success" size="xs"/>
												</div>
											</div>	
										</div>
									</article>
								</div>

							</div>
						</div>

					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
		</article>
		<!-- WIDGET END -->

	</div>
	<!-- end row -->		
</section>
<!-- end widget grid -->

<script type="text/javascript">
var pagedestroy = function(){
	//alert('page destroy!');
	console.log('command list page destroy');
	cmdDataDeleteGridData = null;
	selectedInputRowId = null;
	selectedOutputRowId = null;
}
var getNeInfoCallBack = function(neInfo){
	$("#neId").val(neInfo.neId);
}
var refreshCmdGridList = function(){
	jQuery("#commandListGrid").reloadGrid();
}
var refreshCmdParamGridList = function(){
	jQuery("#selectedInputParamListGrid").reloadGrid();
}
var selectedInputRowId = null;
var selectedOutputRowId = null;
var cmdDataDeleteGridData = null ;
$(function(e) {
	
	pageSetUp(); //Default Call function
	loadScript(baseScriptUrl + '/co/form.custom.validator.js');
	pagefunction();
	function pagefunction() {
		
		CODE.sync('PvsSendReceive', 'PvsSyncAsync', 'EventCd');
		
		run_jqgrid_function();
		
		var featureParam = '';
		function getFeatureList(neId){
			featureParam = "";
			var rules = new Array();
			rules.push({'field':'ne_id', 'op':'eq', 'data':neId}); 		
			var searchJson = {'groupOp':'AND', 'rules':rules };
			var postData = {'filters':JSON.stringify(searchJson), 'sidx' : 'ne_id', 'sord' : 'asc', 'page':1};
			$.ajax({
				type : 'POST',
				async : false,
				url : '<s:url value="/feature/list"/>', 
				//contentType: "application/json",
				dataType : 'json',
				data : postData, 
				success : function(data) {
					var rows = data.rows ;
					for(var i=0; i< rows.length; i++){
						var ftrCd = rows[i].ftrCd ;
						featureParam += ftrCd +':'+ftrCd +';'
					}
					if(featureParam.length>0){
						featureParam = featureParam.substring(0, featureParam.length-1);
					}
				},	error:function(data){
					MessageBox.error(data, "<s:message code="err.500"/>");
				}, complete:function(jqXHR, textStatus){
					$("#content").complete();
				}
			});	
			return featureParam ;
		}
		function run_jqgrid_function() {

			jQuery("#commandListGrid").jqGrid({
				url : '<s:url value="/command/search"/>', 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    //postData : {'filterMaps': JSON.stringify({'page' : 1, 'dateType': '1', 'reqDt': '<fmt:formatDate pattern="yyyyMMdd" value="${curDate}" />'})},
				datatype : 'json',
				height : '330px',
				colNames : [  "Command"	
				            , "NE ID"				
				            , "H_Send/Receive"			
				            , "Send/Receive"			
				            , "H_Synch/Asynch"			
				            , "Sync/Async"			
				            , "H_Action Code"			
				            , "Action Code"			
				            , "Description"			
				            , "Creation Date"	 
				            , "Changed Date"	 
				            , "Operator ID"	],
				colModel : [
					{ name : 'cmd', 		 	index : 'cmd',				width : 150 }, 
					{ name : 'neId', 	 		index : 'ne_id',			align : 'center',	width : 70}, 
					{ name : 'sendRecvInd', 	index : 'send_recv_ind',	hidden : true}, 
					{ name : 'sendRecvName', 	index : 'send_recv_ind',	width : 140}, 
					{ name : 'syncAsyncInd',	index : 'sync_async_ind',	hidden : true}, 
					{ name : 'syncAsyncName',	index : 'sync_async_ind',	width : 70,	align : 'left'}, 
					{ name : 'actionCd', 	 	index : 'action_cd',		hidden : true}, 
					{ name : 'actionCdName', 	index : 'action_cd',		width : 130,		align : 'left'}, 
					{ name : 'descr', 	 	  	index : 'descr',			width : 140,		align : 'left'}, 
					{ name : 'sysCreationDate', index : 'sys_creation_date',align : 'center',   width : 110, formatter:formatters["dateTime"], search: false}, 
					{ name : 'sysUpdateDate', 	index : 'sys_update_date',  align : 'center',   width : 110, formatter:formatters["dateTime"], search: false}, 
					{ name : 'operatorId', 		index : 'operator_id', 		align : 'center',	width : 90 }
				],
				rowNum : 10, //-1 : all data
				rowList : [10, 20, 50, 100], // 한번에 보기 갯수 목록 
				pager : '#pagerOfcommandListGrid',
				sortname : 'cmd',
				sortorder : "asc", 
				caption : "Command List",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : false,
				autowidth : true,				
				//width : 'auto',//$("#content").width(),
			   	shrinkToFit: false,
			   	hidegrid: true,
			   	beforeProcessing : function(data, status, xhr){
					var rows = data.rows ;
					for(var i=0;i<rows.length;i++){
						rows[i].sendRecvName = CODE.name('PvsSendReceive', rows[i].sendRecvInd); 
						rows[i].syncAsyncName = CODE.name('PvsSyncAsync', rows[i].syncAsyncInd); 
						rows[i].actionCdName = CODE.name('EventCd', rows[i].actionCd); 
					}
				},
			   	onSelectRow: function(ids) {
			   		var data = $('#commandListGrid').getGridDataByRowId(ids);
			   		$('#commandRegForm').bindingFormData(data);
			   		$('#saveCommandBtn').attr('method', 'PUT');
			   		$('#cmd, #neId, #neIdSearchBtn').prop('disabled', true);
			   					   		
					var rules = new Array();
					rules.push({'field' : 'ne_id', 'op' : 'eq', 'data' : data.neId}); 		
					var searchJson = {'groupOp' : 'AND', 'rules' : rules, };
					var postData = {'filters' : JSON.stringify(searchJson), 'page' : 1};
					
					//selectable input parameter 목록
					jQuery("#selectableInputParamListGrid").jqGrid('setGridParam',{url:'<s:url value="/param/search"/>?neId='+data.neId, postData : postData});
					jQuery("#selectableInputParamListGrid").trigger('reloadGrid');
					//selectable output parameter 목록
					jQuery("#selectableOutputParamListGrid").jqGrid('setGridParam',{url:'<s:url value="/param/search"/>?neId='+data.neId, postData : postData});
					jQuery("#selectableOutputParamListGrid").trigger('reloadGrid');
					
					//selected input parameter 목록
					rules = new Array();
					rules.push({'field':'cmd', 'op':'eq', 'data':data.cmd}); 		
					rules.push({'field':'ne_id', 'op':'eq', 'data':data.neId}); 		
					rules.push({'field':'req_rsp_ind', 'op':'eq', 'data':'I'});
					searchJson = {'groupOp':'AND', 'rules':rules };
					postData = {'filters':JSON.stringify(searchJson), 'page':1};
					jQuery("#selectedInputParamListGrid").jqGrid('setGridParam',{url:'<s:url value="/paramseq/search"/>?cmd='+data.cmd, postData:postData});
					jQuery("#selectedInputParamListGrid").trigger('reloadGrid');
					
					//selected output parameter 목록
					rules = new Array();
					rules.push({'field':'cmd', 'op':'eq', 'data':data.cmd}); 		
					rules.push({'field':'ne_id', 'op':'eq', 'data':data.neId}); 		
					rules.push({'field':'req_rsp_ind', 'op':'eq', 'data':'O'});
					searchJson = {'groupOp':'AND', 'rules':rules };
					postData = {'filters':JSON.stringify(searchJson), 'page':1};
					jQuery("#selectedOutputParamListGrid").jqGrid('setGridParam',{url:'<s:url value="/paramseq/search"/>?cmd='+data.cmd, postData:postData});
					jQuery("#selectedOutputParamListGrid").trigger('reloadGrid');
					
					//neId별 feature목록 세팅
					var featureParam = getFeatureList(data.neId);
					$("#selectedInputParamListGrid").setColProp('ftrCd', { editoptions: { value: featureParam}});
					$("#selectedOutputParamListGrid").setColProp('ftrCd', { editoptions: { value: featureParam}});
					
					cmdDataDeleteGridData = null; 
				}			
			});
				
			jQuery("#commandListGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			jQuery("#commandListGrid").jqGrid('navGrid', "#pagerOfcommandListGrid"
				,{edit:false,add:false,del:false} // Setting for buttons
				,{closeOnEscape : true, multipleSearch : true, closeAfterSearch : true } //setting for search option
			);
			
			//선택대상 input param
			jQuery("#selectableInputParamListGrid").jqGrid({
				url : '<s:url value="/param/search"/>', 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    postData : {'filterMaps': JSON.stringify({'page' : 1, neId : 'x'})},
				datatype : 'json',
				colNames : [ "Parameter ID"	
				            , "Parameter Name"		
				            , "Description"		
				            , "NE ID"		
				            , "Param Type"		
				            , "Max Length"		
				            , "Default Value"		
				            , "Creation Date"	 
				            , "Changed Date"	 
				            , "Operator ID"			
				            ],
				colModel : [
					{ name : 'pvParamId', 		index : 'pv_param_id',		align : 'left',		width : 120}, 
					{ name : 'csParamId', 		index : 'cs_param_id',		align : 'left' ,	width : 120}, 
					{ name : 'descr', 			index : 'descr',			align : 'left' ,	width : 120}, 
					{ name : 'neId', 			index : 'ne_id', 			align : 'center',	width : 60}, 
					{ name : 'paramType', 		index : 'param_type', 		align : 'center',	width : 80}, 
					{ name : 'paramMaxLen', 	index : 'param_max_len', 	align : 'center',	width : 80}, 
					{ name : 'defValue', 		index : 'def_value', 		align : 'left',		width : 110}, 
					{ name : 'sysCreationDate', index : 'sys_creation_date',align : 'center',   width : 110, formatter:formatters["dateTime"]}, 
					{ name : 'sysUpdateDate', 	index : 'sys_update_date',  align : 'center',   width : 110, formatter:formatters["dateTime"]}, 
					{ name : 'operatorId', 		index : 'operator_id', 		align : 'center',	width : 100 }
					],
				rowNum : 10, //-1 : all data
				rowList : [10, 20, 50, 100], // 한번에 보기 갯수 목록 
				pager : '#pagerOfselectableInputParamListGrid',
				sortname : 'pv_param_id',
				sortorder : "asc",
				caption : "Selectable Parameter List",
				toolbarfilter: false,
				viewrecords : true,				
				multiselect : true,
				height : '330px', //10개:330px, 15개 : 490px 
				autowidth : true,				
			   	shrinkToFit: false,
			   	hidegrid: true,		
			   	beforeProcessing : function(data, status, xhr){
					
				}				
			});
			function beforeSearchEvent(trgtObj){
				var rule = {'field' : 'ne_id', 'op' : 'eq', 'data' : $('#neId').val()};				
				var postData = $(trgtObj).jqGrid('getGridParam', 'postData');
				var searchData = jQuery.parseJSON(postData.filters);
				searchData.rules.push(rule);
				postData.filters = JSON.stringify(searchData);
				$(trgtObj).jqGrid('setGridParam',{url:'<s:url value="/param/search"/>?neId='+$('#neId').val(), postData : postData});
			}
			function beforeRefreshEvent(trgtObj){
				//not working function...
				var rule = {'field' : 'ne_id', 'op' : 'eq', 'data' : $('#neId').val()};				
				var postData = $(trgtObj).jqGrid('getGridParam', 'postData');
				var searchData = jQuery.parseJSON(postData.filters);
				postData.filters = JSON.stringify(searchData);
				$(trgtObj).jqGrid('setGridParam',{url:'<s:url value="/param/search"/>?neId='+$('#neId').val(), postData : postData});
				return false ;
			}
			jQuery("#selectableInputParamListGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn', 
				beforeSearch: function() {
					beforeSearchEvent($("#selectableInputParamListGrid"));
				}
			});
			jQuery("#selectableInputParamListGrid").jqGrid('navGrid', "#pagerOfselectableInputParamListGrid"
					,{edit:false,add:false,del:false, refresh:false, search:false, beforeRefresh : function(){
						return beforeRefreshEvent($("#selectableInputParamListGrid"));
				    }} // Setting for buttons
					,{closeOnEscape : true, multipleSearch : true, closeAfterSearch : true } //setting for search option
				);
			//선택된 input param
			jQuery("#selectedInputParamListGrid").jqGrid({
				url : '<s:url value="/feature/0/chosen"/>',
			    mtype: 'POST',
				datatype : 'json',
				//postData : {page : 1},
				height : '395px', //10개:330px, 15개 : 490px 
				colNames : [  "H_Command"
				            , "H_NeId"	
				            , "H_reqRspInd"	
				            , "Parameter ID"	
				            , "Feature Code"	
				            , "Multi Level Ind"
				            , "Param Level"
				            , "Parent Param ID"
				            , "Param Seq No"
				            , "H_userDefValue"
				            , "Mandatory Flag"
				            , "Default Label"
				            , "Default Value"
				            , "H_Operator ID"
				            , "H_WorkType"
				            ],
				colModel : [
					{ name : 'cmd', 			index : 'cmd',				hidden : true}, 
					{ name : 'neId', 			index : 'ne_id', 			hidden : true}, 
					{ name : 'reqRspInd', 		index : 'req_rsp_ind',		hidden : true}, 
					{ name : 'paramId', 		index : 'param_id',			align : 'left',		width : 120}, 
					{ name : 'ftrCd', 			index : 'ftr_cd',			align : 'left',		width : 90,	editable : true, edittype:"select", editoptions:{value:featureParam}}, 
					{ name : 'multiLevelInd', 	index : 'multi_level_ind',	align : 'center',	width : 90,	editable : true, edittype:"select",editoptions:{value:"Yes:Y;No:N"}}, 
					{ name : 'paramLevel', 		index : 'param_level',		align : 'center',	width : 80,		editable : true, editoptions:{type:"number", maxlength:"5"}}, 
					{ name : 'parentParamId', 	index : 'parent_Param_Id',	align : 'center',	width : 120,	editable : true}, 
					{ name : 'paramSeqNo', 		index : 'param_Seq_No',		align : 'center',	width : 90,		editable : true, editoptions:{type:"number", maxlength:"5"}, editrules: {required: true}}, 
					{ name : 'userDefValue', 	index : 'user_Def_Value', 	hidden : true}, 
					{ name : 'mandatoryFlag', 	index : 'mandatory_Flag', 	align : 'center',	width : 90,		editable : true, edittype:"select",editoptions:{value:"Yes:Y;No:N"}}, 
					{ name : 'defLabel', 		index : 'def_Label', 		align : 'left',		width : 110,	editable : true}, 
					{ name : 'defValue', 		index : 'def_Value', 		align : 'left',		width : 110,	editable : true}, 
					{ name : 'operatorId', 		index : 'operator_id', 		align : 'center',	width : 100, 	hidden : true},
					{ name : 'workType', 		index : 'workType', 		align : 'center',	width : 100, 	hidden : true}
					],
				rowNum : -1, //-1 : all data
				//rowList : [10, 20, 50, 100],
				//pager : '#pagerOfselectedInputParamListGrid',
				sortname : 'param_Seq_No',
				sortorder : "asc",
				caption : "Selected Parameter List",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : true, 
				autowidth : true,
			   	shrinkToFit: false, 
			   	hidegrid: true,
			   	editurl:'clientArray',
			   	cellSubmit: 'clientArray', 
				beforeProcessing : function(data, status, xhr){//필요시 데이타 변경 
				},
				gridComplete : function(data){
					
				},
				onSelectRow : function(rowId){
					var data = $('#selectedInputParamListGrid').getGridDataByRowId(rowId);
					var workType = 'UPDATE';
					if(data.workType == 'CREATE'){ //create - > create, none ->update, update -> update
						workType = 'CREATE';
					}
					$('#selectedInputParamListGrid').updateGridData(rowId, {workType : workType});
					if(selectedInputRowId != rowId){
						if(selectedInputRowId != null){
							$('#selectedInputParamListGrid').saveRow(selectedInputRowId);
						}
						selectedInputRowId = rowId ;
					}
					$('#selectedInputParamListGrid').editRow(rowId);
				}
			});
			
			//선택대상 output param
			jQuery("#selectableOutputParamListGrid").jqGrid({
				url : '<s:url value="/param/search"/>', 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    postData : {'filterMaps': JSON.stringify({'page' : 1, neId : 'x'})},
				datatype : 'json',
				colNames : [ "Parameter ID"	
				            , "Parameter Name"		
				            , "Description"		
				            , "NE ID"		
				            , "Param Type"		
				            , "Max Length"		
				            , "Default Value"		
				            , "Creation Date"	 
				            , "Changed Date"	 
				            , "Operator ID"			
				            ],
				colModel : [
					{ name : 'pvParamId', 		index : 'pv_param_id',		align : 'left',		width : 120}, 
					{ name : 'csParamId', 		index : 'cs_param_id',		align : 'left' ,	width : 120}, 
					{ name : 'descr', 			index : 'descr',			align : 'left' ,	width : 120}, 
					{ name : 'neId', 			index : 'ne_id', 			align : 'center',	width : 60}, 
					{ name : 'paramType', 		index : 'param_type', 		align : 'center',	width : 80}, 
					{ name : 'paramMaxLen', 	index : 'param_max_len', 	align : 'center',	width : 80}, 
					{ name : 'defValue', 		index : 'def_value', 		align : 'left',		width : 110}, 
					{ name : 'sysCreationDate', index : 'sys_creation_date',align : 'center',   width : 110, formatter:formatters["dateTime"]}, 
					{ name : 'sysUpdateDate', 	index : 'sys_update_date',  align : 'center',   width : 110, formatter:formatters["dateTime"]}, 
					{ name : 'operatorId', 		index : 'operator_id', 		align : 'center',	width : 100 }
					],
				rowNum : 10, //-1 : all data
				rowList : [10, 20, 50, 100], // 한번에 보기 갯수 목록 
				pager : '#pagerOfselectableOutputParamListGrid',
				sortname : 'pv_param_id',
				sortorder : "asc",
				caption : "Selectable Output Parameter List",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : true,
				height : '330px', //10개:330px, 15개 : 490px 
				autowidth : true,				
			   	shrinkToFit: false,
			   	hidegrid: true,		
			   	beforeProcessing : function(data, status, xhr){
					
				}
			});
			
			jQuery("#selectableOutputParamListGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn', 
				beforeSearch: function() {
					beforeSearchEvent($("#selectableOutputParamListGrid"));
				}
			});
			jQuery("#selectableOutputParamListGrid").jqGrid('navGrid', "#pagerOfselectableOutputParamListGrid"
					,{edit:false,add:false,del:false, refresh:false, search:false, beforeRefresh : function(){
						return beforeRefreshEvent($("#selectableOutputParamListGrid"));
				    }} // Setting for buttons
					,{closeOnEscape : true, multipleSearch : true, closeAfterSearch : true } //setting for search option
				);
			//선택된 output param 
			jQuery("#selectedOutputParamListGrid").jqGrid({
				url : '<s:url value="/feature/0/chosen"/>',
			    mtype: 'POST',
				datatype : 'json',
				//postData : {page : 1},
				height : '395px', //10개:330px, 15개 : 490px 
				colNames : [  "H_Command"
				            , "H_NeId"	
				            , "H_reqRspInd"	
				            , "Parameter ID"	
				            , "Feature Code"	
				            , "Multi Level Ind"
				            , "Param Level"
				            , "Parent Param ID"
				            , "Param Seq No"
				            , "H_userDefValue"
				            , "Mandatory Flag"
				            , "Default Label"
				            , "Default Value"
				            , "H_Operator ID"			
				            , "H_workType"			
				            ],
				colModel : [
					{ name : 'cmd', 			index : 'cmd',				hidden : true}, 
					{ name : 'neId', 			index : 'ne_id', 			hidden : true}, 
					{ name : 'reqRspInd', 		index : 'req_rsp_ind',		hidden : true}, 
					{ name : 'paramId', 		index : 'param_id',			align : 'left',		width : 120}, 
					{ name : 'ftrCd', 			index : 'ftr_cd',			align : 'left',		width : 90,	editable : true, edittype:"select", editoptions:{value:featureParam}}, 
					{ name : 'multiLevelInd', 	index : 'multi_level_ind',	align : 'center',	width : 90,	editable : true, edittype:"select",editoptions:{value:"Yes:Y;No:N"}}, 
					{ name : 'paramLevel', 		index : 'param_level',		align : 'center',	width : 80,		editable : true, editoptions:{type:"number", maxlength:"5"}}, 
					{ name : 'parentParamId', 	index : 'parent_Param_Id',	align : 'center',	width : 120,	editable : true}, 
					{ name : 'paramSeqNo', 		index : 'param_Seq_No',		align : 'center',	width : 90,		editable : true, editoptions:{type:"number", maxlength:"5"}, editrules: {required: true}}, 
					{ name : 'userDefValue', 	index : 'user_Def_Value', 	hidden : true}, 
					{ name : 'mandatoryFlag', 	index : 'mandatory_Flag', 	align : 'center',	width : 90,		editable : true, edittype:"select",editoptions:{value:"Yes:Y;No:N"}}, 
					{ name : 'defLabel', 		index : 'def_Label', 		align : 'left',		width : 110,	editable : true}, 
					{ name : 'defValue', 		index : 'def_Value', 		align : 'left',		width : 110,	editable : true}, 
					{ name : 'operatorId', 		index : 'operator_id', 		align : 'center',	width : 100, 	hidden : true},
					{ name : 'workType', 		index : 'workType', 		align : 'center',	width : 100, 	hidden : true}
					],
				rowNum : -1, //-1 : all data
				//rowList : [10, 20, 50, 100],
				sortname : 'param_Seq_No',
				sortorder : "asc",
				caption : "Selected Parameter List",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : true,
				autowidth : true,
			   	shrinkToFit: false, 
			   	hidegrid: true,
				editurl:'clientArray',
			   	cellSubmit: 'clientArray', 
				beforeProcessing : function(data, status, xhr){//필요시 데이타 변경 
				},
				gridComplete : function(data){
					
				},
				onSelectRow : function(rowId){
					var data = $('#selectedOutputParamListGrid').getGridDataByRowId(rowId);
					var workType = 'UPDATE';
					
					if(data.workType == 'CREATE'){ //create - > create, none ->update, update -> update
						workType = 'CREATE';
					}
					
					$('#selectedOutputParamListGrid').updateGridData(rowId, {workType : workType});
					if(selectedOutputRowId != rowId){
						if(selectedOutputRowId != null){
							$('#selectedOutputParamListGrid').saveRow(selectedOutputRowId);
						}
						selectedOutputRowId = rowId ;
					}
					$('#selectedOutputParamListGrid').editRow(rowId);
				}
			});
			
			// Add tooltips
			$('.navtable .ui-pg-button').tooltip({
				container : 'body'
			});
		  
			//브라우져 사이즈 조정시 마다 그리드 사이즈 조정		    
		    $(window).on('resize.jqGrid', function () {
				jQuery("#commandListGrid").resizeGridWidth();
				jQuery("#selectableInputParamListGrid").resizeGridWidth();
				jQuery("#selectedInputParamListGrid").resizeGridWidth();
				jQuery("#selectableOutputParamListGrid").resizeGridWidth();
				jQuery("#selectedOutputParamListGrid").resizeGridWidth();
			});
		} // end of jqgrid function
		
		$("#appendInputParameterBtn").click(function(e){
			e.preventDefault();
			var product = $("#commandListGrid").selGridData();
			if(product == null){
				MessageBox.alert("Select command list!");
				return ;
			}
			var data = $("#selectableInputParamListGrid").selGridData(false);
			
			if(data != null){
				var exist = $("#selectedInputParamListGrid").compareGridData('paramId', 'pvParamId', data); 
				if(!exist){
					$.each(data, function(idx, obj){
						obj['reqRspInd'] = 'I';
						obj['cmd'] = $("#cmd").val();
						obj['paramId'] = obj['pvParamId'];
						obj['workType'] = 'CREATE';
					});
					$("#selectedInputParamListGrid").addGridData(data);	
				}
			}else{
				MessageBox.alert("Select left parameter list!");
			}
		});
		
		$("#removeInputParameterBtn").click(function(e){
			e.preventDefault();
			$("#selectedInputParamListGrid").saveAllGridRow();
			var data = $("#selectedInputParamListGrid").selGridData();
			if(data != null){
				$.each(data, function(idx, obj){
					if(obj['workType'] == 'CREATE'){ //none/update ==> DELETE , create : x 
						delete obj ;
					}else{
						obj['workType'] = 'DELETE';
					}
				});
				cmdDataDeleteGridData = combineArrayData(cmdDataDeleteGridData, data) ;
				$("#selectedInputParamListGrid").deleteGridData();
			}else{
				dataBox.alert("Select right parameter list!");
			}
		});
		
		$("#appendOutputParameterBtn").click(function(e){
			e.preventDefault();
			var product = $("#commandListGrid").selGridData();
			if(product == null){
				MessageBox.alert("Select command list!");
				return ;
			}
			var data = $("#selectableOutputParamListGrid").selGridData(false);
			
			if(data != null){
				var exist = $("#selectedOutputParamListGrid").compareGridData('paramId', 'pvParamId', data);
				if(!exist){
					$.each(data, function(idx, obj){
						obj['reqRspInd'] = 'O';
						obj['cmd'] = $("#cmd").val();
						obj['paramId'] = obj['pvParamId'];
						obj['workType'] = 'CREATE';
					});
					$("#selectedOutputParamListGrid").addGridData(data);	
				}
			}else{
				MessageBox.alert("Select left parameter list!");
			}
		});
		
		$("#removeOutputParameterBtn").click(function(e){
			e.preventDefault();
			var data = $("#selectedOutputParamListGrid").selGridData();
			if(data != null){
				$.each(data, function(idx, obj){
					if(obj['workType'] == 'CREATE'){ //none/update ==> DELETE , create : x 
						delete obj ;
					}else{
						obj['workType'] = 'DELETE';
					}
				});
				cmdDataDeleteGridData = combineArrayData(cmdDataDeleteGridData, data) ;
				$("#selectedOutputParamListGrid").deleteGridData();
			}else{
				dataBox.alert("Select right parameter list!");
			}
		});
		
		$("#newCommandBtn").click(function(e){
			e.preventDefault();
			$('#saveCommandBtn').attr('method', 'POST');
			$('#commandRegForm').trigger('reset');
			$('#cmd, #neId, #neIdSearchBtn').prop('disabled', false);
			
			jQuery("#commandListGrid").trigger('reloadGrid');
			
			jQuery("#selectedInputParamListGrid").jqGrid('setGridParam',{url:'<s:url value="/paramseq/search"/>?cmd=0'});
			jQuery("#selectedInputParamListGrid").trigger('reloadGrid');
			
			jQuery("#selectedOutputParamListGrid").jqGrid('setGridParam',{url:'<s:url value="/paramseq/search"/>?cmd=0'});
			jQuery("#selectedOutputParamListGrid").trigger('reloadGrid');
		});
		
		$("#saveCommandBtn").click(function(e){
			e.preventDefault();
			
			if(!$('#commandRegForm').formValidate()){
				return ;
			}
			var cmd = $('#cmd').val();						
			var data = {cmd : cmd 
						, neId: $('#neId').val()
						, descr: $('#descr').val()
						, sendRecvInd: $('#sendRecvInd').val()
						, syncAsyncInd: $('#syncAsyncInd').val()
						, actionCd: $('#actionCd').val()
						} ;
			console.log("sending data === "+JSON.stringify(data));
			$("#content").processing();
			$.ajax({
				type : $('#saveCommandBtn').attr('method'),
				async : true,
				url : '<s:url value="/command/"/>' + cmd, 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(data),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						MessageBox.alert('Saved!', function(){
							jQuery("#commandListGrid").reloadGrid();
							$("#newCommandBtn").trigger('click');
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
		
		$("#delCommandBtn").click(function(e){
			e.preventDefault();
			var cmd = $('#cmd').val();
			var neId = $('#neId').val();
			var data = {'cmd': cmd, 'neId': neId, 'workType': 'DELETE'} ;
			if(cmd == ''){
				MessageBox.alert('Select command to delete!');
				return ;
			}
			console.log("submit data == "+ JSON.stringify(data));
			
			$("#content").processing();
			$.ajax({
				type : 'DELETE',
				url : '<s:url value="/command/"/>'+cmd, 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(data),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						jQuery("#commandListGrid").reloadGrid();
						$("#newCommandBtn").trigger('click');
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
		
		$("#neIdSearchBtn").click(function(e){
			e.preventDefault();
			Dialog.open({
				div : '#networkElementDialog', 
				url : '<s:url value="/neInfosDialog"/>?callBack=getNeInfoCallBack', 
				title :'Select Network Element', 
				width : 650, 
				height : 575
			}); 
		});
		
		$("[id=saveCommandParamBtn]").click(function(e){
			e.preventDefault();
			var reqResInd= $(this).attr('reqResInd');
			var data = null;
			if(reqResInd == 'I'){
				$("#selectedInputParamListGrid").saveAllGridRow();;
				data = $("#selectedInputParamListGrid").allGridData();
			}else{
				$("#selectedOutputParamListGrid").saveAllGridRow();;
				data = $("#selectedOutputParamListGrid").allGridData();
			}
			//saveAllGrid의 함수가 좀 늦어지면 input tag가 send data에 포함되어 시간차를 두었음...
			setTimeout(function(){
				var newParams = new Array();
				var deleteGridData = cmdDataDeleteGridData;
				//alert(JSON.stringify(deleteGridData));
				if(deleteGridData != null){
					$.each(deleteGridData, function(idx, obj){
						newParams.push(obj);
					});
				}
				
				if(data != null){
					$.each(data, function(idx, obj){
						if(obj['workType'] == ''){
							obj['workType'] = 'CREATE';
						}				
						newParams.push(obj);
					});
				}
				var cmd = $('#cmd').val();
				console.log("sending data === "+JSON.stringify(data));
				$("#content").processing();
				$.ajax({
					type : 'POST',
					async : true,
					url : '<s:url value="/paramseq/"/>' + cmd, 
					contentType: "application/json",
					dataType : 'json',
					data : JSON.stringify({provParamSeqs: newParams}),
					success : function(data) { 
						if(data.resultCode == 'SUCCESS'){
							MessageBox.alert('Saved!', function(){
								//jQuery("#commandListGrid").reloadGrid();
								//$("#newCommandBtn").trigger('click');
								if(reqResInd == 'I'){
									$("#selectedInputParamListGrid").reloadGrid();
								}else{
									$("#selectedOutputParamListGrid").reloadGrid();
								}
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
			},200);
			
		});
		$("#selectedInputParamTabLink").click(function(e){
			cmdDataDeleteGridData = null;
		});
		$("#selectedOutputParamTabLink").click(function(e){
			cmdDataDeleteGridData = null;
		});
		
		$("#uploadCmdBtn").click(function(e){
			e.preventDefault();
			Dialog.open({
				div : '#excelUploadDialog', 
				url : '<s:url value="/excelUpload/command"/>?callBack=refreshCmdGridList', 
				title :'Excel Upload', 
				width : 800, 
				height : 615
			}); 
		});
		
		$("#uploadCmdParamBtn").click(function(e){
			e.preventDefault();
			Dialog.open({
				div : '#excelUploadDialog', 
				url : '<s:url value="/excelUpload/cmdParameter"/>?callBack=refreshCmdParamGridList', 
				title :'Excel Upload', 
				width : 1000, 
				height : 615
			}); 
		});
	}// end pageFunction
	
});	
</script>