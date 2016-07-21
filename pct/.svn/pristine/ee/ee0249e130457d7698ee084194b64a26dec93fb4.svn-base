<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<div class="row">
	<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
				<%-- <h1 class="page-title txt-color-blueDark">
					<i class="fa fa-pencil-square-o fa-fw "></i> 
						OP. Table
					<span>> Current Status</span>
				</h1> --%>
			</div>
			<div class="col-xs-7 col-sm-7 col-md-7 col-lg-7">
				<form class="form-horizontal">
					<div class="form-group" style="display: flex; align-items: center;">
						<label
							class="control-label col-xs-4 col-sm-4 col-md-4 col-lg-4">
							<h5>
								<i class="fa fa-clock-o"></i> Refresh Time(seconds) :
							</h5>
						</label>
						<div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
							<input id="ion-slider-1" type="text" name="range_1" value="">
						</div>
					</div>
				</form>
			</div>

		</article>
</div>

<!-- end widget grid -->
<!-- widget grid -->
<section id="widget-grid" class="">
	<div class="row">
		<article class="col-md-4">
			<div class="form-horizontal">
				<table id="provCurrentStatisticsGrid"></table>
			</div>
		</article>
		<article class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
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
					<h2>Realtime Status Chart</h2>				
					
				</header>

				<!-- widget div-->
				<div>
					
					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
					</div>
					<!-- end widget edit box -->
					
					<!-- widget content -->
					<div class="widget-body no-padding">
						<div id="provCurrentStatisticsChart" class="chart no-padding" style="width:100%; height:290px;"></div>
					</div>
					<!-- end widget content -->
				</div>
				<!-- end widget div -->
			</div>
			<!-- end widget -->

		</article>
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<table id="provCurrentErrorListGrid"></table>
		</article>
		
		<!-- WIDGET END -->

	</div>
	<!-- end row -->		
</section>
<!-- end widget grid -->


<script type="text/javascript">
//다른 페이지 이동 했다 다시 호출 되는 경우 타이머가 중복작용하는 것을 방지하기위해 전역으로 선언함.
var currentProcessStatusInterval = null;
var pagedestroy = function(){
	//alert('page destroy!');
	console.log('current statistics page destroy');
	//다른 페이지 이동시에도 이 타이머는 계속 동작하는데... 챠트 id가 없어 에러가 발생한다.
	//이미 다른 페이지에 이동해 있으므로 이 타이머는 중단 시킨다.
	clearInterval(currentProcessStatusInterval);
	currentProcessStatusInterval = null;
}
$(function(e) {
	
	pageSetUp(); //Default Call function
	pagefunction();
	
	
	function pagefunction() {
		
		//var curDate = '2014-09-11 15:40:00';
		var curDate = '';
		run_jqgrid_function();
		
		// Load morris dependencies and run pagefunction
		loadScript("${BOOT_JS}/plugin/morris/raphael.min.js", function(){
			loadScript("${BOOT_JS}/plugin/morris/morris.min.js", function(){
				
				run_chart_function();
				
				if(currentProcessStatusInterval != null){
					clearInterval(currentProcessStatusInterval);
					currentProcessStatusInterval = null;
				}
				
				//리로드는 기본 10초 간경으로 호출하도록 한다. 브라우져에 저장한 interval값이 있는 경우 해당 interval로 리로드 시간을 정한다.
				var interval = $("body").data('currentIntervalValue') ;
				if(interval){
					currentProcessStatusInterval = setInterval(reloadCurrentStatusPage, Number(interval)*1000);
				}else{
					currentProcessStatusInterval = setInterval(reloadCurrentStatusPage, 10*1000);
					$("body").data('currentIntervalValue', 10) ;
				}
				run_slider_function();
			});
		
		});
		
		function statusFormatter(cellvalue, options, rowObject ){
	  		return '<span style="color:red">'+cellvalue+'</span>';
		}
		
		//그리드 및 챠트 리로드
		function reloadCurrentStatusPage(){
		    	
	    	try{
		    	jQuery("#provCurrentStatisticsGrid").jqGrid('setGridParam', {url : '<s:url value="/op/statistic/current"/>', postData : {curDate : curDate}});
				jQuery("#provCurrentStatisticsGrid").trigger("reloadGrid",[{page:1}]); 
		    	run_chart_function();
	    	}catch(e){
	    		
	    	}
		}; 
		
		function getChartData(url){
			
			$.ajax({
				type : "POST",  
				async : false,
				url : url,
				//contentType: "application/json",
				dataType : 'json',
				success : function(data) { 
					
					console.log('Before Chart data ===== '+JSON.stringify(data));
					$.each(data, function(itemName,itemValue){
						itemValue.reqDate = formatters.time(formatters.dateTimeString(itemValue.reqDate)); 
					});
					retData = data ;
					console.log('After Chart data ===== '+JSON.stringify(data));
									
				},	error:function(data){
					MessageBox.error("<s:message code="err.500"/>");
				}, complete:function(jqXHR, textStatus){
					$("#${param.dialogName}").complete();
				}
			});
			return retData ;
		}
		
		// slider 조정
		function run_slider_function(){
			/*
			 * ION SLIDER
			 */
			loadScript("${BOOT_JS}/plugin/ion-slider/ion.rangeSlider.min.js", ion_slider); 

			function ion_slider() {
				
			    //* ion Range Sliders
				var interval = $("body").data('currentIntervalValue') ;
			    $("#ion-slider-1").ionRangeSlider({
					to : interval, //처음 시작
			    	from : interval, //마지막
					postfix : " sec",
					grid : true,
					min : 0,
					max : 10,
					keyboard : true,
					onChange : onChangeSlide
			    });
			}
			function onChangeSlide(obj) {
				var num = obj.from;
				clearInterval(currentProcessStatusInterval);
				if(num == 0){
					currentProcessStatusInterval = null;
					return ;
				}
		
				currentProcessStatusInterval = setInterval(reloadCurrentStatusPage, (num * 1000));
				$("body").data('currentIntervalValue', num) ;
				console.log("==after polling time==" + num * 1000);

		    };
		    
		} //end of slider function
		
		function run_chart_function(){
	   		var chartData = getChartData('<s:url value="/op/statistic/current/chart"/>?curDate='+curDate, null);
	   		new Morris.Bar({
			  element: 'provCurrentStatisticsChart',
			  data: chartData,
			  xkey: 'reqDate',
			  ykeys: ['sCnt', 'eCnt', 'pCnt', 'nCnt'],  
			  labels: ['Success', 'FAIL', 'Processing', 'Not Yet'],
			  stacked: true
			});
		} //end of chart function
		
		function run_jqgrid_function() {
			jQuery("#provCurrentStatisticsGrid").jqGrid({
				url : '<s:url value="/op/statistic/current"/>?curDate='+curDate, 
			    mtype: 'POST',//get으로 하면 한글이 깨져서 조회가 안됨.
			    //postData : {'curDate': '${curDate}'},
				datatype : 'json',
				width  : '340px',
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
					{ name : 'eCnt', 		index : 'eCnt', 		width: '60', 	align : 'center', formatter : statusFormatter, sortable : false}, 
					{ name : 'pCnt', 		index : 'pCnt', 		width: '60', 	align : 'center', sortable : false}, 
					{ name : 'nCnt', 		index : 'nCnt',  		width: '60', 	align : 'center', sortable : false}, 
					],
				rowNum : -1, //-1 : all data
				sortname : 'event_cd',
				sortorder : "desc",
				caption : "Realtime CS Message",
				toolbarfilter: false,
				viewrecords : true,				
				multiselect : false,
			   	shrinkToFit: true,
			   	hidegrid: false,
			   	onSelectRow: function(ids) {
			   		var rowData = $("#provCurrentStatisticsGrid").getGridDataByRowId(ids);
			   		var eventCd = rowData.eventCd ;
					jQuery("#provCurrentErrorListGrid").jqGrid('setGridParam', {url : '<s:url value="/op/statistic/current/message"/>', postData : {curDate : curDate, eventCd : eventCd}});
					jQuery("#provCurrentErrorListGrid").trigger("reloadGrid",[{page:1}]); 
				}
			});
				
			jQuery("#provCurrentErrorListGrid").jqGrid({
				url : '<s:url value="/op/statistic/current/message"/>?curDate='+curDate+'&eventCd=',
			    mtype: 'POST',
				datatype : 'json',
				width : $("#content").width(),
				height : 'auto',
				colNames : [ "Prov Seq No"	
					            , "Event"		
					            , "Event"		
					            , "Subs ID"		
					            , "CAS ID"		
					            , "MAC Address"	
					            , "STB Model"	
					            , "Status"		
					            , "Status"
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
						{ name : 'macAddress', 	index : 'macAddress', 	align : 'center'}, 
						{ name : 'stbModel', 	index : 'stbModel',  	align : 'center', sortable : false}, 
						{ name : 'statusCd', 	index : 'statusCd', 	align : 'center', hidden : true},
						{ name : 'statusName',  index : 'status_cd', 	align : 'center' , formatter : statusFormatter},
						{ name : 'reqDt',  		index : 'req_dt',  	 	align : 'center' , formatter:formatters["dateTimeString"]},
						{ name : 'returnDt',  	index : 'return_dt',   	align : 'center' , formatter:formatters["dateTimeString"]},
						{ name : 'resultCode', 	index : 'result_code', 	align : 'center' },
						{ name : 'resultMsg',  	index : 'result_msg',  	align : 'center' },
						],
				rowNum : -1, //-1 : all data
				sortname : 'req_dt',
				sortorder : "desc",
				caption : "Realtime CS Message By Event",
				toolbarfilter: true,
				viewrecords : true,				
				multiselect : false,
				autowidth : true,
			   	shrinkToFit: true,
			   	hidegrid: true,
				beforeProcessing : function(data, status, xhr){//필요시 데이타 변경 
				}
			});
			
			$(window).on('resize.jqGrid', function (e) {
				jQuery("#provCurrentStatisticsGrid").resizeGridWidth();
				jQuery("#provCurrentErrorListGrid").resizeGridWidth();
			});
		  
		} // end run_jqgrid_function 
				
	}// end pageFunction
	
});	
</script>

