<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<!-- widget grid -->
<section id="widget-grid" class="">
	<!-- row -->

	<div class="row">
		<!-- NEW WIDGET START -->
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">

			<div class="col-xs-12  col-lg-4">
				<input type="hidden" id="sysResourceAlarmValue" value="on">
				<a href="javascript:void(0);" id="alarmSwitch" class="btn btn-primary"><i class="fa fa-bell"></i> Alarm on </a> <a href="javascript:void(0);" data-content="" class="btn btn-primary" rel="popover"
					data-placement="bottom" data-html="true" aria-describedby="popover343145"><i class="fa fa-gear"></i> Alarm Configuration </a>
			</div>
			<div class="form-group col-xs-12  col-lg-6 col-lg-offset-2" style="display: flex; align-items: center;">
				<label class="control-label col-xs-12  col-lg-4 col-lg-offset-3"><h5>
						<i class="fa fa-clock-o"></i> Refresh Time(seconds) :
					</h5></label>
				<div class="col-xs-12  col-lg-6">
					<input id="ion-slider-1" type="text" name="range_1" value="">
				</div>
			</div>

			<table id="systemTreeGrid"></table>


			<div class="row">
				<hr class="featurette-divider">

				<div class="col-md-6">
					<div class="panel panel-info">
						<div class="panel-heading">
							<h6 class="panel-title text-center">CPU</h6>
						</div>

						<div class="chart-container">
							<div id="cpuChart" class="chart"></div>
						</div>

					</div>
					<!-- end area -->
				</div>
				<!-- end panel -->

				<div class="col-md-6">
					<div class="panel panel-info">
						<div class="panel-heading">
							<h6 class="panel-title text-center">Memory</h6>
						</div>
						<div class="chart-container">
							<div id="memoryChart" class="chart"></div>
						</div>
					</div>
					<!-- end area -->
				</div>
				<!-- end panel -->
			</div>
			<!-- end row -->

			<table id="diskTreeGrid"></table>
		</article>
		<!-- WIDGET END -->
	</div>

	<div id="soundContainer" class="hide"></div>
	<!-- end row -->
</section>
<!-- end widget grid -->

<script type="text/javascript">
	/* variable for alarm config */
	var alarmConfDataFromServer = '<c:out value="${sysAlarmConfData}" escapeXml="false"/>';
	var alarmConfData = JSON.parse(alarmConfDataFromServer);
	/* end variable for alarm config */

	pageSetUp(); //Default Call function

	var pagefunction = function pagefunction() {

		/* alarm on/off toggle */
		var toggle = false;

		$("#alarmSwitch").click(function(e) {
			e.preventDefault();

			if (toggle) {
				$(this).html("<i class=\"fa fa-bell\"></i> Alarm on");
				$("#sysResourceAlarmValue").attr("value", "on");
				console.log("==alarm==" + $("#sysResourceAlarmValue").val());
				toggle = false;
			} else {
				$(this).html("<i class=\"fa fa-bell-o\"></i> Alarm off");
				$("#sysResourceAlarmValue").attr("value", "off");

				console.log("==alarm==" + $("#sysResourceAlarmValue").val());

				toggle = true;
			}
		});
		/*end alarm on/off toggle */

		/* alarm config */
		var alarmTinypage = '<div id="alarm-page" class="row">'
						+ '<div class="col-xs-12 col-sm-12 col-lg-12"><a id="refresh" href="javascript:void(0);" class="btn btn-primary btn-sm pull-right">'
						+ '<i class="fa fa-refresh"></i> refresh </a></div><div class="col-xs-12 col-sm-12 col-lg-12"><hr></div>'
						+ '<div class="col-xs-12 col-sm-12 col-lg-12"> <table id="alarmGrid"></table><div><div class="col-xs-12 col-sm-12 col-lg-12"><hr></div>'
						+ '<div class="col-lg-12"><div class="alert alert-danger fade in col-lg-9 hide"><button class="close" data-dismiss="alert">×</button><i class="fa-fw fa fa-times"></i><strong>Error!</strong> The daily cronjob has failed.</div><a id="save" href="javascript:void(0);" class="btn btn-primary btn-sm pull-right">'
						+ '<i	class="fa fa-save"></i> save </a></div>' + '</div>';
		$('[rel=popover]').attr('data-content', alarmTinypage);
		$('[rel=popover]').click(function(e) {
			e.preventDefault();
			$('.popover').css({
				'max-width': '800px'
			});
			$('.arrow').css({
				'left': '15%'
			});
			console.log("===========clicked===========");
			run_alarm_grid_function();
		});

		/* refresh button click */
		$('body').on('click', '#refresh', function() {
			console.log('===refresh clicked===');
			$("#alarmGrid").trigger('reloadGrid');
		});

		/* save button click */
		$('body').on('click', '#save', function() {
			console.log('===save clicked===');

			var rawData = $('#alarmGrid').jqGrid('getChangedCells', 'dirty');
			var sendData = JSON.stringify(rawData);
			console.log('======================');
			console.log(sendData);
			console.log('======================');

			/* input validation */
			if (sendData == '[]') { return; }

			for (var i = 0; i < rawData.length; i++) {

				if (rawData[i].min == "" || rawData[i].max == "") {
					$('#alarm-page .alert').removeClass('hide');
					$('#alarm-page .alert').text("It must be filled.");
					return;
				}

				if (rawData[i].id == 1 && rawData[i].min != 0) {
					$('#alarm-page .alert').removeClass('hide');
					$('#alarm-page .alert').text(alarmConfData[0].status + "[Min Value] must be 0.");
					return;
				}

				if (rawData[i].id == 3 && rawData[i].max != 100) {
					console.log(alarmConfData[2].status + "[Max Value] must be 100..<br>");
					$('#alarm-page .alert').removeClass('hide');
					$('#alarm-page .alert').text(alarmConfData[2].status + "[Max Value] must be 100.");
					return;
				}
			}

			$('#alarm-page .alert').addClass('hide');
			//TODO :  alarm input validation

			/* end input validation */

			$.ajax({
				//timeout : 5000,
				type: 'PUT',
				url: '<s:url value="/view/monitor/sysResources/updateAlarmConf"/>.json',
				data: sendData,
				contentType: "application/json;charset=utf-8",
				dataType: 'json',
				success: function(response) {

					if (response.resultCode == "SUCCESS") {
						$.smallBox({
							title: response.resultMsg,
							content: "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
							color: "#296191",
							iconSmall: "fa fa-thumbs-up bounce animated",
							timeout: 4000
						});
					} else {
						$.smallBox({
							title: "Execution failure",
							content: response.resultMsg,
							color: "#5384AF",
							timeout: 4000,
							icon: "fa fa-bell"
						});
					}
					$("#alarmGrid").trigger('reloadGrid');
				},

				error: function(error) {

					console.log("====startBtn error===>" + JSON.stringify(error));
				},

				complete: function(jqXHR, textStatus) {
					$("#widget-grid").complete();
				}
			});
		});

		/* end alarm config */

		run_jqgrid_function();
		run_cpu_chart();
		run_memory_chart();

		/* Polling time setting */

		//initial slider polling time setting
		var processPollingTime = 1000; // milliseconds.
		var processStatus_second = 60; // init interval_time(seconds)
		var processStatusInterval = setInterval(processFunc, processStatus_second * processPollingTime);
		console.log("[sysResources]==polling==start" + formatters.dateTime(new Date()));
		console.log("[sysResources]==initial polling time==" + processStatus_second * processPollingTime);

		function processFunc() {
			console.log("[sysResources]==polling==start" + formatters.dateTime(new Date()));
			$("#systemTreeGrid").trigger('reloadGrid');
			$("#diskTreeGrid").trigger('reloadGrid');
			run_cpu_chart();
			run_memory_chart();
		}

		var track = function(data) {
			delete data.input;
			delete data.slider;

			console.log("[sysResources]==now==" + data.from_value);

			if (data.from_value == 'Stop') {
				clearInterval(processStatusInterval);
				processStatusInterval = null;
				console.log("[sysResources]==polling==stop" + formatters.dateTime(new Date()));
				return;
			}

			clearInterval(processStatusInterval);

			var num = parseInt(data.from_value);
			var seconds = num < 50 ? (num == 1 ? 1 : Math.ceil(num * 0.1)) : Math.floor(num * 0.1);

			processStatusInterval = setInterval(processFunc, (num * processPollingTime));

			console.log("[sysResources]==after polling time==" + num * processPollingTime);

		};

		/* end Polling time setting */

		/*
		 * ION SLIDER
		 */
		loadScript("${BOOT_JS}/plugin/ion-slider/ion.rangeSlider.min.js", ion_slider);

		function ion_slider() {

			//* ion Range Sliders

			$("#ion-slider-1").ionRangeSlider({
				from: 5,
				postfix: " sec",
				grid: true,
				values: ['Stop', 5, 10, 20, 30, 60],
				keyboard: true,
				onChange: track
			});
		}

		function run_alarm_grid_function() {
			console.log("===run_alarm_grid_function==start");

			//List Grid
			$("#alarmGrid").jqGrid(
							{
								url: '<s:url value="/view/monitor/sysResources/getAlarmConf"/>.json',
								mtype: 'GET',
								datatype: 'json',
								colNames: ['id', 'Status', "Min Value - <span style='color:red;'>To change, double click on cell</span>",
										"Max Value - <span style='color:red;'>To change, double click on cell</span>", 'Color'],

								colModel: [{
									name: 'id',
									index: 'id',
									hidden: true,
									key: true
								},

								{
									name: 'status',
									index: 'status',
									editable: false,
									align: 'left',
									sortable: true,
									width: '80px',
									formatter: function(inValue) {
										return '<strong>' + inValue + '</strong>';
									}
								}, {
									name: 'min',
									index: 'min',
									editable: true,
									sortable: true,
									align: 'left',
									width: '250px',
									editoptions: {
										dataEvents: [{
											type: 'blur',
											fn: function(e) {
												var selr = $('#alarmGrid').jqGrid('getGridParam', 'selrow');
												var min = $('#' + selr + '_' + 'min').val();
												console.log('===========min==============' + min);
												$("#alarmGrid").jqGrid('saveCell', selr, "2");
											}
										}]
									}

								}, {
									name: 'max',
									index: 'max',
									editable: true,
									sortable: true,
									align: 'left',
									width: '250px',
									editoptions: {
										dataEvents: [{
											type: 'blur',
											fn: function(e) {
												var selr = $('#alarmGrid').jqGrid('getGridParam', 'selrow');
												var max = $('#' + selr + '_' + 'max').val();
												console.log('===========max==============' + max);
												$("#alarmGrid").jqGrid('saveCell', selr, "3");
											}
										}]
									}

								}, {
									name: 'color',
									index: 'color',
									align: 'center',
									width: '80px',
									formatter: function(inValue) {
										return '<div style="width : 100%; color:' + inValue + '; background-color:' + inValue + ';">' + inValue + '</div>';
									}
								}],
								sortname: 'id',
								gridview: true,
								autowidth: true,
								shrinkToFit: true,
								height: 'auto',
								cellEdit: true,
								cellsubmit: 'clientArray',
								editurl: 'clientArray',
								loadError: loadErrorCallback, // error handler; add/edit/delete errors
								loadComplete: loadCompleteCallback
							// is called after loading all
							});

			$(window).bind('resize', function() {
				$('#alarmGrid').setGridWidth($('#alarmGrid').parent().width()); //Resized to new width as per window
			});

		}

		function run_jqgrid_function() {
			console.log("===run_jqgrid_function==start");

			//Tree Grid
			$("#systemTreeGrid").jqGrid({
				url: '<s:url value="/view/monitor/sysResources/polling"/>.json',
				mtype: 'GET',
				datatype: 'json',
				colNames: ['Category', 'Used Rate', 'Status', 'Comment'],
				colModel: [{
					name: 'name',
					width: '25%',
					align: 'center',
					sortable: false
				}, {
					name: 'ratio',
					width: '25%',
					align: 'center',
					formatter: function(inValue) {
						if (!inValue) return "";
						return '<div style="text-align: right;">' + inValue + '%</div>';
					}

				}, {
					name: 'ratio',
					width: '25%',
					align: 'center',
					formatter: sysResourceSummaryFormatter
				}, {
					name: 'diskcomment',
					width: '25%',
					align: 'left'

				}],
				sortname: 'id',
				gridview: true,
				treeGrid: true,
				loadonce: true,
				treeGridModel: 'adjacency',
				treedatatype: 'json',
				ExpandColumn: 'processName',
				ExpandColClick: true,
				treeIcons: {
					plus: 'ui-icon-circle-plus',
					minus: 'ui-icon-circle-minus',
					leaf: 'ui-icon-minus'
				},
				autowidth: true,
				shrinktofit: true,
				height: 'auto',
				caption: "System summary",
				loadError: loadErrorCallback, // error handler; add/edit/delete errors
				loadComplete: sysloadCompleteCallback, // is called after loading all

			});

			/* Resize grid by window size*/
			$(window).bind('resize', function() {
				$('#systemTreeGrid').setGridWidth($('#content').width()); //Resized to new width as per window
			});

			function sysloadCompleteCallback(data) {

				console.log("=sysloadCompleteCallback=\n" + JSON.stringify(data));

				var alarmOnOffVal = $("#sysResourceAlarmValue").val();
				console.log("==alarmOnOffVal==" + alarmOnOffVal);

				var warningCnt = 0, criticalCnt = 0, normalCnt = 0;
				$.each(data.rows, function(i, val) {

					if (val.ratio != null) {
						console.log("==val.ratio==" + val.ratio);
						var usedRateNum = Number(val.ratio);

						if (usedRateNum >= alarmConfData[1].min && usedRateNum <= alarmConfData[1].max) {
							++warningCnt;

							if (alarmOnOffVal == 'on') {
								$.smallBox({
									title: val.hostName + "." + val.category + " : Warning",
									content: "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
									color: "#296191",
									iconSmall: "fa fa-thumbs-up bounce animated",
									timeout: 4000
								});
							}
						} else if (usedRateNum >= alarmConfData[2].min && usedRateNum <= alarmConfData[2].max) {
							++criticalCnt;

							if (alarmOnOffVal == 'on') {
								$.smallBox({
									title: val.hostName + "." + val.category + " : Error",
									content: "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
									color: "#296191",
									iconSmall: "fa fa-thumbs-up bounce animated",
									timeout: 4000
								});
							}

						} else {
							//noting to do (normal status)
							++normalCnt;
						}
					}

				});

				if (criticalCnt > 0 && alarmOnOffVal == "on") {
					//execute a critical-alarm
					console.log("alarmConfData[2].filename=" + alarmConfData[2].filename);
					beepSound("${pageContext.request.contextPath}/resources/sounds/" + alarmConfData[2].filename);
				} else if (warningCnt > 0 && alarmOnOffVal == "on") {
					//execute a warning-alarm
					console.log("alarmConfData[2].filename=" + alarmConfData[1].filename);
					beepSound("${pageContext.request.contextPath}/resources/sounds/" + alarmConfData[1].filename);
				} else {
					//nothing to do...
				}
				/* alarm status check end*/
			}

			function beepSound(surl) {
				console.log("==sound url==" + surl);
				var audioElement = document.createElement('audio');
				audioElement.setAttribute('src', surl);
				audioElement.setAttribute('autoplay', 'autoplay');
				$.get();
				audioElement.addEventListener("load", function() {
					audioElement.play();
				}, true);
			}

			function sysResourceSummaryFormatter(inValue) {

				var num = Number(inValue);

				if (inValue === undefined || !inValue || isNaN(inValue)) {
					return "";
				} else if (num >= alarmConfData[0].min && num <= alarmConfData[0].max) {
					return "<div style='border-radius:25px; background: #99ff00; color: white; font-weight: bold; text-align:center;'>Normal</div>";
				} else if (num >= alarmConfData[1].min && num <= alarmConfData[1].max) {
					return "<div style='border-radius:25px; background: yellow; color: green; font-weight: bold; text-align:center;'>Warning</div>";
				} else if (num >= alarmConfData[2].min && num <= alarmConfData[2].max) { return "<div style='border-radius:25px; background: red; color: white; font-weight: bold; text-align:center;'>Critical</div>"; }
				return inValue;
			}

			function getBytesWithUnit(bytes) {
				if (isNaN(bytes)) { return; }
				var units = [' bytes', ' KB', ' MB', ' GB', ' TB', ' PB', ' EB', ' ZB', ' YB'];
				var amountOf2s = Math.floor(Math.log(+bytes) / Math.log(2));
				if (amountOf2s < 1) {
					amountOf2s = 0;
				}
				var i = Math.floor(amountOf2s / 10);
				bytes = +bytes / Math.pow(2, 10 * i);

				// Rounds to 3 decimals places.
				if (bytes.toString().length > bytes.toFixed(3).toString().length) {
					bytes = bytes.toFixed(3);
				}
				return bytes + units[i];
			}

			//Tree Grid
			$("#diskTreeGrid").jqGrid({
				url: '<s:url value="/view/monitor/sysResources/polling/disk"/>.json',
				mtype: 'GET',
				datatype: 'json',
				width: 'auto',
				colNames: ['Disk Utilization', 'datetime', 'Total Size', 'Used Size', 'Free Size', 'Used'],
				colModel: [{
					name: 'name',
					width: '15%',
					align: 'center',
				}, {
					name: 'datetime',
					width: '12%',
					align: 'center',
					formatter: function(inValue) {
						if (inValue == null) {
							return "";
						} else {
							return inValue.replace(/(\d{4})(\d{2})(\d{2})(\d{2})(\d{2})(\d{2})/g, "$1-$2-$3 $4:$5:$6");

						}

					}
				}, {
					name: 'tot',
					width: '10%',
					align: 'right',
					formatter: getBytesWithUnit

				}, {
					name: 'use',
					width: '10%',
					align: 'right',
					formatter: getBytesWithUnit

				}, {
					name: 'unuse',
					width: '10%',
					align: 'right',
					formatter: getBytesWithUnit
				}, {
					name: 'ratio',
					width: '10%',
					align: 'right',
					formatter: function(inValue) {
						return (inValue == "" || inValue == null) ? "" : (Number(inValue) > 80) ? '<span style="color: red; font-weight: bold;">' + inValue + ' %</span>' : inValue + " %";
					}
				}],
				sortname: 'id',
				gridview: true,
				treeGrid: true,
				loadonce: true,
				treeGridModel: 'adjacency',
				treedatatype: 'json',
				ExpandColumn: 'processName',
				ExpandColClick: true,
				treeIcons: {
					plus: 'ui-icon-circle-plus',
					minus: 'ui-icon-circle-minus',
					leaf: 'ui-icon-minus'
				},
				autowidth: true,
				shrinktofit: true,
				height: 'auto',
				caption: "Disk",
				loadError: loadErrorCallback, // error handler; add/edit/delete errors
				loadComplete: loadCompleteCallback, // is called after loading all

			});

			$(window).bind('resize', function() {
				$('#diskTreeGrid').setGridWidth($('#content').width()); //Resized to new width as per window
			});

		}

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

		function run_cpu_chart() {
			$.ajax({
				//timeout : 5000,
				type: 'GET',
				url: '<s:url value="/view/monitor/sysResources/polling/cpu"/>.json',
				dataType: 'json',
				success: function(res) {

					console.log("==cpu chart=\n" + JSON.stringify(res));

					if ($("#cpuChart").length) {
						new Morris.Bar({
							element: 'cpuChart',
							axes: true,
							grid: true,
							data: res,
							xkey: 'hostName',
							ykeys: ['use', 'unuse'],
							labels: ['use', 'unuse'],
							stacked: true,
							resize: true
						});

					}

				},

				error: function(error) {

					console.log("====startBtn error===>" + JSON.stringify(error));
				},

				complete: function(jqXHR, textStatus) {

				}
			});

		}

		function run_memory_chart() {
			$.ajax({
				//timeout : 5000,
				type: 'GET',
				url: '<s:url value="/view/monitor/sysResources/polling/memory"/>.json',
				dataType: 'json',
				success: function(res) {

					console.log("==memory chart=\n" + JSON.stringify(res));

					if ($("#memoryChart").length) {
						new Morris.Bar({
							element: 'memoryChart',
							axes: true,
							grid: true,
							data: res,
							xkey: 'hostName',
							ykeys: ['ratio', 'unusedratio'],
							labels: ['use', 'unuse'],
							stacked: true,
							resize: true
						});

					}

				},

				error: function(error) {

					console.log("====startBtn error===>" + JSON.stringify(error));
				},

				complete: function(jqXHR, textStatus) {

				}
			});

		}

	}

	// load all flot plugins
	// Load morris dependencies and run pagefunction
	loadScript("${BOOT_JS}/plugin/morris/raphael.min.js", function() {
		loadScript("${BOOT_JS}/plugin/morris/morris.min.js", pagefunction);
	});
</script>
