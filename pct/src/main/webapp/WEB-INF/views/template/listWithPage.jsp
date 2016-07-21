<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>

<script type="text/javascript">
var testCallBack = function(returnData){
	alert('function testCallBack = '+JSON.stringify(returnData));
}
$(function(e) {
	
	pageSetUp();//Default Call function
	pagefunction();
	
	function pagefunction() {
		run_jqgrid_function();
		
		function run_jqgrid_function() {

			jQuery("#productListGrid").jqGrid({
				url : $('#productSearchForm').attr('action'), 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
				datatype : 'json',
				height : 'auto',
				colNames : ['Actions', 'Product Code', 'Product Name', 'Service Domain', 'Product Dv Code', 'Product KD Code', 'Customer Code', 'Discount Desc', 'Bonus Desc', 'Rate List'],
				colModel : [
					{ name : 'actButtons', 	}, 
					{ name : 'prodCd', 	 	index : 'prod_Cd' }, 
					{ name : 'prodName', 	index : 'prod_Name' }, 
					{ name : 'svcDomain', 	index : 'svc_Domain', align : "center"}, 
					{ name : 'prodDvCd', 	index : 'prod_Dv_Cd', align : "center"}, 
					{ name : 'prodKdCd', 	index : 'prod_Kd_Cd', align : "center"}, 
					{ name : 'custDvCd', 	index : 'cust_Dv_Cd', align : "center"}, 
					{ name : 'discDscr', 	index : 'disc_Dscr',  align : "center", sortable : false}, 
					{ name : 'bonusDscr', 	index : 'bonus_Dscr', align : "center", sortable : false},
					{ name : 'rates',  		sortable : false ,	hidden : true}
					],
				rowNum : 10, //default page list : -1 - all, n - n개
				rowList : [10, 20, 50, 100], // 한번에 보기 갯수 목록 
				pager : '#pagerOfProductList',
				sortname : 'prod_Name',
				sortorder : "asc",
				caption : "Product List",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : true,
				autowidth : true,
			   	shrinkToFit: true,
			   	hidegrid: false,
				beforeProcessing : function(data, status, xhr){
					//필요시 데이타 변경 
				},
				gridComplete: function(data){
					var ids = jQuery("#productListGrid").jqGrid('getDataIDs');
					for(var i=0; i < ids.length; i++){
						var cl = ids[i];
						be = "<button class='btn btn-xs btn-default' data-original-title='Edit Row' onclick=\"jQuery('#productListGrid').editRow('"+cl+"');\"><i class='fa fa-pencil'></i></button>"; 
						se = "<button class='btn btn-xs btn-default' data-original-title='Save Row' onclick=\"jQuery('#productListGrid').saveRow('"+cl+"');\"><i class='fa fa-save'></i></button>";
						ca = "<button class='btn btn-xs btn-default' data-original-title='Cancel'   onclick=\"jQuery('#productListGrid').restoreRow('"+cl+"');\"><i class='fa fa-times'></i></button>";  

						jQuery("#productListGrid").jqGrid('setRowData',ids[i],{actButtons : be+se+ca});
					}
				},
				//editurl : "dummy.html",
				
				});
				
				jQuery("#productListGrid").jqGrid('navGrid', "#pagerOfProductList"
					,{edit:false,add:false,del:false} // Setting for buttons
					,{closeOnEscape : true, multipleSearch : true, closeAfterSearch : true } //setting for search option
				);
				
				//jQuery("#productListGrid").jqGrid('inlineNav', "#pagerOfProductList");//row단의 등록, 수정, 삭제, 취소 버튼 활성화
				
				// Add tooltips
				$('.navtable .ui-pg-button').tooltip({
					container : 'body'
				});
			  
			    //브라우져 사이즈 조정시 마다 그리드 사이즈 조정		   
			    $(window).on('resize.jqGrid', function () {
					jQuery("#productListGrid").jqGrid( 'setGridWidth', $(".jarviswidget").width() );
				});
			    
			 	//navGrid 영역 css 변경
			    // remove classes
				$(".ui-jqgrid").removeClass("ui-widget ui-widget-content");
				$(".ui-jqgrid-view").children().removeClass("ui-widget-header ui-state-default");
				$(".ui-jqgrid-labels, .ui-search-toolbar").children().removeClass("ui-state-default ui-th-column ui-th-ltr");
				$(".ui-jqgrid-pager").removeClass("ui-state-default");
				$(".ui-jqgrid").removeClass("ui-widget-content");

				// add classes
				$(".ui-jqgrid-htable").addClass("table table-bordered table-hover");
				$(".ui-jqgrid-btable").addClass("table table-bordered table-striped");

				$(".ui-pg-div").removeClass().addClass("btn btn-sm btn-primary");
				$(".ui-icon.ui-icon-plus").removeClass().addClass("fa fa-plus");
				$(".ui-icon.ui-icon-pencil").removeClass().addClass("fa fa-pencil");
				$(".ui-icon.ui-icon-trash").removeClass().addClass("fa fa-trash-o");
				$(".ui-icon.ui-icon-search").removeClass().addClass("fa fa-search");
				$(".ui-icon.ui-icon-refresh").removeClass().addClass("fa fa-refresh");
				$(".ui-icon.ui-icon-disk").removeClass().addClass("fa fa-save").parent(".btn-primary").removeClass("btn-primary").addClass("btn-success");
				$(".ui-icon.ui-icon-cancel").removeClass().addClass("fa fa-times").parent(".btn-primary").removeClass("btn-primary").addClass("btn-danger");

				$(".ui-icon.ui-icon-seek-prev").wrap("<div class='btn btn-sm btn-default'></div>");
				$(".ui-icon.ui-icon-seek-prev").removeClass().addClass("fa fa-backward");

				$(".ui-icon.ui-icon-seek-first").wrap("<div class='btn btn-sm btn-default'></div>");
				$(".ui-icon.ui-icon-seek-first").removeClass().addClass("fa fa-fast-backward");

				$(".ui-icon.ui-icon-seek-next").wrap("<div class='btn btn-sm btn-default'></div>");
				$(".ui-icon.ui-icon-seek-next").removeClass().addClass("fa fa-forward");

				$(".ui-icon.ui-icon-seek-end").wrap("<div class='btn btn-sm btn-default'></div>");
				$(".ui-icon.ui-icon-seek-end").removeClass().addClass("fa fa-fast-forward");



		} // end run_jqgrid_function function

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
			jQuery("#productListGrid").reloadGrid();
		});
		
		$("#dialogPopupBtn").click(function(e){
			e.preventDefault();
			
		 	Dialog.open({
				div : '#custPricePlanDialog', 
				url : '<s:url value="/template/modal"/>?callBack=testCallBack', 
				title :'Dialog Popup Template', 
				width : 820, 
				height : 680
			}); 
		});	
		
		$("#selectedGridDataBtn").click(function(e){
			e.preventDefault();
			alert(JSON.stringify($("#productListGrid").selGridData()));
		});	
		
		$("#deleteDataRowBtn").click(function(e){
			e.preventDefault();
			$("#productListGrid").deleteGridData();
		});	
		
		$("#allDataBtn").click(function(e){
			e.preventDefault();
			alert(JSON.stringify($("#productListGrid").allGridData()));
		});	
		
		$("#reloadGridBtn").click(function(e){
			e.preventDefault();
			$("#productListGrid").reloadGrid();
		});	
		
		$("#alertMessageBtn").click(function(e){
			e.preventDefault();
			MessageBox.alert('alert test!');
		});
		
		$("#confirmMessageBtn").click(function(e){
			e.preventDefault();
			MessageBox.confirm('confirm test!', function (){
				alert('Ok click');
			}, function(){
				alert('Cancel click');
			});
		});
		
		$("#infoMessageBtn").click(function(e){
			e.preventDefault();
			MessageBox.info('info test!', function(){alert('Ok click!');});
		});
		
		$("#errorMessageBtn").click(function(e){
			e.preventDefault();
			MessageBox.error('error test!', function(){alert('Ok click!');});
		});
		$("#registDialogFormBtn").click(function(e){
			e.preventDefault();
			Dialog.open({
				div : '#custPricePlanDialog', 
				url : '<s:url value="/template/form"/>?callBack=testCallBack', 
				title :'Regist Form Template', 
				width : 820, 
				height : 680
			}); 
		});
	}
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
			<div class="widget-body">
				<form class="form-inline" role="form" id="productSearchForm" action="<s:url value="/template/find"/>">
					<fieldset>
						<div class="form-group">
							<label for="exampleInputEmail2">Service Domain</label>
							<input type="hidden" id="searchField" name="searchField" value="svc_domain"/>
							<input type="hidden" id="searchOper" name="searchOper" value="eq"/>
							<input type="hidden" id="searchField" name="searchField" value="prod_name"/>
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
			<div class="form-actions">
				<div class="row">
					<div class="col-md-12">
						<customTag:button label="Message Alert" id="alertMessageBtn" css="warning" size="xs"/>
						<customTag:button label="Message Confirm" id="confirmMessageBtn" css="success" size="xs"/>
						<customTag:button label="Message Information" id="infoMessageBtn" css="info" size="xs"/>
						<customTag:button label="Message Error" id="errorMessageBtn" css="danger" size="xs"/>
					</div>
				</div>
			</div>
				
			<table id="productListGrid"></table>
			<div id="pagerOfProductList"></div>
			
			<div class="form-actions">
				<div class="row">
					<div class="col-md-12">
						<customTag:button label="Regist Form" id="registDialogFormBtn"/>
						<customTag:button label="Dialog Popup" id="dialogPopupBtn"/>
						<customTag:button label="Get Grid Data" id="selectedGridDataBtn" css="success" size="xs"/>
						<customTag:button label="Get All Grid Data" id="allDataBtn" css="success" size="xs"/>
						<customTag:button label="Delete Grid Data" id="deleteDataRowBtn" css="danger" size="xs"/>
						<customTag:button label="Reload Grid Data" id="reloadGridBtn" css="danger" size="xs"/>
					</div>
				</div>
			</div>	
		</article>
		<!-- WIDGET END -->
	</div>
	<!-- end row -->		
</section>
<!-- end widget grid -->

