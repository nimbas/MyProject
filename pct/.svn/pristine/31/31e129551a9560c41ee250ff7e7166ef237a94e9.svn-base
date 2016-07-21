<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<!-- widget grid -->
<section id="widget-grid" class="">
	<div class="row">
		<article class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
			<table id="parameterListGrid"></table>
			<div id="pagerOfparameterListGrid"></div>
		</article>
		<article class="col-sm-6 col-md-6 col-lg-6">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false">
				<header>
					<span class="widget-icon"> <i class="fa fa-eye"></i> </span>
					<h2>Parameter Information</h2>

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

						<form class="form-horizontal" id="parameterRegForm">
							<fieldset>
								<customTag:inputbox label="Parameter ID" id="pvParamId" required="required"/>
								<customTag:inputbox label="Parameter Name" id="csParamId" required="required"/>
								<customTag:textbox label="Description" id="descr" rows="3" />
								<customTag:inputsearch label="NE ID" id="neId" required="required"/>
								<customTag:selectbox label="Parameter Type" id="paramType" required="required" codeType="ProvParamType"/>
								<div class="form-group" id="enumList">
									<label class="control-label col-xs-3 col-sm-3 col-md-3 col-lg-3 control-label">${label }</label>
									<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
										<div class="row">
											<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
												<table id="parameterEnumListGrid"></table>
												<div id="pagerOfparameterEnumListGrid"></div>
											</article>
										</div>
										<div class="row">
											<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
												<div style="text-align:right;margin-top:10px;">
													<a class="btn btn-info btn-xs" id="deleteBtn" disabled="disabled">Delete</a>
													<a class="btn btn-info btn-xs" id="editBtn" disabled="disabled">Edit</a>
													<a class="btn btn-info btn-xs" id="addBtn">Add</a>
													<a class="btn btn-info btn-xs" id="saveBtn" disabled="disabled">Save</a>
													<a class="btn btn-info btn-xs" id="cancelBtn" disabled="disabled">Cancel</a>
												</div>
											</article>
										</div>
									</div>
								</div>
								<customTag:inputbox label="Parameter Max Length" id="paramMaxLen" type="number"/>
								<customTag:inputbox label="Default Value" id="defValue"/>
								<customTag:inputbox label="Creation Date" id="sysCreationDate" disabled="disabled" value=""/>
								<customTag:inputbox label="Changed Date" id="sysUpdateDate" disabled="disabled"/>
								<customTag:inputbox label="Operator ID" id="operatorId" disabled="disabled"/>
							</fieldset>
							
						</form>
						
						<div class="form-actions">
							<div class="row">
								<div class="col-md-12">
									<customTag:button label="Upload" id="uploadBtn" css="success" size="xs" userDefine="method='POST'"/>
									<customTag:button label="New" id="newParameterBtn" css="success" size="xs" userDefine="method='POST'"/>
									<customTag:button label="Delete" id="delParameterBtn" css="success" size="xs" userDefine="method='DELETE'"/>
									<customTag:button label="Save" id="saveParameterBtn" css="success" size="xs" userDefine="method='POST'"/>
								</div>
							</div>
						</div>		
	
					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
			<!-- end widget -->

		</article>
		<!-- WIDGET END -->

	</div>
	<!-- end row -->		
</section>
<!-- end widget grid -->

<script type="text/javascript">

var pagedestroy = function(){
	//alert('page destroy!');
	console.log('param list page destroy');
	$("body").removeData('deleteGridData') ;
}
var getNeInfoCallBack = function(neInfo){
	$("#neId").val(neInfo.neId);
}
var refreshGridList = function(){
	jQuery("#parameterListGrid").reloadGrid();
}
$(function(e) {
	pageSetUp(); //Default Call function
	pagefunction();
	loadScript(baseScriptUrl + '/co/form.custom.validator.js');
	function pagefunction() {
		
		run_jqgrid_function();
		function run_jqgrid_function() {

			jQuery("#parameterListGrid").jqGrid({
				url : '<s:url value="/param/search"/>', 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    postData : {'filterMaps': JSON.stringify({'page' : 1})},
				datatype : 'json',
				colNames : [ "Parameter ID"	
				            , "Parameter Name"		
				            , "Description"		
				            , "NE ID"		
				            , "Param Type"		
				            , "Max Length"		
				            , "Default Value"		
				            , "Creation Date"	 
				            , "Changed Date"	 
				            , "Operator ID"			
				            ],
				colModel : [
					{ name : 'pvParamId', 		index : 'pv_param_id',		align : 'left',		width : 120}, 
					{ name : 'csParamId', 		index : 'cs_param_id',		align : 'left' ,	width : 120}, 
					{ name : 'descr', 			index : 'descr',			align : 'left' ,	width : 120}, 
					{ name : 'neId', 			index : 'ne_id', 			align : 'left',		width : 60}, 
					{ name : 'paramType', 		index : 'param_type', 		align : 'center',	width : 80}, 
					{ name : 'paramMaxLen', 	index : 'param_max_len', 	align : 'center',	width : 80}, 
					{ name : 'defValue', 		index : 'def_value', 		align : 'left',		width : 110}, 
					{ name : 'sysCreationDate', index : 'sys_creation_date',align : 'center',   width : 110, formatter:formatters["dateTime"]}, 
					{ name : 'sysUpdateDate', 	index : 'sys_update_date',  align : 'center',   width : 110, formatter:formatters["dateTime"]}, 
					{ name : 'operatorId', 		index : 'operator_id', 		align : 'center',	width : 100 }
					],
				rowNum : 15, //-1 : all data
				rowList : [15, 20, 50, 100], // 한번에 보기 갯수 목록 
				pager : '#pagerOfparameterListGrid',
				sortname : 'pv_param_id',
				sortorder : "asc",
				caption : "Parameter List",
				toolbarfilter: false,
				viewrecords : true,				
				multiselect : false,
				height : '490px',  //10개:330px, 15개 : 490px 
				autowidth : true,				
			   	shrinkToFit: false,
			   	hidegrid: true,		
			   	beforeProcessing : function(data, status, xhr){
					
				},
			   	onSelectRow: function(ids) {
			   		var sendData = $("#parameterListGrid").selGridData();
			   		$("#parameterEnumListGrid").clearGridData();
			   		if(sendData.paramType == 'E'){
						$.ajax({
							type : 'POST',
							url : '<s:url value="/param/enum/search"/>', 
							//contentType: "application/json",
							dataType : 'json',
							data : {pvParamId : sendData.pvParamId},
							success : function(data) {
								$("#parameterEnumListGrid").addGridData(data.rows);
							},	error:function(data){
								MessageBox.error(data, "<s:message code="err.500"/>"); 
							}, complete:function(jqXHR, textStatus){
								setTimeout(function(){$("#enumList").show();}, 200);
							}
						});	
					}else{
						$("#enumList").hide();
					}
			   		
			   		$('#parameterRegForm').bindingFormData($('#parameterListGrid').getGridDataByRowId(ids));
			   		$('#saveParameterBtn').attr('method', 'PUT');
			   		$('#pvParamId, #neId, #neIdSearchBtn').prop('disabled', true);
				}			
			});
				
			//jQuery("#parameterListGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			jQuery("#parameterListGrid").jqGrid('navGrid', "#pagerOfparameterListGrid"
				,{edit:false,add:false,del:false} // Setting for buttons
				,{closeOnEscape : true, multipleSearch : true, closeAfterSearch : true } //setting for search option
			);
			
			jQuery("#parameterEnumListGrid").jqGrid({
				datatype: "local",
				height: 100,
				autowidth : true,				
			   	shrinkToFit: false,
			   	//pager : '#pagerOfparameterEnumListGrid',
				colNames:['workType', 'H_pvParamId', 'H_neId', 'Enum Value', 'Order', 'Description'],
			   	colModel:[
					{name:'workType',   index:'workType', 	hidden:true},
					{name:'pvParamId',  index:'pvParamId', 	hidden:true},
					{name:'neId',  		index:'neId', 		hidden:true},
					{name:'enumValue',  index:'enum_value',	width:140,	editable : true},
					{name:'orderNo',    index:'order_no',   width:80,	editable : true},
			   		{name:'enumRealValue',index:'enum_real_value', width:210,  	editable : true},				   			
			   	],
			   	multiselect: false,
			   	viewrecords: true,
			   	shrinkToFit: false,
			   	caption: "Enum List",
			   	editurl:'clientArray',
			   	cellsubmit: 'clientArray', 
			   	onSelectRow : function(rowId){
			   		$("#editBtn").attr('disabled', false);
			   		$("#deleteBtn").attr('disabled', false);
			   	},
			});
			
			//브라우져 사이즈 조정시 마다 그리드 사이즈 조정		    
		    $(window).on('resize.jqGrid', function () {
				jQuery("#parameterListGrid").resizeGridWidth();
				jQuery("#parameterEnumListGrid").resizeGridWidth();
			});
		} // end of jqgrid function
			
		$("#deleteBtn").click(function(e){
			e.preventDefault();
			var data = $('#parameterEnumListGrid').selGridData();
			if(data.workType == 'NONE'){
				data.workType = 'DELETE';
				$("body").setArrayData('deleteGridData', data) ;
			}
			$('#parameterEnumListGrid').deleteGridData();
			$(this).attr('disabled', true);
		});
		
		function gridButtonDisableOption(opt){
			$("#deleteBtn").attr('disabled', opt.del);
			$('#editBtn').attr('disabled', opt.edit);
			$('#addBtn').attr('disabled', opt.add);
			$('#saveBtn').attr('disabled', opt.save);
			$('#cancelBtn').attr('disabled', opt.cancel);
		}
		$("#editBtn").click(function(e){
			e.preventDefault();
			var data = $('#parameterEnumListGrid').selGridData();
			$('#parameterEnumListGrid').editRow(data.keyId);
			gridButtonDisableOption({del:true, add:true, edit:true, save:false, cancel:false});
		});
		
		$("#addBtn").click(function(e){
			e.preventDefault();
			$('#parameterEnumListGrid').jqGrid('addRow',"new");
			gridButtonDisableOption({del:true, add:true, edit:true, save:false, cancel:false});
		});
		
		$("#saveBtn").click(function(e){
			e.preventDefault();
			var data = $('#parameterEnumListGrid').selGridData();
			$('#parameterEnumListGrid').saveRow(data.keyId);
			if(data.workType == 'NONE'){
				data = $('#parameterEnumListGrid').selGridData();
				data.workType = 'UPDATE';
				setTimeout(function(){$('#parameterEnumListGrid').updateGridData(data);}, 100);
			}
			gridButtonDisableOption({del:true, add:false, edit:true, save:true, cancel:true});
		});
		$("#cancelBtn").click(function(e){
			e.preventDefault();
			var data = $('#parameterEnumListGrid').selGridData();
			$('#parameterEnumListGrid').restoreRow(data.keyId);
			gridButtonDisableOption({del:true, add:false, edit:true, save:true, cancel:true});
		});
		
		$("#newParameterBtn").click(function(e){
			e.preventDefault();
			$('#saveParameterBtn').attr('method', 'POST');
			$('#parameterRegForm').trigger('reset');
			$('#pvParamId, #neId, #neIdSearchBtn').prop('disabled', false);
			$("#parameterEnumListGrid").clearGridData();
		});
		
		$("#paramType").change(function(e){
			
			var paramType = $(this).val(); 
			var data = $("#parameterListGrid").selGridData();
			if(data != null && data.paramType != paramType && data.paramType == 'E'){
				var enumData = $("#parameterEnumListGrid").allGridData();
				//alert(JSON.stringify(enumData));
				if(enumData != null){
					$.each(enumData, function(idx, obj){
						if(obj['workType'] == 'NONE' || obj['workType'] == 'UPDATE'){
							obj['workType'] = 'DELETE';
						}else{
							delete obj ;
						}
					});
					$("body").setArrayData('deleteGridData', enumData) ;
				}
				$("#parameterEnumListGrid").clearGridData();
			}
			if(paramType == 'E'){
				$("#enumList").show();
			}else{
				$("#enumList").hide();
			}
		});
		$("#saveParameterBtn").click(function(e){
			e.preventDefault();
			
			if(!$('#parameterRegForm').formValidate()){
				return ;
			}
			var pvParamId = $('#pvParamId').val();
			var newEnums = new Array();
			var delProvEnums = $("body").data('deleteGridData') ;
			//alert(JSON.stringify(delProvEnums));
			if(delProvEnums != null)
			$.each(delProvEnums, function(idx, obj){
				obj['pvParamId'] = pvParamId;
				obj['neId'] = $('#neId').val();
				newEnums.push(obj);
			});
			var provEnums = $('#parameterEnumListGrid').allGridData(false);
			if($('#paramType').val() == 'E' && (provEnums == null || provEnums.length == 0)){
				MessageBox.alert('Add enum !');
				return ;
			}
			if(provEnums != null)
			$.each(provEnums, function(idx, obj){
				if(obj['workType'] == ''){
					obj['workType'] = 'CREATE';
				}				
				obj['pvParamId'] = pvParamId;
				obj['neId'] = $('#neId').val();
				newEnums.push(obj);
			});
			var workType = 'CREATE' ;
			if($('#saveParameterBtn').attr('method') == 'PUT'){
				workType = 'UPDATE' ;
			}
			var data = {   'pvParamId'	: pvParamId
						 , 'csParamId' 	: $('#csParamId').val()
						 , 'descr' 		: $('#descr').val()
						 , 'paramType' 	: $('#paramType').val()
						 , 'paramMaxLen': $('#paramMaxLen').val()
						 , 'neId' 		: $('#neId').val()
						 , 'defValue' 	: $('#defValue').val()
						 , 'workType'	: workType
						 , 'provEnums'	: newEnums
					   } ;
			console.log("submit data == "+ JSON.stringify(data));
			$("#content").processing();
			$.ajax({
				type : $('#saveParameterBtn').attr('method'),
				async : true,
				url : '<s:url value="/param/"/>'+pvParamId, 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(data),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						$("#parameterListGrid").reloadGrid();
						$('#newParameterBtn').trigger('click');
						$('#parameterEnumListGrid').clearGridData();
						$("body").removeData('deleteGridData');//초기화
					}else{
						MessageBox.error(data.resultMsg);
					}
				},	error:function(data){
					MessageBox.error(data, "<s:message code="err.500"/>");
				}, complete:function(jqXHR, textStatus){
					$("#content").complete();
				}
			});	
		});
		
		$("#delParameterBtn").click(function(e){
			e.preventDefault();
			var pvParamId = $('#pvParamId').val();
			var neId = $('#neId').val();
			var data = {'pvParamId': pvParamId, 'neId': neId, 'workType': 'DELETE'} ;
			if(pvParamId == ''){
				MessageBox.alert('Select parameter code to delete!');
				return ;
			}
			console.log("submit data == "+ JSON.stringify(data));
			
			$("#content").processing();
			$.ajax({
				type : 'DELETE',
				url : '<s:url value="/param/"/>'+pvParamId, 
				contentType: "application/json",
				dataType : 'json',
				data : JSON.stringify(data),
				success : function(data) { 
					if(data.resultCode == 'SUCCESS'){
						jQuery("#parameterListGrid").reloadGrid();
						$("#newParameterBtn").trigger('click');
					}else{
						MessageBox.error(data.resultMsg);
					}
				},	error:function(data){
					MessageBox.error(data, "<s:message code="err.500"/>"); 
				}, complete:function(jqXHR, textStatus){
					$("#content").complete();
				}
			});	
		});
		
		$("#neIdSearchBtn").click(function(e){
			e.preventDefault();
			Dialog.open({
				div : '#networkElementDialog', 
				url : '<s:url value="/neInfosDialog"/>?callBack=getNeInfoCallBack', 
				title :'Select Network Element', 
				width : 650, 
				height : 575
			}); 
		});
		
		$("#uploadBtn").click(function(e){
			e.preventDefault();
			Dialog.open({
				div : '#excelUploadDialog', 
				url : '<s:url value="/excelUpload/parameter"/>?callBack=refreshGridList', 
				title :'Excel Upload', 
				width : 800, 
				height : 615
			}); 
		});
	}// end pageFunction
	
});	
</script>