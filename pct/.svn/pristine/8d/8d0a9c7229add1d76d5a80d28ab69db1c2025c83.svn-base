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
			<table id="neInfoListDialogGrid"></table>
			<div id="pagerOfneInfoListDialogGrid"></div>
			
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
	loadScript(baseScriptUrl + '/co/form.custom.validator.js');
	function pagefunction() {
		
		CODE.sync('SvcDomain', 'SourceTargetInd');
				
		run_jqgrid_function();
	
		function run_jqgrid_function() {

			jQuery("#neInfoListDialogGrid").jqGrid({
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
					{ name : 'ipAddr', 			index : 'ip_addr', 			align : 'center',	width : 60}, 
					{ name : 'portNo', 			index : 'port_no', 			align : 'center',	width : 60}, 
					{ name : 'passwd', 			index : 'passwd', 			align : 'center',	width : 60}, 
					{ name : 'srcTrgtInd', 		index : 'src_trgt_ind', 	hidden: true}, 
					{ name : 'srcTrgtName', 	index : 'src_trgt_ind', 	align : 'center',   width : 80}, 
					{ name : 'sysCreationDate', index : 'sys_creation_date',align : 'center',   width : 110, formatter:formatters["dateTime"]}, 
					{ name : 'sysUpdateDate', 	index : 'sys_update_date',  align : 'center',   width : 110, formatter:formatters["dateTime"]}, 
					{ name : 'operatorId', 		index : 'operator_id', 		align : 'center',	width : 100 }
					],
				rowNum : 10, //-1 : all data
				rowList : [10, 20, 50, 100], // 한번에 보기 갯수 목록 
				pager : '#pagerOfneInfoListDialogGrid',
				sortname : 'ne_id',
				sortorder : "asc",
				caption : "Network Element List",
				toolbarfilter: false,
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
				
			//jQuery("#neInfoListDialogGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			jQuery("#neInfoListDialogGrid").jqGrid('navGrid', "#pagerOfneInfoListDialogGrid"
				,{edit:false,add:false,del:false} // Setting for buttons
				,{closeOnEscape : true, multipleSearch : true, closeAfterSearch : true } //setting for search option
			);
			
					  
			//브라우져 사이즈 조정시 마다 그리드 사이즈 조정		    
		    $(window).on('resize.jqGrid', function () {
				jQuery("#neInfoListDialogGrid").resizeGridWidth();
			});
		} // end of jqgrid function
			
		$("#searchBtn").click(function(e){
			e.preventDefault();
			
			var rules = new Array();
			
			var searchJson = {'groupOp' : 'AND', 'rules' : null };
			var postData = {'filters' : JSON.stringify(searchJson), 'page' : 1};
			jQuery("#neInfoListDialogGrid").jqGrid('setGridParam', {postData : postData});
			jQuery("#neInfoListDialogGrid").reloadGrid(640);
		});
		
		$("#chooseNeBtn").click(function(e){
			e.preventDefault();
			if('${param.callBack}' != '' && eval("window.${param.callBack}") != null){
				var funcName = eval("window.${param.callBack}");
				var neInfo = $("#neInfoListDialogGrid").selGridData();
				if(neInfo == null){
					MessageBox.alert("Select network element!")
					return;
				}
				funcName(neInfo);
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