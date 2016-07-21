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
			<table id="ipAddressListDialogGrid"></table>
			<div class="form-actions">
				<div class="row">
					<div class="col-md-12">
						<customTag:button label="Select" id="chooseIpAddressBtn"/>
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

			jQuery("#ipAddressListDialogGrid").jqGrid({
				url : '<s:url value="/user/${param.dlrCd}/availableIp"/>', 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    postData : {'filterMaps': JSON.stringify({'page' : 1})},
				datatype : 'json',
				colNames : [ "IP Address" ],
				colModel : [
					{ name : 'ipAddress', 			index : 'ip_address',			align : 'center', width : 260}, 
					],
				rowNum : -1, //-1 : all data
				sortname : 'ip_address',
				sortorder : "asc",
				//caption : "IP Address List",
				toolbarfilter: false,
				viewrecords : true,				
				multiselect : false,
				//width : 500, 
				autowidth : true,				
				height : '330',//10개:330px, 15개 : 490px 
			   	shrinkToFit: false,
			   	hidegrid: true,		
				ondblClickRow: function (rowid, iRow, iCol, e) {
					$("#chooseIpAddressBtn").click();
		        }
			});
				
			//브라우져 사이즈 조정시 마다 그리드 사이즈 조정		    
		    $(window).on('resize.jqGrid', function () {
				jQuery("#ipAddressListDialogGrid").resizeGridWidth();
			});
		} // end of jqgrid function
			
		
		$("#chooseIpAddressBtn").click(function(e){
			e.preventDefault();
			if('${param.callBack}' != '' && eval("window.${param.callBack}") != null){
				var funcName = eval("window.${param.callBack}");
				var ip = $("#ipAddressListDialogGrid").selGridData();
				if(ip == null){
					MessageBox.alert("Select List!")
					return;
				}
				funcName(ip.ipAddress);
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