<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- Right side column. Contains the navbar and content of the page -->
<aside class="right-side">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>
			Product <small>Simple query</small>
		</h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
			<li><a href="#">Examples</a></li>
			<li class="active">Product</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">
		<div class="row">
			<div class="col-md-12">
				<!-- general form elements -->
				<div class="box box-primary">
					<!-- /.box-header -->
					<!-- form start -->
					<s:url value="/pages/examples/product/ajax/findByName" var="formUrl" />
					<form class="form-inline" role="form" action="${fn:escapeXml(formUrl)}">
						<div class="box-body">
							<div class="form-group">
								<label for="productName">product name</label>
								<input type="text" class="form-control input-sm" " id="value"
									name="value" value="${search.value}" placeholder="Enter product Name">
							</div>
							<button type="submit" class="btn btn-primary btn-sm">Submit</button>
						</div>
					</form>
				</div>
				<!-- /.box -->

				<!-- table섹션구분을 위해 box위에 jqGrid table선언 -->
				<div id="div_grid" class="box box-solid">
					<table id="grid"></table>
					<div id="page"></div>
				</div>
			</div>
			<span id="error-message" class="error-message"></span>
		</div>
	</section>
	<!-- /.content -->
</aside>



<!-- 이 프로그램의 자바스크립트 로직 선언 -->
<script>
    var gridColNames = [ "<s:message code="product_grid_id" />", "<s:message code="product_grid_name" />", "<s:message code="product_grid_service" />", "<s:message code="product_grid_valid_date" />", "<s:message code="product_grid_expired_date" />" ];
    var gridCaption = "<s:message code="product_grid_caption" />";
</script>
<script type="text/javascript">
/*
 * ==============================================
 * 프로그램 스타일
 * 
 * 1.전역변수
 * 2.document.ready
 * 3.document.ready에서 호출할 함수구현
 *===============================================
 */

/*
 *1.jqGrid옵션 전역변수
 */
// These settings are used (a) in methods like $("#dataTable").jqGrid("getGridParam", "selrow");
// and (b) in the initialization of the navigation bar.
// Similar settings can be used in a third way: (c) $.extend($.jgrid.edit, {}); $.extend($.jgrid.del, {}); $.extend($.jgrid.search, {});
var jqGridNavBarOptions = {
    edit : false,
    add : false,
    del : false,
    search : false,
    refresh : true
};
var jqGridEditOptions = {
    reloadAfterSubmit : false,
    mtype : "PUT",
    modal : true,
    closeAfterEdit : true,
    recreateForm : true,
    serializeEditData : serializeEditDataCallback,
    errorTextFormat : errorTextFormatCallback,
    onclickSubmit : onclickSubmitEditCallback,
    afterSubmit : afterSubmitCallback,
    onclickPgButtons : cleanEditForm
};
var jqGridAddOptions = {
    reloadAfterSubmit : false,
    mtype : "POST",
    modal : true,
    closeAfterAdd : true,
    recreateForm : true,
    serializeEditData : serializeEditDataCallback,
    errorTextFormat : errorTextFormatCallback,
    afterSubmit : afterSubmitCallback
};
var jqGridDelOptions = {
    reloadAfterSubmit : false,
    mtype : "DELETE",
    serializeDelData : serializeDelDataCallback,
    errorTextFormat : errorTextFormatCallback,
    onclickSubmit : onclickSubmitDelCallback
};
var jqGridSearchOptions = {
    sopt : [ "cn", "bw", "eq", "ne", "lt", "gt", "ew" ]
};

var URL = "/pc/pages/examples/product/ajax/findAll";
console.log("===URL===" + URL);
/*
 * 2.document.ready
 */
$(document).ready(function() {
    setupGrid();
    // decorateButtons();
    // initialiseWarningDialog();
    // $(window).resize(setDataGridWidth);
    // setDataGridWidth();
    submit();
});

function setupGrid() {

    console.log("===setupGrid===" + URL);
    
   
    $('#grid').jqGrid({

	url : URL, // source of data for the grid
	datatype : "json", // type of server response; request data type is
	// configured separately
	jsonReader : {
	    repeatitems : false,
	    id : "prodCd"
	}, // the unique ID of a row
	colNames : gridColNames, // names of columns; defined in the JSP file
	// for localization purposes
	colModel : [ {
	    name : 'prodCd',
	    index : "prod_cd",
	    align : 'left'
	}, {
	    name : 'prodName',
	    index : "prod_name",
	    align : 'left'
	}, {
	    name : 'svcDomain',
	    index : "svc_domain",
	    align : 'center'
	}, {
	    name : 'valdStrtDt',
	    index : "vald_strt_dt",
	    align : 'center'
	}, {
	    name : 'expireDate',
	    index : "expire_date",
	    align : 'center'
	} ],
	rowNum : 10,
	rowList : [ 5, 10, 20 ],
	height : '200',
	width : 'auto',
	autowidth : true,
	shrinkToFit : true,
	sortname : "prod_cd",
	sortorder : "asc",
	sortable : true,
	pager : "#page",
	viewrecords : true,
	caption : gridCaption, // defined in the JSP file for localization
	// purposes
	loadError : loadErrorCallback, // error handler; add/edit/delete errors
	// are processed by other methods
	loadComplete : loadCompleteCallback, // is called after loading all
	// data to the grid
	autoencode : true
    // when set to true encodes (HTML encode) the incoming (from server) and
    // posted data. It prevents Cross-site scripting (XSS) attacks.
    // The posted data should not be encoded - it's de-encoded in
    // serializeEditDataCallback().

    });

    $("#grid").jqGrid("navGrid", "#page", jqGridNavBarOptions, jqGridEditOptions, jqGridAddOptions, jqGridDelOptions, jqGridSearchOptions);

    console.log("==jqGrid선언==완료==");
}

function submit() {

    $("form.form-inline").submit(function(event) {
	event.preventDefault();
	console.log("==submit 로직 시작 ==");
	
	$("#grid").jqGrid("GridUnload");

	var form = $(this);
	console.log("입력값:" + $('input[name="value"]').val());
	var obj = new Object();
	obj.productName = $('input[name="value"]').val();
	var text = JSON.stringify(obj);

	var input = form.serialize();
	console.log("Form serialize:" + input);
	console.log("json형식:" + text);
	console.log("====입력완료====");
	URL=form.attr("action")+"?"+form.serialize();
	setupGrid(URL);
	
	/*
	$.ajax({
	    type : "POST",
	    url : form.attr("action"),
	    data : form.serialize(),
	    dataType : "json",
	    success : function(data) {

		var maxIndex = 0;
		var gridListIds = $('#grid').jqGrid('getDataIDs');
		if (gridListIds == "" || gridListIds == null || gridListIds.length == 0) {

		} else {
		    maxIndex = gridListIds.maxGridIndex();
		}

		if (data != "" && data != null) {
		    var rowid = maxIndex;
		    for (var i = 0; i < data.productList.length; i++) {
			jQuery('#grid').jqGrid('addRowData', ++rowid, data.productList[i]);
		    }
		}
	    },
	    error : function(xhr) {

	    }
	});
	*/
	
	return false;
    });
}

// callbacks that are called before the request is sent to the server
// --------------

// Fires after the submit button is clicked and the postdata is constructed.
// Parameters passed to this event are: a options array of the method and the
// posted data array.
// The event should return array of type {} which extends the postdata array.
function onclickSubmitEditCallback(options, data) {
    cleanEditForm();
    options.url = URL + "/" + data.dataTable_id;
}

function onclickSubmitDelCallback(options, rowid) {
    options.url = URL + "/" + rowid;
    // return { field1:value1 }; // will be sent to the server
}

// Serialize the data passed to the AJAX request. The function should return the
// serialized data.
// This event can be used when a custom data should be passed to the server
// (JSON, XML, etc.)
// The method receives the data which will be posted to the server.
function serializeEditDataCallback(data) {
    // create a copy
    var modifiedData = $.extend({}, data);

    // if it's a new record, replace its ID
    if (modifiedData.id == "_empty") {
	modifiedData.id = 0;
	modifiedData.version = 0;
    }

    // the operation is passed as an HTTP method, this field is not necessary
    delete modifiedData.oper;

    // The "autoencode:true" option HTML-encodes incoming and posted data.
    // The posted data should not be encoded. It is de-encoded here.
    modifiedData.name = $.jgrid.htmlDecode(modifiedData.name);

    // encode the data in `application/x-www-form-urlencoded`
    return $.param(modifiedData);

    // Remove the comment to return JSON instead
    // return JSON.stringify(modifiedData);
    // You also need to add `ajaxEditOptions: { contentType: "application/json"
    // }` to `edit` options
}

// This callback is similar to serializeEditDataCallback(), but it is called
// when a row is deleted.
function serializeDelDataCallback(data) {

    return $.param({
	version : $("#dataTable").jqGrid("getCell", data.id, "version")
    });
}

// callbacks that are called when the response is received from server
// -----------------

// This callback is called when an error happens during an add/edit/delete
// operation on the server.
// It should return a string which is displayed at the top of the dialog.
function errorTextFormatCallback(xhr) {

    // If the response does not have JSON data, or it contains an error message
    // that should be displayed on a separate error page...
    if (xhr.responseJSON == null || xhr.responseJSON.globalErrorCode != null) {
	return; // the error should be processed globally
    }

    var validationErrors = xhr.responseJSON.validationErrors;

    if (validationErrors != null) {

	for (var i = 0; i < validationErrors.length; i += 2) {
	    var selector = ".DataTD #" + validationErrors[i];
	    $(selector).after("<div class='field-error-message'>" + validationErrors[i + 1] + "</div>");
	}
    }

    return xhr.responseJSON.localErrorMessage;
}

// removes error icons from an add/edit form
function cleanEditForm() {
    $(".field-error-message").remove();
}

// set the ID of the new row in the grid
function afterSubmitCallback(xhr, data) {
    data.version = xhr.responseJSON.version;
    // the id in the returned array is used for new records only; it is ignored
    // for updated records
    return [ true, "", xhr.responseJSON.id ];
}

// error handler for the grid data requests (not for add/edit/delete operations)
function loadErrorCallback(xhr, st, err) {

    if (xhr.responseJSON != null && xhr.responseJSON.localErrorMessage != null) {
	// #error-message is a <span> tag in the HTML page
	$("#error-message").html(xhr.responseJSON.localErrorMessage);
    }
}

// This callback is called after loading all data to the grid. It cleans the
// error message on the main page (NOT in add/edit/delete dialogs).
function loadCompleteCallback(data) {
    console.log(data);
    // clean the error message (#error-message is a <span> tag in the HTML page)
    $("#error-message").html("");
}

// other methods
// --------------------------------------------------------------------

function setDataGridWidth() {
    $("html").css("overflow", "hidden"); // hack for bottom scrollbar in
    // Chrome that keeps appearing when you click the unmaximise button

    var width = $("#content").width();
    $("#dataTable").jqGrid("setColProp", "name", {
	widthOrg : width - 130
    });
    $("#dataTable").jqGrid("setGridWidth", width - 10);

    $("html").css("overflow", "auto");
}

// Creates a jQuery UI dialog (hidden at this point)
function initialiseWarningDialog() {
    $("#selectRowMessage").dialog({
	autoOpen : false,
	height : 120,
	modal : true,
	buttons : {
	    Close : function() {
		$(this).dialog("close");
	    }
	}
    });
}

function attachButtons() {
    $("#editBtn").click(function() {
	var gr = $("#dataTable").jqGrid("getGridParam", "selrow");
	if (gr != null) {
	    $("#dataTable").jqGrid("editGridRow", gr, jqGridEditOptions);
	} else {
	    $("#selectRowMessage").dialog("open");
	}
    });

    $("#addBtn").click(function() {
	$("#dataTable").jqGrid("editGridRow", "new", jqGridAddOptions);
    });

    $("#deleteBtn").click(function() {
	var gr = $("#dataTable").jqGrid("getGridParam", "selrow");
	if (gr != null) {
	    $("#dataTable").jqGrid("delGridRow", gr, jqGridDelOptions);
	} else {
	    $("#selectRowMessage").dialog("open");
	}
    });

    $("#searchBtn").click(function() {
	$("#dataTable").jqGrid("searchGrid", jqGridSearchOptions);
    });

    $("#resetBtn").click(function() {
	var postdata = $("#dataTable").jqGrid("getGridParam", "postData");
	postdata._search = false;
	postdata.searchField = "";
	postdata.searchOper = "";
	postdata.searchString = "";

	$("#dataTable").trigger("reloadGrid", [ {
	    page : 1
	} ]);
    });
}

// converts buttons into jQuery UI buttons
function decorateButtons() {
    $("#addBtn").button({
	icons : {
	    primary : "ui-icon-plus"
	}
    });

    $("#editBtn").button({
	icons : {
	    primary : "ui-icon-pencil"
	}
    });

    $("#deleteBtn").button({
	icons : {
	    primary : "ui-icon-trash"
	}
    });

    $("#searchBtn").button({
	icons : {
	    primary : "ui-icon-search"
	}
    });

    $("#resetBtn").button({
	icons : {
	    primary : "ui-icon-arrowreturnthick-1-w"
	}
    });
}

function preloadImages() {
    var themeImagesDir = "//ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/themes/redmond/images/";
    $("<img/>")[0].src = themeImagesDir + "ui-icons_217bc0_256x240.png";
    $("<img/>")[0].src = themeImagesDir + "ui-icons_f9bd01_256x240.png";
}
</script>
