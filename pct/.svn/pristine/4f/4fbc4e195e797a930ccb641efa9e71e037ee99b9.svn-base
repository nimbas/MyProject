<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<script type="text/javascript">
$(function(e) {
	
	pageSetUp(); //Default Call function
	pagefunction();
	
	function pagefunction(){
		run_jqgrid_function();
		function run_jqgrid_function() {
			
			//Tree Grid
			$("#sampleTreeGrid").jqGrid({
				url : '<s:url value="/template/treeGrid"/>.json', 
			    mtype: 'POST',
				datatype : 'json',
				width : 'auto',
			    colNames: ['Product Name', 'Feature Code', 'rate'],
			    colModel: [
				    { name: 'prodName', index: 'prodName', width: 400, sorttype: "string"},
				    { name: 'ftrCd', index: 'ftrCd', width: 160, sorttype: "string" },
				    { name: 'rate', index: 'rate', width: 160, sorttype: "string" } 
				],
			    sortname: 'id',
			    gridview: true,
			    treeGrid: true,
			    loadonce: true,
			    treeGridModel: 'adjacency',
			    treedatatype: 'json',
			    ExpandColumn: 'prodName',
			    ExpandColClick: true,
			    width: $("#content").width(),
			    height: 'auto',
			    caption: "Adjacency Example",
				loadError : loadErrorCallback, // error handler; add/edit/delete errors
				loadComplete : loadCompleteCallback, // is called after loading all
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
			
			function loadErrorCallback(xhr, st, err) {

			    if (xhr.responseJSON != null && xhr.responseJSON.localErrorMessage != null) {
				// #error-message is a <span> tag in the HTML page
				$("#error-message").html(xhr.responseJSON.localErrorMessage);
			    }
			}

			function loadCompleteCallback(data) {
			    console.log(data);
			    // clean the error message (#error-message is a <span> tag in the HTML page)
			    $("#error-message").html("");
			}
			
			$(window).on('resize.jqGrid', function () {
				jQuery("#sampleTreeGrid").jqGrid( 'setGridWidth', $("#content").width() );
			});
		}
		
		//TODO : Click Event Function...
	}
	
});
</script>

<div class="row">
	<div class="col-sm-12">
		<h1 class="page-title txt-color-blueDark">
			<i class="fa fa-pencil-square-o fa-fw "></i> 
				Template
			<span>> Tree Grid List</span>
		</h1>
	</div>
</div>

<!-- widget grid -->
<section id="widget-grid" class="">
	<!-- row -->
	<div class="row">

		<!-- NEW WIDGET START -->
		<article class="col-sm-12">
			<table id="sampleTreeGrid"></table>
		</article>
		<!-- WIDGET END -->
	</div>
	<!-- end row -->		
</section>
<!-- end widget grid -->

