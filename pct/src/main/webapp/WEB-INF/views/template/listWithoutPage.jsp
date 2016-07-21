<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<script type="text/javascript">
$(function(e) {
	
	pageSetUp(); //Default Call function
	pagefunction();
	
	function pagefunction() {
		run_jqgrid_function();
		
		function run_jqgrid_function() {

			jQuery("#productListGrid").jqGrid({
				url : $('#productSearchForm').attr('action'), 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
				datatype : 'json',
				width : $("#content").width(),
				height : 'auto',
				colNames : ['Product Code', 'Product Name', 'Service Domain', 'Product Dv Code', 'Product KD Code', 'Customer Code', 'Discount Desc', 'Bonus Desc', 'Rate List'],
				colModel : [
					{ name : 'prodCd', 	 	index : 'p.prod_Cd' }, 
					{ name : 'prodName', 	index : 'prod_Name' }, 
					{ name : 'svcDomain', 	index : 'svc_Domain', align : "center"}, 
					{ name : 'prodDvCd', 	index : 'prod_Dv_Cd', align : "center"}, 
					{ name : 'prodKdCd', 	index : 'prod_Kd_Cd', align : "center"}, 
					{ name : 'custDvCd', 	index : 'cust_Dv_Cd', align : "center"}, 
					{ name : 'discDscr', 	index : 'disc_Dscr',  align : "center", sortable : false}, 
					{ name : 'bonusDscr', 	index : 'bonus_Dscr', align : "center", sortable : false},
					{ name : 'rates',  		sortable : false ,	hidden : false}
					],
				rowNum : -1, //-1 : all data
				//rowList : [10, 20, 50, 100],
				//pager : '#pagerOfProductList',
				sortname : 'prod_Name',
				sortorder : "asc",
				caption : "Product List",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : true,
				autowidth : true,
			   	shrinkToFit: true,
			   	hidegrid: false,
				beforeProcessing : function(data, status, xhr){//필요시 데이타 변경 
					//prodcut.rates Object형을 Stringify 한다. 
					for(var i=0; i<data.rows.length;i++){
						data.rows[i].rates = JSON.stringify(data.rows[i].rates);
					}
					//return data ;
				},
				gridComplete: function(data){
					var ids = jQuery("#productListGrid").jqGrid('getDataIDs');
					for(var i=0;i < ids.length;i++){
						var cl = ids[i];
						be = "<button class='btn btn-xs btn-default' data-original-title='Edit Row' onclick=\"jQuery('#productListGrid').editRow('"+cl+"');\"><i class='fa fa-pencil'></i></button>"; 
						se = "<button class='btn btn-xs btn-default' data-original-title='Save Row' onclick=\"jQuery('#productListGrid').saveRow('"+cl+"');\"><i class='fa fa-save'></i></button>";
						ca = "<button class='btn btn-xs btn-default' data-original-title='Cancel' onclick=\"jQuery('#productListGrid').restoreRow('"+cl+"');\"><i class='fa fa-times'></i></button>";  
						//ce = "<button class='btn btn-xs btn-default' onclick=\"jQuery('#productListGrid').restoreRow('"+cl+"');\"><i class='fa fa-times'></i></button>"; 
						//jQuery("#productListGrid").jqGrid('setRowData',ids[i],{act:be+se+ce});
						jQuery("#productListGrid").jqGrid('setRowData',ids[i],{act:be+se+ca});
					}
				},
				//editurl : "dummy.html",
			});
				
			jQuery("#productListGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			/* jQuery("#productListGrid").jqGrid('navGrid', "#pagerOfProductList", {
				edit : false,
				add : false,
				del : true
			});
			jQuery("#productListGrid").jqGrid('inlineNav', "#pagerOfProductList"); */
			
			// Add tooltips
			$('.navtable .ui-pg-button').tooltip({
				container : 'body'
			});
		  
			//브라우져 사이즈 조정시 마다 그리드 사이즈 조정		    
		    $(window).on('resize.jqGrid', function () {
				jQuery("#productListGrid").jqGrid( 'setGridWidth', $("#content").width() );
			});
		} // end function
			
		$("#searchBtn").click(function(e){
			e.preventDefault();
			var searchField0 = $("#productSearchForm [id=searchField]:eq(0)").val();
			var searchField1 = $("#productSearchForm [id=searchField]:eq(1)").val();
			var searchOper0 = $("#productSearchForm [id=searchOper]:eq(0)").val();
			var searchOper1 = $("#productSearchForm [id=searchOper]:eq(1)").val();
			var searchString0 = $("#productSearchForm [id=searchString]:eq(0)").val();
			var searchString1 = $("#productSearchForm [id=searchString]:eq(1)").val();
			
			var rules = new Array();
			rules.push({'field' : searchField0, 'op' : searchOper0, 'data' : searchString0}); 		
			rules.push({'field' : searchField1, 'op' : searchOper1, 'data' : searchString1}); 		
			var searchJson = {'groupOp' : 'AND', 'rules' : rules, };
			var postData = {'filters' : JSON.stringify(searchJson), 'page' : 1};
			jQuery("#productListGrid").jqGrid('setGridParam', {postData : postData});
			jQuery("#productListGrid").trigger("reloadGrid",[{page:1}]);
		});
		
	}// end pageFunction
	
});	
</script>

<div class="row">
	<div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
		<h1 class="page-title txt-color-blueDark">
			<i class="fa fa-pencil-square-o fa-fw "></i> 
				Template
			<span>> Product List</span>
		</h1>
	</div>
</div>

<!-- widget grid -->
<section id="widget-grid" class="">
	<div class="row">
		<!-- NEW WIDGET START -->
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
		
			<div class="jarviswidget" id="wid-id-4" data-widget-colorbutton="false" data-widget-editbutton="false">
				<header>
					<span class="widget-icon"> <i class="fa fa-eye"></i> </span>
					<h2>Search Form</h2>
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
						<form class="form-inline" role="form" id="productSearchForm" action="<s:url value="/template/findWithoutPage"/>">
							<fieldset>
								<div class="form-group">
									<label for="exampleInputEmail2">Service Domain</label>
									<input type="hidden" id="searchField" name="searchField" value="p.svc_domain"/>
									<input type="hidden" id="searchOper" name="searchOper" value="eq"/>
									<input type="hidden" id="searchField" name="searchField" value="p.prod_name"/>
									<input type="hidden" id="searchOper" name="searchOper" value="like"/>
									<select class="form-control" id="searchString" name="searchString">
										<option value="">Select Service Domain</option>
										<option value="1">Cross</option>
										<option value="2">Mobile</option>
										<option value="3">IPTV</option>
										<option value="4">Broad Band</option>
										<option value="5">VOIP</option>
									</select>
								</div>
								<div class="form-group">
									<label for="exampleInputPassword2">Product Name</label>
									<input type="text" class="form-control"  id="searchString" name="searchString" placeholder="Input product Name!">
								</div>
								<button type="submit" class="btn btn-primary" id="searchBtn">Search Product</button>
							</fieldset>
							
						</form>

					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
			<table id="productListGrid"></table>
			<div id="pagerOfProductList"></div>
		</article>
		<!-- WIDGET END -->

	</div>
	<!-- end row -->		
</section>
<!-- end widget grid -->

