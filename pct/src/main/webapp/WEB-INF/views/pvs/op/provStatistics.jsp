<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<article class="col-md-12">
		
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
						<form class="form-horizontal" role="form" id="provStatisticSearchForm">
							<fieldset style="height:60px">
								<div class="form-group">
									<div class="col-md-1">
										<select class="form-control" id="searchDateType" name="searchDateType">
											<option value="datepickerType1">Date</option>
											<!-- <option value="datepickerType2">Period</option> -->
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
									<label class="control-label col-md-1" for="eventCd">Ne</label>
									<div class="col-md-2">
										<select class="form-control" id="neCode" name="neCode" >
											<option value="">::: Select :::</option>
											<c:forEach items="${neCodeList }" var="code"><option value="${code.code }">${code.meaning }</option></c:forEach>
										</select>
									</div>
									<div class="col-md-2">
										<button type="submit" class="btn btn-success btn-sm" id="searchBtn"><i class="fa fa-search"></i>
										Search</button>
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
	</div>
	<div class="row">
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<div class="row">
				<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
					<table id="provStatisticsGrid"></table>
				</div>
				<div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
					<div class="jarviswidget" data-widget-editbutton="false" data-widget-colorbutton="false"	
							data-widget-editbutton="false"
							data-widget-togglebutton="false"
							data-widget-deletebutton="false"
							data-widget-fullscreenbutton="true"
							data-widget-custombutton="false"
							data-widget-collapsed="false" 
							data-widget-sortable="false">
						<header>
							<span class="widget-icon"> <i class="fa fa-bar-chart-o"></i> </span>
							<h2>CS Message Chart</h2>				
							
						</header>
		
						<!-- widget div-->
						<div>
							
							<!-- widget edit box -->
							<div class="jarviswidget-editbox">
							</div>
							<!-- end widget edit box -->
							
							<!-- widget content -->
							<div class="widget-body no-padding">
								<div id="provStatisticsChart" class="chart no-padding" style="width:100%; height:290px;"></div>
							</div>
							<!-- end widget content -->
						</div>
						<!-- end widget div -->
					</div>
							
				</div>
			</div>
		</article>
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<div class="row">
				<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
					<table id="provNeStatisticsGrid"></table>
				</div>
				<div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
					<div class="jarviswidget" data-widget-editbutton="false" data-widget-colorbutton="false"	
							data-widget-editbutton="false"
							data-widget-togglebutton="false"
							data-widget-deletebutton="false"
							data-widget-fullscreenbutton="true"
							data-widget-custombutton="true"
							data-widget-collapsed="false" 
							data-widget-sortable="false">
						<header>
							<span class="widget-icon"> <i class="fa fa-bar-chart-o"></i> </span>
							<h2>Ne Message Chart</h2>				
						</header>
						<!-- widget div-->
						<div>
							
							<!-- widget edit box -->
							<div class="jarviswidget-editbox">
							</div>
							<!-- end widget edit box -->
							<!-- widget content -->
							<div class="widget-body no-padding">
								<div id="provNeStatisticsChart" class="chart no-padding" style="width:100%; height:290px;"></div>
							</div>
							<!-- end widget content -->
							
						</div>
						<!-- end widget div -->
						
					</div>
				</div>
			</div>
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
		
		// Load morris dependencies and run pagefunction
		loadScript("${BOOT_JS}/plugin/morris/raphael.min.js", function(){
			loadScript("${BOOT_JS}/plugin/morris/morris.min.js");
		});
		
		function errStatusFormatter(cellvalue, options, rowObject ){
	  		return '<span style="color:red">'+formatters["bigNumber"](cellvalue)+'</span>';
		}
		function run_jqgrid_function() {

			jQuery("#provStatisticsGrid").jqGrid({
				url : '<s:url value="/op/statistic/cs"/>', 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    postData : {'filterMaps': JSON.stringify({'condition': '1', 'date': '<fmt:formatDate pattern="yyyyMMdd" value="${curDate}" />'})},
				datatype : 'json',
				autowidth  : true,
				height : '280px',
				colNames : [ "Event_hidden"	
				            , "Event"		
				            , "Success"		
				            , "Error"
				            , "Processing"			
				            , "NotYet"	 
				            ],
				colModel : [
					{ name : 'eventCd', 	index : 'event_cd' ,	hidden : true}, 
					{ name : 'eventName', 	index : 'event_cd',	 	width: '100', 	align : 'center'}, 
					{ name : 'sCnt', 		index : 'sCnt', 		width: '60', 	align : 'center', sortable : false}, 
					{ name : 'eCnt', 		index : 'eCnt', 		width: '60', 	align : 'center', formatter : errStatusFormatter, sortable : false}, 
					{ name : 'pCnt', 		index : 'pCnt', 		width: '60', 	align : 'center', sortable : false}, 
					{ name : 'nCnt', 		index : 'nCnt',  		width: '60', 	align : 'center', sortable : false}, 
					],
				rowNum : -1, //-1 : all data
				sortname : 'event_cd',
				sortorder : "desc",
				caption : "CS Message",
				toolbarfilter: false,
				viewrecords : true,				
				multiselect : false,
			   	shrinkToFit: true,
			   	hidegrid: false,
			   	onSelectRow: function(ids) {
			   		var rowData = $("#provStatisticsGrid").getGridDataByRowId(ids);
			   		var chartData = getChartData('<s:url value="/op/statistic/cs/chart"/>', rowData.eventCd);
			   		new Morris.Bar({
					  element: 'provStatisticsChart',
					  data: chartData,
					  xkey: 'reqDate',
					  ykeys: ['sCnt', 'eCnt', 'pCnt', 'nCnt'],  
					  labels: ['Success', 'FAIL', 'Processing', 'Not Yet'],
					  stacked: true
					});
				}
			});
				
			jQuery("#provNeStatisticsGrid").jqGrid({
				url : '<s:url value="/op/statistic/ne"/>', 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    postData : {'filterMaps': JSON.stringify({'condition': '1', 'date': '<fmt:formatDate pattern="yyyyMMdd" value="${curDate}" />'})},
				datatype : 'json',
				width  : '340px',
				height : '280px',
				colNames : [ "NE"
				            , "Event_hidden"	
				            , "Event"		
				            , "Success"		
				            , "Error"
				            , "Processing"			
				            , "NotYet"	 
				            ],
				colModel : [
					{ name : 'ne', 			index : 'ne',	width: '40' }, 
					{ name : 'eventCd', 	index : 'event_cd' ,	hidden : true}, 
					{ name : 'eventName', 	index : 'event_cd',	 	width: '100',	align : 'center'}, 
					{ name : 'sCnt', 		index : 'sCnt', 		width: '50',	align : 'center', sortable : false}, 
					{ name : 'eCnt', 		index : 'eCnt', 		width: '50',	align : 'center', formatter : errStatusFormatter, sortable : false}, 
					{ name : 'pCnt', 		index : 'pCnt', 		width: '50',	align : 'center', sortable : false}, 
					{ name : 'nCnt', 		index : 'nCnt',  		width: '50',	align : 'center', sortable : false}, 
					],
				rowNum : -1, //-1 : all data
				
				sortname : 'event_cd',
				sortorder : "desc",
				caption : "NE Message",
				toolbarfilter: false,
				viewrecords : true,				
				multiselect : false,
			   	shrinkToFit: true,
			   	hidegrid: false,
			   	onSelectRow: function(ids) {
			   		var rowData = $("#provNeStatisticsGrid").getGridDataByRowId(ids);
			   		var chartData = getChartData('<s:url value="/op/statistic/ne/chart"/>', rowData.eventCd, rowData.ne); 
			   		new Morris.Bar({
					  element: 'provNeStatisticsChart',
					  data: chartData,
					  xkey: 'reqDate',
					  ykeys: ['sCnt', 'eCnt', 'pCnt', 'nCnt'], 
					  labels: ['Success', 'FAIL', 'Processing', 'Not Yet'],
					  stacked: true
					});
				}			
			});
			
			//그리드 자동 리사이즈					
			$(window).on('resize.jqGrid', function (e) {
				jQuery("#provStatisticsGrid").resizeGridWidth();
				jQuery("#provNeStatisticsGrid").resizeGridWidth();
			});
		} // end run_jqgrid_function 
		
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
		
		function getChartData(url, eventCd, ne){
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
				reqEndDate = formatters.removePattern($("#clockpicker").val());
				if(reqDate == ''){
					MessageBox.alert('Date is not selected!');
					return ;
				}
				if(time == ''){
					MessageBox.alert('Time is not selected!');
					return ;
				}
				//reqDate = reqDate + time ;
			}
			var jqgridFilters = {'groupOp' : 'AND', 'rules' : [] };
			jqgridFilters.rules.push({'field' : 'event_cd', 'op' : 'eq', 'data' : eventCd});
			if(ne != null){
				jqgridFilters.rules.push({'field' : 'target_ne', 'op' : 'eq', 'data' : ne});
			}
			var filterMap = {'condition': dateType,'date': reqDate, 'dateTime': reqEndDate, 'eventCd' : eventCd};
			var postData = {'filters' : JSON.stringify(jqgridFilters), 'page' : 1, 'filterMaps': JSON.stringify(filterMap)};
			var retData = null ;
			$.ajax({
				type : "POST",  
				async : false,
				url : url,
				data : postData,
				//contentType: "application/json",
				dataType : 'json',
				success : function(data) { 
					console.log(JSON.stringify(data));
					$.each(data, function(itemName,itemValue){
						delete itemValue['eventCd'];
						delete itemValue['eventName'];
						delete itemValue['ne'];
					});
					retData = data ;
					//console.log('Chart data ===== '+JSON.stringify(data));
									
				},	error:function(data){
					MessageBox.error("<s:message code="err.500"/>");
				}, complete:function(jqXHR, textStatus){
					$("#${param.dialogName}").complete();
				}
			});
			return retData ;
		}
		
		// event function area
		$("#searchBtn").click(function(e){
			e.preventDefault();
			
			var rules = new Array();						
			var searchStringArray = $("#provStatisticSearchForm [id=searchString]");
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
				reqEndDate = formatters.removePattern($("#clockpicker").val());
				if(reqDate == ''){
					MessageBox.alert('Date is not selected!');
					return ;
				}
				if(time == ''){
					MessageBox.alert('Time is not selected!');
					return ;
				}
				//reqDate = reqDate + time ;
			}
			
			var jqgridFilters = {'groupOp' : 'AND', 'rules' : rules, };
			var filterMap = {'condition': dateType,'date': reqDate, 'dateTime': reqEndDate, 'targetNe' : $("#neCode").val()};
			var postData = {'filters' : JSON.stringify(jqgridFilters), 'page' : 1, 'filterMaps': JSON.stringify(filterMap)};
			jQuery("#provStatisticsGrid").jqGrid('setGridParam', {postData : postData});
			jQuery("#provStatisticsGrid").trigger("reloadGrid",[{page:1}]); 
			
			jQuery("#provNeStatisticsGrid").jqGrid('setGridParam', {postData : postData});
			jQuery("#provNeStatisticsGrid").trigger("reloadGrid",[{page:1}]);
			
		});
		
		$("#searchDateType").change(function(e){
			$("[id^=datepickerType]").each(function(e){
				$(this).hide();
			});
			$("[id="+$(this).val()+"]").show();
		});
		
		
	}// end pageFunction
	
});	
</script>

