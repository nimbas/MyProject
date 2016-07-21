<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<form class="form-inline" role="form" id="uploadForm" name="uploadForm" method="POST" enctype="multipart/form-data" action="<s:url value="/excelUpload/${uploadCmd }"/>">
				<fieldset>
					<div class="form-group">
						<input type='file' id='file' name='file' value='file'/>
					</div>
					<customTag:button label="Upload" id="excelUploadBtn" css="success" size="xs" />
					&nbsp;&nbsp;&nbsp;<a href="<c:url value="/resources/template/excelUploadSample.xlsx"/>" target="_blank">Click here to download Excel Upload Template</a>
				</fieldset>
				<br>
			</form>
		</article>
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<table id="excelUploadResultGrid"></table>
			<div id="pagerOfexcelUploadResultGrid"></div>
			
			<div class="form-actions">
				<div class="row">
					<div class="col-md-12">
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
		
		loadScript('${BOOT_JS}/plugin/jquery-form/jquery-form.min.js');
		
		<c:choose>
		<c:when test="${uploadCmd eq 'neInfo'}">				            
		var colNames = ["NE ID", "svcDomain", "IP", "Port", "Password", "Target/Source", "Result", "Error Message"];
		var colModel = [
			{ name : 'neId', 			index : 'neId',			align : 'center',	width : 110}, 
			{ name : 'svcDomain', 		index : 'svcDomain',	align : 'center',	width : 100}, 
			{ name : 'ipAddr', 			index : 'ipAddr', 		align : 'center',	width : 140}, 
			{ name : 'portNo', 			index : 'portNo', 		align : 'center',	width : 60}, 
			{ name : 'passwd', 			index : 'passwd', 		align : 'left',		width : 60}, 
			{ name : 'srcTrgtInd', 		index : 'srcTrgtInd', 	align : 'center',   width : 80}, 
			{ name : 'resultCode', 		index : 'resultCode', 	align : 'center',   width : 80}, 
			{ name : 'resultMsg', 		index : 'resultMsg', 	align : 'left',   	width : 140}, 
		];
		</c:when>		
		<c:when test="${uploadCmd eq 'feature'}">				            
		var colNames = ["Feature Code", "Feature Description", "Service Domain", "NE ID", "Target/Source", "Result", "Error Message"];
		var colModel = [
			{ name : 'ftrCd', 			index : 'ftrCd', 		align : 'center',	width : 110}, 
			{ name : 'descr', 			index : 'descr', 		align : 'left' ,	width : 120}, 
			{ name : 'svcDomain', 		index : 'svcDomain', 	align : 'center',	width : 100}, 
			{ name : 'neId', 			index : 'neId', 		align : 'center',	width : 60}, 
			{ name : 'srcTrgtInd', 		index : 'srcTrgtInd', 	align : 'center',   width : 80}, 
			{ name : 'resultCode', 		index : 'resultCode',	align : 'center',   width : 80}, 
			{ name : 'resultMsg', 		index : 'resultMsg', 	align : 'left',   	width : 140}, 
		];
		</c:when>
		<c:when test="${uploadCmd eq 'prodFeature'}">				            
		var colNames = ["Product Code", "Feature Code", "Apply Y/N", "Result", "Error Message"];
		var colModel = [
			{ name : 'prodCd', 			index : 'prodCd',		align : 'center',	width : 110}, 
			{ name : 'ftrCd', 			index : 'ftrCd',		align : 'center',	width : 100}, 
			{ name : 'aplyFlag', 		index : 'ipAddr', 		align : 'center',	width : 140}, 
			{ name : 'resultCode', 		index : 'resultCode', 	align : 'center',   width : 80}, 
			{ name : 'resultMsg', 		index : 'resultMsg', 	align : 'left',   	width : 140}, 
		];
		</c:when>
		<c:when test="${uploadCmd eq 'parameter'}">				            
		var colNames = ["Parameter ID", "Parameter Name", "Description", "NE ID", "Param Type", "Max Length"
		                , "Default Value", "Enum List", "Result", "Error Message"];
		var colModel = [
			{ name : 'pvParamId', 		index : 'pvParamId', 	align : 'left',		width : 120}, 
			{ name : 'csParamId', 		index : 'csParamId', 	align : 'left' ,	width : 120}, 
			{ name : 'descr', 			index : 'descr', 		align : 'left' ,	width : 120}, 
			{ name : 'neId', 			index : 'neId', 		align : 'left',		width : 60}, 
			{ name : 'paramType', 		index : 'paramType', 	align : 'center',	width : 80}, 
			{ name : 'paramMaxLen', 	index : 'paramMaxLen',  align : 'center',	width : 80}, 
			{ name : 'defValue', 		index : 'defValue', 	align : 'left',		width : 110}, 
			{ name : 'enumList', 		index : 'enumList', 	align : 'center',   width : 80}, 
			{ name : 'resultCode', 		index : 'resultCode', 	align : 'center',   width : 80}, 
			{ name : 'resultMsg', 		index : 'resultMsg', 	align : 'left',   	width : 140}, 
		];
		</c:when>
		<c:when test="${uploadCmd eq 'command'}">				            
		var colNames = ["Command", "NE ID", "Send/Receive", "Sync/Async", "Action Code", "Description"	, "Result", "Error Message"];
		var colModel = [
			{ name : 'cmd', 		 	index : 'cmd', 		 	 width : 150 }, 
			{ name : 'neId', 	 		index : 'neId', 	 	 align : 'center',	width : 70}, 
			{ name : 'sendRecvInd', 	index : 'sendRecvInd', 	 width : 140}, 
			{ name : 'syncAsyncInd',	index : 'syncAsyncInd',	 width : 70,		align : 'left'}, 
			{ name : 'actionCd', 		index : 'actionCd', 	 width : 130,		align : 'left'}, 
			{ name : 'descr', 	 	  	index : 'descr', 	 	 width : 140,		align : 'left'}, 
			{ name : 'resultCode', 		index : 'resultCode', 	 align : 'center',  width : 80}, 
			{ name : 'resultMsg', 		index : 'resultMsg', 	 align : 'left',   	width : 140}, 
		];
		</c:when>
		<c:when test="${uploadCmd eq 'cmdParameter'}">				            
		var colNames = [  "Command","NEID","FeatureCode","reqRspInd","ParameterID","MultiLevelInd","ParamLevel"
		                  ,"ParentParamID","ParamSeqNo","MandatoryFlag","DefaultLabel","DefaultValue","Result","ErrorMessage"];
		var colModel = [
			{ name : 'cmd', 			index : 'cmd', 			  align : 'left',	  width : 150}, 
			{ name : 'neId', 			index : 'neId', 		  align : 'left',	  width : 90}, 
			{ name : 'ftrCd', 			index : 'ftrCd', 		  align : 'left',	  width : 90}, 
			{ name : 'reqRspInd', 		index : 'reqRspInd', 	  align : 'center',	  width : 90}, 
			{ name : 'paramId', 		index : 'paramId', 		  align : 'left',	  width : 120}, 
			{ name : 'multiLevelInd', 	index : 'multiLevelInd',  align : 'center',	  width : 90}, 
			{ name : 'paramLevel', 		index : 'paramLevel', 	  align : 'center',	  width : 80}, 
			{ name : 'parentParamId', 	index : 'parentParamId',  align : 'center',	  width : 120}, 
			{ name : 'paramSeqNo', 		index : 'paramSeqNo', 	  align : 'center',	  width : 90}, 
			{ name : 'mandatoryFlag', 	index : 'mandatoryFlag',  align : 'center',	  width : 90}, 
			{ name : 'defLabel', 		index : 'defLabel', 	  align : 'left',	  width : 110}, 
			{ name : 'defValue', 		index : 'defValue', 	  align : 'left',	  width : 110},
			{ name : 'resultCode', 		index : 'resultCode', 	  align : 'center',   width : 80}, 
			{ name : 'resultMsg', 		index : 'resultMsg', 	  align : 'left',     width : 140}, 
		];
		</c:when>
		<c:when test="${uploadCmd eq 'sourceCmd'}">				            
		var colNames = ["NE ID", "Command", "Feature Code", "Result", "Error Message"];
		var colModel = [
			{ name : 'srcNeId', 		index : 'srcNeId', 		align : 'left' ,	width : 130 },
			{ name : 'srcCmd', 			index : 'srcCmd', 		align : 'left' ,	width : 150 }, 
			{ name : 'srcFtrCd', 		index : 'srcFtrCd', 	align : 'left',		width : 130 },
			{ name : 'resultCode', 		index : 'resultCode', 	align : 'center',   width : 80}, 
			{ name : 'resultMsg', 		index : 'resultMsg', 	align : 'left',   	width : 140}, 
		];
		</c:when>
		<c:when test="${uploadCmd eq 'targetCmd'}">				            
		var colNames = ["SourceNEID" ,"SourceCommand" ,"SourceFeatureCode" ,"Order" ,"TargetNEID" ,"TargetCommand" 
		                ,"TargetFeatureCode" ,"ErrorContinueFlag" ,"RollbackorBranch" ,"RolebackNECommand" ,"ExceptionFlow","Result","ErrorMessage"];
		var colModel = [
			{ name : 'srcNeId', 		  index : 'srcNeId', 		    align : 'left' ,	width : 90},
			{ name : 'srcCmd', 			  index : 'srcCmd', 		  	align : 'left' ,	width : 110}, 
			{ name : 'srcFtrCd', 		  index : 'srcFtrCd', 		    align : 'left',		width : 90},
			{ name : 'provOrder', 		  index : 'provOrder', 		    align : 'center',	width : 70 },
			{ name : 'trgtNeId', 		  index : 'trgtNeId', 		    align : 'left',		width : 90},
			{ name : 'trgtCmd', 		  index : 'trgtCmd', 		    align : 'left',		width : 110}, 
			{ name : 'trgtFtrCd', 		  index : 'trgtFtrCd', 		    align : 'left',		width : 90}, 
			{ name : 'errorContinueFlag', index : 'errorContinueFlag',  align : 'center',	width : 110},
			{ name : 'rollbackOrBranch',  index : 'rollbackOrBranch',   align : 'center',	width : 110},
			{ name : 'rolebackNeCmd', 	  index : 'rolebackNeCmd', 	    align : 'left',		width : 110},
			{ name : 'exceptionFlowId',   index : 'exceptionFlowId',    align : 'left',		width : 110},
			{ name : 'resultCode', 		  index : 'resultCode', 	  	align : 'center',   width : 80}, 
			{ name : 'resultMsg', 		  index : 'resultMsg', 		    align : 'left',   	width : 140}, 
		];
		</c:when>
		<c:when test="${uploadCmd eq 'mapParameter'}">				            
		var colNames = ["NE ID", "Command", "Feature Code", "Input/Output", "To NE ID", "To Command", "To Feature Code", "Param ID", "MultiLevel YN"
		                , "Param Level", "Parent Parameter", "Param Seq No", "Mandatory", "From Ne ID", "From Command", "FromFtr CD", "From I/O"
		                , "From Param ID", "Default Value", "Result", "Error Message"];
		var colModel = [
			{ name : 'ne', 	 			index : 'ne', 	 			align : 'left' ,	width : 90 }, 
			{ name : 'cmd', 	 		index : 'cmd', 	 			align : 'left' ,	width : 110 }, 
			{ name : 'ftrCd', 	 		index : 'ftrCd', 	 		align : 'left',		width : 90 }, 
			{ name : 'toCmdIoInd', 	 	index : 'toCmdIoInd', 	 	align : 'center',	width : 100 }, 
			{ name : 'toNe', 	 		index : 'toNe', 	 		align : 'left' ,	width : 90 }, 
			{ name : 'toCmd', 	 		index : 'toCmd', 	 		align : 'left' ,	width : 110 }, 
			{ name : 'toFtrCd', 	 	index : 'toFtrCd', 	 		align : 'left',		width : 90 }, 
			{ name : 'toParamId', 	 	index : 'toParamId', 	 	align : 'left',		width : 140}, 
			{ name : 'multiLevelInd', 	index : 'multiLevelInd', 	align : 'center',	width : 90}, 
			{ name : 'paramLevel', 		index : 'paramLevel', 		align : 'center',	width : 80}, 
			{ name : 'parentParamId', 	index : 'parentParamId', 	align : 'center',	width : 120}, 
			{ name : 'paramSeqNo', 		index : 'paramSeqNo', 		align : 'center',	width : 90}, 
			{ name : 'mandatoryFlag', 	index : 'mandatoryFlag', 	align : 'center',	width : 90},
			{ name : 'fromNe', 			index : 'fromNe', 			align : 'left',		width : 90	},  
			{ name : 'fromCmd', 		index : 'fromCmd', 			align : 'left',		width : 110}, 
			{ name : 'fromFtrCd', 		index : 'fromFtrCd', 		align : 'left',		width : 90}, 
			{ name : 'fromCmdIoInd', 	index : 'fromCmdIoInd', 	align : 'center',	width : 120}, 
			{ name : 'fromParamId', 	index : 'fromParamId', 		align : 'left',		width : 140 }, 
			{ name : 'defValue', 		index : 'defValue', 		align : 'left',		width : 140 },
			{ name : 'resultCode', 		index : 'resultCode', 		align : 'center',   width : 80}, 
			{ name : 'resultMsg', 		index : 'resultMsg', 		align : 'left',   	width : 140}, 
		];
		</c:when>
		</c:choose>
		
		run_jqgrid_function();
		
		function run_jqgrid_function() {
			jQuery("#excelUploadResultGrid").jqGrid({
				datatype:"local",
				colNames : colNames,
				colModel : colModel,
				sortname : 'neId',
				sortorder : "asc",
				caption : "The result of upload",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : false,
				autowidth : true,				
				height : '330',//10개:330px, 15개 : 490px 
			   	shrinkToFit: false,
			   	hidegrid: true,
			   	beforeProcessing : function(data, status, xhr){
					
				},
			});
			
			jQuery("#excelUploadResultGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
					  
			//브라우져 사이즈 조정시 마다 그리드 사이즈 조정		    
		    $(window).on('resize.jqGrid', function () {
				jQuery("#excelUploadResultGrid").resizeGridWidth();
			});
		} // end of jqgrid function
				
		$("#excelUploadBtn").click(function(e){
			e.preventDefault();
			
			var fileName = $.trim($('#file').val().toLowerCase());
			if(fileName != '') {
				existFile = 'true' ;
				if(!(fileName.lastIndexOf(".xls") != -1  || fileName.lastIndexOf(".xlsx") != -1)){
					MessageBox.alert("Not excel file!");
					return ;
				}
			}else{
				MessageBox.alert("Select excel file!");
				return ;
			}
			$("#${param.dialogName}").processing('Uploading..');
			$('#uploadForm').ajaxSubmit({ 
				url : '<s:url value="/excelUpload/${uploadCmd }"/>' +($.browser.msie ? '.html' :'.json'),
				contentType: "multipart/form-data",			
				success : function(data) {
					var dataList = data.resultObj ;
										
					for(var i=0; i<dataList.length;i++){
						console.log(JSON.stringify(dataList[i])); 
						if(dataList[i].result == null){
							dataList[i].resultCode = 'NOT WORK';
						}else if(dataList[i].result.resultCode == 'SUCCESS'){
							dataList[i].resultCode = "<font color='red'>"+dataList[i].result.resultCode+"</font>";
						}else if(dataList[i].result.resultCode == 'FAIL'){
							dataList[i].resultCode = "<font color='red'>"+(dataList[i].result.resultCode)+"</font>";
							dataList[i].resultMsg = "<font color='red'>"+(dataList[i].result.resultMsg)+"</font>";
						} 
					}
					$('#excelUploadResultGrid').clearGrid().addGridData(dataList);
					
					if(data.resultCode == 'FAIL'){
						MessageBox.error("An error has occurred. All data has rollbacked. Please, Check your upload excel!", function(){
							
						}); 	
					}else if(data.resultCode == 'SUCCESS'){
			            MessageBox.alert("Saved!", function(){
			            	if('${param.callBack}' != '' && eval("window.${param.callBack}") != null){
			    				var funcName = eval("window.${param.callBack}");
			    				funcName();
			    				Dialog.close('#${param.dialogName}');
			    			}else{
			    				alert('${param.callBack} function is not defined!');
			    			}
			            });
					}				
				},
				error:function(data){
					MessageBox.error(data, "<s:message code="err.500"/>");
				}, 
				complete:function(jqXHR, textStatus){
					$("#${param.dialogName}").complete();
				}
		    });	
		});
		
		$("#closeBtn").click(function(e){
			e.preventDefault();
			Dialog.close('#${param.dialogName}');
		});
	}// end pageFunction
	
});	
</script>