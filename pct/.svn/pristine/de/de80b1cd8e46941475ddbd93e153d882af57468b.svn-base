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
			<table id="sourceParamListGrid"></table>
			<div id="pagerOfsourceParamListGrid"></div>
			
			<div class="form-actions">
				<div class="row">
					<div class="col-md-12">
						<customTag:button label="Select" id="chooseNeBtn"/>
						<customTag:button label="Close" id="closeBtn"/>
					</div>
				</div>
			</div>
		</article>
		<!-- WIDGET END -->
		
	</div>
	<!-- end row -->		
</section>
<!-- end widget grid -->

<script type="text/javascript">
$(function(e) {
	
	pageSetUp(); //Default Call function
	pagefunction();
	
	function pagefunction() {
		
		run_jqgrid_function();
	
		function run_jqgrid_function() {
			var targetData = $('#targetCommandGrid').selGridData();
			var filterMaps = {
				  neId  	: targetData.srcNeId
				, cmd   	: targetData.srcCmd
				, ftrCd 	: targetData.srcFtrCd
				, trgtNeId  : targetData.trgtNeId
				, trgtCmd   : targetData.trgtCmd
				, trgtFtrCd : targetData.trgtFtrCd
				, provOrder : targetData.provOrder
			};
			jQuery("#sourceParamListGrid").jqGrid({
				url : '<s:url value="/map/param/source/search"/>', 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    postData : {neId : targetData.srcNeId, 'filterMaps': JSON.stringify(filterMaps), 'sidx' : 'ne_id', 'sord' : 'asc', 'page':1},
				datatype : 'json',
				colNames : [  "NE ID"
				            , "Command"
				            , "Feature Code"
				            , "Param ID"
				            , "Input/Output"
				            , "MultiLevel YN"			
				            , "Param Level"			
				            , "Parent Parameter"
				            , "Param Seq No"
				            , "Mandatory"		
				            , "Default Label"		
				            , "Default Value" ],
				colModel : [
					{ name : 'toNe', 	 		index : 'ne_id',			align : 'left' ,	width : 100 }, 
					{ name : 'toCmd', 	 		index : 'cmd',			align : 'left' ,	width : 100 }, 
					{ name : 'toFtrCd', 	 	index : 'ftr_cd',		align : 'left' ,	width : 100 }, 
					{ name : 'toParamId', 	 	index : 'param_id',		align : 'left' ,	width : 140 }, 
					{ name : 'paramSeq.reqRspInd', 	 	index : 'req_rsp_ind',		align : 'center' ,	width : 100 },
					{ name : 'paramSeq.multiLevelInd', 	index : 'multi_level_ind',	align : 'center',	width : 90}, 
					{ name : 'paramSeq.paramLevel', 	index : 'param_level',		align : 'center',	width : 80}, 
					{ name : 'paramSeq.parentParamId', 	index : 'parent_Param_Id',	align : 'center',	width : 120}, 
					{ name : 'paramSeq.paramSeqNo', 	index : 'param_Seq_No',		align : 'center',	width : 90}, 
					{ name : 'paramSeq.mandatoryFlag', 	index : 'mandatory_Flag', 	align : 'center',	width : 90},
					{ name : 'defLabel', 		index : 'def_label',		width : 110}, 
					{ name : 'defValue', 		index : 'def_value',		width : 110}, 
					
				],
				rowNum : 10, //-1 : all data
				rowList : [10, 20, 50, 100], // 한번에 보기 갯수 목록 
				pager : '#pagerOfsourceParamListGrid',
				sortname : 'ne_id',
				sortorder : "asc",
				caption : "Network Element List",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : false,
				//width : 500, 
				autowidth : true,				
				height : '330',//10개:330px, 15개 : 490px 
			   	shrinkToFit: false,
			   	hidegrid: true,		
			   	beforeProcessing : function(data, status, xhr){
					var rows = data.rows ;
					for(var i=0;i<rows.length;i++){
						rows[i].svcDomainName = CODE.name('SvcDomain', rows[i].svcDomain); 
						rows[i].srcTrgtName = CODE.name('SourceTargetInd', rows[i].srcTrgtInd); 
					}
				},
			   	onSelectRow: function(ids) {
				},
				ondblClickRow: function (rowid, iRow, iCol, e) {
					$("#chooseNeBtn").click();
		        }
			});
				
			//jQuery("#sourceParamListGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			jQuery("#sourceParamListGrid").jqGrid('navGrid', "#pagerOfsourceParamListGrid"
				,{edit:false,add:false,del:false} // Setting for buttons
				,{closeOnEscape : true, multipleSearch : true, closeAfterSearch : true } //setting for search option
			);
			jQuery("#sourceParamListGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
					  
			//브라우져 사이즈 조정시 마다 그리드 사이즈 조정		    
		    $(window).on('resize.jqGrid', function () {
				jQuery("#sourceParamListGrid").resizeGridWidth();
			});
		} // end of jqgrid function
			
		$("#searchBtn").click(function(e){
			e.preventDefault();
			
			var rules = new Array();
			
			var searchJson = {'groupOp' : 'AND', 'rules' : null };
			var postData = {'filters' : JSON.stringify(searchJson), 'page' : 1};
			jQuery("#sourceParamListGrid").jqGrid('setGridParam', {postData : postData});
			jQuery("#sourceParamListGrid").reloadGrid(640);
		});
		
		$("#chooseNeBtn").click(function(e){
			e.preventDefault();
			if('${param.callBack}' != '' && eval("window.${param.callBack}") != null){
				var funcName = eval("window.${param.callBack}");
				var sourceParam = $("#sourceParamListGrid").selGridData();
				if(sourceParam == null){
					MessageBox.alert("Select network element!")
					return;
				}
				funcName('${param.rowid}', sourceParam);
				Dialog.close('#${param.dialogName}');
			}else{
				alert('${param.callBack} function is not defined!');
			}
		});
		
		$("#closeBtn").click(function(e){
			e.preventDefault();
			Dialog.close('#${param.dialogName}');
		});
	}// end pageFunction
	
});	
</script>