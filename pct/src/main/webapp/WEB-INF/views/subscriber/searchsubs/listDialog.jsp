<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c"         uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fn"        uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>


<!-- widget grid -->
<section id="widget-grid" class="">
	<div class="row">
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<form class="form-horizontal" role="form" id="subscriptionCustomerSearchForm" name="subscriptionCustomerSearchForm" action="">
				<fieldset>
					<div class="form-group" style="_display:inline-block; background:#EFEBDE 5px 5px no-repeat; border:solid 1px #c6c7c6; padding:5px 10px 5px 40px;  font-weight:bold; color:#94657b; white-space:nowrap; aamin-width:930px;">
						<input type="hidden" name="custNoD" id="custNoD" class="cbs_field" value="${custNo}" />
						<input type="hidden" name="entrNoD" id="entrNoD" class="cbs_field" value="${entrNo}" />
						<table>
							<colgroup>
								<col width="90%" />
								<col width="10%" />
							</colgroup>
							<tr>
								<td>
								<label class="control-label col-md-1">Type</label>
							<div class="col-md-3">
							    <select class="form-control" id="searchOp" name="searchOp" searchField="MRKT_CD" searchOper="eq" required="required" onchange="fchangeSelectOp(this)">
	                                <option value="" selected>::: Select :::</option>
	                                <option value="cust" ${selectOp eq 'customer' ? 'selected' : '' } >Customer</option>
	                                <option value="bill" ${selectOp eq 'billing' ? 'selected': '' } >Billing</option>
	                                <option value="subs" ${selectOp eq 'subscriber' ? 'selected': '' } >Subscriber</option>
                                </select>
                            </div>
                            <div class="col-md-3">
                            	<input type="text" class="form-control" searchField="PROD_CD" searchOper="eq" placeholder="product code" name="searchText" id ="searchText" value=${entrNo} />
                            </div>
                            <label class="control-label col-md-1">Category</label>
                            <div class="col-md-3">
							    <select class="form-control" id="selectCategory" name="selectCategory" searchField="MRKT_CD" searchOper="eq" required="required">
                                </select>
                            </div>
								</td>
								<td rowspan="2">
									<div class="col-md-3"><!-- 조회버튼 -->
										<button type="button" class="btn btn-success btn-sm" id="searchBtn" onclick="fclickSearchWH()"><i class="fa fa-search"></i>Search</button>
	                               	</div>
								</td>
							</tr>
							<tr height="5px"></tr>
							<tr>
								<td>
									<label class="control-label col-md-1" align="left">StartDate</label>
									<div class="col-sm-3" id="datepickerType1">
                                    	<div class="input-group" >
                                        	<input type="text" id="strtDt" name="strtDt" class="form-control datepicker" data-dateformat="yy-mm-dd" value=${strtDttm} style="z-index:9999"/>
                                        	<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                    	</div>
                                	</div>
                               		<label class="control-label col-md-1">EndDate</label>
                               		<div class="col-sm-3" id="datepickerType2">
	                                   <div class="input-group" >
	                                       <input type="text" id="endDt" name="endDt" class="form-control datepicker" data-dateformat="yy-mm-dd" value=${endDttm} style="z-index:9999"/>
	                                       <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
	                                   </div>
                               		</div>
                               		<label class="control-label col-md-1" align="left">Operator</label>
                               		<div class="col-md-2">
                               			<div class="input-group" >
	                               			<input type="text" class="form-control" name="operatorNm" id ="operatorNm" width="15px" disabled/>
	                               			<a class="btn bg-color-blueLight txt-color-white" href="javascript:clickOperator_dialog(0);" style="margin-bottom:10px">choose</a>
                               			</div>
                               		</div>
								</td>
							</tr>
						</table>
					</div>
				</fieldset>
			</form>
			<div class="row">
				<div class="col-md-10 demo-icon-font">
					<span class="glyphicon glyphicon-search"></span>
					<span class="glyphicon-class">Work History</span>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12" align="center">
					<table id="gworkHistory"></table>
					<div id="pworkHistory"></div>
				</div>
			</div>
			<div class="row">
		    	<div class="col-md-6 demo-icon-font">
					<span class="glyphicon glyphicon-search"></span>
					<span class="glyphicon-class">System Work History</span>
				</div>
				<div class="col-md-6 demo-icon-font">
					<span class="glyphicon glyphicon-search"></span>
					<span class="glyphicon-class">UserComment</span>
				</div>
			</div>
			<div class="row" >
			    <div class="col-md-6">
			    	<textarea id='taSystemWorkHistory' style="width:100%; height:200px" readOnly></textarea>
			    </div>
			    <div class="col-md-6">
			    	<textarea id="taUserComment"       style="width:100%; height:200px" readOnly></textarea>
			    </div>
			</div>
			<div class="row">
				<div align="right" style="margin-right:15px">
					<button type="button" id="btWHNew" onclick="fclickNew()">New</button>
					<button type="button" id="btWHClose" onclick="fclickClose()">Close</button>
				</div>
			</div>
		</article>
	</div>
	<!-- end row -->		
</section>
<!-- end widget grid -->

<script type="text/javascript">
$(function(e){
	pageSetUp();
	pagefunction();
	
	setSelectCategory();
	
	$("#strtDt").datepicker({
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
	
	$("#endDt").datepicker({
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

	function pagefunction() {
		loadScript('${BOOT_JS}/plugin/jquery-form/jquery-form.min.js');
	}
	
	$('#gworkHistory').jqGrid({
		mtype     :  "POST",
		datatype  :  "json",
		height    :  250,
		width     :  950,
	   	colNames  :  [  
						 'Category'
						,'Product'
						,'Costomer No'
						,'Belong Dealer'
						,'Bill Account no'
						,'Creation Date'
						,'Creation User'
						,'User Memo'//userMemo'
						,'Sys Memo' //sysMemo'
	   	             ],
	   	colModel  :  [
						 {name: 'memoNm', 			index: 'memoNm', 			width : "130"}   						
   						,{name: 'prodNo', 			index: 'prodNo', 			width : "130"}
   						,{name: 'custMemoNo', 		index: 'custMemoNo', 		width : "130"}
   						,{name: 'memoCrteDlrNm',	index: 'memoCrteDlrNm', 	width : "130"}
   						,{name: 'billAcntNo', 		index: 'billAcntNo', 		width : "130"}
   						,{name: 'sysCreationDate', 	index: 'sysCreationDate', 	width : "125",  align: 'center'}
   						,{name: 'operatorId', 		index: 'operatorId', 		width : "130"}
   						,{name: 'userMemo', 		index: 'userMemo', 			width : "0", 	hidden:true}
   						,{name: 'sysMemo', 			index: 'sysMemo', 			width : "0", 	hidden:true}
				     ],
		pager     : '#pworkHistory',
	   	multiselect: false,
	   	viewrecords: true,
	   	shrinkToFit: false,
	   	onSelectRow: function (id) {
	   				     var gridData = $("#gworkHistory").getGridDataByRowId(id);
	   				     
	   				     $("#taSystemWorkHistory").val(gridData.sysMemo);
	   				     $("#taUserComment").val(gridData.userMemo)
     	             }
	});
});

function setSelectCategory() {
	
	var value = $("#searchOp").val();
	var url = 'subscriber/getSelectCategory?memoCateCd='+value;	

	$.ajax({
		type : "GET",  
		async : false,
		url : url,
		dataType : 'json',
		data : '',
		success : function(data) {
			$("#selectCategory").empty();
			if(data.list.length>0){
				$("#selectCategory").removeAttr("disabled");
				$("#selectCategory").append("<option value=''>::: Select :::</option>");
				for(var i=0; i<data.list.length; i++){
					var memoKdCdInfo = data.list[i];
					$("#selectCategory").append("<option value="+memoKdCdInfo.selectCategory+">"+memoKdCdInfo.memoNm+"</option>");
				}
			}else{
				$("#selectCategory").attr("disabled");
				$("#selectCategory").append("<option value='::: Select :::'></option>");
			}
		},
		error:function(data){
			MessageBox.error(data, "err.500"); 
		}, complete:function(jqXHR, textStatus){ 
			vFirstLoad = false;
		}
	});	 
}

function clickOperator_dialog(menuObject){
	Dialog.open({
		div : '#operatorDialog', 
		url : '<s:url value="/subscriber/operatorDialog?callBackFunc=callBackFunc&dialogName=operatorDialog"/>', 
		title :'Operator Select', 
		width : 500, 
		height : 750,
		modal : true
	}); 
}

function fclickNew(menuObject){
	var searchOp     =  $("#searchOp").val();
	var forCBEntrNo  =  $("#searchText").val()
	var forSysMemo   =  $("#taSystemWorkHistory").val();
	
	if(searchOp == 'subs'){
	    Dialog.open({
	    	div : '#newDialog', 
	    	url : '<s:url value="/subscriber/newDialog?callBackFunc=callBackFuncNew&dialogName=newDialog&forCBEntrNo='+forCBEntrNo+'&forSysMemo='+forSysMemo+'"/>', 
	    	title :'Register Memo', 
	    	width : 400, 
	    	height : 400
	    });
	}else{
		MessageBox.noti("Billing account/Customer will not register, additional notes.");
	}
}

function callBackFunc(member){
	$("#operatorNm").val(member.userId);
}

function fchangeSelectOp(sel){
	if(sel.value == 'cust'){
		$("#searchText").val($("#custNoD").val());
	}else if(sel.value == 'subs'){
		$("#searchText").val($("#entrNoD").val());
	}
}

function fclickClose(){
	Dialog.close('#${param.dialogName}');
}

function fclickSearchWH(){
	var searchCode     =  $("#searchOp").val();
	var searchCol      =  null, searchVal = null;
	var searchCategory =  $("#selectCategory").val();
	var strtDate       =  $("#strtDt").val();
	var endDate        =  $("#endDt").val();
	var searchOperator =  $("#operatorNm").val();
	
	if      ( searchCode  ==  'cust' ){
		searchCol  =  'CUST_NO';
		searchVal  =  $("#searchText").val();
	}else if( searchCode  ==  'bill' ){
		searchCol  =  'BILL_ACNT_NO';
		searchVal  =  $("#searchText").val();
	}else if( searchCode  ==  'subs'  ){
		searchCol   =  'ENTR_NO';
		searchVal   =  $("#searchText").val();
	}
	
	var filterMap  =  { 'searchCol':searchCol
			          , 'searchVal':searchVal
			          , 'searchCategory':searchCategory
			          , 'strtDate':strtDate
			          , 'endDate':endDate
			          , 'searchOperator':searchOperator };
	var postData   =  { 'filterMaps':JSON.stringify( filterMap ) };

	jQuery("#gworkHistory").jqGrid(  'setGridParam',  { url:'<s:url value="/subscribe/WorkHistory/retrieveWorkHistory"/>', postData:postData } );
	jQuery("#gworkHistory").trigger("reloadGrid",[{page:1}]);
}

</script>