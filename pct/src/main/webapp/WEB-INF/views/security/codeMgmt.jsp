<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%   
response.setHeader("Cache-Control","no-store");   
response.setHeader("Pragma","no-cache");   
response.setDateHeader("Expires",0);   
if (request.getProtocol().equals("HTTP/1.1")) 
        response.setHeader("Cache-Control", "no-cache"); 
%>
    
<s:url value="/resources/bootstrap/js" var="BOOT_JS" scope="session" />
<sec:authentication property="principal.username" var="username" />
<link rel="stylesheet" type="text/css" media="screen" href="${BOOT_JS}/plugin/jstree/themes/default/style.min.css">

<!-- widget grid -->
<section id="widget-grid" class="">

	<!-- row -->
	<div class="row">

		<!-- NEW WIDGET START -->
		<article class="col-sm-12 col-md-12 col-lg-6">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget jarviswidget-color-orange" id="wid-id-0" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">
				<!-- widget options:
				usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">

				data-widget-colorbutton="false"
				data-widget-editbutton="false"
				data-widget-togglebutton="false"
				data-widget-deletebutton="false"
				data-widget-fullscreenbutton="false"
				data-widget-custombutton="false"
				data-widget-collapsed="true"
				data-widget-sortable="false"

				-->
				<header>
					<span class="widget-icon"> <i class="fa fa-list"></i>
					</span>
					<h2>Code List</h2>
					<div class="widget-toolbar" role="menu">
						<div class="btn-group">
							<button class="btn btn-default btn-xs" type="button" id="btn-refresh-codelst">
								<i class="fa fa-refresh"></i>
							</button>
						</div>
					</div>
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

						<div class="widget-body-toolbar bg-color-white">
							<form class="form-inline" role="form">
								<div class="row">
									<div class="col-sm-12 col-md-12">

										<div class="form-group">
											<input type="text" class="form-control input-sm" id="codeSearch" placeholder="code name">
										</div>

									</div>

								</div>

							</form>

						</div>
						<div id="codeTree" style="height:760px; max-height:760px;overflow:auto;"></div>
					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->

			</div>
			<!-- end widget -->

		</article>
		<!-- WIDGET END -->

		<!-- NEW WIDGET START -->
		<article class="col-sm-12 col-md-12 col-lg-6">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-1" data-widget-editbutton="false" data-widget-colorbutton="false" data-widget-deletebutton="false" data-widget-togglebutton="false"
				data-widget-fullscreenbutton="false">
				<!-- widget options:
				usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">

				data-widget-colorbutton="false"
				data-widget-editbutton="false"
				data-widget-togglebutton="false"
				data-widget-deletebutton="false"
				data-widget-fullscreenbutton="false"
				data-widget-custombutton="false"
				data-widget-collapsed="true"
				data-widget-sortable="false"

				-->
				<header>
					<span class="widget-icon"> <i class="fa fa-edit"></i>
					</span>
					<h2>Code Information</h2>
					<div class="widget-toolbar" role="menu">
						<div id="btn-group-objinfo" class="btn-group">
							<!-- 
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-trash-codeinfo" >
								<i class="fa fa-trash-o"></i>
							</button>
							 -->
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-refresh-codeinfo">
								<i class="fa fa-refresh"></i>
							</button>
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-plus-codeinfo">
								<i class="fa fa-plus"></i>
							</button>
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-edit-codeinfo">
								<i class="fa fa-edit"></i>
							</button>
							<button class="btn btn-default btn-xs disabled" type="button" id="btn-save-codeinfo">
								<i class="fa fa-save"></i>
							</button>
						</div>
					</div>
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
						<form class="form-horizontal" id="codeForm">
							<fieldset>
								<h3 class="col-xs-12 col-sm-12 col-md-12 col-lg-12">Common</h3>
								<customTag:inputbox label="Code Group" id="codeGroup" required="required" disabled="disabled" />
								<customTag:inputbox label="Code ID" id="code" required="required" disabled="disabled" />
								
								<customTag:checkbox label="Use" id="enabledFlag" codeType="BasicCheck" />
								
								<customTag:inputWithDate label="Activate Date" id="startDateActive" disabled="disabled" />
								<customTag:inputWithDate label="Expiry Date" id="endDateActive" disabled="disabled" />
								<customTag:selectbox label="Service Domain" id="svcDomain" codeType="SvcDomain" disabled="disabled" />
								<customTag:inputbox label="Sub Group 1" id="subGrp1" disabled="disabled" />
								<customTag:inputbox label="Sub Group 2" id="subGrp2" disabled="disabled" />
								<div style="display:flex; align-items:center">
									<h3 class="col-xs-10 col-sm-10 col-md-10 col-lg-10" id="codeMeaningTitle">Code Meaning</h3>
									<div class="col-xs-2 col-sm-2 col-md-2 col-lg-2 text-right">
										<button class="btn btn-default btn-xs disabled" id="btn-locale-append-codeinfo">
											<i class="fa fa-plus"></i>
										</button>						
									</div>
								</div>
								<div id="codeMeaningSection">
									<div class="form-group">
										<label class="col-xs-3 col-sm-3 col-md-3 col-lg-3 control-label">English</label>
										<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
											<input class="form-control required" required="required" disabled="disabled"/>
										</div>										
									</div>
								<!-- 
								<customTag:inputbox label="English" id="mean1" required="required" disabled="disabled" />
								<customTag:inputbox label="Korean" id="meanKorean" required="required" disabled="disabled" />
								<customTag:inputbox label="Mogolian" id="meanMongolian" required="required" disabled="disabled" />
								 -->
								</div>
								
								<h3 class="col-xs-12 col-sm-12 col-md-12 col-lg-12" id="codeDescriptionTitle">Description</h3>
								<div id="codeDescriptionSection">
									<div class="form-group">
										<label class="col-xs-3 col-sm-3 col-md-3 col-lg-3 control-label">English</label>
										<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
											<input class="form-control required" required="required" disabled="disabled"/>
										</div>										
									</div>
								<!-- 
								<customTag:inputbox label="English" id="description1" required="required" disabled="disabled" />
								<customTag:inputbox label="Korean" id="descriptionKorean" required="required" disabled="disabled" />
								<customTag:inputbox label="Mogolian" id="descriptionMongolian" required="required" disabled="disabled" />
								 -->
								 </div>
							</fieldset>
						</form>

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

	<!-- row -->

	<div class="row"></div>

	<!-- end row -->

	<!-- hidden div, for Control menu -->
	<div class="hidden-menu" id="hiddenControlMenu">
		<div class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"/>
		<ul class="dropdown-menu" id="hiddenControlMenu-dropdown">
			<!-- Example
			<li>
				<i class="jstree-icon jstree-themeicon glyphicon glyphicon-book jstree-themeicon-custom"></i>
				<strong id="controlMenuName">CODE :: ID</strong>
			</li>
			<li class="divider"></li>
			<li>
				<a href="javasciprt:void(0)">
					<i class="fa fa-file fa-fw txt-color-greenLight"></i>
					<u>A</u>dd Group
				</a>
			</li>
			<li>
				<a href="javasciprt:void(0)">
					<i class="fa fa-file fa-fw txt-color-greenLight"></i>
					<u>A</u>dd Group
				</a>
			</li>
			-->
		</ul>
	</div>
	<!-- end hidden div, for Control menu -->

	<style type="text/css">
	.hidden-menu{
		position: absolute;
	}
	</style>

</section>
<!-- end widget grid -->

<script type="text/javascript">

	pageSetUp();
	
	var MODE = {
		ADD: "ADD",
		UPDATE: "UPDATE",
		SELECT: "SELECT",
		NONE: "",
		DELETE:"DELETE",
		ACTION:{
			ADDGROUP : "ADDGROUP",
			MODIFYGROUP : "MODIFYGROUP",
			ADDCODE : "ADDCODE",
			MODIFYCODE : "MODIFYCODE",
			DELETECODE : "DELETECODE"
		}
	};
	
	var ROOT_ID = '00';
	
	//{"af", "ar-DZ", "ar", "az", "bg", "bs", "ca", "cs", "cy-GB", "da", "de", "el", "en-AU", "en-GB", "en-NZ", "eo", "es", "et", "eu", "fa", "fi", "fo", "fr-CH", "fr", "gl", "he", "hi", "hr", "hu", "hy", "id", "is", "it", "ja", "ka", "kk", "km", "ko", "lb", "lt", "lv", "mk", "ml", "ms", "nl-BE", "nl", "no", "pl", "pt-BR", "pt", "rm", "ro", "ru", "sk", "sl", "sq", "sr-SR", "sr", "sv", "ta", "th", "tj", "tr", "uk", "vi", "zh-CN", "zh-HK", "zh-TW"};
	// :::Configure::: 처음의 값이 Default로 정함. 
	var LANGUAGE_CODE_SET = {
			"en":{country:"English",flag:"flag"},			
			"ko":{country:"Korean",flag:"flag flag-kr"},
			"mn":{country:"Mogolian",flag:"flag flag-mn"},			
			"ja":{country:"Japanese",flag:"flag flag-jp"},
			"zh-CN":{country:"Chinanese",flag:"flag flag-cn"},
			localeSet : ["en","ko","mn","ja","zh-CN"],
			getLocales: function(){
				return this.localeSet;
			},
			length: function(){
				return this.localeSet.length;
			}
	};
	
	//선택한 코드로 등록된 Locale 정보를 담는다.
	var Selected_Locale = [];
	var Before_Modify_Locale = [];
	
	console.log('JG >>>> Login STATUS >>> USER : ','<c:out value="${username}"/>');
	
	var loginUser = '<c:out value="${username}"/>';
	var codePointer = null;
	var codeTreeHoverPointer = null;
	
	var codeInfoCurrentMode = MODE.NONE;
	
	var to = false;
	$('#codeSearch').keyup(function() {
		if (to) {
			clearTimeout(to);
		}
		to = setTimeout(function() {
			var v = $('#codeSearch').val();
			$('#codeTree').jstree(true).search(v);
		}, 250);
	});
	
	//Code Tree내에서 항목들을 마우스 오버 할 경우, 오버 대상의 노드 위치를 저장함.
	$('#codeTree').on('hover_node.jstree',function(e,data){
		//console.log('JG >>>>> TEST >>>>> CodeTree Mouseover Pointer :',data.node.id);
		codeTreeHoverPointer = data.node;
		
	})
	
	//Code Tree내에서 마우스 오버한 항목 부근에서 히든 메뉴를 출력하기 위함.
	var pagefunction = function() {
		//Mouse 우클릭 이벤트		
		$("#codeTree").mousedown(function(e){ 
		    if( e.button == 2 ) { 
		    	console.log("===codeTree==clicked ::: Pointer >>> ",codePointer,e.button);
		    	
		    	var templateData = {
		    		isGroup : codeTreeHoverPointer.id.search(/^00[/]/i) == 0 ? true : false,
		    		codeId : codeTreeHoverPointer.id
		    	};
		    	
		    	$('#hiddenControlMenu').offset({
					left:e.pageX,
					top:e.pageY
				});
		    	
		    	$('#hiddenControlMenu-dropdown').html(settingHiddenControlMenu(templateData));
		    	
		    	$('#hiddenControlMenu .dropdown-toggle').attr('aria-expanded','true');
		    	$('#hiddenControlMenu').addClass('open');
				
		      	return false; 
		    } 
		    return true;
		 });
		
		$("#codeTree").bind("contextmenu",function(e){
	        return false;
	    });
		
		
		/* Code List button */
		$("#btn-refresh-codelst").click(function() {
			console.log("===btn-refresh-codelst==clicked");

			$('#codeTree').jstree('refresh');
		});
		
		$("#btn-refresh-codeinfo").click(function() {
			console.log("===btn-refresh-codeinfo==clicked");

			var codeGroup = $("#codeGroup").val();
			var code = $("#code").val();

			if (codeGroup == '' || code == '') { return; }

			getCodeInfo(codeGroup+'/'+code);
			codePointer = codeGroup+'/'+code;

		});
		
		$("#btn-plus-codeinfo").click(function() {
			console.log("===btn-plus-codeInfo==clicked");
			var defaultLocale = LANGUAGE_CODE_SET.getLocales()[0];
			Selected_Locale = [defaultLocale];
			
			var codeGroup = $("#codeGroup").val();

			var parentId = $("#codeGroup").val();
						
			//$('#codeForm').find('input,select').attr('value', '');
			//$('#enabledFlag').attr('checked', true);
			//$('#codeGroup').attr('value', codeGroup);
			
			var newSetter = [{
					codeGroup:codeGroup,
					code:'',
					enabledFlag:true,
					startDateActive_js:'',
					endDateActive_js:'',
					svcDomain:'',
					subGrp1:'',
					subGrp2:'',
					meaning:'',
					description:'',
					language:defaultLocale
			}];
			
			settingCodeinfoView(newSetter);
			
			// 동적 생성 후 접근 제어 적용.
			$('#codeForm button').removeClass('disabled');
			$('#codeForm').find('input,select').removeAttr('disabled');
			$('#codeGroup').attr('disabled','disabled');
			$('#btn-locale-append-codeinfo').removeClass('disabled');

			if (codeInfoCurrentMode != MODE.ADD) {
				codeInfoCurrentMode = MODE.ADD; //추가상태로 변경     
			}

			console.log("codeInfoCurrentMode = " + codeInfoCurrentMode);
		});
		
		$("#btn-edit-codeinfo").click(function() {
			console.log("===btn-eidt-codeInfo==clicked");
			
			var codeGroup = $("#codeGroup").val();
			var code = $("#code").val();

			if (codeGroup == '' || code == '') { return; }
			
			Before_Modify_Locale = [];
			var tempStringforDeepCopy = JSON.stringify(Selected_Locale);
			Before_Modify_Locale = JSON.parse(tempStringforDeepCopy);

			$('#codeForm').find('input,select').removeAttr('disabled');
			$('#btn-locale-append-codeinfo').removeClass('disabled');
			
			$('#codeForm button').removeClass('disabled');
			$('#codeGroup').attr('disabled', 'disabled');
			$('#code').attr('disabled', 'disabled');

			if (codeInfoCurrentMode != MODE.UPDATE) {
				codeInfoCurrentMode = MODE.UPDATE; //편집상태로 변경               
			}

			console.log("codeInfoCurrentMode = " + codeInfoCurrentMode);
		});
		
		$('#btn-locale-append-codeinfo').click(function(e){
			console.log("===btn-locale-append-codeinfo==clicked");
			e.preventDefault();
			if(codeInfoCurrentMode != MODE.ADD && codeInfoCurrentMode != MODE.UPDATE){
				//추가, 수정이 아닐경우는 접근해서는 않되는 기능
				console.log('WARN >>>>> Access not Allowed...');
				return;
			}
			
			if(Selected_Locale.length == LANGUAGE_CODE_SET.length){
				console.log('WARN >>>>> Append item, disable...');
				return;
			}
			
			var blankLocaleSearchData = LANGUAGE_CODE_SET.getLocales();
			for(var i=0;i<blankLocaleSearchData.length;i++){
				
				if(Selected_Locale.indexOf(blankLocaleSearchData[i]) == -1){
					Selected_Locale.push(blankLocaleSearchData[i]);
					break;
				}
			}
			
			var settingCodeInfoData = saveStatus();
			console.log('JG >>>>> TEST >>>>> settingCodeInfoData',settingCodeInfoData);
			
			//화면 재 구성.
			settingCodeinfoView(settingCodeInfoData);
			
			// 동적 생성 후 접근 제어 적용.
			$('#codeForm button').removeClass('disabled');
			$('#codeForm').find('input,select').removeAttr('disabled');
			$('#codeGroup').attr('disabled','disabled');
			$('#btn-locale-append-codeinfo').removeClass('disabled');
					
			
		});
		
		
		
		$("#btn-save-codeinfo").click(function() {
			
			var codeDataforPost = [];			
			
			/* Validate */
			if ((codeInfoCurrentMode != MODE.ADD) && (codeInfoCurrentMode != MODE.UPDATE)) {
				printErrorBox("Access Denied", "This mode is not allowed");
				console.log("This mode is not allowed");
				return;
			}			
			
			if($("#codeGroup").val() == '' || $("#code").val() == ''){
				printErrorBox("Validation Error", "There is no value in the required fields.");
				return;
			}
			
			for(var i=0;i<Selected_Locale.length;i++){
				if($('#meanInput'+Selected_Locale[i]).val() == '' || $('#descriptionInput'+Selected_Locale[i]).val() == ''){
					printErrorBox("Validation Error", "There is no value in the required fields.");
					return;	
				}
			}
			/* End Validate */
			
			//작성된 내용 저장
			codeDataforPost = saveStatus();
			
			codePointer = $("#codeGroup").val()+'/'+$("#code").val();
			
			var urlString = 'code/single';
			
			if (codeInfoCurrentMode == MODE.ADD) {
				$.ajax({
					type: 'POST',
					url: urlString,
					contentType: "application/json",
					data: JSON.stringify(codeDataforPost),
					dataType: 'json',
					success: function(res) {
						console.log(res);
						if (res.resultCode == 'FAIL') {
							$.smallBox({
								title: "Execution failure",
								content: res.resultMsg,
								color: "#5384AF",
								timeout: 4000,
								icon: "fa fa-bell"
							});

						} else {
							$.smallBox({
								title: "Code add Completed.",
								content: "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
								color: "#296191",
								iconSmall: "fa fa-thumbs-up bounce animated",
								timeout: 4000
							});

							codeInfoCurrentMode = MODE.NONE;
							$('#codeForm').find('input,select').attr('disabled', 'disabled');
							console.log('JG >>>>> Pointer : ',codePointer);
							getCodeInfo(codePointer);
							$('#codeTree').jstree('refresh');

						}

					},
					error: function(error) {
						MessageBox.error("500 Err : Server Error");
					}
				});
			}
			
			if (codeInfoCurrentMode == MODE.UPDATE) {
				/* 수정 명령 전달 준비 */
				
				//삭제나, 수정여부 확인 및 셋팅
				for(var i=0;i<Before_Modify_Locale.length;i++){
					if(existLocale(Before_Modify_Locale[i],'')){
						setCodeDatasUpdateStatus(codeDataforPost,Before_Modify_Locale[i],MODE.UPDATE);
					}else{
						var codeDatatoDelete = {
							codeGroup : codeDataforPost[0].codeGroup,
							code : codeDataforPost[0].code,
							language : Before_Modify_Locale[i],
							enabledFlag:true,
							startDateActive_js:'',
							endDateActive_js:'',							
							svcDomain:'',
							subGrp1:'',
							subGrp2:'',
							meaning:'',
							description:'',
							updateStatus : MODE.DELETE
							
						};						
						
						codeDataforPost.push(codeDatatoDelete);
					}
				}
				
				//추가 여부 확인 및 셋팅
				for(var i=0;i< Selected_Locale.length;i++){
					var j=0;
					for(;j<Before_Modify_Locale.length;j++){
						if(Selected_Locale[i] == Before_Modify_Locale[j]){
							break;
						}
					}
					if(j == Before_Modify_Locale.length)
						for(var k=0;k<codeDataforPost.length;k++){
							if(codeDataforPost[k].language == Selected_Locale[i]){
								codeDataforPost[k].updateStatus = MODE.ADD;
								codeDataforPost[k].createdBy = loginUser;
								break;
							}
						}
				}
				
				console.log('JG >>>>> POST TEST >>>>> codeDataforPost',codeDataforPost);
				
				/* end 수정 명령 전달 준비 */
				$.ajax({
					type: 'PUT',
					url: urlString,
					contentType: "application/json",
					data: JSON.stringify(codeDataforPost),
					dataType: 'json',
					success: function(res) {
						console.log(res);
						if (res.resultCode == 'FAIL') {
							$.smallBox({
								title: "Execution failure",
								content: res.resultMsg,
								color: "#5384AF",
								timeout: 4000,
								icon: "fa fa-bell"
							});

						} else {
							$.smallBox({
								title: "Modify Completed.",
								content: "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
								color: "#296191",
								iconSmall: "fa fa-thumbs-up bounce animated",
								timeout: 4000
							});

							codeInfoCurrentMode = MODE.NONE;
							$('#codeForm').find('input,select').attr('disabled', 'disabled');
							console.log('JG >>>>> Pointer : ',codePointer);
							getCodeInfo(codePointer);
							$('#codeTree').jstree('refresh');

						}

					},
					error: function(error) {
						MessageBox.error("500 Err : Server Error");
					}
				});
			}
				
		});
		
		/* Code Tree*/
		loadScript("${BOOT_JS}/plugin/jstree/jstree.min.js", run_codeTree);

		function run_codeTree() {
			console.log("===run_codeTree==")
			$.jstree.defaults.search.show_only_matches = true;
			console.log("show_only_matches=" + $.jstree.defaults.search.show_only_matches);
			console.log('JG >>>> TEST ::: START');
			// AJAX
			$('#codeTree').jstree({
				'core': {
					'data': {
						'url': 'code/allList/tree',
						'dataType': 'json'
					}
				},
				"plugins": ["search", "wholerow"]

			}).on('changed.jstree', function(e, data) {
				
				if (data && data.selected && data.selected.length) {

					$('.widget-toolbar button').removeClass('disabled');
					
					var i, j, r = [];
					
					for (i = 0, j = data.selected.length; i < j; i++) {						
						r.push(data.instance.get_node(data.selected[i]).id);
					}
					console.log('Selected id: ' + r.join(', '));
					var id = r.join(', ');
					getCodeInfo(id);

				} else {
					console.log("===not selected==")
				}
			});

		}
	}
	
	//Code 정보가져오기
	function getCodeInfo(id, next) {

		codeInfoCurrentMode = MODE.SELECT;

		$('#codeForm').find('input,select').val('');
		$('#codeForm').find('input,select').attr('disabled', 'disabled');
		$('#enabledFlag').attr('checked', false);
		$('#btn-locale-append-codeinfo').addClass('disabled');
		$('#codeForm a').addClass('disabled');
		
		//Group 이나 Code 에 맞춰 Template View 변경
		if(id.search(/^00[/]/) === 0){
			settingTemplateCodeGroupInfoView();
		}else{
			settingTemplateCodeInfoView();
		}
		

		var urlString = "code/single/";
		codePointer = id;

		$.ajax({
			type: 'GET',
			url: urlString + id,
			contentType: "application/json",
			dataType: 'json',
			success: function(res) {
				console.log(res);
				if (res.resultCode == 'FAIL') {
					$.smallBox({
						title: "Execution failure",
						content: res.resultMsg,
						color: "#5384AF",
						timeout: 4000,
						icon: "fa fa-bell"
					});

				} else {
					console.log("JG >>>>> res : ",res);
					
					settingCodeinfoView(res);
					if(next != undefined)next();
					
				}

			},
			error: function(error) {
				MessageBox.error("500 Err : Server Error");
			}
		});
	}
	
	//Code 정보로 Codeinfo View 구성 함수
	function settingCodeinfoView(codeInfo){
		var codeInfoCount = codeInfo.length;
		
		var commonInfo = codeInfo[0];
		
		$("#codeGroup").val(commonInfo.codeGroup);
		$("#code").val(commonInfo.code);
		$("#enabledFlag").prop('checked',commonInfo.enabledFlag);
		
		$("#startDateActive").val(commonInfo.startDateActive_js);
		$("#endDateActive").val(commonInfo.endDateActive_js);
		$("#svcDomain > option[value='" + commonInfo.svcDomain + "']").attr("selected", "true");
		$("#subGrp1").val(commonInfo.subGrp1);
		$("#subGrp2").val(commonInfo.subGrp2);
		
		var meaningDataforHTML = "";
		var descriptionDataforHTML = "";
		var locale="";
		var localetoCont="";
		
		Selected_Locale = [];
		
		console.log('JG >>>> TEST ::: codeInfoCount',codeInfoCount);
		
		for(var i=0;i<codeInfoCount;i++){
			locale = codeInfo[i].language;
			Selected_Locale.push(locale);
		}
		
		for(var i=0;i<codeInfoCount;i++){
			locale = codeInfo[i].language;
			
			
			if(LANGUAGE_CODE_SET.hasOwnProperty(locale)){
				localetoCont = LANGUAGE_CODE_SET[locale].country;
			}else{
				localetoCont = locale;
			}
			
			//코드의 Locale 개수 만큼 meaning 등록
			//HEAD
			meaningDataforHTML = meaningDataforHTML
			+ '<div class="form-group">'
			+'<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3 text-right">'
			+ '<button class="btn btn-default dropdown-toggle disabled" data-toggle="dropdown" aria-expanded="false">'
			+ localetoCont
			+ '</button>'
			+'<ul class="dropdown-menu pull-right">';
						
			//LOCALE 
			var locales = LANGUAGE_CODE_SET.getLocales();
			var countryContainData = "";
			
			for(var j=0;j<locales.length;j++){

				if(locales[j] == locale){
					countryContainData = '<li class="active"><a href="javascript:void(0);">'
					+ '<i class="'+LANGUAGE_CODE_SET[locales[j]].flag+'"/>'
					+ LANGUAGE_CODE_SET[locales[j]].country
					+'<i class="fa fa-lock fa-fw"/></a></li>'
					+'<li class="divider"></li>'
					+ countryContainData;
				}else{
					if(existLocale(locales[j],locale)){
						countryContainData = countryContainData
						+ '<li><a href="javascript:void(0);">'
						+ '<i class="'+LANGUAGE_CODE_SET[locales[j]].flag+'"/>'
						+ LANGUAGE_CODE_SET[locales[j]].country
						+'<i class="fa fa-lock fa-fw"/></a></li>';
					}else{
						countryContainData = countryContainData
						+ '<li><a href="javascript:changeMeaningLocale(\''+locales[j]+'\',\''+locale+'\','+i+');">'
						+ '<i class="'+LANGUAGE_CODE_SET[locales[j]].flag+'"/>'
						+ LANGUAGE_CODE_SET[locales[j]].country;
					}
					countryContainData = countryContainData					
					+'</a></li>';
				}
			}
			
			if(Selected_Locale.length != 1){
				countryContainData = countryContainData
				+ '<li class="divider"></li>'
				+ '<li><a href="javascript:deleteMeaningLocale('+i+');">'
				+ '<i class="fa fa-times fa-lg fa-fw txt-color-red"/>'
				+ '<u>D</u>elete</a></li>';
			}
			
			
			meaningDataforHTML = meaningDataforHTML + countryContainData
			+ '</ul></div>'
			+ '<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">'
			+ '<input id="meanInput'+locale+'" locale="'+locale+'" class="form-control required" required="required" disabled="disabled" value="'+codeInfo[i].meaning+'"/>'
			+ '</div></div>';
			
			/*
			Description이 없는 경우, 처리
			 - Description은 Required가 되어야 하는지, 정립이 필요함.
			 - 현재 입력 시에는 무조건 입력하게 되어있음. (Required)
			*/
			var description = codeInfo[i].description;
			if(description == undefined || description == null || description == ""){
				description = '';
			}
			
			//코드의 Locale 개수 만큼 description 등록
			descriptionDataforHTML = descriptionDataforHTML
			+ '<div class="form-group">'
			+ '<label class="col-xs-3 col-sm-3 col-md-3 col-lg-3 control-label">'+localetoCont+'</label>'
			+ '<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">'
			+ '<input id="descriptionInput'+locale+'" locale="'+locale+'" class="form-control required" required="required" disabled="disabled" value="'+description+'"/>'
			+ '</div></div>';
		}
		
		$("#codeMeaningSection").html(meaningDataforHTML);
		$("#codeDescriptionSection").html(descriptionDataforHTML);
	}
	
	//로케이션 변경 버튼 선택
	function changeMeaningLocale(selectedLocale,oldLocale,index){
		console.log('JG >>>>> TEST >>>>> changeMeaningLocale('+selectedLocale+')',index);
		Selected_Locale[index] = selectedLocale;
		
		var oldMeaning = $('#meanInput'+oldLocale).val();
		var oldDescription = $('#descriptionInput'+oldLocale).val();
		
		var settingCodeInfoData = saveStatus();
		
		//화면 재 구성.
		settingCodeinfoView(settingCodeInfoData);
		
		// 동적 생성 후 접근 제어 적용.
		$('#codeForm button').removeClass('disabled');
		$('#codeForm').find('input,select').removeAttr('disabled');
		$('#codeGroup').attr('disabled','disabled');
		if (codeInfoCurrentMode == MODE.UPDATE) {
			$('#code').attr('disabled','disabled');
		}
		$('#btn-locale-append-codeinfo').removeClass('disabled');
		
		$('#meanInput'+selectedLocale).val(oldMeaning);
		$('#descriptionInput'+selectedLocale).val(oldDescription);
	}
	
	//codeinfo > 특정 로케이션 필드 제거
	function deleteMeaningLocale(index){
		console.log('JG >>>>> TEST >>>>> deleteMeaningLocale()',index);
		Selected_Locale.splice(index,1);
				
		var settingCodeInfoData = saveStatus();
		
		//화면 재 구성.
		settingCodeinfoView(settingCodeInfoData);
		
		// 동적 생성 후 접근 제어 적용.
		$('#codeForm button').removeClass('disabled');
		$('#codeForm').find('input,select').removeAttr('disabled');
		$('#codeGroup').attr('disabled','disabled');
		if (codeInfoCurrentMode == MODE.UPDATE) {
			$('#code').attr('disabled','disabled');
		}
		$('#btn-locale-append-codeinfo').removeClass('disabled');
	}
	
	//codeinfo > view를 Group에 맞게 재 구성
	function settingTemplateCodeGroupInfoView(){
		$('#codeGroup').parent().parent().css('visibility','hidden');
	}
	
	//codeinfo > view를 Code에 맞게 재 구성
	function settingTemplateCodeInfoView(){
		$('#codeGroup').parent().parent().css('visibility','visible');
	}
	
	//hidden Control Menu 구성
	function settingHiddenControlMenu(codeInfo){
		var hiddenContolMenuforHTML = "";
		
		var title = codeInfo.codeId.replace(/^00[/]/,"");
				
		hiddenContolMenuforHTML = hiddenContolMenuforHTML
		+ '<li>'
		+ '<strong id="controlMenuName" style="margin-left : 10px; margin-right : 10px">'+title+'</strong></li>'
		if(codeInfo.isGroup == true){
			hiddenContolMenuforHTML = hiddenContolMenuforHTML
			+ '<li class="divider"></li>'
			+ '<li>'
			+ '<a href="javascript:selectHiddenMenu(\''+codeInfo.codeId+'\', \''+MODE.ACTION.ADDGROUP+'\')">'
			+ '<i class="fa fa-file fa-fw txt-color-greenLight"></i>'
			+ '<u>N</u>ew Group'
			+ '</a></li>'		
			+ '<li>'
			+ '<a href="javascript:selectHiddenMenu(\''+codeInfo.codeId+'\', \''+MODE.ACTION.MODIFYGROUP+'\')">'
			+ '<i class="fa fa-edit fa-fw"></i>'
			+ '<u>M</u>odify Group'
			+ '</a></li>';
		}
		
		
		
		hiddenContolMenuforHTML = hiddenContolMenuforHTML
			+ '<li class="divider"></li>'
			+ '<li>'
			+ '<a href="javascript:selectHiddenMenu(\''+codeInfo.codeId+'\', \''+MODE.ACTION.ADDCODE+'\')">'
			+ '<i class="fa fa-file fa-fw txt-color-greenLight"></i>'
			+ '<u>N</u>ew Code'
			+ '</a></li>'		
			+ '<li>';
			
		if(codeInfo.isGroup == false){
			hiddenContolMenuforHTML = hiddenContolMenuforHTML
			+ '<a href="javascript:selectHiddenMenu(\''+codeInfo.codeId+'\', \''+MODE.ACTION.MODIFYCODE+'\')">'
			+ '<i class="fa fa-edit fa-fw"></i>'
			+ '<u>M</u>odify Code'
			+ '</a></li>'
			+ '<li>'
			+ '<a href="javascript:selectHiddenMenu(\''+codeInfo.codeId+'\', \''+MODE.ACTION.DELETECODE+'\')">'
			+ '<i class="fa fa-times fa-fw txt-color-red"></i>'
			+ '<u>D</u>elete Code'
			+ '</a></li>';
		}
		
		return hiddenContolMenuforHTML;
	}
	
	//히든 메뉴 내 항목을 실행 시 처리하는 부분
	function selectHiddenMenu(targetId, Mode){
		console.log('JG >>>>> TEST >>>>> selectHiddenMenu()',targetId, Mode);
		
		switch(Mode){
		case MODE.ACTION.ADDGROUP:
			getCodeInfo(targetId,function(){
				settingTemplateCodeGroupInfoView();
				$("#btn-plus-codeinfo").trigger("click");			
			});
			break;
		case MODE.ACTION.ADDCODE:
			getCodeInfo(targetId,function(){
				if($("#codeGroup").val() == "00"){
					$("#codeGroup").val($("#code").val());
					settingTemplateCodeInfoView();
				}
				$("#btn-plus-codeinfo").trigger("click");
			});
			break;
		case MODE.ACTION.MODIFYGROUP:
		case MODE.ACTION.MODIFYCODE:
			getCodeInfo(targetId,function(){
				$("#btn-edit-codeinfo").trigger("click");			
			});
			break;
		case MODE.ACTION.DELETECODE:
			getCodeInfo(targetId,function(){
				console.log('JG >>>>> TEST >>>>> ...Delete Action Start...');
				
				$.SmartMessageBox({
					title : "Delete Code",
					content : "Are you sure you want to DELETE this?",
					buttons : '[No][Yes]'
				}, function(ButtonPressed) {
					if (ButtonPressed === "Yes") {
						
						var urlString = 'code/single/'+targetId;
						
						$.ajax({
							type: 'DELETE',
							url: urlString,
							contentType: "application/json",
							dataType: 'json',
							success: function(res) {
								console.log(res);
								if (res.resultCode == 'FAIL') {
									$.smallBox({
										title: "Execution failure",
										content: res.resultMsg,
										color: "#5384AF",
										timeout: 4000,
										icon: "fa fa-bell"
									});

								} else {
									$.smallBox({
										title: "Code DELETE Completed.",
										content: "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
										color: "#296191",
										iconSmall: "fa fa-thumbs-up bounce animated",
										timeout: 4000
									});

									codeInfoCurrentMode = MODE.NONE;
									$('#codeForm').find('input,select').attr('disabled', 'disabled');
									$('#codeForm').find('input,select').val('');
									codePointer = null;
									$('#codeTree').jstree('refresh');

								}

							},
							error: function(error) {
								MessageBox.error("500 Err : Server Error");
							}
						});
								
					}		
				});
				
			});
			break;
		}
	}
	
	//codeinfo > 설정된 로케이션 값 유무 확인 함수
	function existLocale(locale, defulatLocale){
		for(var i=0;i<Selected_Locale.length;i++){
			if(Selected_Locale[i] != defulatLocale && Selected_Locale[i] == locale)return true;
		}
		return false;
	}
	
	//codeData[] 내 로케일 정보를 찾고 그에 맞게 UpdateStatus를 적용하는 함수
	function setCodeDatasUpdateStatus(codeDatas, locale, Status){
		for(var i=0;i<codeDatas.length;i++){
			if(codeDatas[i].language == locale){
				codeDatas[i].updateStatus = Status;
			}
		}
	}
	
	function saveStatus(){
		var codeDataforPost = [];
		var codeRawString = '';
		var codeMeaningStringSet = [];
		var codeDescriptionStringSet = [];
		
		var codeRawObj = {
				codeGroup: $("#codeGroup").val(),
				code: $("#code").val(),
				enabledFlag: $("#enabledFlag").prop('checked'),
				startDateActive_js: $("#startDateActive").val(),
				endDateActive_js: $("#endDateActive").val(),
				svcDomain: $("#svcDomain").val(),
				subGrp1: $("#subGrp1").val(),
				subGrp2: $("#subGrp2").val()
			}
			
		if(codeInfoCurrentMode == MODE.ADD)codeRawObj.createdBy = loginUser;
		if(codeInfoCurrentMode == MODE.UPDATE)codeRawObj.lastUpdatedBy = loginUser;
						
		codeRawString = JSON.stringify(codeRawObj);
		
		for(var i=0;i<Selected_Locale.length;i++){
			if($('#meanInput'+Selected_Locale[i]).val() == undefined)codeMeaningStringSet.push('');
			else codeMeaningStringSet.push($('#meanInput'+Selected_Locale[i]).val());
			
			if($('#descriptionInput'+Selected_Locale[i]).val() == undefined)codeDescriptionStringSet.push('');
			else codeDescriptionStringSet.push($('#descriptionInput'+Selected_Locale[i]).val());
		}
		
		
		
		var tempCodeData;
		for(var i=0;i<Selected_Locale.length;i++){
			console.log('JG >>>>> TEST >>>>> Selected_Locale[i]',Selected_Locale[i]);
			tempCodeData = JSON.parse(codeRawString);
			
			//if(codeMeaningStringSet[i] == '' || codeDescriptionStringSet[i] == ''){
				//printErrorBox("Validation Error", "There is no value in the required fields.");
				//return;	
			//}
			
			tempCodeData.language = Selected_Locale[i];
			tempCodeData.meaning = codeMeaningStringSet[i];
			tempCodeData.description = codeDescriptionStringSet[i];
			//console.log('JG >>>>> Setting Data : ',tempCodeData);
			codeDataforPost.push(tempCodeData);
		}
		
		return codeDataforPost;
	}

	// end pagefunction

	// destroy generated instances 
	// pagedestroy is called automatically before loading a new page
	// only usable in AJAX version!

	var pagedestroy = function() {

		/*
		Example below:

		$("#calednar").fullCalendar( 'destroy' );
		if (debugState){
			root.console.log("✔ Calendar destroyed");
		} 

		For common instances, such as Jarviswidgets, Google maps, and Datatables, are automatically destroyed through the app.js loadURL mechanic

		 */

		$("#codeTree").jstree('destroy');
		if (debugState) {
			root.console.log("✔ jstree  destroyed");
		}

	}

	// end destroy

	// run pagefunction on load

	pagefunction();
	
	function printErrorBox(title, content){
		$.smallBox({
			title: title,
			content: content,
			color: "#5384AF",
			timeout: 4000,
			icon: "fa fa-bell"
		});
	}
	
	function printOkBox(title){
		$.smallBox({
			title: title,
			content: "<i class='fa fa-clock-o'></i> <i>2 seconds ago...</i>",
			color: "#296191",
			iconSmall: "fa fa-thumbs-up bounce animated",
			timeout: 4000
		});
	}
</script>

