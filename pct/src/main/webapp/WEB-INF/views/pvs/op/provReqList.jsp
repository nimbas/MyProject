<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%-- <div class="row">
	<div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
		<h1 class="page-title txt-color-blueDark">
			<i class="fa fa-pencil-square-o fa-fw "></i> 
				OP. Table
			<span>> Prov. Request</span>
		</h1>
	</div>
</div> --%>

<!-- widget grid -->
<section id="widget-grid" class="">
	<div class="row">
		<!-- NEW WIDGET START -->
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
		
			<div class="jarviswidget" id="searchDiv" data-widget-colorbutton="false" data-widget-editbutton="false">
				<header>
					<span class="widget-icon"> <i class="fa fa-eye"></i> </span>
					<h2>Search</h2>
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
						<form class="form-horizontal" role="form" id="provReqSearchForm" action="<s:url value="/op/provReq/search"/>">
							<fieldset>
								<div class="form-group">
									<div class="col-md-1">
										<select class="form-control" id="searchDateType" name="searchDateType"> 
											<option value="datepickerType1">Date</option>
											<option value="datepickerType2">Period</option>
											<option value="datepickerType3">Date Time</option>
										</select>
									</div>
									<div class="col-md-3">
										<div class="row">
											<div class="col-sm-12" id="datepickerType1" >
												<div class="input-group">
													<input class="form-control" type="text" id="searchDate1" name="searchDate1" placeholder="" class="form-control datepicker" data-dateformat="yy-mm-dd" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${curDate}" />">
													<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
												</div>
											</div>
											<div class="col-sm-6" id="datepickerType2" style="display:none;">
												<div class="input-group">
													<input class="form-control" id="searchDate2From" name="searchDate2From" type="text" placeholder="" data-dateformat="yy-mm-dd" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${prevDate}" />">
													<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
												</div>
											</div>
											<div class="col-sm-6" id="datepickerType2" style="display:none;">
												<div class="input-group">
													<input class="form-control" id="searchDate2To" name="searchDate2To"  type="text" placeholder="" data-dateformat="yy-mm-dd" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${curDate}" />">
													<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
												</div>
											</div>
											<div class="col-sm-6" id="datepickerType3" style="display:none;">
												<div class="input-group" >
													<input class="form-control" type="text" id="searchDate3" name="searchDate3" placeholder="" class="form-control datepicker" data-dateformat="yy-mm-dd" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${curDate}" />">
													<span class="input-group-addon"><i class="fa fa-calendar"></i></span>
												</div>
											</div>
											<div class="col-sm-6" id="datepickerType3" style="display:none;">
												<div class="input-group" >
													<input class="form-control" id="clockpicker" type="text" placeholder="" data-autoclose="true" value="<fmt:formatDate pattern="HH:mm" value="${curDate}" />">
													<span class="input-group-addon"><i class="fa fa-clock-o"></i></span>
												</div>
											</div>
											
										</div>
									</div>								
									<label class="control-label col-md-1" for="eventCd">Event</label>
									<div class="col-md-2">
										<select class="form-control" id="searchString" name="searchString" searchField="event_cd" searchOper="eq" >
											<option value="">::: Select :::</option>
											<code:out codeType="EventCd" option="listbox"/>
										</select>
									</div>								
									<label class="control-label col-md-1" for="eventCd">Status</label>
									<div class="col-md-2">
										<select class="form-control" id="searchString" name="searchString" searchField="status_cd" searchOper="eq" >
											<option value="">::: Select :::</option>
											<code:out codeType="PvsStatusCd" option="listbox"/>
										</select>
									</div>
									<div class="col-md-2">
										<button type="submit" class="btn btn-success btn-sm" id="searchBtn"><i class="fa fa-search"></i>
										Search</button>
									</div>
								</div>
							</fieldset>
							
							<fieldset>
								<div class="form-group">
									<label class="control-label col-md-2" for="provSeqNoId">Prov Seq No</label>
									<div class="col-md-2">
										<input type="text" class="form-control" id="searchString" name="searchString" searchField="pv_req_seq_no" searchOper="eq" placeholder="Prov Seq No">
									</div>								
									<label class="control-label col-md-1" for="subscriberId">Subs ID</label>
									<div class="col-md-2">
										<input type="text" class="form-control" id="searchString" name="searchString" searchField="entr_no" searchOper="eq" placeholder="Subs ID">
									</div>								
									<div class="col-md-3">
										&nbsp;
									</div>								
									<div class="col-md-2">
										<button type="reset" class="btn btn-success btn-sm" id="resetBtn"><i class="fa fa-times"></i>
										Reset 
										</button>
									</div>
								</div>
							</fieldset>
						</form>

					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
		</article>
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<table id="provReqListGrid"></table>
			<div id="pagerOfProvReqList"></div>
			<div class="form-actions">
				<div class="row">
					<div class="col-md-12">
						<customTag:button label="NE Message Reprocessing" id="reprocessingBtn" css="success" size="xs"/>
						<customTag:button label="NE Message Modification" id="modificationBtn" css="success" size="xs"/>
					</div>
				</div>	
			</div>
			<table id="neReqListGrid"></table>
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
		
		run_jqgrid_function();
		run_calendar_function();
		
		function statusFormatter(cellvalue, options, rowObject ){
			var color = "";
	  	  	if(cellvalue == 'E') {
	  	  		color ="red";
	  	  	} else if(cellvalue == 'R'){
	  	  		color ="black";
	  	  	} else {
	  	  		color ="navy";
	  	  	}
	  		return "<span style='font-weight:bold;color :"+color+";'>"+cellvalue+"</span>";
		}
		
		function run_jqgrid_function() {

			jQuery("#provReqListGrid").jqGrid({
				url : $('#provReqSearchForm').attr('action'), 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    postData : {'filterMaps': JSON.stringify({'page' : 1, 'dateType': '1', 'reqDt': '<fmt:formatDate pattern="yyyyMMdd" value="${curDate}" />'})},
				datatype : 'json',
				colNames : [ "Prov Seq No"	
				            , "Event"		
				            , "Event"		
				            , "Subs ID"		
				            , "CAS ID"		
				            , "MAC Address"	
				            , "STB Model"	
				            , "Status"		
				            , "Status"
				            , "Message"			
				            , "Request Date"	 
				            , "Reponse Date"	 
				            , "Result"			
				            , "Result Message"
				            ],
				colModel : [
					{ name : 'pvReqSeqNo', 	index : 'pv_req_seq_no' }, 
					{ name : 'eventCd', 	index : 'event_cd' ,	hidden : true}, 
					{ name : 'eventName', 	index : 'event_cd',	 	align : 'center'}, 
					{ name : 'entrNo', 		index : 'entrNo', 		align : 'center'}, 
					{ name : 'casId', 		index : 'casId', 		align : 'center'}, 
					{ name : 'macAddress', 	index : 'macAddress', 	align : 'center', editable: true}, 
					{ name : 'stbModel', 	index : 'stbModel',  	align : 'center', sortable : false}, 
					{ name : 'statusCd', 	index : 'statusCd', 	align : 'center', hidden : true},
					{ name : 'statusName',  index : 'status_cd', 	align : 'center' , formatter : statusFormatter},
					{ name : 'message',  	index : 'message',  	align : 'center' , editable: true},
					{ name : 'reqDt',  		index : 'req_dt',  	 	align : 'center' , formatter:formatters["dateTimeString"]},
					{ name : 'returnDt',  	index : 'return_dt',   	align : 'center' , formatter:formatters["dateTimeString"]},
					{ name : 'resultCode', 	index : 'result_code', 	align : 'center' },
					{ name : 'resultMsg',  	index : 'result_msg',  	align : 'center' },
					],
				rowNum : 10, //-1 : all data
				rowList : [10, 20, 50, 100], // 한번에 보기 갯수 목록 
				pager : '#pagerOfProvReqList',
				sortname : 'req_dt',
				sortorder : "desc",
				caption : "CS Request Information",
				toolbarfilter: false,
				viewrecords : true,				
				multiselect : false,
				autowidth : true,				
				//width : 'auto',//$("#content").width(),
				height : 'auto',
			   	shrinkToFit: true,
			   	hidegrid: true,
			   	
			   	onSelectRow: function(ids) {
			   		//jQuery('#provReqListGrid').jqGrid('editRow',ids,true);
					if(ids == null) {
						ids=0;
						if(jQuery("#neReqListGrid").jqGrid('getGridParam','records') >0 ){
							jQuery("#neReqListGrid").jqGrid('setGridParam',{url:"<s:url value="/op/provReq/subList"/>?pvReqSeqNo=0"});
							jQuery("#neReqListGrid").trigger('reloadGrid');
						}
					} else {
						var pvReqSeqNo = $("#provReqListGrid").getGridDataByRowId(ids).pvReqSeqNo;
						jQuery("#neReqListGrid").jqGrid('setGridParam',{url:"<s:url value="/op/provReq/subList"/>?pvReqSeqNo="+pvReqSeqNo});
						jQuery("#neReqListGrid").trigger('reloadGrid');			
					}
				}			
			});
				
			//jQuery("#provReqListGrid").jqGrid('filterToolbar',{stringResult: true, searchOperators : true, defaultSearch: 'cn'});
			
			jQuery("#provReqListGrid").jqGrid('navGrid', "#pagerOfProvReqList"
				,{edit:false,add:false,del:false} // Setting for buttons
				,{closeOnEscape : true, multipleSearch : true, closeAfterSearch : true } //setting for search option
			);
			
			jQuery("#neReqListGrid").jqGrid({
				url : '<s:url value="/op/provReq/subList"/>?pvReqSeqNo=0', 
			    mtype: 'GET',
				datatype : 'json',
				width : $("#content").width(),
				height : 'auto',
				colNames : [  "pv_req_seq_no_hidden"	
				            , "NE Seqno"				
				            , "Request Date"			
				            , "Source NE"			
				            , "Source CMD"			
				            , "Target NE"			
				            , "Target CMD"			
				            , "Prod. Code"			
				            , "Message"				
				            , "Status"
				            , "Status"
				            , "Return Date"  		
				            , "Result NE"  			
				            , "Result"  				
				            , "Result Msg"  			
				            , "Try Count"  			
				            , "Err Continue Flage"  	
				            , "Update Date"  		
				            , "Operator"  	],
				colModel : [
					{ name : 'pvReqSeqNo', 	index : 'pv_req_seq_no' , 	hidden : true}, 
					{ name : 'neSeqno', 	index : 'ne_seqno' , 	sortable : false}, 
					{ name : 'reqDt', 		index : 'req_dt', 		sortable : false,	formatter:formatters['dateTimeString']}, 
					{ name : 'sourceNe', 	index : 'source_ne',	align : 'center', sortable : false}, 
					{ name : 'sourceCmd', 	index : 'source_cmd',	align : 'center', sortable : false}, 
					{ name : 'targetNe', 	index : 'target_ne',	align : 'center', sortable : false}, 
					{ name : 'targetCmd', 	index : 'target_cmd',	align : 'center', sortable : false}, 
					{ name : 'prodCd', 		index : 'prod_cd',		align : 'center', sortable : false}, 
					{ name : 'message', 	index : 'message',		align : 'center', sortable : false},
					{ name : 'statusCd',  	index : 'status_cd',	align : 'center', hidden : true},
					{ name : 'statusName',  index : 'status_name',	align : 'center', sortable : false, formatter : statusFormatter},
					{ name : 'returnDt',  	index : 'return_dt',	align : 'center',sortable : false, formatter:formatters['dateTimeString']},
					{ name : 'resultNe',  	index : 'result_ne',	align : 'center',sortable : false},
					{ name : 'resultCode',  index : 'result_code',	align : 'center',sortable : false},
					{ name : 'resultMsg',  	index : 'result_msg', 	align : 'center',sortable : false},
					{ name : 'tryCnt',  	index : 'try_cnt', 		align : 'center',sortable : false},
					{ name : 'errorContinueFlag', index : 'error_continue_flag', 	align : 'center',sortable : false},
					{ name : 'sysUpdateDate', index : 'sys_update_date', 	align : 'center',sortable : false, formatter:formatters['dateTime']},
					{ name : 'operatorId',  index : 'operator_id', 	align : 'center',sortable : false},
					],
				rowNum : -1, //-1 : all data
				sortname : 'req_dt',
				sortorder : "desc",
				caption : "NE Request Information",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : false,
				autowidth : true,
			   	shrinkToFit: true,
			   	hidegrid: true,
				beforeProcessing : function(data, status, xhr){//필요시 데이타 변경 
				},
				gridComplete : function(data){
					var ids = jQuery("#neReqListGrid").jqGrid('getDataIDs');
					if(ids != null){
						jQuery("#neReqListGrid").jqGrid('setSelection', 1);
					}
				}
			});
			
			// Add tooltips
			$('.navtable .ui-pg-button').tooltip({
				container : 'body'
			});
		  
			//브라우져 사이즈 조정시 마다 그리드 사이즈 조정		    
		    $(window).on('resize.jqGrid', function () {
				jQuery("#provReqListGrid").resizeGridWidth();
				jQuery("#neReqListGrid").resizeGridWidth();
			});
		} // end of jqgrid function
			
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
			
			/*
			 * CLOCKPICKER
			 */
			
			// load clockpicker script
			
			loadScript("${BOOT_JS}/plugin/clockpicker/clockpicker.min.js", runClockPicker);
		
			function runClockPicker(){
				$('#clockpicker').clockpicker({
					placement: 'bottom',
				    donetext: 'Done'
				});
			}
		}// end calendar function
		
		// event function area
		$("#searchBtn").click(function(e){
			e.preventDefault();
			
			var rules = new Array();						
			var searchStringArray = $("#provReqSearchForm [id=searchString]");
			$.each(searchStringArray, function(itemName,itemValue){
				var searchField = $(this).attr('searchField');
				var searchOper = $(this).attr('searchOper');
				var searchString = $(this).val();
				if(searchString != ''){//검색어가 있는 경우에만.
					rules.push({'field' : searchField, 'op' : searchOper, 'data' : searchString}); 		
				} 
			});
			
			var reqDate, reqEndDate, time ;
			var dateType = $("#searchDateType").val();
			if(dateType == 'datepickerType1'){
				//단순 날짜
				dateType = '1';
				reqDate = formatters.removePattern($("#searchDate1").val());
				if(reqDate == ''){
					MessageBox.alert('Date is not selected!');
					return ;
				}
			}else if(dateType == 'datepickerType2'){
				//기간 날짜
				dateType = '2';
				reqDate = formatters.removePattern($("#searchDate2From").val());
				reqEndDate = formatters.removePattern($("#searchDate2To").val());
				if(reqDate == ''){
					MessageBox.alert('Start date is not selected!');
					return ;
				}
				if(reqEndDate == ''){
					MessageBox.alert('End date is not selected!');
					return ;
				}
			}else if(dateType == 'datepickerType3'){
				//단순 날짜 + 시간
				dateType = '3';
				reqDate = formatters.removePattern($("#searchDate3").val());
				time = formatters.removePattern($("#clockpicker").val());
				if(reqDate == ''){
					MessageBox.alert('Date is not selected!');
					return ;
				}
				if(time == ''){
					MessageBox.alert('Time is not selected!');
					return ;
				}
				reqDate = reqDate + time ;
			}
			
			var jqgridFilters = {'groupOp' : 'AND', 'rules' : rules, };
			var filterMap = {'dateType': dateType,'reqDt': reqDate, 'reqEndDt': reqEndDate};
			var postData = {'filters' : JSON.stringify(jqgridFilters), 'page' : 1, 'filterMaps': JSON.stringify(filterMap)}; 
			jQuery("#provReqListGrid").jqGrid('setGridParam', {postData : postData});
			jQuery("#provReqListGrid").trigger("reloadGrid",[{page:1}]); 
			jQuery("#neReqListGrid").clearGrid(); 
			
		});
		
		$("#searchDateType").change(function(e){
			$("[id^=datepickerType]").each(function(e){
				$(this).hide();
			});
			$("[id="+$(this).val()+"]").show();
		});
		
		$("#reprocessingBtn").click(function(e){
			e.preventDefault();
			var message = $("#neReqListGrid").selGridData();
			if(message != null){
				$("#${param.dialogName}").processing();
				$.ajax({
					type : "POST",  
					async : true,
					url : '<s:url value="/op/provReq/neReprocessing"/>',
					data : message,
					//contentType: "application/json",
					dataType : 'json',
					success : function(data) { 
						if(data.resultCode == 'FAIL'){
							MessageBox.error(data.resultMsg);
						}else{
							MessageBox.info("Successfully re-processed!");	
						}
										
					},	error:function(data){
						MessageBox.error("<s:message code="err.500"/>");
					}, complete:function(jqXHR, textStatus){
						$("#${param.dialogName}").complete();
					}
				});
			}else{
				MessageBox.alert("Select NE Request List!");
			}
		});
		
		$("#modificationBtn").click(function(e){
			e.preventDefault();
			var message = $("#neReqListGrid").selGridData();
			if(message != null){
				Dialog.open({
					div : '#provReqMessageModification', 
					url : '<s:url value="/op/provReq/modification"/>?callBack=refreshNeReqGrid', 
					title :'NE Message Modification', 
					width : 820, 
					height : 450
				}); 
			}else{
				MessageBox.alert("Select NE Request List!");
			}
		});
		
	}// end pageFunction
	
});	
</script>