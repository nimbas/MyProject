<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c"         uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fn"        uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="cug" uri="http://www.acube.com/jsp/tags/cug" %>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<script type="text/javascript" src="<s:url value="/resources/js/co/jquery.form.js"/>"></script>
<link   type="text/css"        rel="stylesheet"  href="<s:url value="/resources/css/jquery.treeview.css"/>" />
<script type="text/javascript" src="<s:url value="/resources/js/co/jquery.treeview.js"/>"></script>

<!-- widget grid -->
<!-- widget grid -->
<section id="widget-grid" class="">
	<div class="row">
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<form class="form-horizontal" role="form" id="subOperatorSearchForm" name="subOperatorSearchForm" action="">
				<fieldset>
					<div class="form-group" style="_display:inline-block; background:#EFEBDE 5px 5px no-repeat; border:solid 1px #c6c7c6; padding:5px 10px 5px 40px;  font-weight:bold; color:#94657b; white-space:nowrap; aamin-width:930px;">
						<table>
							<colgroup>
								<col width="90%" />
								<col width="10%" />
							</colgroup>
							<tr>
								<td>
									<label class="control-label col-md-1">Type</label>
									<div class="col-md-5">
									    <select class="form-control" id="searchOpOD" name="searchOpOD" required="required" onchange="changeSearchOp(this)">
			                                <option value="userId" selected >User ID</option>
			                                <option value="userNm" >User Name</option>
			                                <option value="orgCd" >Org Code</option>
		                                </select>
		                            </div>
		                            <div class="col-md-6">
		                            	<input type="text" class="form-control" placeholder="" name="searchTextOD" id ="searchTextOD" />
		                            </div>
								</td>
								<td rowspan="2">
									<div class="col-md-3"><!-- 조회버튼 -->
										<button type="button" class="btn btn-success btn-sm" id="searchBtnOD" onclick="fclickSearch()"><i class="fa fa-search"></i>Search</button>
	                               	</div>
								</td>
							</tr>
							<tr height="5px"></tr>	
							<tr>
								<td>
									<div class="col-md-5">
										<button type="button" class="btn btn-sm" id="orgTreeOn" onclick="orgTtreeIsOn()">Org Tree On</button>
										<button type="button" class="btn btn-sm" id="orgTreeOff" onclick="orgTtreeIsOff()">Org Tree Off</button>
									</div>
									<div class="col-md-7">
										<input type="text" class="form-control" placeholder="Org Name" name="orgNm" id ="orgNm" id="orgNm" disabled/>
									</div>
								</td>
							</tr>
						</table>
					</div>
					<div class="row">
						<div class="col-md-12" align="center" style="margin-top:25px">
							<table id="goperatorList"></table>
							<div id="poperatorList"></div>
						</div>
					</div>
					<div class="row">
						<div align="right" style="margin-top:50px; margin-right:15px">
							<button type="button" id="btOPComfirm" onclick="fclickComfirm()" disabled>Comfirm</button>
							<button type="button" id="btOPClose" onclick="fclickClose()">Close</button>
						</div>
					</div>
					<div ID='layer1' style="background-color:#FFFFFF; position:absolute; left:40px; top:80px; z-index:9999;visibility:hidden; border:1px solid black;">
						<div class="wrap_100">
							<div class="f_left">
								<div class="table_view01" style="width: 250px;height:350px;overflow:auto;border:1px solid black;z-index:10000">
									<ul id="orgTree" class="orgTree">
										<cug:cosInfoTree/>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</fieldset>
			</form>
		 </div>
		</article>
	</div>
	<!-- end row -->		
</section>
<!-- end widget grid -->

<style>
	
</style>

<script type="text/javascript">
var gridRowData;

$(function(e){
	pageSetUp();
	pagefunction();
	
	$("#orgTreeOn").css('display', 'block');
	$("#orgTreeOff").css('display', 'none');
	$("#orgTreeOn").attr('disabled','true');
	
	$("#orgTree").treeview({
		persist: "location",
		collapsed: true,
		unique: true,
		animated: "medium"
	});
	
	loadScript(baseScriptUrl + '/co/form.custom.validator.js');
	
	resizeJqGridWidth();
	
	function pagefunction() {
		loadScript('${BOOT_JS}/plugin/jquery-form/jquery-form.min.js');
	}

	$('#subOperatorSearchForm #goperatorList').jqGrid({
		mtype     :  "POST",
		datatype  :  "json",
		height    :  400,
		width     :  450,
	   	colNames  :  [  'marketCd'
	   	             ,  'market'
	   	             ,  'userId'
	   	             ,  'Login Id'
	   	       	     ,  'User Name'
	   	             ,  'Organization'
	   	             ,  'Dealer Name'
	   	             ,  'Start Date'
	   	             ,  'User Level'
	   	             ,  'User Level Code' 
	   	             ,  'IP Adress' 
	   	             ,  'IP Scan Y/N'
	   	             ],
	   	colModel  :  [
						 { name : 'marketCode',   		index : 'marketCode',           hidden : true},
						 { name : 'marketName',   		index : 'marketName',           width : "100",  sorttype : "string"},
			             { name : 'userId',   			index : 'userId',               hidden : true}, 
			             { name : 'loginId',   			index : 'loginId',              width : "100",  sorttype : "string"}, 
			             { name : 'userName', 			index : 'userName', 			width : "150", 	sorttype : "string"},
			             { name : 'dlrCd',    			index : 'dlrCd',    			width : "80", 	sorttype : "string", 	align : "center" },
			             { name : 'dlrNm',    			index : 'dlrNm',    			width : "150", 	sorttype : "string"},
			             { name : 'effectiveDate8',    	index : 'effectiveDate8',   	width : "100", 	sorttype : "string", 	align : "center" },
			             { name : 'userlevelNm',    	index : 'userlevelNm',    		width : "80", 	sorttype : "string", 	align : "center" },
			             { name : 'userLevel',    		index : 'userLevel',    		width : "80", 	sorttype : "string", 	align : "center" ,hidden : true},
			             { name : 'ipAddress',    		index : 'ipAddress',    		width : "120", 	sorttype : "string", 	align : "center" },
			             { name : 'ipScanYn',    		index : 'ipScanYn',    		    width : "80", 	sorttype : "string", 	align : "center" }
				     ],
		pager     : '#poperatorList',
	   	multiselect: false,
	   	viewrecords: true,
	   	shrinkToFit: false,
	   	rowNum     : 12,
	   	onSelectRow: function (id) {
			            $("#btOPComfirm").attr('disabled', false);
			            
			            gridRowData = $("#goperatorList").getGridDataByRowId(id);
     	             }
	});
});

function orgTtreeIsOn(){
    layer1.style.visibility='visible';
    $("#orgTreeOn").css('display', 'none');
    $("#orgTreeOff").css('display', 'block');
 }
 
function orgTtreeIsOff(){
	layer1.style.visibility='hidden';
	$("#orgTreeOn").css('display', 'block');
	$("#orgTreeOff").css('display', 'none');
 }

function changeSearchOp(sel){ 
	if(sel.value=='orgCd'){
    	$("#orgTreeOn").removeAttr('disabled');
	}else{
		$("#orgTreeOn").attr('disabled',true);
		orgTtreeIsOff();
	}
}

function treeDlrCd(value1,value2){
	$('#searchTextOD').val(value1);
	$('#orgNm').val(value2);
}

function resizeJqGridWidth(grid_id, div_id, width){
    // window에 resize 이벤트를 바인딩 한다.
    $(window).bind('resize', function() {
        // 그리드의 width 초기화
        $('#' + grid_id).setGridWidth(width, false);
        // 그리드의 width를 div 에 맞춰서 적용
        $('#' + grid_id).setGridWidth($('#' + div_id).width() , false); //Resized to new width as per window
     }).trigger('resize');
}

function fclickSearch(){
	orgTtreeIsOff();
	
	var searchCode = $("#searchOpOD").val();
	var searchCol=null, searchVal=null;
	
	if      ( searchCode  ==  'userId' ){
		searchCol  =  'USER_ID';
		searchVal  =  $("#searchTextOD").val();
	}else if( searchCode  ==  'userNm' ){
		searchCol  =  'USER_NAME';
		searchVal  =  $("#searchTextOD").val();
	}else if( searchCode  ==  'orgCd'  ){
		searchCol   =  'DLR_CD';
		searchVal   =  $("#searchTextOD").val();
	}
	
	var filterMap  =  { 'searchCol':searchCol, 'searchVal':searchVal };
	var postData   =  { 'filterMaps':JSON.stringify( filterMap ) };
	
	jQuery("#goperatorList").jqGrid(  'setGridParam',  { url:'<s:url value="/subscribe/WorkHistory/OperatorSelect"/>', postData:postData } );
	jQuery("#goperatorList").trigger("reloadGrid",[{page:1}]);
	
}

function fclickComfirm(){
	var funcName = eval("${param.callBackFunc}");
	funcName(gridRowData);
	
	Dialog.close('#${param.dialogName}');
}

function fclickClose(){
	Dialog.close('#${param.dialogName}');
}

</script>