<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<!-- widget grid -->
<section id="widget-grid" class="">
	<div class="row">
		<article class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
			<%-- <div class="form-actions">
				<div class="row">
					<div class="col-md-12">
						<customTag:button label="Add" id="saveFeatureBtn" css="success" size="xs"/>
						<customTag:button label="Modify" id="modifyFeatureBtn" css="success" size="xs"/>
						<customTag:button label="Delete" id="deleteFeatureBtn" css="success" size="xs"/>
					</div>
				</div>	
			</div> --%>
			<table id="featureListGrid"></table>
			<div id="pagerOfFeatureListGrid"></div>
		</article>
		<article class="col-sm-6 col-md-6 col-lg-6">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false">
				<header>
					<span class="widget-icon"> <i class="fa fa-eye"></i> </span>
					<h2>Feature Information</h2>

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

						<form class="form-horizontal" id="featureRegForm">
							<fieldset>
								<customTag:inputbox label="Feature Code" id="ftrCd" required="required"/>
								<customTag:textbox label="Feature Description" id="descr" rows="3"/>
								<customTag:selectbox label="Service Domain" id="svcDomain" codeType="SvcDomain" required="required"/>
								<customTag:inputsearch label="NE ID" id="neId" required="required"/>
								<customTag:radiobox label="Target/Source" id="srcTrgtInd" codeType="SourceTargetInd" required="required"/>
								<customTag:inputbox label="Creation Date" id="sysCreationDate" disabled="disabled" value=""/>
								<customTag:inputbox label="Changed Date" id="sysUpdateDate" disabled="disabled"/>
								<customTag:inputbox label="Operator ID" id="operatorId" disabled="disabled"/>
							</fieldset>
							
						</form>
						
						<div class="form-actions">
							<div class="row">
								<div class="col-md-12">
									<customTag:button label="Upload" id="uploadBtn" css="success" size="xs" userDefine="method='POST'"/>
									<customTag:button label="New" id="newFeatureBtn" css="success" size="xs" userDefine="method='POST'"/>
									<customTag:button label="Delete" id="delFeatureBtn" css="success" size="xs" userDefine="method='DELETE'"/>
									<customTag:button label="Save" id="saveFeatureBtn" css="success" size="xs" userDefine="method='POST'"/>
								</div>
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

	</div>
	<!-- end row -->		
</section>
<!-- end widget grid -->

<script type="text/javascript">
var refreshGridList = function(){
	jQuery("#featureListGrid").reloadGrid();
}
var getNeInfoCallBack = function (neInfo){
	$("#neId").val(neInfo.neId);
}
$(function(e) {
	pageSetUp(); //Default Call function
	pagefunction();
	loadScript(baseScriptUrl + '/co/form.custom.validator.js');
	function pagefunction() {
		
		CODE.sync('SvcDomain', 'SourceTargetInd');
				
		run_jqgrid_function();
	
		function run_jqgrid_function() {

			jQuery("#featureListGrid").jqGrid({
				url : '<s:url value="/feature/search"/>', 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    postData : {'filterMaps': JSON.stringify({'page' : 1})},
				datatype : 'json',
				colNames : [ "Feature Code"	
				            , "Feature Description"		
				            , "svcDomain"		
				            , "Service Domain"		
				            , "NE ID"		
				            , "Target/Source"		
				            , "Target/Source"		
				            , "Creation Date"	 
				            , "Changed Date"	 
				            , "Operator ID"			
				            ],
				colModel : [
					{ name : 'ftrCd', 			index : 'ftr_cd',			align : 'center',	width : 110}, 
					{ name : 'descr', 			index : 'descr',			align : 'left' ,	width : 120}, 
					{ name : 'svcDomain', 		index : 'svc_domain',	 	hidden: true}, 
					{ name : 'svcDomainName', 	index : 'svc_domain',	 	align : 'center',	width : 100}, 
					{ name : 'neId', 			index : 'ne_id', 			align : 'center',	width : 60}, 
					{ name : 'srcTrgtInd', 		index : 'src_trgt_ind', 	hidden: true}, 
					{ name : 'srcTrgtName', 	index : 'src_trgt_ind', 	align : 'center',   width : 80}, 
					{ name : 'sysCreationDate', index : 'sys_creation_date',align : 'center',   width : 110, formatter:formatters["dateTime"]}, 
					{ name : 'sysUpdateDate', 	index : 'sys_update_date',  align : 'center',   width : 110, formatter:formatters["dateTime"]}, 
					{ name : 'operatorId', 		index : 'operator_id', 		align : 'center',	width : 100 }
					],
				rowNum : 15, //-1 : all data
				rowList : [15, 20, 50, 100], // 한번에 보기 갯수 목록 
				pager : '#pagerOfFeatureListGrid',
				sortname : 'ftr_cd',
				sortorder : "asc",
				caption : "Feature List",
				toolbarfilter: false,
				viewrecords : true,				
				multiselect : false,
				height : '490px',  //10개:330px, 15개 : 490px 
				autowidth : true,				
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
			   		$('#featureRegForm').bindingFormData($('#featureListGrid').getGridDataByRowId(ids));
			   		$('#saveFeatureBtn').attr('method', 'PUT');
			   		$('#ftrCd, #svcDomain, #neId, #neIdSearchBtn').prop('disabled', true);
				}			
			});
				
			//jQuery("#featureListGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			jQuery("#featureListGrid").jqGrid('navGrid', "#pagerOfFeatureListGrid"
				,{edit:false,add:false,del:false} // Setting for buttons
				,{closeOnEscape : true, multipleSearch : true, closeAfterSearch : true } //setting for search option
			);
			
					  
			//브라우져 사이즈 조정시 마다 그리드 사이즈 조정		    
		    $(window).on('resize.jqGrid', function () {
				jQuery("#featureListGrid").resizeGridWidth();
			});
		} // end of jqgrid function
			
		$("#searchBtn").click(function(e){
			e.preventDefault();
			
			var rules = new Array();
			
			var searchJson = {'groupOp' : 'AND', 'rules' : null };
			var postData = {'filters' : JSON.stringify(searchJson), 'page' : 1};
			jQuery("#featureListGrid").jqGrid('setGridParam', {postData : postData});
			jQuery("#featureListGrid").reloadGrid();
		});
		
		$("#newFeatureBtn").click(function(e){
			e.preventDefault();
			$('#saveFeatureBtn').attr('method', 'POST');
			$('#featureRegForm').trigger('reset');
			$('#ftrCd, #svcDomain, #neId, #neIdSearchBtn').prop('disabled', false);
		});
		
		$("#saveFeatureBtn").click(function(e){
			e.preventDefault();
			
			if(!$('#featureRegForm').formValidate()){
				return ;
			}
			var ftrCd = $('#ftrCd').val();
			var descr = $('#descr').val();
			var svcDomain = $('#svcDomain').val();
			var neId = $('#neId').val();
			var srcTrgtInd = $('[id=srcTrgtInd]:checked').val();
			
			var data = {   'ftrCd': ftrCd
						 , 'descr' : descr
						 , 'svcDomain': svcDomain
						 , 'neId' : neId
						 , 'srcTrgtInd' : srcTrgtInd
					   } ;
			console.log("submit data == "+ JSON.stringify(data));
			$("#content").processing();
			$.ajax({
				type : $('#saveFeatureBtn').attr('method'),
				async : true,
				url : '<s:url value="/feature/"/>'+ftrCd, 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(data),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						jQuery("#featureListGrid").reloadGrid();
						$('#featureRegForm').trigger('reset');
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
		
		$("#delFeatureBtn").click(function(e){
			e.preventDefault();
			var ftrCd = $('#ftrCd').val();
			var svcDomain = $('#svcDomain').val();
			var data = {'ftrCd': ftrCd, 'svcDomain': svcDomain} ;
			if(ftrCd == ''){
				MessageBox.alert('Select feature code to delete!');
				return ;
			}
			console.log("submit data == "+ JSON.stringify(data));
			
			$("#content").processing();
			$.ajax({
				type : 'DELETE',
				url : '<s:url value="/feature/"/>'+ftrCd, 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(data),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						jQuery("#featureListGrid").reloadGrid();
						$('#featureRegForm').trigger('reset');
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
		
		$("#uploadBtn").click(function(e){
			e.preventDefault();
			Dialog.open({
				div : '#excelUploadDialog', 
				url : '<s:url value="/excelUpload/feature"/>?callBack=refreshGridList', 
				title :'Excel Upload', 
				width : 800, 
				height : 615
			}); 
		});
	}// end pageFunction
	
});	
</script>