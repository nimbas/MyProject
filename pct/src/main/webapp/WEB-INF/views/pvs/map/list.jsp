<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- widget grid -->
<section id="widget-grid" class="">
	<div class="row">
		
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<div>
				<div class="row">
					<!-- NEW WIDGET START -->
					<article class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
						<table id="sourceCommandGrid"></table>
						<div id="pagerOfsourceCommandGrid"></div>
						<div style="height:10px">&nbsp;</div>
						<div class="row" style="text-align: right">
							<div class="col-md-12">
								<customTag:button label="Upload" id="uploadSrcCmdBtn" css="success" size="xs" userDefine="method='POST'"/>
								<customTag:button label="Delete" id="deleteMapDefBtn" css="success" size="xs"/>
								<customTag:button label="Add" id="addMapDefBtn" css="success" size="xs"/>
								<customTag:button label="Save" id="saveMapDefBtn" css="success" size="xs"/>
							</div>
						</div>
					</article>
					<article class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
						<table id="targetCommandGrid"></table>
						<div id="pagerOftargetCommandGrid"></div>
						<div style="height:10px">&nbsp;</div>
						<div class="row" style="text-align: right">
							<div class="col-md-12">
								<customTag:button label="Upload" id="uploadTrgtCmdBtn" css="success" size="xs" userDefine="method='POST'"/>
								<customTag:button label="Delete" id="deleteMapTargetBtn" css="success" size="xs"/>
								<customTag:button label="Add" id="addMapTargetBtn" css="success" size="xs"/>
								<customTag:button label="Save" id="saveMapTargetBtn" css="success" size="xs"/>
							</div>
						</div>
					</article>
					
					<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<br>
						<table id="parameterMapListGrid"></table>
						<div id="pagerOfparameterMapListGrid"></div>
						<div class="form-actions">
							<div class="row">
								<div class="col-md-12">
									<customTag:button label="Upload" id="uploadMapParamBtn" css="success" size="xs" userDefine="method='POST'"/>
									<customTag:button label="Delete" id="deleteSourceParameterBtn" css="success" size="xs"/>
									<customTag:button label="Save" id="saveSourceParameterBtn" css="success" size="xs"/>
								</div>
							</div>	
						</div>
					</article>					
				</div>
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
	console.log('product list page destroy');
	$("body").removeData('deleteGridData') ;
}
var refreshSrcCmdGridList = function(){
	jQuery("#sourceCommandGrid").reloadGrid();
}
var refreshTrgtCmdGridList = function(){
	jQuery("#targetCommandGrid").reloadGrid();
}
var refreshMapParamGridList = function(){
	jQuery("#sourceCommandGrid").reloadGrid();
}
var getSourceParamCallBack = function(rowid, sourceParam){
	//console.log('sourceParam = ' + JSON.stringify(sourceParam));
	var tdata = $('#parameterMapListGrid').getGridDataByRowId(rowid);
	console.log('sourceParam = ' + JSON.stringify(tdata));
	var workType = tdata['paramSeq.workType'] ;
	if(workType == 'NONE'){
		workType = 'UPDATE';
	}
	var data = {
		  fromNe 		: sourceParam.toNe
		, fromCmd 		: sourceParam.toCmd
		, fromFtrCd 	: sourceParam.toFtrCd
		, fromCmdIoInd 	: sourceParam['paramSeq.reqRspInd']
		, fromParamId 	: sourceParam.toParamId
		, defValue 		: sourceParam.defValue
		, 'paramSeq.workType' : workType
	};
	$('#parameterMapListGrid').updateGridData(rowid, data);
}
var selectSourceParam = function(rowid){
	Dialog.open({
		div : '#networkElementDialog', 
		url : '<s:url value="/map/param/source"/>?rowid='+rowid+'&callBack=getSourceParamCallBack', 
		title :'Select Abailable Parameter', 
		width : 650, 
		height : 620
	}); 
}
var gridComboBoxList = function(opt, url, srcTrgtInd, neId){
	var retDataStr = ":;";
	var rules = new Array();
	var postData = null ;
	if('ne' == opt){
		rules.push({'field':'src_trgt_ind', 'op':'eq', 'data': srcTrgtInd}); 		
		var searchJson = {'groupOp':'AND', 'rules':rules };
		postData = {'rows' : -1, 'filters':JSON.stringify(searchJson), 'sidx' : 'ne_id', 'sord' : 'asc', 'page':1};
	}else if('cmd' == opt){
		var send_recv_ind = srcTrgtInd == 'S' ? 'S' : 'R' ;
		rules.push({'field':'send_recv_ind', 'op':'eq', 'data':send_recv_ind}); 		
		rules.push({'field':'ne_id', 'op':'eq', 'data': neId}); 		
		var searchJson = {'groupOp':'AND', 'rules':rules };
		postData = {'rows' : -1, 'filters':JSON.stringify(searchJson), 'sidx' : 'cmd', 'sord' : 'asc', 'page':1};
	}else if('ftr' == opt){
		rules.push({'field':'src_trgt_ind', 'op':'eq', 'data': srcTrgtInd}); 		
		var searchJson = {'groupOp':'AND', 'rules':rules };
		postData = {'rows' : -1, 'filters':JSON.stringify(searchJson), 'sidx' : 'ftr_cd', 'sord' : 'asc', 'page':1};
	}else if('rollback' == opt){
		var send_recv_ind = 'R' ;
		rules.push({'field':'send_recv_ind', 'op':'eq', 'data':send_recv_ind}); 		
		rules.push({'field':'ne_id', 'op':'eq', 'data': neId}); 		
		var searchJson = {'groupOp':'AND', 'rules':rules };
		postData = {'rows' : -1, 'filters':JSON.stringify(searchJson), 'sidx' : 'cmd', 'sord' : 'asc', 'page':1};
	}else if('exception' == opt){
		postData = {neId : neId, 'rows' : -1, 'sidx' : 'exception_flow_id', 'sord' : 'asc', 'page':1};
	}
	
	$.ajax({
		type : 'POST',
		async : false,
		url : url, // , 
		//contentType: "application/json",
		dataType : 'json',
		//data : JSON.stringify(postData),
		data : postData,
		success : function(data) {
			console.log(opt + ' combo list box ['+srcTrgtInd+', '+url+'] == '+JSON.stringify(data));
			var rows = data.rows ;
			for(var i=0; i< rows.length; i++){
				var tmpCode ;
				if('ne' == opt){
					tmpCode = rows[i].neId ;
					
				}else if('cmd' == opt){
					tmpCode = rows[i].cmd ;
				}else if('ftr' == opt){
					tmpCode = rows[i].ftrCd ;
				}else if('rollback' == opt){
					tmpCode = rows[i].cmd ;
				}else if('exception' == opt){
					tmpCode = rows[i].exceptionFlowId ;
				}
				retDataStr += tmpCode +':'+tmpCode +';'
			}
			if(retDataStr.length>0){
				retDataStr = retDataStr.substring(0, retDataStr.length-1);
			}
		},	error:function(data){
			MessageBox.error(data, "<s:message code="err.500"/>");
		}, complete:function(jqXHR, textStatus){
		}
	});	
	
	return retDataStr ;
};
var changeNeInfo = function(srcTrgtInd, neId){
	var cmdList = gridComboBoxList('cmd', '<s:url value="/command/search"/>', srcTrgtInd, neId);
	if(srcTrgtInd == 'S'){
		$("#sourceCommandGrid").setColProp('srcCmd', { editoptions: { value: cmdList}});	
	}else{
		$("#targetCommandGrid").setColProp('trgtCmd', { editoptions: { value: cmdList}});
	}
	
};
var changeRollbackOrBranch = function(opt, neId){
	var url = '<s:url value="/command/search"/>';
	if(opt == 'exception'){
		url = '<s:url value="/map/exception/flow"/>';
	}
	var cmbList = gridComboBoxList(opt, url, null, neId);
	if(opt == 'rollback'){
		$("#targetCommandGrid").setColProp('rolebackNeCmd', { editoptions: { value: cmbList}});	
	}else{
		$("#targetCommandGrid").setColProp('exceptionFlowId', { editoptions: { value: cmbList}});
	}
	
};

var refreshTargetCommandGrid = function(data){
	//그리드 row 선택시 target command를 조회한다. 
	if(data.workType == 'CREATE'){
		jQuery("#targetCommandGrid").clearGrid();
		return ;
	}
	var rules = new Array();
	rules.push({'field':'src_ne_id', 'op':'eq', 'data':data.srcNeId}); 		
	rules.push({'field':'src_cmd', 'op':'eq', 'data':data.srcCmd}); 		
	rules.push({'field':'src_ftr_cd', 'op':'eq', 'data':data.srcFtrCd}); 		
	var searchJson = {'groupOp':'AND', 'rules':rules };
	var postData = {neId : data.srcNeId, 'filters':JSON.stringify(searchJson), 'sidx' : 'prov_order', 'sord' : 'asc', 'page':1};
	jQuery("#targetCommandGrid").jqGrid('setGridParam',{postData : postData});
	jQuery("#targetCommandGrid").trigger('reloadGrid');
	
	$('#parameterMapListGrid').clearGrid();
}
$(function(e) {
	
	pageSetUp(); //Default Call function
	pagefunction();
	
	function pagefunction() {
		
		run_jqgrid_function();
		var cellOfSourceCommand = {};
		var cellOfTargetCommand = {};
		function run_jqgrid_function() {

			var srcNeList = gridComboBoxList('ne', '<s:url value="/neInfo/search"/>', 'S', null) ;
			var trgtNeList = gridComboBoxList('ne', '<s:url value="/neInfo/search"/>', 'T', null) ;
			var srcCmdList = null ;
			var trgtCmdList = null ;
			var srcFtrList = gridComboBoxList('ftr', '<s:url value="/feature/search"/>', 'S', null) ;
			var trgtFtrList = gridComboBoxList('ftr', '<s:url value="/feature/search"/>', 'T', null) ;
			jQuery("#sourceCommandGrid").jqGrid({
				url : '<s:url value="/map/search"/>',
			    mtype: 'POST',
				datatype : 'json',
				height : '330px',//10개:330px, 15개 : 490px 
				colNames : [ "NE ID"	
				            , "Command"		
				            , "Feature Code"	
				            , "Operator ID"			
				            , "H_WorkType"			
				            //, "Action"			
				            ],
				colModel : [
					{ name : 'srcNeId', 		index : 'src_ne_id',		align : 'left' ,	width : 130,	editable:true, edittype:"select", 
								editoptions:{value: srcNeList}}, //, dataEvents: [{ type: 'blur', fn: changeNeInfo}]
					{ name : 'srcCmd', 			index : 'src_cmd',			align : 'left' ,	width : 150,	editable:true, edittype:"select", editoptions:{value: srcCmdList}}, 
					{ name : 'srcFtrCd', 		index : 'src_ftr_cd',		align : 'left',		width : 130,	editable:true, edittype:"select", editoptions:{value: srcFtrList}}, 
					{ name : 'operatorId', 		index : 'operator_id', 		hidden: true,		align : 'center',	width : 100 },
					{ name : 'workType', 		index : 'workType', 		hidden: true },
					//{ name : 'viewTargetCommand',index : 'viewTargetCommand', align : 'center',		width : 110, editable:false, sortable : false, search : false},
					],
				rowNum : 10, //-1 : all data
				rowList : [10, 20, 50, 100],
				pager : '#pagerOfsourceCommandGrid',
				sortname : 'src_ne_id',
				sortorder : "asc",
				caption : "Source Command",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : false,
				autowidth : false,
			   	shrinkToFit: true,
			   	hidegrid: true,
			   	cellEdit: true,
			   	//editurl:'clientArray',
			   	cellsubmit: 'clientArray', 
				beforeProcessing : function(data, status, xhr){//필요시 데이타 변경 
				},
				gridComplete: function(){
					//grid 완료시 버튼 생성
					/* var ids = jQuery("#sourceCommandGrid").jqGrid('getDataIDs');
					for(var i=0;i < ids.length;i++){
						var rowid = ids[i];
						var data = $('#sourceCommandGrid').getGridDataByRowId(rowid);
						if(data.workType != 'CREATE'){
							var viewTargetCommand = "<input style='height:26px; width : 100px' type='button' value='Target Command' onclick=\"jQuery('#sourceCommandGrid').setSelection('"+rowid+"');\"  />";
							jQuery("#sourceCommandGrid").jqGrid('setRowData',ids[i],{viewTargetCommand: viewTargetCommand});
						}
					} */	
				},
				onSelectCell : function(rowid, celname, value, iRow, iCol){
					
					// cell을 선택시 new 버튼으로 생성한 row에 대해서는 key항목에 대해서 선택 할 수 있게 한다.
					var data = $("#sourceCommandGrid").getGridDataByRowId(rowid);
					if(data.workType == 'CREATE' && celname != 'viewTargetCommand'){
						jQuery("#sourceCommandGrid").setColProp(celname,{editable:true});
						setTimeout(function(){jQuery("#sourceCommandGrid").editCell(iRow, iCol, true);}, 200);
					}else{
						refreshTargetCommandGrid(data);
					}
				},
				beforeSelectRow: function (rowid, e) {
					//그리드 row 선택전
					var data = $("#sourceCommandGrid").getGridDataByRowId(rowid);
					if(data.workType == 'NONE'){
				        //return false; // prevent selection and so the editing of the cell
				    }
					return true ;
				},	
				beforeEditCell: function (rowid, cellname, value, irow, icol) {
					
					// editable : true인 경우 cell 클릭시 입력값이 combobox인경우 해당 option을 db에서 읽어와 세팅한다.
					
					var data = $("#sourceCommandGrid").getGridDataByRowId(rowid);
					
					if(cellname == 'srcCmd'){//관련 source command 콤보 박스 생성
						changeNeInfo('S', data.srcNeId);	
					}
					if(data.workType != 'CREATE'){
						//기존 데이타의 경우 key값에 대해서 수정하지 못하도록 editable 옵션을 false로 변경한다.
						var colProp = jQuery("#sourceCommandGrid").getColProp('srcNeId');
						if(colProp.editable == true){
							setTimeout(function(){$("#sourceCommandGrid").saveCell(irow, icol);}, 100);
							//$("#targetCommandGrid").saveCell(irow, icol);
							jQuery("#sourceCommandGrid").setColProp('srcNeId',{editable:false});
							jQuery("#sourceCommandGrid").setColProp('srcCmd',{editable:false});
							jQuery("#sourceCommandGrid").setColProp('srcFtrCd',{editable:false});
						}
						
						//그리드 row 선택시 target command를 조회한다. 
						refreshTargetCommandGrid(data);
					}
					cellOfSourceCommand = {irow : irow, icol:icol};
				},
				afterSaveCell : function(rowid, cellname, value, iRow, iCol){
					//enter를 치거나 다른 cell로 이동시 저장되는 시점의 이벤트 처리
				} ,
				onSelectRow : function(rowid){
					//그리드 row 선택시 target command를 조회한다. 
					var data = $("#sourceCommandGrid").getGridDataByRowId(rowid);
					refreshTargetCommandGrid(data);
				}				
			});
			
			jQuery("#sourceCommandGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			jQuery("#targetCommandGrid").jqGrid({
				url : '<s:url value="/map/target/search"/>',
			    mtype: 'POST',
				datatype : 'json',
				postData : {neId : 0, page : 1},
				height : '395px', //10개:330px, 15개 : 490px 
				colNames : [  "Action"
				            , "H_NE ID"	
					        , "H_Command"		
					        , "H_Feature Code"	
					        , "Order"	
				            , "Target NE ID"	
				            , "Target Command"	
				            , "Target Feature Code"	
				            , "Error Continue Flag"		
				            , "Rollback or Branch"		
				            , "Roleback NE Command"		
				            , "Exception Flow"		
				            //, "Operator ID"
				            , "H_workType"	
				            ],
				colModel : [
					{ name : 'paramView', 		  index : 'paramView',			align : 'center',	width : 110,	sortable: false 	}, 
					{ name : 'srcNeId', 		  index : 'src_ne_id',			hidden : true },
					{ name : 'srcCmd', 			  index : 'src_cmd',			hidden : true }, 
					{ name : 'srcFtrCd', 		  index : 'src_ftr_cd',			hidden : true },
					{ name : 'provOrder', 		  index : 'prov_order',			align : 'center',	width : 70,     editable:true, editoptions:{type:"number", maxlength:"10"}, editrules: {required: true}}, 
					{ name : 'trgtNeId', 		  index : 'trgt_ne_id', 		align : 'left',		width : 110,	editable:true, edittype:"select", editoptions:{value: trgtNeList}, editrules: {required: true}}, 
					{ name : 'trgtCmd', 		  index : 'trgt_cmd', 			align : 'left',		width : 110,	editable:true, edittype:"select", editoptions:{value: trgtCmdList}, editrules: {required: true}}, 
					{ name : 'trgtFtrCd', 		  index : 'trgt_ftr_cd', 		align : 'left',		width : 110,	editable:true, edittype:"select", editoptions:{value: trgtFtrList}, editrules: {required: true}}, 
					{ name : 'errorContinueFlag', index : 'error_continue_flag',align : 'center',	width : 110,	editable:true, edittype:"select", editoptions:{value: 'Y:Y;N:N'}}, 
					{ name : 'rollbackOrBranch',  index : 'rollback_or_branch', align : 'center',	width : 110,	editable:true, edittype:"select", editoptions:{value: 'N:N;R:R;E:E'}}, 
					{ name : 'rolebackNeCmd', 	  index : 'roleback_ne_cmd', 	align : 'left',		width : 110,	editable:true, edittype:"select", editoptions:{value: ''}}, 
					{ name : 'exceptionFlowId',   index : 'exception_flow_id', 	align : 'left',		width : 110,	editable:true, edittype:"select", editoptions:{value: ''}}, 
					//{ name : 'operatorId', 		  index : 'operator_id', 		align : 'center',	width : 100 },
					{ name : 'workType', 		  index : 'workType', 			hidden: true}, 
					],
				rowNum : -1, //-1 : all data
				//rowList : [10, 20, 50, 100],
				//pager : '#pagerOftargetCommandGrid',
				sortname : 'prov_order',
				sortorder : "asc",
				caption : "Target Command",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : false,
				autowidth : true,
			   	shrinkToFit: false, 
			   	hidegrid: true,
			   	cellEdit: true,
			   	//editurl:'clientArray',
			   	cellsubmit: 'clientArray', 
				beforeProcessing : function(data, status, xhr){//필요시 데이타 변경 
				},
				afterSaveCell: function (rowid, cellname, value, irow, icol) {
					var data = $("#targetCommandGrid").getGridDataByRowId(rowid);
					//기존 데이타인 경우 cell 값이 저장되는 경우 UPDATE 처리
					if(data.workType == 'NONE'){
						$("#targetCommandGrid").updateGridData(rowid, {workType : 'UPDATE'});	
					}
					
					//rollbackOrBranch에서 값을 변경 후 저장되는데...
					//N : 이면 rolebackNeCmd or exceptionFlowId 값은 불필요
					if(cellname == 'rollbackOrBranch' && data.rollbackOrBranch == 'N'){
						$("#targetCommandGrid").updateGridData(rowid, {rolebackNeCmd: '', exceptionFlowId : ''});
					}else if(cellname == 'rollbackOrBranch' && data.rollbackOrBranch == 'R'){//R : 이면 exceptionFlowId 값은 불필요
						$("#targetCommandGrid").updateGridData(rowid, {exceptionFlowId : ''});
					}else if(cellname == 'rollbackOrBranch' && data.rollbackOrBranch == 'E'){//E : 이면 rolebackNeCmd 값은 불필요
						$("#targetCommandGrid").updateGridData(rowid, {rolebackNeCmd: ''});
					}
					
					//rolebackNeCmd cell 수정시rollbackOrBranch 값이 R이면 exceptionFlowId 불필요
					if(cellname == 'rolebackNeCmd' && data.rollbackOrBranch == 'R'){
						$("#targetCommandGrid").updateGridData(rowid, {rolebackNeCmd: value, exceptionFlowId : ''});	
					}
					//exceptionFlowId cell 수정시rollbackOrBranch 값이 E이면 rolebackNeCmd 불필요
					else if(cellname == 'exceptionFlowId' && data.rollbackOrBranch == 'E'){
						$("#targetCommandGrid").updateGridData(rowid, {rolebackNeCmd : '', exceptionFlowId : value});	
					}
				},
				beforeEditCell: function (rowid, cellname, value, irow, icol) {
					var data = $("#targetCommandGrid").getGridDataByRowId(rowid);
					//alert(JSON.stringify(data));
					if(cellname == 'trgtCmd'){
						changeNeInfo('T', data.trgtNeId);	
					}
					if(cellname == 'rolebackNeCmd' && data.rollbackOrBranch == 'R'){
						changeRollbackOrBranch('rollback', data.trgtNeId);
					}else if(cellname == 'exceptionFlowId' && data.rollbackOrBranch == 'E'){
						changeRollbackOrBranch('exception', data.trgtNeId);
					}else{
						$("#targetCommandGrid").setColProp('rolebackNeCmd', { editoptions: { value: ''}});
						$("#targetCommandGrid").setColProp('exceptionFlowId', { editoptions: { value: ''}});
					}
					
					//db에 저장된 target command의 경우 해당 key값은 수정하지 못하도록 처리함.. 
					if((cellname == 'trgtNeId' || cellname == 'trgtCmd' || cellname == 'trgtFtrCd' ) && data.workType != 'CREATE'){
						var colProp = jQuery("#targetCommandGrid").getColProp('trgtNeId');
						if(colProp.editable == true){
							setTimeout(function(){$("#targetCommandGrid").saveCell(irow, icol);}, 100);
							jQuery("#targetCommandGrid").setColProp('trgtNeId',{editable:false});
							jQuery("#targetCommandGrid").setColProp('trgtCmd',{editable:false});
							jQuery("#targetCommandGrid").setColProp('trgtFtrCd',{editable:false});
						}
					}
					// 최종 save 이벤트시 마지막 선택한 cell 정보 저장
					cellOfTargetCommand = {irow : irow, icol:icol}; 
				},
				gridComplete: function(){
					var ids = jQuery("#targetCommandGrid").jqGrid('getDataIDs');
					for(var i=0;i < ids.length;i++){
						var rowid = ids[i];
						var data = $('#targetCommandGrid').getGridDataByRowId(rowid);
						var paramView = "<input style='height:22px;width:100px;' type='button' value='Parameter Map' onclick=\"jQuery('#targetCommandGrid').setSelection('"+rowid+"');\"  />";
						jQuery("#targetCommandGrid").jqGrid('setRowData',ids[i],{paramView: paramView});
					}	
				},
				onSelectRow : function (rowid){
					// row 선택시 parameter information 그리드 조회
					var data = $("#targetCommandGrid").getGridDataByRowId(rowid);
					if(data.workType == 'CREATE'){
						return ;
					}
					var filterMaps = {
						  neId  	: data.srcNeId
						, cmd   	: data.srcCmd
						, ftrCd 	: data.srcFtrCd 
						, trgtNeId  : data.trgtNeId
						, trgtCmd   : data.trgtCmd
						, trgtFtrCd : data.trgtFtrCd 
					};
					var postData = {neId : data.srcNeId, 'filterMaps':JSON.stringify(filterMaps), 'sidx' : 's.ne_id', 'sord' : 'asc', 'page':1};
					jQuery("#parameterMapListGrid").jqGrid('setGridParam',{postData : postData});
					jQuery("#parameterMapListGrid").trigger('reloadGrid');
				}, 
				onSelectCell : function(rowid, cellname, value, iRow, iCol){
					
					//cell 선택시 new를 클릭하여 추가된 row의 경우 키값에대하여 선택 할 수 있게한다. 
					var data = $("#targetCommandGrid").getGridDataByRowId(rowid); 
					if((cellname == 'trgtNeId' || cellname == 'trgtCmd' || cellname == 'trgtFtrCd') && data.workType == 'CREATE'){
						jQuery("#targetCommandGrid").setColProp(cellname,{editable:true});
						setTimeout(function(){jQuery("#targetCommandGrid").editCell(iRow, iCol, true);}, 200);
					}
				}
			});
			
			// Add tooltips
			$('.navtable .ui-pg-button').tooltip({
				container : 'body'
			});
		  
			//브라우져 사이즈 조정시 마다 그리드 사이즈 조정		    
		    $(window).on('resize.jqGrid', function () {
				jQuery("#parameterMapListGrid").resizeGridWidth();
				jQuery("#sourceCommandGrid").resizeGridWidth();
				jQuery("#targetCommandGrid").resizeGridWidth();
			});
			
		    jQuery("#parameterMapListGrid").jqGrid({
				url : '<s:url value="/map/param/target/search"/>', 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    postData : {neId : '0', page : 1},
				datatype : 'json',
				height : '330px',
				colNames : [  "Input/Output"
				            , "H_ToNeId"
				            , "H_ToCmd"
				            , "H_ToFtrCd"
				            , "Param ID"				
				            , "MultiLevel YN"			
				            , "Param Level"			
				            , "Parent Parameter"
				            , "Param Seq No"
				            , "Mandatory"
				            , "Action"
				            , "Ne ID"			
				            , "CMD"			
				            , "Ftr CD"				
				            , "Input/Output"
				            , "Param ID"  		
				            , "Default Value"
				            , "workType"],
				colModel : [
					{ name : 'toCmdIoInd', 	 	index : 'req_rsp_ind',		align : 'center',	width : 100 }, 
					{ name : 'toNe', 	 		index : 'ne_id',			hidden : true }, 
					{ name : 'toCmd', 	 		index : 'cmd',				hidden : true }, 
					{ name : 'toFtrCd', 	 	index : 'ftr_cd',			hidden : true }, 
					{ name : 'toParamId', 	 	index : 'param_id',			width : 140}, 
					{ name : 'paramSeq.multiLevelInd', 	index : 'multi_level_ind',	align : 'center',	width : 90}, 
					{ name : 'paramSeq.paramLevel', 	index : 'param_level',		align : 'center',	width : 80}, 
					{ name : 'paramSeq.parentParamId', 	index : 'parent_Param_Id',	align : 'center',	width : 120}, 
					{ name : 'paramSeq.paramSeqNo', 	index : 'param_Seq_No',		align : 'center',	width : 90}, 
					{ name : 'paramSeq.mandatoryFlag', 	index : 'mandatory_Flag', 	align : 'center',	width : 90},
					{ name : 'action', 			index : 'action', 			align : 'center',	width : 80,		sortable: false, 	search : false}, 
					{ name : 'fromNe', 			index : 'from_ne', 			align : 'left',		width : 110,	hidden : true},  
					{ name : 'fromCmd', 		index : 'from_cmd', 		align : 'left',		width : 110,	hidden : true}, 
					{ name : 'fromFtrCd', 		index : 'from_ftr_cd', 		align : 'left',		width : 110,	hidden : true}, 
					{ name : 'fromCmdIoInd', 	index : 'from_cmd_io_ind',	align : 'center',	width : 120 ,	sortable: false, 	search : false}, 
					{ name : 'fromParamId', 	index : 'from_param_id',	width : 140 ,		sortable: false, 	search : false}, 
					{ name : 'defValue', 		index : 'def_value',		width : 140 ,		sortable: false, 	search : false}, 
					{ name : 'paramSeq.workType', 	 	index : 'workType',			hidden : true }, 
					
				],
				rowNum : 10, //-1 : all data
				rowList : [10, 20, 50, 100], // 한번에 보기 갯수 목록 
				pager : '#pagerOfparameterMapListGrid',
				sortname : 'to_ne',
				sortorder : "asc", 
				caption : "Parameter Information",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : false,
				autowidth : true,				
				//width : 'auto',//$("#content").width(),
			   	shrinkToFit: true,
			   	hidegrid: true,
			   	beforeProcessing : function(data, status, xhr){
					
				},
				gridComplete: function(){
					var ids = jQuery("#parameterMapListGrid").jqGrid('getDataIDs');
					for(var i=0;i < ids.length;i++){
						var rowid = ids[i];
						var viewTargetParamBtn = "<input style='height:22px; width : 76px' type='button' value='Select' onclick=\"selectSourceParam('"+rowid+"');\"  />";
						jQuery("#parameterMapListGrid").jqGrid('setRowData', rowid, {action: viewTargetParamBtn});
					}	
				},
			   	onSelectRow: function(ids) {
			   	
				}			
			});
				
			jQuery("#parameterMapListGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn', 
				beforeSearch: function() {
					//검색시 기존 검색조건이 날라가버리므로 새로 검색 조건을 추가해야함.
					var data = $("#targetCommandGrid").selGridData();
					var filterMaps = {
							  neId  	: data.srcNeId
							, cmd   	: data.srcCmd
							, ftrCd 	: data.srcFtrCd 
							, trgtNeId  : data.trgtNeId
							, trgtCmd   : data.trgtCmd
							, trgtFtrCd : data.trgtFtrCd 
						};
					var postData = {neId : data.srcNeId, 'filterMaps':JSON.stringify(filterMaps), 'sidx' : 's.ne_id', 'sord' : 'asc', 'page':1};
					jQuery("#parameterMapListGrid").jqGrid('setGridParam',{postData : postData});
				}
			});
			jQuery("#parameterMapListGrid").jqGrid('navGrid', "#pagerOfparameterMapListGrid"
				,{edit:false,add:false,del:false} // Setting for buttons
				,{closeOnEscape : true, multipleSearch : true, closeAfterSearch : true } //setting for search option
			);
			
			jQuery("#parameterMapListGrid").jqGrid('setGroupHeaders', {
				  useColSpanStyle: false, 
				  groupHeaders:[
					{startColumnName: 'toCmdIoInd', numberOfColumns: 10, titleText: 'To Parameter'},
					{startColumnName: 'action', numberOfColumns: 7, titleText: 'From Parameter'}
				  ]	
			});
		} // end of jqgrid function
		
		$('#deleteMapDefBtn').click(function(e){
			e.preventDefault();
			var data = $('#sourceCommandGrid').selGridData();
			if(data != null){
				if(data.workType == 'NONE'){
					//MessageBox.alert('You can not delete this source command['+data.srcNeId+' - '+data.srcCmd + ' - '+ data.srcFtrCd+'].');
					setTimeout(function(){
						data.workType = 'DELETE';
						//MessageBox.alert('You can not delete this target command['+data.trgtNeId+' - '+data.trgtCmd+' - '+data.trgtFtrCd+'].');
						console.log("sending data === "+JSON.stringify(data));
						$("#content").processing();
						$.ajax({
							type : 'POST',
							async : true,
							url : '<s:url value="/map"/>', 
							contentType: "application/json",
							dataType : 'json',
							data : JSON.stringify({provMaps : [data]}),
							success : function(data) { 
								if(data.resultCode == 'SUCCESS'){
									MessageBox.alert('Saved!', function(){
										jQuery("#sourceCommandGrid").reloadGrid();
										var postData = {neId : '0', 'sidx' : 'ne_id', 'sord' : 'asc', 'page':1};
										jQuery("#targetCommandGrid").jqGrid('setGridParam',{postData : postData});
										$('#targetCommandGrid').reloadGrid();
										jQuery("#parameterMapListGrid").jqGrid('setGridParam',{postData : postData});
										$('#parameterMapListGrid').reloadGrid();
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
					}, 200);
				}else{
					$('#sourceCommandGrid').deleteGridData(data.keyId);
				}
			}else{
				MessageBox.alert('Select Source Command List.');
			}
		});
		
		$("#addMapDefBtn").click(function(e){
			e.preventDefault();
			$('#sourceCommandGrid').addGridData({workType: 'CREATE', srcNeId : '', srcCmd : '', srcFtrCd : ''});
		});
		
		$("#saveMapDefBtn").click(function(e){
			e.preventDefault();
			$('#sourceCommandGrid').saveCell(cellOfSourceCommand.irow, cellOfSourceCommand.icol);
			setTimeout(function(){
				var data = $('#sourceCommandGrid').allGridData();
				
				if(data != null){
					var processSave = false ;
					$.each(data, function(i, obj){
						if(obj['workType'] != 'NONE'){
							processSave = true ;	
						}
					});
					if(!processSave){
						MessageBox.alert('Not changed source commands!');
						return ;
					}
				}
				console.log("sending data === "+JSON.stringify(data));
				$("#content").processing();
				$.ajax({
					type : 'POST',
					async : true,
					url : '<s:url value="/map"/>', 
					contentType: "application/json",
					dataType : 'json',
					data : JSON.stringify({provMaps : data}),
					success : function(data) { 
						if(data.resultCode == 'SUCCESS'){
							MessageBox.alert('Saved!', function(){
								$('#sourceCommandGrid').reloadGrid();
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
			}, 200);
		});
		
		
		$("#deleteMapTargetBtn").click(function(e){
			e.preventDefault();
			$('#targetCommandGrid').saveCell(cellOfTargetCommand.irow, cellOfTargetCommand.icol);
			var data = $('#targetCommandGrid').selGridData();
			if(data != null){
				if(data.workType == 'NONE'){
					setTimeout(function(){
						data.workType = 'DELETE';
						//MessageBox.alert('You can not delete this target command['+data.trgtNeId+' - '+data.trgtCmd+' - '+data.trgtFtrCd+'].');
						console.log("sending data === "+JSON.stringify(data));
						$("#content").processing();
						$.ajax({
							type : 'POST',
							async : true,
							url : '<s:url value="/map/target"/>', 
							contentType: "application/json",
							dataType : 'json',
							data : JSON.stringify({provMaps : [data]}),
							success : function(data) { 
								if(data.resultCode == 'SUCCESS'){
									MessageBox.alert('Saved!', function(){
										$('#targetCommandGrid').reloadGrid();
										var postData = {neId : '0', 'sidx' : 'ne_id', 'sord' : 'asc', 'page':1};
										jQuery("#parameterMapListGrid").jqGrid('setGridParam',{postData : postData});
										$('#parameterMapListGrid').reloadGrid();
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
					}, 200);
				}else{
					$('#targetCommandGrid').deleteGridData(data.keyId);
				}
			}else{
				MessageBox.alert('Select Target Command List.');
			}
		});
		$("#addMapTargetBtn").click(function(e){
			e.preventDefault();
			var allData = $('#targetCommandGrid').allGridData();
			var provOrders = new Array();
			var maxOrder = 1;
			if(allData != null){
				$.each(allData, function(i, obj){
					provOrders.push(obj['provOrder']) ;
				});
				maxOrder = provOrders.maxGridIndex() + 1;
			}
			srcData = $('#sourceCommandGrid').selGridData();
			if(srcData != null){
				$('#targetCommandGrid').addGridData({workType: 'CREATE', srcNeId : srcData.srcNeId, srcCmd : srcData.srcCmd, srcFtrCd : srcData.srcFtrCd, provOrder : maxOrder});
			}
			
		});
		$("#saveMapTargetBtn").click(function(e){
			e.preventDefault();
			var srcData = $('#sourceCommandGrid').selGridData();
			if(srcData == null){
				MessageBox.alert('Not selected source command!');
				return ;
			}
			$('#targetCommandGrid').saveCell(cellOfTargetCommand.irow, cellOfTargetCommand.icol);
			setTimeout(function(){
				var data = $('#targetCommandGrid').allGridData();
				
				var processSave = false ;
				if(data != null)
				$.each(data, function(i, obj){
					if(obj['workType'] != 'NONE'){
						processSave = true ;	
					}
				});
				if(!processSave){
					MessageBox.alert('Not changed target commands!');
					return ;
				}
				console.log("sending data === "+JSON.stringify(data));
				$("#content").processing();
				$.ajax({
					type : 'POST',
					async : true,
					url : '<s:url value="/map/target"/>', 
					contentType: "application/json",
					dataType : 'json',
					data : JSON.stringify({provMaps : data}),
					success : function(data) { 
						if(data.resultCode == 'SUCCESS'){
							MessageBox.alert('Saved!', function(){
								$('#targetCommandGrid').reloadGrid();
								var postData = {neId : '0', 'sidx' : 'ne_id', 'sord' : 'asc', 'page':1};
								jQuery("#parameterMapListGrid").jqGrid('setGridParam',{postData : postData});
								$('#parameterMapListGrid').reloadGrid();
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
			}, 200);
		});
		
		$("#deleteSourceParameterBtn").click(function(e){
			e.preventDefault();
			var obj = $('#parameterMapListGrid').selGridData();
			if(obj == null){
				MessageBox.alert('Select Parameter Information List.');
				return ;
			}
			var postData = new Array();
			postData.push({
				  ne            : obj['fromNe']              
				, cmd           : obj['fromCmd']
				, ftrCd         : obj['fromFtrCd']
				, fromNe        : obj['fromNeId']
				, fromCmd       : obj['fromCmd']
				, fromFtrCd     : obj['fromFtrCd']
				, fromCmdIoInd  : obj['fromCmdIoInd']
				, fromParamId   : obj['fromParamId']
				, toNe          : obj['toNe']
				, toCmd         : obj['toCmd']
				, toFtrCd       : obj['toFtrCd']
				, toCmdIoInd    : obj['toCmdIoInd']
				, toParamId     : obj['toParamId']
				, defValue      : obj['defValue']
				, workType      : 'DELETE'
			}); 
			console.log("sending data === "+JSON.stringify(postData));
			$("#content").processing();
			$.ajax({
				type : 'POST',
				async : true,
				url : '<s:url value="/map/param"/>', 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify({paramMaps : postData}),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						MessageBox.alert('Saved!', function(){
							$('#parameterMapListGrid').reloadGrid();
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
		
		$("#saveSourceParameterBtn").click(function(e){
			e.preventDefault();
			var srcData = $('#sourceCommandGrid').selGridData();
			if(srcData == null){
				MessageBox.alert('Not selected source command!');
				return ;
			}
			
			var trgtData = $('#targetCommandGrid').selGridData();
			if(trgtData == null){
				MessageBox.alert('Not selected target command!');
				return ;
			}
			
			var data = $('#parameterMapListGrid').allGridData();
			var postData = new Array();
			var processSave = false ;
			if(data != null)
			$.each(data, function(i, obj){
				postData.push({
					  ne            : obj['fromNe']              
					, cmd           : obj['fromCmd']
					, ftrCd         : obj['fromFtrCd']
					, fromNe        : obj['fromNe']
					, fromCmd       : obj['fromCmd']
					, fromFtrCd     : obj['fromFtrCd']
					, fromCmdIoInd  : obj['fromCmdIoInd']
					, fromParamId   : obj['fromParamId']
					, toNe          : obj['toNe']
					, toCmd         : obj['toCmd']
					, toFtrCd       : obj['toFtrCd']
					, toCmdIoInd    : obj['toCmdIoInd']
					, toParamId     : obj['toParamId']
					, defValue      : obj['defValue']
					, workType      : obj['paramSeq.workType']
				}); 
				if(obj['paramSeq.workType'] != 'NONE'){
					processSave = true ;	
				}
			});
			if(!processSave){
				MessageBox.alert('Not changed parameter information!');
				return ;
			}
			console.log("sending data === "+JSON.stringify(postData));
			$("#content").processing();
			$.ajax({
				type : 'POST',
				async : true,
				url : '<s:url value="/map/param"/>', 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify({paramMaps : postData}),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						MessageBox.alert('Saved!', function(){
							$('#parameterMapListGrid').reloadGrid();
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
		
		$("#uploadSrcCmdBtn").click(function(e){
			e.preventDefault();
			Dialog.open({
				div : '#excelUploadDialog', 
				url : '<s:url value="/excelUpload/sourceCmd"/>?callBack=refreshSrcCmdGridList', 
				title :'Excel Upload', 
				width : 800, 
				height : 615
			}); 
		});
		
		$("#uploadTrgtCmdBtn").click(function(e){
			e.preventDefault();
			Dialog.open({
				div : '#excelUploadDialog', 
				url : '<s:url value="/excelUpload/targetCmd"/>?callBack=refreshTrgtCmdGridList', 
				title :'Excel Upload', 
				width : 800, 
				height : 615
			}); 
		});
		
		$("#uploadMapParamBtn").click(function(e){
			e.preventDefault();
			Dialog.open({
				div : '#excelUploadDialog', 
				url : '<s:url value="/excelUpload/mapParameter"/>?callBack=refreshMapParamGridList', 
				title :'Excel Upload', 
				width : 800, 
				height : 615
			}); 
		});
		
	}// end pageFunction
	
});	
</script>