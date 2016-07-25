<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c"         uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fn"        uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 20160422 yhggs
	폼의 칸조정을 위한 css 삽입.
 -->
<%-- <link rel="stylesheet" type="text/css" href="${BOOT_CSS}/my_style.css"/>
<script type="text/javascript" src="${JS}/util.js"></script> --%>
<!-- widget grid -->
	<!-- widget grid -->
<section id="widget-grid" class="">
				
					<!-- START ROW -->
<div class="row">

	<!-- NEW COL START -->
	<article class="col-sm-12 col-md-12 col-lg-12">

		<!-- Widget ID (each widget will need unique ID)-->
		<div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="true" data-widget-custombutton="false">
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
				<span class="widget-icon"> <i class="fa fa-edit"></i> </span>
				<h2>Search</h2>
			</header>

			<!-- widget div-->
			<div>
				<!-- widget content -->
				<div class="widget-body">

					<form class="form-horizontal" role="form" id="prodSearchForm" action="">
						<!-- S: 조회 기준 1열 -->
						<fieldset>
							 <div class="form-group">
                               	<label class="control-label col-md-1">MARKET</label>
                               	<div class="col-md-2">
                                   <%-- >>> ${fn:length(partnerList)} <<< --%>
                                   <select class="form-control" id="searchString" name="searchString" searchField="MRKT_CD" searchOper="eq" required="required">
                                       <option value="">::: Select :::</option>
                                       <code:out codeType="CosMarket" option="listbox"/>
                                   </select>
                              	</div>

                                <label class="control-label col-md-1">SERVICE</label>
                               	<div class="col-md-2">
                                   <select class="form-control" id="searchString" name="searchString" searchField="SCV_DOMAIN" searchOper="eq" required="required">
                                       <option value="">::: Select :::</option>
                                       <code:out codeType="SvcDomain" option="listbox"/>
                                   </select>
                               	</div>

                               <label class="control-label col-md-1">Bill Type</label>
                               <div class="col-md-2">
                                   <select class="form-control" id="searchString" name="searchString" searchField="PROD_DV_CD" searchOper="eq" required="required">
                                       <option value="">::: Select :::</option>
                                       <code:out codeType="BillType" option="listbox"/>
                                   </select>
                               </div>
                          	 </div>
						</fieldset>
						<!-- E: 조회 기준 1열 -->
						
						<!-- S: 조회 기준 2열 -->
						<fieldset>
							 <div class="form-group">
                               	<label class="control-label col-md-1">Product Name</label>
                               	<div class="col-md-2">
                                   <%-- >>> ${fn:length(partnerList)} <<< --%>
                                 <input type="text" class="form-control" id="searchString" name="searchString" searchField="PROD_NAME" searchOper="eq" placeholder="product name"/>
                              	</div>

                                <label class="control-label col-md-1">Product Type</label>
                               	<div class="col-md-2">
                                   <select class="form-control" id="searchString" name="searchString" searchField="PROD_KD_CD" searchOper="eq" required="required">
                                       <option value="">::: Select :::</option>
                                       <code:out codeType="PrdType" option="listbox"/>
                                   </select>
                               	</div>

                               <label class="control-label col-md-1">Sale End Date</label>
                               <div class="col-sm-2" id="datepickerType1">
                                   <div class="input-group" >
                                       <input class="form-control" type="text" id="searchDate3" name="searchDate3" placeholder="" class="form-control datepicker" data-dateformat="yy-mm-dd"/>
                                       <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                   </div>
                               </div>
                                  <%-- <div class="input-group">
                                  	<input class="form-control hasDatepicker" type="text" id="searchString" searchField="sale_end_dttm" searchOper="eq"/>
                                  	<span class="input-group-addon">
                                  		<i class="fa fa-calendar"></i>
                                  	</span>
                                  </div> --%>
                               <div class="col-md-3"><!-- 조회버튼 -->
                                      <button type="submit" class="btn btn-success btn-sm" id="searchBtn"><i class="fa fa-search"></i>
                                      Search</button>
                               </div>
                          	 </div>
						</fieldset>
						<!-- E: 조회 기준 2열 -->
					</form>

				</div>
				<!-- end widget content -->

			</div>
			<!-- end widget div -->

		</div>
		<!-- end widget -->

	</article>
	<!-- END COL -->
	
	<!-- S: product aticle -->
	<article class="col-sm-12 col-md-12 col-lg-12" style="margin-bottom:30px;">
		<div class="container-fluid" id="productListGridDiv">	
			<table id="productListGrid"></table>
            <div id="pagerOfproductList"></div>
        </div>
	</article>
	<!-- E: product aticle -->
	<br>
	<article class="col-sm-12 col-md-12 col-lg-12">
		<div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="true" data-widget-custombutton="false">
			<header>
				<span class="widget-icon"><i class="fa fa-edit"></i></span>
				<h2>Product</h2>
			</header>
			<div class="widget-body">
				<ul id="myTab1" class="nav nav-tabs bordered">
					<li class="active">
						<a href="#s1" data-toggle="tab" aria-expanded="false">Rate</a>
					</li>
					<li class="">
						<a href="#s2" data-toggle="tab" aria-expanded="false">Production Relation</a>
					</li>
					<li class="">
						<a href="#s3" data-toggle="tab" aria-expanded="false">Feature</a>
					</li>
					<li class="">
						<a href="#s4" data-toggle="tab" aria-expanded="false">Discount</a>
					</li>
					<li class="">
						<a href="#s5" data-toggle="tab" aria-expanded="false">Penalty</a>
					</li>
				</ul>
				
				<div id="myTabContent1" class="tab-content padding-10">
				
					<div class="tab-pane fade active in" id="s1">
						<form class="form-horizontal" role="form" id="productRateForm">
						<fieldset>
							<div class="table-responsive">
							 <table class="table table-bordered">
									<tbody>
										<tr>
											<th class="bg-color-blue txt-color-white">Market</th>
											<td><input type="text" id="mrktNm" name="mrktNm" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Product Code</th>
											<td><input type="text" id="prodCd" name="prodCd" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Product Name</th>
											<td><input type="text" id="prodName" name="prodName" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Service Domain</th>
											<td><input type="text" id="svcDomain" name="svcDomain" style="width: 100%;"></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Bill Type</th>
											<td><input type="text" id="prodDvCd" name="prodDvCd" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Product Type</th>
											<td><input type="text" id="prodKdCd" name="prodKdCd" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Cust Division</th>
											<td><input type="text" id="custDvCd" name="custDvCd" style="width: 100%;"></td>
											<td colspan="2" rowspan="6"></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Sales Start Date</th>
											<td><input type="text" id="saleStrtDttmDate" name="saleStrtDttm" style="width: 120px;"></td>
											<th class="bg-color-blue txt-color-white">Sales End Date</th>
											<td><input type="text" id="saleEndDttmDate" name="saleEndDttm" style="width: 120px;"></td>
											<th class="bg-color-blue txt-color-white">Deferred Flag</th>
											<td><input type="text" id="deferredFlag" name="deferredFlag" style="width:100%;"></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Bill Cycle</th>
											<td><input type="text" id="billCycle" name="billCycle" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Treatement Price</th>
											<td><input type="text" id="treatementPrice" name="treatementPrice" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Treatement Day</th>
											<td><input type="text" id="treatmentDay" name="treatmentDay" style="width: 100%;"></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Discount Desc.</th>
											<td colspan="5"><input type="text" id="discDscr" name="discDscr" style="width: 100%;"></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Bonus Desc.</th>
											<td colspan="5"><input type="text" id="bounsDscr" name="bounsDscr" style="width: 100%;"></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Reservation Day</th>
											<td><input type="number" max="2" id="rsvRegDay" name="rsvRegDay" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Auto Expire Day</th>
											<td><input type="number" max="2" id="autoExpDay" name="autoExpDay" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Sms Period</th>
											<td><input type="text" id="smsPeriod" name="smsPeriod" style="width: 100%;"></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Real Product Change Day</th>
											<td><input type="number" max="2" id="paidChgDay" name="paidChgDay" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Short Name</th>
											<td><input type="text" id="shotProdNm" name="shotProdNm" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Ext. Product Name</th>
											<td><input type="text" id="extProdCd" name="extProdCd" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Currency</th>
											<td><input type="text" id="currency" name="currency" style="width: 100%;"></td>
										</tr>
										<!-- <tr>
											<td colspan="8" align="right">
												<input type="button" value="Update" class="btn btn-primary" name="pdProductUpdateBtn" id="pdProductUpdateBtn" />
											</td>
										</tr> -->
										
									</tbody>
								</table>
							<!-- 	<div class="row pull-right">
									<input type="button" value="Update" id="pdProductUpdateBtn"/>
								</div> -->
								<div class="row">
									<div  id="pdProductSubTabDiv_1"  class="col-sm-6 col-md-6 col-lg-6" >
										<table id="pdhProductMainGridTable_1"></table>
										<div id="pagerOfpdhProductMainGridTable_1"></div>
									</div>
									
									<div id="pdProductSubTabDiv_2"  class="col-sm-6 col-md-6 col-lg-6">
										<table id="pdhProductMainGridTable_1_1"></table>
										<div id="pagerOfpdhProductMainGridTable_1_1"></div>
									</div>
								</div>
								
							</div>
						</fieldset>
						</form>
					</div>
					
					<div class="tab-pane fade" id="s2">
						<div id="pdhProductSubTabDiv_3" class="container-fluid">
							<table id="pdhProductMainGridTable_2"></table>
							<div id="pagerOfpdhProductMainGridTable_2"></div>
						</div>
					</div>
					
					<div class="tab-pane fade container-fluid" id="s3">
						<div class="row-fluid">
							<div class="col-sm-8 col-md-8 col-lg-8" id="pdhFtrDiv">
								<table id="pdhFtr"></table>
								<div id="pagerOfpdhFtr"></div>
							</div>
							<div class="col-sm-4 col-md-4 col-lg-4" id="pdhFtrParamDiv">
								<table id="pdhFtrParam"></table>
								<div id="pagerOfpdhFtrParam"></div>
							</div>
							
						</div>
					</div>
					
					<div class="tab-pane fade" id="s4">
						<div id="discountTable_Div" class="container-fluid">
							<table id="discountTable"></table>
							<div id="pagerOfdiscountTable"></div>
						</div>
					</div>
					
					<div class="tab-pane fade" id="s5">
						<div id="penaltyDiv" class="container-fluid">
							<table id="penaltyGridList"></table>
							<div id="pagerOfpenalty"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</article>

</div>

<script type="text/javascript">
// Rate - S
function resizeJqGridWidth(grid_id, div_id, width){
    // window에 resize 이벤트를 바인딩 한다.
    $(window).bind('resize', function() {
        // 그리드의 width 초기화
        $('#' + grid_id).setGridWidth(width, false);
        // 그리드의 width를 div 에 맞춰서 적용
        $('#' + grid_id).setGridWidth($('#' + div_id).width() , false); //Resized to new width as per window
     }).trigger('resize');
}
$(function(e){
	pageSetUp(); //Default Call function
	pagefunction();
	
	function pagefunction(){
		
		run_jqgrid_function();
		run_calendar_function();
		loadScript(baseScriptUrl + '/co/form.custom.validator.js');
		
		resizeJqGridWidth('pdhFtrParam','pdhFtrParamDiv',500 );
		resizeJqGridWidth('pdhFtr','pdhFtrDiv',1000 );
		resizeJqGridWidth('productListGrid','productListGridDiv',1600 );
		resizeJqGridWidth('pdhProductMainGridTable_1','pdProductSubTabDiv_1',800 );
		resizeJqGridWidth('pdhProductMainGridTable_1_1','pdProductSubTabDiv_2',800 );
		resizeJqGridWidth('pdhProductMainGridTable_2','pdhProductSubTabDiv_3',1595 );
		resizeJqGridWidth('discountTable','discountTable_Div',1171 );
		// resizeJqGridWidth('penaltyGridList','penaltyDiv',1171 );
		
		
		function run_jqgrid_function() {
			$("#productListGrid").jqGrid(
					{
						mtype: 'POST',
						datatype : "json",
						height : 200,
						width : 1600,
						colNames : [ 'Market Code', 'Market', 'Product Code',
								'Product Name', 'Service', 'Division',
								'Product Division', 'Kind Code', 'Product Type',
								'Kind Detail Code', 'Detail Name',
								'Cust Division Code', 'Division Name', 'Version',
								'Start Date', 'End Date',
								'Prod Id Code', 'Valid Date',
								'Expired Date', 'Prod Priority', 'Prod State Code',
								'State', 'Memo'
								// , 'Bundle Y/N'
								, 'Bill Cycle',
								'Mps Domain'
								// 	             ,'Deffered'
								, 'Cug Y/N', 'Disc Memo', 'Bonus', 'Tariff',
								'Contract Periode', 'Treatment', 'Treatment Periode',
								'Parent Product', 'RSV Reg. Day', 'Auto Exipire',
								'Paid Charge Day', 'bundle Deposit', 'Zone', 'SMS',
								'Short Name', 'Ext Product Code', 'Currency','prodSubTypeCd','Product Sub Type', 'Expire Date', 'Expire Date Type', 'Next Join Confirm히든', 'Next Join Confirm','Next Join Product' ],
						colModel : [ 
						             { name : 'mrktCd', 			index : 'mrktCd', 			width : "80", 	sorttype : "string", align : "left", hidden : true }
						             , { name : 'mrktNm', 			index : 'mrktNm', 			width : "80", 	sorttype : "string", align : "left" }
						             , { name : 'prodCd', 			index : 'prodCd', 			width : "80", 	sorttype : "string", align : "left" }
						             , { name : 'prodName', 		index : 'prodName', 		width : "100", 	sorttype : "string", align : "left" }
						             , { name : 'svcDomain', 		index : 'svcDomain', 		width : "100", 	sorttype : "string", align : "left" }
						             , { name : 'prodDvCd', 		index : 'prodDvCd', 		width : "100", 	sorttype : "string", align : "left", hidden : true }
						             , { name : 'prodDvNm', 		index : 'prodDvNm', 		width : "100", 	sorttype : "string", align : "left" }
						             , { name : 'prodKdCd', 		index : 'prodKdCd', 		width : "100", 	sorttype : "string", align : "left", hidden : true }
						             , { name : 'prodKdNm', 		index : 'prodKdNm', 		width : "100", 	sorttype : "string", align : "left" }
						             , { name : 'prodKdDtlCd', 		index : 'prodKdDtlCd', 		width : "100", 	sorttype : "string", align : "left", hidden : true }
						             , { name : 'prodKdDtlNm', 		index : 'prodKdDtlNm', 		width : "100", 	sorttype : "string", align : "left", hidden : true }
						             , { name : 'custDvCd',			index : 'custDvCd', 		width : "100", 	sorttype : "string", align : "left", hidden : true }
						             , { name : 'custDvNm', 		index : 'custDvNm', 		width : "100", 	sorttype : "string", align : "left" }
						             , { name : 'version', 			index : 'version',	 		width : "100", 	sorttype : "string", align : "left", hidden : true }
						             , { name : 'saleStrtDttm', 	index : 'saleStrtDttm', 	width : "100", 	sorttype : "string", align : "left", hidden : true }
						             , { name : 'saleEndDttm', 		index : 'saleEndDttm', 		width : "100", 	sorttype : "string", align : "left", hidden : true }
						             , { name : 'prodIdCd', 		index : 'prodIdCd', 		width : "100", 	sorttype : "string", align : "left", hidden : true }
						             , { name : 'valdStrtDt', 		index : 'valdStrtDt', 		width : "100", 	sorttype : "string", align : "left" }
						             , { name : 'valdEndDt', 		index : 'valdEndDt', 		width : "100", 	sorttype : "string", align : "left" }
						             , { name : 'prodPrty', 		index : 'prodPrty', 		width : "100", 	sorttype : "string", align : "left", hidden : true }
						             , { name : 'prodStateCd', 		index : 'prodStateCd', 		width : "100", 	sorttype : "string", align : "left", hidden : true }
						             , { name : 'prodStateNm', 		index : 'prodStateNm', 		width : "100", 	sorttype : "string", align : "left" }
						             , { name : 'dscr', 			index : 'prodCd', 			dscr : "100", 	sorttype : "string", align : "left" }
						            // , { name : 'isBundle', 		index : 'isBundle', 		width : "100", 	sorttype : "string", align : "left" }
						             , { name : 'billingCycle', 	index : 'billCycle', 		width : "100", 	sorttype : "string", align : "left" }
						             , { name : 'mpsDomain', 		index : 'mpsDomain', 		width : "100", 	sorttype : "string", align : "left", hidden : true }
									// ,{ name : 'deferredFlag', index : 'deferredFlag', width : "100", 	align:"left"} 
									 , { name : 'cugFlag', 			       index : 'cugFlag', 			width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'discDscr', 		       index : 'discDscr', 		width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'bounsDscr', 		       index : 'bounsDscr', 		width : "100", 	sorttype : "string", }
									 , { name : 'tariffDscr', 		       index : 'tariffDscr', 		width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'contractPeriod', 	       index : 'contractPeriod', 	width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'treatementPrice',         index : 'treatementPrice', 	width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'treatmentDay', 	       index : 'treatmentDay', 	width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'parentProductCd', 	       index : 'parentProductCd', 	width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'rsvRegDay', 		       index : 'parentProductCd', 	width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'autoExpDay', 		       index : 'parentProductCd', 	width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'paidChgDay', 		       index : 'parentProductCd', 	width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'bundleDepositYn',         index : 'parentProductCd', 	width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'zoneFlag', 		       index : 'parentProductCd', 	width : "100", 	sorttype : "string", align : "left", hidden : true }
									 , { name : 'smsPeriod', 		       index : 'parentProductCd',	width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'shotProdNm', 		       index : 'parentProductCd',	width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'extProdCd', 		       index : 'parentProductCd',	width : "100", 	sorttype : "string", align : "left" }
									 , { name : 'currencyMeanining',       index : 'currencyMeanining',width : "80", 	sorttype : "string", align : "left" }
									 , { name : 'productSubType'   ,       index : 'productSubType',	width : "80", 	sorttype : "string", align : "left" ,hidden : true}
									 , { name : 'productSubTypeMeaning'   ,index : 'productSubTypeMeaning',	width : "80", 	sorttype : "string", align : "left" }
									 , { name : 'expireDate'   			  ,index : 'expireDate',		width : "100" }
									 , { name : 'expireDateType'   		  ,index : 'expireDateType',	width : "100" }
									 , { name : 'nextJoinConfirm'   	  ,index : 'nextJoinConfirm',	hidden:true }
									 , { name : 'nextJoinConfirmYn'   	  ,index : 'nextJoinConfirmYn',	width : "100" }
									 , { name : 'nextJoinProduct'   	  ,index : 'nextJoinProduct',	width : "100" }
									
									 ],
						pager: "#pagerOfproductList",
						viewrecords : true,
						shrinkToFit : false,
						gridview: true,
						caption : 'Product List',
						onSelectRow : function(ids) {
							console.log($('#productListGrid').getGridDataByRowId(ids));
							// $('#productRateForm').bindingFormData($('#productListGrid').getGridDataByRowId(ids));
							$('#productRateForm').bindingFormData($('#productListGrid').getGridDataByRowId(ids));
							
							
							var prodCd = $("#productListGrid").getGridDataByRowId(ids).prodCd;
					   		var filterMap = {'prodCd' : prodCd};
					   		var postData = {'filterMaps' : JSON.stringify(filterMap)};
					   		
					   		// Product Rate Grid List
							jQuery("#pdhProductMainGridTable_1").jqGrid('setGridParam',{url:'<s:url value="/product/rate/list"/>', postData:postData});
							jQuery("#pdhProductMainGridTable_1").trigger("reloadGrid",[{page:1}]); 
							
							// Product Cycle Grid List
							jQuery("#pdhProductMainGridTable_1_1").jqGrid('setGridParam',{url:'<s:url value="/product/cycle/list"/>', postData:postData});
							jQuery("#pdhProductMainGridTable_1_1").trigger("reloadGrid",[{page:1}]); 
							
							// Product Relation Grid List
							jQuery("#pdhProductMainGridTable_2").jqGrid('setGridParam',{url:'<s:url value="/product/relation/list"/>', postData:postData});
							jQuery("#pdhProductMainGridTable_2").trigger("reloadGrid",[{page:1}]);
							
							// Feature Grid List
							jQuery("#pdhFtr").jqGrid('setGridParam',{url:'<s:url value="/product/ftr/list"/>', postData:postData});
							jQuery("#pdhFtr").trigger("reloadGrid",[{page:1}]);
							
							// Discount Grid List
							jQuery("#discountTable").jqGrid('setGridParam',{url:'<s:url value="/product/dicount/list"/>', postData:postData});
							jQuery("#discountTable").trigger("reloadGrid",[{page:1}]);
							
							// Panelty Grid List
							jQuery("#penaltyGridList").jqGrid('setGridParam',{url:'<s:url value="/product/penalty/list"/>', postData:postData});
							jQuery("#penaltyGridList").trigger("reloadGrid",[{page:1}]);
							
							
						},
					});
					
			$("#pdhProductMainGridTable_1").jqGrid(
					{
						mtype : "POST",
						datatype : "json",
						height : 200,
						width : 800,
						autowidth : true,
						colNames : [ 'Feature Code', 'Feture Code Name','RATE','RATE DV CD'],
						colModel : [ 
							               { name : 'ftrCd', 			index : 'ftrCd', 			align : "center" }
							             , { name : 'ftrCdNm', 			index : 'ftrCdNm', 			align : "left" }
							             , { name : 'rate', 			index : 'prodPrty', 		align : "right" ,	formatter : 'integer'}
							             , { name : 'rateDvCd', 		index : 'rateDvCd'}
									],

						viewrecords : true,
						shrinkToFit : false,
						caption : 'Product Rate List',
						onSelectRow : function(id, status) {
							
						},
						pager : '#pagerOfpdhProductMainGridTable_1'

					});



			$("#pdhProductMainGridTable_1_1").jqGrid(
					{
						mtype : "POST",
						datatype : "json",
						width: 800,
						height : 200,
						autowidth : true,
						colNames : [
											'On Cycle',
											'Rate',
											'Condition'
								   ],
						colModel : [ 
				           		  { name : 'onCycle', 			index : 'onCycle', 				 align : "center" },
				           		  { name : 'rate', 				index : 'inventoryItemId', 	 align : "right",	formatter : 'integer' },
				           		  { name : 'cond', 				index : 'inventoryItemId', 	align : "left" }
						            ],

						viewrecords : true,
						shrinkToFit : false,
						caption : 'Product Cycle Rate List',
						onSelectRow : function(id, status) {
						
						},
						pager : '#pagerOfpdhProductMainGridTable_1_1'

					});
			//Rate - E

			// Production Relation - S
			jQuery("#pdhProductMainGridTable_2").jqGrid({
				mtype : "POST",
				datatype : "json",
				colNames : ['Product Code', 'Product Name', 'Target Product Id', 'Target Product Name', 'Relation Type', 'Relation Desc', 'Valid Start Date', 'Valid End Date'],
				colModel : [{
					name : 'prodCd',
					index : 'prodCd',
					sortable : true,
					align : "left",
				}, {
					name : 'prodName',
					index : 'prodName',
					align : "left",
				}, {
					name : 'trgtProdCd',
					index : 'trgtProdCd',
					align : "left",
				}, {
					name : 'trgtProdName',
					index : 'trgtProdName',
					align : "left",
				}, {
					name : 'prodDpndSelsDvCd',
					index : 'prodDpndSelsDvCd',
					align : "left",
				}, {
					name : 'prodDpndSelsDvNm',
					index : 'prodDpndSelsDvNm',
					align : "left",
				}, {
					name : 'valdStrtDt',
					index : 'valdStrtDt',
					align : "left",
				}, {
					name : 'valdEndDt',
					index : 'valdEndDt',
					align : "left",
				}],
				rowNum : 10,
				rowList : [10, 20, 30],
				toolbarfilter : true,
				viewrecords : true,
				gridComplete : function() {

				},
				multiselect : false,
				width : 1595,
				height : 270,
				caption : "Product Relation",
				pager : '#pagerOfpdhProductMainGridTable_2'

			});
			//Production Relation - E

			// Feature - S
				$("#pdhFtr").jqGrid(
						{
							mtype : "POST",
							datatype : "json",
							height : 293,
							width : 1000,
							colNames : [ 'PROV Feature Code', 'Description', 'Apply Flag',
									'NE ID', 'User Define', 'Bss PROV', 'Max Param Count',
									'Common Use Flag' ],
							colModel : [ 
							               { name : 'provFtrCd',  		index : 'provFtrCd', 		width : "80", 	sorttype : "string", align : "left"   }
							             , { name : 'descr', 				index : 'descr', 			width : "400", 	sorttype : "string", align : "left"   }
							             , { name : 'aplyFlag',				index : 'aplyFlag', 		width : "80", 	sorttype : "string", align : "center" }
							             , { name : 'neId',					index : 'neId', 				width : "80", 	sorttype : "string", align : "center" }
							             , { name : 'isUserDffine', 		index : 'isUserDffine', 	width : "100", 	sorttype : "string", align : "center" }
							             , { name : 'isBssProv', 			index : 'isBssProv', 		width : "100", 	sorttype : "string", align : "center" }
							             , { name : 'maxParamCnt', 	index : 'maxParamCnt',	width : "100", 	sorttype : "string", align : "center" }
							             , {
								name : 'commonUseFag',
								index : 'commonUseFag',
								autowidth : true,
								sorttype : "string",
								align : "center"
							} ],
							pager : "#pagerOfpdhFtr",
							viewrecords : true,
							shrinkToFit : false,
							caption : 'Feature',
							onSelectRow : function(id, status) {
								
								// Ftr Param
								var rowData = $('#pdhFtr').getRowData(id);
								var provFtrCd = rowData['provFtrCd'];
								var filterMap = {'provFtrCd' : provFtrCd};
						   		var postData = {'filterMaps' : JSON.stringify(filterMap)};
						   		
								$("#pdhFtrParm").jqGrid("clearGridData", true);
								
								jQuery("#pdhFtrParm").jqGrid('setGridParam',{url:'<s:url value="/product/ftrparam/list"/>', postData:postData});
								jQuery("#pdhFtrParm").trigger("reloadGrid",[{page:1}]);
								

							}

						});
						
				$("#pdhFtrParam").jqGrid(
						{
							mtype : "POST",
							datatype : "json",
							height : 293,
							width : 500,
							colNames : [ 'Ftr CD', 'Param. ID', 'Desc.', 'User Def. Value',
									'Param. Seq', 'Param. Type', 'NET. ID', 'Def. Value' ],
							colModel : [ 
							               { name : 'provFtrCd', 	index : 'provFtrCd', 	/* width : "80", */ 	sorttype : "string", align : "left"   }
							             , { name : 'pvParamId', 	index : 'pvParamId', 	/* width : "80", */ 	sorttype : "string", align : "center" }
							             , { name : 'descr', 		index : 'descr', 		/* width : "100", */ 	sorttype : "string", align : "center" }
							             , { name : 'userDefValue', index : 'userDefValue', /* width : "80", */ 	sorttype : "string", align : "center" }
							             , { name : 'paramSeqNo', 	index : 'paramSeqNo', 	/* width : "80", */ 	sorttype : "string", align : "left"   }
							             , { name : 'paramType', 	index : 'paramType', 	/* width : "80", */ 	sorttype : "string", align : "center" }
							             , { name : 'neId',			index : 'neId', 		/* width : "100", */ 	sorttype : "string", align : "center" }
							             , { name : 'defValue',		index : 'defValue', 	/* width : "100", */ 	sorttype : "string", align : "center" }
			 						   ],

							viewrecords : true,
							shrinkToFit : false,
							pager : "#pagerOfpdhFtrParam",
							//cursor:'pointer',
							caption : 'Feature Paramater'

						});
			// Feature - E

			// Discount -S
			$("#discountTable").jqGrid(
						{
							mtype : "POST",
							datatype	: "json",
							height		: 293,
							width		: 1171,
							colNames	: [
							        	   		'PROD_CD' 
							        	   		,//'FTR_CD' ,
							        	   		'FTR_NAME' ,
							        	   		//'RATE_APLY_KD_CD'  ,
							        	   		'DISCOUNTAPLYNAME' ,
							        	   		'RATE'
							        	   		],
							colModel	: [
							        	     	 {name : 'prodCd', 					index : 'prodCd', 					width : "250", align :"left"}
							        	  	// , {name : 'featureCd', 				index : 'featureCd', 				width : "180", align :"left"}
							        	   		, {name : 'ftrName', 					index : 'ftrName', 					width : "250", align :"left"}
							        	  	// , {name : 'rateApplyKindCd', 		index : 'rateApplyKindCd', 		width : "180", align :"left"}
							        	   		, {name : 'discountAplyName', 	index : 'discountAplyName', 	width : "300", align :"left"}
							        	   		, {name : 'discountRate', 			index : 'discountRate', 			width : "300", align :"right" ,	formatter : 'integer'}
							        	   ],
					        viewrecords : true,
					        shrinkToFit : false,
					        caption   	:'Discount Table',
					        pager : "#pagerOfdiscountTable"
					        
						});
			// Discount -E

			// Penalty - S
			$("#penaltyGridList").jqGrid({
					mtype : "POST",
					datatype : "json",
					height : 293,
					width : 1171,
					colNames : [ 'Product Code', 'Target Product Code', 'Feture Name', 'Penalty' ],
					colModel : [ 
					               { name : 'prodCd',  		width : "200"}
					             , { name : 'trgtProdCd', 	width : "300"}
					             , { name : 'featureNm',		width : "300" }
					             , { name : 'pnlt',				width : "300", 	 align : "right" ,	formatter : 'integer'}
					],
					viewrecords : true,
					shrinkToFit : false,
					caption : 'Penalty',
					pager : "#pagerOfpenalty",
					onSelectRow : function(id, status) {

					}

				});
			// Penalty - E
		}
		
		function run_calendar_function(){
			$("#searchDate1, #searchDate3").datepicker({
			    //defaultDate: "-1m",
			    changeMonth: true,
			    dateFormat: 'yy-mm-dd',
			    prevText: '<i class="fa fa-chevron-left"></i>',
			    nextText: '<i class="fa fa-chevron-right"></i>',
			    maxDate : 'today',
			    onClose: function (selectedDate) {
			        //alert(selectedDate);
			    }
		
			});
			// Date Range Picker
			$("#searchDate2From").datepicker({
			    //defaultDate: "-1m",
			    changeMonth: true,
			    numberOfMonths: 2,
			    dateFormat: 'yy-mm-dd',
			    prevText: '<i class="fa fa-chevron-left"></i>',
			    nextText: '<i class="fa fa-chevron-right"></i>',
			    onClose: function (selectedDate) {
			    	//alert(selectedDate);
			    }
		
			});
			$("#searchDate2To").datepicker({
			    //defaultDate: "+2d",
			    changeMonth: true,
			    numberOfMonths: 2,
			    dateFormat: 'yy-mm-dd',
			    prevText: '<i class="fa fa-chevron-left"></i>',
			    nextText: '<i class="fa fa-chevron-right"></i>',
			    maxDate : 'today', 
			    onClose: function (selectedDate) {
			    	//alert(selectedDate);
			    }
			});
		}// end calendar function
	}
	
	$("#searchBtn").on("click",function(e){
		e.preventDefault();
		
		$("#productRateForm").trigger('reset');
		$("#pdhProductMainGridTable_1").jqGrid("clearGridData", true);
		$("#pdhProductMainGridTable_1_1").jqGrid("clearGridData", true);
		$("#pdhProductMainGridTable_2").jqGrid("clearGridData", true);
		$("#pdhFtr").jqGrid("clearGridData", true);
		$("#discountTable").jqGrid("clearGridData", true);
		$("#penalty").jqGrid("clearGridData", true);
		$("#pdhFtrParm").jqGrid("clearGridData", true);
		
		console.log("===Search Btn Event Start===");
		var rules = new Array();
		var searchStringArray = $("#prodSearchForm [id=searchString]");
	  	
		$.each(searchStringArray, function(itemName,itemValue){
              var searchField = $(this).attr('searchField');
              var searchOper = $(this).attr('searchOper');
              var searchString = $(this).val();
			
              if(searchString != ''){
            	  rules.push({'field' : searchField, 'op' : searchOper, 'data' : searchString});
				} 	
          });
		
		var reqDate = $("#searchDate3").val();
		var dateType = 'datepickerType1';
		
		if(dateType == 'datepickerType1'){
			dateType = '1';
			bpProductDate = formatters.removePattern($("#searchDate3").val());
			console.log("reqDate ::"+reqDate);
		}
		
		
		var jqgridFilters = {'groupOp' : 'AND', 'rules':rules,};
		var filterMap = {'dateType':dateType,'bpProductDate':bpProductDate}
		var postData = {'filters':JSON.stringify(jqgridFilters),'page':1,'filterMaps':JSON.stringify(filterMap)};
	
		jQuery("#productListGrid").jqGrid('setGridParam',{url:'<s:url value="/product/search"/>', postData:postData});
		jQuery("#productListGrid").trigger("reloadGrid",[{page:1}]);
		
		

	});
	
	$("#pdProductUpdateBtn").on("click",function(e){
		e.preventDefault();
		
		var mrktCd = $("#productRateForm #mrktCd").val();
		var prodCd = $("#productRateForm #prodCd").val();
		var prodName = $("#productRateForm #prodName").val();
		var svcDomain =$("#productRateForm #svcDomain").val();
		var prodDvCd=$("#productRateForm #prodDvCd").val();
		var prodKdCd=$("#productRateForm #prodKdCd").val();
		var custDvCd=$("#productRateForm #custDvCd").val();
		var saleStrtDttm=$("#productRateForm #saleStrtDttm").val();
		var saleEndDttm=$("#productRateForm #saleEndDttm").val();
		var deferredFlag=$("#productRateForm #deferredFlag").val();
		var billCycle=$("#productRateForm #billCycle").val();
		var treatementPrice=$("#productRateForm #treatementPrice").val();
		var treatmentDay=$("#productRateForm #treatmentDay").val();
		var discDscr=$("#productRateForm #discDscr").val();
		var bounsDscr=$("#productRateForm #bounsDscr").val();
		var rsvRegDay=$("#productRateForm #rsvRegDay").val();
		var autoExpDay=$("#productRateForm #autoExpDay").val();
		var smsPeriod=$("#productRateForm #smsPeriod").val();
		var paidChgDay=$("#productRateForm #paidChgDay").val();
		var shotProdNm=$("#productRateForm #shotProdNm").val();
		var extProdCd=$("#productRateForm #extProdCd").val();
		var currency=$("#productRateForm #currency").val();
		
		var data = {
			'mrktCd': mrktCd,
			'prodCd' : prodCd,
			'prodName' : prodName,
			'svcDomain' : svcDomain,
			'prodDvCd' : prodDvCd,
			'prodKdCd' : prodKdCd,
			'custDvCd' : custDvCd,
			'saleStrtDttm' : saleStrtDttm,
			'saleEndDttm' : saleEndDttm,
			'deferredFlag' : deferredFlag,
			'billCycle' : billCycle,
			'treatementPrice' : treatementPrice,
			'treatmentDay' : treatmentDay,
			'discDscr' : discDscr,
			'bounsDscr' : bounsDscr,
			'rsvRegDay' : rsvRegDay,
			'autoExpDay' : autoExpDay,
			'smsPeriod' : smsPeriod,
			'paidChgDay' : paidChgDay,
			'shotProdNm' : shotProdNm,
			'extProdCd' : extProdCd,
			'currency' : currency
		};
		
		console.log("data == "+JSON.stringify(data));
		
		$.ajax({
			type : "PUT",
			async : true,
			url : '<s:url value="/product/rate/update"/>',
			contentType: "application/json",
			dataType : 'json',
			data : JSON.stringify(data),
			success : function(data) {
				if(data.resultCode == 'SUCCESS'){
					jQuery("#productListGrid").reloadGrid();
					$('#productRateForm').trigger('reset');
				}else{
					MessageBox.error(data.resultMsg);
				}
			},	error:function(data){
				MessageBox.error(data, "<s:message code="err.500"/>");
			}, complete:function(jqXHR, textStatus){
				$("#content").complete();
			}
		})

		
	});
	
		
});

</script>				
<!-- END ROW -->