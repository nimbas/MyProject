<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<script type="text/javascript">
$(function(e) {
	
	pageSetUp(); //Default Call function
	pagefunction();
	
	function pagefunction(){
		run_jqgrid_function();
		function run_jqgrid_function() {
			//Tree Grid
			var gridWidth = $('#${param.dialogName}').width()-5 ;
			$("#sampleTreeGrid").jqGrid({
				url : '<s:url value="/template/treeGrid"/>.json', 
			    mtype: 'POST',
				datatype : 'json',
			    colNames: ['Product Name', 'Feature Code', 'rate'],
			    colModel: [
				    { name: 'prodName', index: 'prodName', width: 400, sorttype: "string"},
				    { name: 'ftrCd', index: 'ftrCd', width: 260, sorttype: "string" },
				    { name: 'rate', index: 'rate', width: 260, sorttype: "string" } 
				],
			    sortname: 'id',
			    gridview: true,
			    treeGrid: true,
			    loadonce: true,
			    treeGridModel: 'adjacency',
			    treedatatype: 'json',
			    ExpandColumn: 'prodName',
			    ExpandColClick: true,
			    width : gridWidth, 
			    height: 'auto',
			    caption: "Adjacency Example"
			});
			
			/* 
			// sample code
			var mydata = [{"rowNumber":0,"totalCount":0,"id":"58","parent":null,"prodName":"The rate of Yarianii bagts 10000","ftrCd":null,"rate":null,"status":null,"lvl":0,"level":0,"expanded":true,"loaded":true,"isLeaf":false},{"rowNumber":0,"totalCount":0,"id":"58101","parent":"58","prodName":"Yarianii bagts 10000","ftrCd":"101","rate":"30000","status":null,"lvl":1,"level":1,"expanded":true,"loaded":true,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"58851","parent":"58","prodName":"Yarianii bagts 10000","ftrCd":"851","rate":"0","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"58852","parent":"58","prodName":"Yarianii bagts 10000","ftrCd":"852","rate":"0","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"58853","parent":"58","prodName":"Yarianii bagts 10000","ftrCd":"853","rate":"1000","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"58856","parent":"58","prodName":"Yarianii bagts 10000","ftrCd":"856","rate":"15000","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"58956","parent":"58","prodName":"Yarianii bagts 10000","ftrCd":"956","rate":"0","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"58980","parent":"58","prodName":"Yarianii bagts 10000","ftrCd":"980","rate":"1000","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"59","parent":null,"prodName":"The rate of Yarianii bagts 400","ftrCd":null,"rate":null,"status":null,"lvl":0,"level":0,"expanded":true,"loaded":true,"isLeaf":false},{"rowNumber":0,"totalCount":0,"id":"59101","parent":"59","prodName":"Yarianii bagts 400","ftrCd":"101","rate":"30000","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"59851","parent":"59","prodName":"Yarianii bagts 400","ftrCd":"851","rate":"0","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"59852","parent":"59","prodName":"Yarianii bagts 400","ftrCd":"852","rate":"0","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"59853","parent":"59","prodName":"Yarianii bagts 400","ftrCd":"853","rate":"1000","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"59856","parent":"59","prodName":"Yarianii bagts 400","ftrCd":"856","rate":"15000","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"59956","parent":"59","prodName":"Yarianii bagts 400","ftrCd":"956","rate":"0","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"59980","parent":"59","prodName":"Yarianii bagts 400","ftrCd":"980","rate":"1000","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"60","parent":null,"prodName":"The rate of Yarianii bagts 30000","ftrCd":null,"rate":null,"status":null,"lvl":0,"level":0,"expanded":true,"loaded":true,"isLeaf":false},{"rowNumber":0,"totalCount":0,"id":"60101","parent":"60","prodName":"Yarianii bagts 30000","ftrCd":"101","rate":"30000","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"60851","parent":"60","prodName":"Yarianii bagts 30000","ftrCd":"851","rate":"0","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"60852","parent":"60","prodName":"Yarianii bagts 30000","ftrCd":"852","rate":"0","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"60853","parent":"60","prodName":"Yarianii bagts 30000","ftrCd":"853","rate":"1000","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"60856","parent":"60","prodName":"Yarianii bagts 30000","ftrCd":"856","rate":"15000","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"60956","parent":"60","prodName":"Yarianii bagts 30000","ftrCd":"956","rate":"0","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true},{"rowNumber":0,"totalCount":0,"id":"60980","parent":"60","prodName":"Yarianii bagts 30000","ftrCd":"980","rate":"1000","status":null,"lvl":1,"level":1,"expanded":false,"loaded":false,"isLeaf":true}];
			$("#sampleTreeGrid")[0].addJSONData({
				total: 1,
				page: 1,
				records: mydata.length,
				rows: mydata
			}); */
			
		}
		
		//TODO : Here Click Event Function...
		$("#confirmBtn").click(function(e){ 
			e.preventDefault();
			if(eval("window.${param.callBack}") != null){
				var funcName = eval("${param.callBack}");
				funcName($("#sampleTreeGrid").selGridData());
			}			
			Dialog.close('#${param.dialogName}');
		});
			
		$("#closeBtn").click(function(e){ 
			e.preventDefault();
			Dialog.close('#${param.dialogName}');			
		});
		
	}
	
});
</script>
<!-- widget grid -->
<section id="widget-grid" class="">
	<!-- row -->
	<div class="row" style="height:555px; overflow-x:hidden; overflow-y:auto">

		<!-- NEW WIDGET START -->
		<article class="col-sm-12">
			<table id="sampleTreeGrid"></table>
		</article>
		<!-- WIDGET END -->
	</div>
	<!-- end row -->
	<div class="form-actions">
		<div class="row">
			<div class="col-md-12">
				<customTag:button label="Confirm" id="confirmBtn" css="success" size="xs"/>
				<customTag:button label="Close" id="closeBtn" css="success" size="xs"/>
			</div>
		</div>
	</div>			
</section>
<!-- end widget grid -->
