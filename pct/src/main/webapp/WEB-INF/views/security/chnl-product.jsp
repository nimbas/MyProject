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
			<table id="productListDialogGrid"></table>
			<div id="pagerOfproductListDialogGrid"></div>
			
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
		
		CODE.sync('SvcDomain');
				
		run_jqgrid_function();
	
		function run_jqgrid_function() {

			jQuery("#productListDialogGrid").jqGrid({
				url : '<s:url value="/profile/channel/product"/>', 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    postData : {'filterMaps': JSON.stringify({'channelId': '${param.channelId}', 'page' : 1})},
				datatype : 'json',
				colNames : [ "Service Domain"		
				            , "Product Code"	
				            , "Product Name"		
				            , "svcDomain"		
				            ],
				colModel : [
					{ name : 'svcDomainName', 	index : 'b.svc_domain',	 	align : 'center',	width : 100}, 
					{ name : 'prodCd', 			index : 'b.prod_cd',		align : 'center',	width : 110}, 
					{ name : 'prodName', 		index : 'b.prod_name', 		align : 'center',	width : 160}, 
					{ name : 'svcDomain', 		index : 'b.svc_domain',	 	hidden: true}, 
					],
				rowNum : 10, //-1 : all data
				rowList : [10, 20, 50, 100], // 한번에 보기 갯수 목록 
				pager : '#pagerOfproductListDialogGrid',
				//sortname : 'b.prod_name',
				//sortorder : "asc",
				caption : "Product List",
				toolbarfilter: false,
				viewrecords : true,				
				multiselect : false,
				//width : 500, 
				autowidth : true,				
				height : '330',//10개:330px, 15개 : 490px 
			   	shrinkToFit: true,
			   	hidegrid: true,		
			   	beforeProcessing : function(data, status, xhr){
					var rows = data.rows ;
					if(rows != null)
					for(var i=0;i<rows.length;i++){
						rows[i].svcDomainName = CODE.name('SvcDomain', rows[i].svcDomain); 
					}
				}
			});
				
			//jQuery("#productListDialogGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			jQuery("#productListDialogGrid").jqGrid('navGrid', "#pagerOfproductListDialogGrid"
				,{edit:false,add:false,del:false} // Setting for buttons
				,{closeOnEscape : true, multipleSearch : true, closeAfterSearch : true } //setting for search option
			);
			
					  
			//브라우져 사이즈 조정시 마다 그리드 사이즈 조정		    
		    $(window).on('resize.jqGrid', function () {
				jQuery("#productListDialogGrid").resizeGridWidth();
			});
		} // end of jqgrid function
			
		
		
		$("#closeBtn").click(function(e){
			e.preventDefault();
			Dialog.close('#${param.dialogName}');
		});
	}// end pageFunction
	
});	
</script>