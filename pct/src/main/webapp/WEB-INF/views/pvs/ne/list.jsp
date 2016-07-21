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
			<table id="neInfoListGrid"></table>
			<div id="pagerOfneInfoListGrid"></div>
		</article>
		<article class="col-sm-6 col-md-6 col-lg-6">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false">
				<header>
					<span class="widget-icon"> <i class="fa fa-eye"></i> </span>
					<h2>Network Element Information</h2>

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

						<form class="form-horizontal" id="neRegForm">
							<fieldset>
								<customTag:inputbox label="NE ID" id="neId" required="required"/>
								<customTag:selectbox label="Service Domain" id="svcDomain" codeType="SvcDomain" required="required"/>
								<customTag:radiobox label="Target/Source" id="srcTrgtInd" codeType="SourceTargetInd" required="required"/>
								<customTag:inputbox label="IP Address" id="ipAddr"/>
								<customTag:inputbox label="Port No" id="portNo"/>
								<customTag:inputbox label="Password" id="passwd"/>
								<customTag:inputbox label="Creation Date" id="sysCreationDate" disabled="disabled" value=""/>
								<customTag:inputbox label="Changed Date" id="sysUpdateDate" disabled="disabled"/>
								<customTag:inputbox label="Operator ID" id="operatorId" disabled="disabled"/>
							</fieldset>
							
						</form>
						
						<div class="form-actions">
							<div class="row">
								<div class="col-md-12">
									<customTag:button label="Upload" id="uploadBtn" css="success" size="xs" userDefine="method='POST'"/>
									<customTag:button label="New" id="newNeInfoBtn" css="success" size="xs" userDefine="method='POST'"/>
									<customTag:button label="Delete" id="delNeInfoBtn" css="success" size="xs" userDefine="method='DELETE'"/>
									<customTag:button label="Save" id="saveNeInfoBtn" css="success" size="xs" userDefine="method='POST'"/>
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
	jQuery("#neInfoListGrid").reloadGrid();
}
$(function(e) {
	
	pageSetUp(); //Default Call function
	pagefunction();
	loadScript(baseScriptUrl + '/co/form.custom.validator.js');
	function pagefunction() {
		
		CODE.sync('SvcDomain', 'SourceTargetInd');
				
		run_jqgrid_function();
	
		function run_jqgrid_function() {

			jQuery("#neInfoListGrid").jqGrid({
				url : '<s:url value="/neInfo/search"/>', 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    postData : {'filterMaps': JSON.stringify({'page' : 1})},
				datatype : 'json',
				colNames : [ "NE ID"	
				            , "svcDomain"		
				            , "Service Domain"		
				            , "IP"		
				            , "Port"		
				            , "Password"		
				            , "Target/Source"		
				            , "Target/Source"		
				            , "Creation Date"	 
				            , "Changed Date"	 
				            , "Operator ID"			
				            ],
				colModel : [
					{ name : 'neId', 			index : 'ne_id',			align : 'center',	width : 110}, 
					{ name : 'svcDomain', 		index : 'svc_domain',	 	hidden: true}, 
					{ name : 'svcDomainName', 	index : 'svc_domain',	 	align : 'center',	width : 100}, 
					{ name : 'ipAddr', 			index : 'ip_addr', 			align : 'center',	width : 140}, 
					{ name : 'portNo', 			index : 'port_no', 			align : 'center',	width : 60}, 
					{ name : 'passwd', 			index : 'passwd', 			align : 'left',		width : 60}, 
					{ name : 'srcTrgtInd', 		index : 'src_trgt_ind', 	hidden: true}, 
					{ name : 'srcTrgtName', 	index : 'src_trgt_ind', 	align : 'center',   width : 80}, 
					{ name : 'sysCreationDate', index : 'sys_creation_date',align : 'center',   width : 110, formatter:formatters["dateTime"]}, 
					{ name : 'sysUpdateDate', 	index : 'sys_update_date',  align : 'center',   width : 110, formatter:formatters["dateTime"]}, 
					{ name : 'operatorId', 		index : 'operator_id', 		align : 'center',	width : 100 }
					],
				rowNum : 15, //-1 : all data
				rowList : [15, 20, 50, 100], // 한번에 보기 갯수 목록 
				pager : '#pagerOfneInfoListGrid',
				sortname : 'ne_id',
				sortorder : "asc",
				caption : "Network Element List",
				toolbarfilter: false,
				viewrecords : true,				
				multiselect : false,
				//width : 500, 
				autowidth : true,				
				height : '490px', //10개:330px, 15개 : 490px 
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
			   		$('#neRegForm').bindingFormData($('#neInfoListGrid').getGridDataByRowId(ids));
			   		$('#passwd').val('');
			   		$('#saveNeInfoBtn').attr('method', 'PUT');
			   		$('#neId, #svcDomain, #neId').prop('disabled', true);
				}			
			});
				
			//jQuery("#neInfoListGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			jQuery("#neInfoListGrid").jqGrid('navGrid', "#pagerOfneInfoListGrid"
				,{edit:false,add:false,del:false} // Setting for buttons
				,{closeOnEscape : true, multipleSearch : true, closeAfterSearch : true } //setting for search option
			);
			
					  
			//브라우져 사이즈 조정시 마다 그리드 사이즈 조정		    
		    $(window).on('resize.jqGrid', function () {
				jQuery("#neInfoListGrid").resizeGridWidth();
			});
		} // end of jqgrid function
			
		$("#searchBtn").click(function(e){
			e.preventDefault();
			
			var rules = new Array();
			
			var searchJson = {'groupOp' : 'AND', 'rules' : null };
			var postData = {'filters' : JSON.stringify(searchJson), 'page' : 1};
			jQuery("#neInfoListGrid").jqGrid('setGridParam', {postData : postData});
			jQuery("#neInfoListGrid").reloadGrid();
		});
		
		$("#newNeInfoBtn").click(function(e){
			e.preventDefault();
			$('#saveNeInfoBtn').attr('method', 'POST');
			$('#neRegForm').trigger('reset');
			$('#neId, #svcDomain, #neId').prop('disabled', false);
		});
		
		$("#saveNeInfoBtn").click(function(e){
			e.preventDefault();
			
			if(!$('#neRegForm').formValidate()){
				return ;
			}
			var neId = $('#neId').val();
			var svcDomain = $('#svcDomain').val();
			var srcTrgtInd = $('[id=srcTrgtInd]:checked').val();
			var ipAddr = $('#ipAddr').val();
			var portNo = $('#portNo').val();
			var passwd = $('#passwd').val();
			var data = {   
				  'ipAddr': ipAddr
				, 'portNo' : portNo
				, 'passwd' : passwd
				, 'svcDomain': svcDomain
				, 'neId' : neId
				, 'srcTrgtInd' : srcTrgtInd
		   	} ;
			console.log("submit data == "+ JSON.stringify(data));
			$("#content").processing();
			$.ajax({
				type : $('#saveNeInfoBtn').attr('method'),
				async : true,
				url : '<s:url value="/neInfo/"/>'+neId, 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(data),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						jQuery("#neInfoListGrid").reloadGrid();
						$('#neRegForm').trigger('reset');
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
		
		$("#delNeInfoBtn").click(function(e){
			e.preventDefault();
			var neId = $('#neId').val();
			var data = {'neId': neId} ;
			if(neId == ''){
				MessageBox.alert('Select network element to delete!');
				return ;
			}
			console.log("submit data == "+ JSON.stringify(data));
			
			$("#content").processing();
			$.ajax({
				type : 'DELETE',
				url : '<s:url value="/neInfo/"/>'+neId, 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(data),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						jQuery("#neInfoListGrid").reloadGrid();
						$('#neRegForm').trigger('reset');
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
		
		$("#uploadBtn").click(function(e){
			e.preventDefault();
			Dialog.open({
				div : '#excelUploadDialog', 
				url : '<s:url value="/excelUpload/neInfo"/>?callBack=refreshGridList', 
				title :'Excel Upload', 
				width : 800, 
				height : 615
			}); 
		});
			
	}// end pageFunction
	
});	
</script>