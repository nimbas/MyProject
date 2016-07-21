<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c"         uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fn"        uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<script type="text/javascript" src="/resources/js/code/code.js"></script>
<style>
th, td{
	height : 30px;
}
</style>
<!-- widget grid -->
	<!-- widget grid -->
<section id="widget-grid" class="">
				
					<!-- START ROW -->
<div class="row">

	<!-- NEW COL START -->
	<article class="col-sm-12 col-md-12 col-lg-12">

		<!-- Widget ID (each widget will need unique ID)-->
		<div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="true" data-widget-custombutton="false">
			<header>
				<span class="widget-icon"> <i class="fa fa-search"></i> </span>
				<h2>Search Condition</h2>
			</header>

			<!-- widget div-->
			<div>
				<!-- widget content -->
				<div class="widget-body">

					<form class="smart-form" role="form" id="subscriptionCustomerSearchForm" name="subscriptionCustomerSearchForm" action="">
						
						<input type="hidden" name="custNo" id ="custNo" class="cbs_field" />
						<input type="hidden" name="entrNo" id ="entrNo" class="cbs_field" />
						<input type="hidden" name="cnvgNo" id ="cnvgNo" class="cbs_field" />
						<input type="hidden" name="aceno" id ="aceno" class="cbs_field" value=""/>
						<input type="hidden" name="billAcntNo" id ="billAcntNo" class="cbs_field" value=""/>
						<input type="hidden" name="ppayEntrDvCd" id ="ppayEntrDvCd" class="cbs_field" value=""/>
						<input type="hidden" name="ppayEntrDvNm" id ="ppayEntrDvNm" class="cbs_field" value=""/>
						<input type="hidden" name="billAcntSttsCd" id ="billAcntSttsCd" class="cbs_field" value=""/>
						<input type="hidden" name="entrSttsCd" id ="entrSttsCd" class="cbs_field" value=""/>
						<input type="hidden" name="svcCd" id ="svcCd" class="cbs_field" value=""/>
						<input type="hidden" name="prodNo" id ="prodNo" class="cbs_field" value=""/>
						<input type="hidden" name="userLevel" id ="userLevel" class="cbs_field" value="${user.userLevel}"/>
						<input type="hidden" name="imsiNo" id ="imsiNo" class="cbs_field" >
						<input type="hidden" name="blackListYn" id ="blackListYn" class="cbs_field" >
						<input type="hidden" name="rlusrCustNo" id ="rlusrCustNo" class="cbs_field" >
						<input type="hidden" name="rlusrCustNm" id ="rlusrCustNm" class="cbs_field" >
						<input type="hidden" name="custDvCd" id ="custDvCd" class="cbs_field" >
						<input type="hidden" name="ocsStatusCd" id ="ocsStatusCd" class="cbs_field" >
						
						<!-- S: 조회 기준 1열 -->
						<fieldset>
    					   <div class="row">
								<section class="col col-3">
									<label class="select">
										<select id="searchString" name="searchString" searchField="MRKT_CD" searchOper="eq" required="required">
											<code:out codeType="CoSearchType" option="listbox"/>
										</select><i></i>
									</label>
								</section>
								<section class="col col-3">
									<label class=input>
										<input type="text" id="searchEntrNo" name="searchString" searchField="PROD_CD" searchOper="eq" placeholder="product code"/>
									</label>
								</section>
								<section class="col col-1">
									 <button type="button" class="btn btn-success btn-sm" id="searchBtn">Search</button>
								</section>
								<section class="col col-5">
									<div class="inline-group">
										<label class="checkbox">
										<input type="hidden" name="withTerminated" id="withTerminated" value="N"/>
										<input type="checkbox" name="withTerminated_0" id="withTerminated_0"/>
										<i></i>With termindated
										</label>
										<label class="checkbox">
										<input type="hidden" name="showSelectedOnly" id="showSelectedOnly" value="Y"/>
										<input type="checkbox" name="showSelectedOnly_0" id="showSelectedOnly_0" checked="checked"/>
										<i></i>Show Selected Number
										</label>
										<label class="checkbox">
										<input type="hidden" name="showSelectedTree" id="showSelectedTree" value="N"/>
										<input type="checkbox" name="showSelectedTree_0" id="showSelectedTree_0"/>
										<i></i>Show tree grid type
										</label>
									</div>
								</section>
							</div>
						</fieldset>
						<!-- E: 조회 기준 1열 -->
					</form>
					

				</div>
				<!-- end widget content -->

			</div>
			<!-- end widget div -->

		</div>
		<!-- end widget -->

	</article>
	<!-- END COL -->

	<article class="col-sm-12 col-md-12 col-lg-12">
		<div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="true" data-widget-custombutton="false">
			<header>
				<span class="widget-icon"><i class="fa fa-edit"></i></span>
				<h2>Information</h2>
			</header>
			<div class="widget-body">
				<ul id="myTab1" class="nav nav-tabs bordered">
					<li class="active">
						<a href="#s1" data-toggle="tab" aria-expanded="false">Customer Information</a>
					</li>
					<li class="">
						<a href="#s2" data-toggle="tab" aria-expanded="false">Contract Information</a>
					</li>
				</ul>
				
				<div id="myTabContent1" class="tab-content padding-10">
					<div class="tab-pane fade active in" id="s1">
						<div class="container-fluid">
						<div class="row">
							<div class="col-md-10 demo-icon-font">
								<span class="glyphicon glyphicon-user"></span>
								<span class="glyphicon-class">Customer</span>
								<!-- <i class="fa fa-info"></i>
								Customer	 -->			
							</div>
							<div class="col-md-2">
								<div class="pull-right">
									<div class="row">
										<a class="btn bg-color-blueLight txt-color-white" href="javascript:clickMenu_dialog(0);" style="margin-bottom:10px">Work History</a>
										<a class="btn bg-color-blueLight txt-color-white" href="javascript:clickMenu_customerChange(0);" style="margin-bottom:10px">Customer Change</a>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
						<form class="form-horizontal" role="form" id="csCust000ViewFrom" name="csCust000ViewFrom">
						<fieldset>
							<div class="table-responsive">
							 <table class="table table-condensed table-bordered">
									<tbody>
										<tr>
											<th class="bg-color-blue txt-color-white">Name</th>
											<td><input type="text" id="custFullName" name="custFullName"  readonly="readonly" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">SSN</th>
											<td><input type="text" id="custrnmNo" name="custrnmNo" readonly="readonly" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Phone no.</th>
											<td><input type="text" id="phoneNo" name="phoneNo" readonly="readonly" style="width: 100%;"></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Type</th>
											<td><input type="text" id="custDvNm" name="custDvNm" readonly="readonly" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Web Id</th>
											<td><input type="text" id="userId" name="userId" readonly="readonly" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Password</th>
											<td><input type="password" id="custPswdDisplay" name="custPswdDisplay" readonly="readonly" style="width: 100%;"></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Contact</th>
											<td><input type="text" id="cntctFullNm" name="cntctFullNm" readonly="readonly" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">E-MAIL</th>
											<td><input type="text" id="emailAddr" name="emailAddr" readonly="readonly" style="width: 100%;"></td>
											<th class="bg-color-blue txt-color-white">Position</th>
											<td><input type="text" id="position" name="position" readonly="readonly" style="width:100%;"></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Base Address</th>
											<td colspan="5">
												<textarea class="form_readonly" readonly style="width: 100%;" id="fullAddr" >  </textarea>
											</td>
										</tr>
									</tbody>
								</table>
							</div>
						</fieldset>
						</form>
						</div>
						</div>
					</div>
					
					<div class="tab-pane fade" id="s2">
						<div id="subscriptionInCustDiv_1" class="container-fluid">
							<table id="subscriptionInCust"></table>
							<div id="pagerOfsubscriptionInCust"></div>
						</div>
					</div>
				
				</div>
			</div>
		</div>
	</article>
	
	<article class="col-sm-12 col-md-12 col-lg-12">
		<div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="true" data-widget-custombutton="false">
			<header>
				<span class="widget-icon"><i class="fa fa-edit"></i></span>
				<h2>Subscriber Informaion</h2>
			</header>
			<div class="widget-body">
				<ul id="myTab1" class="nav nav-tabs bordered">
					<li class="active">
						<a href="#s3" data-toggle="tab" aria-expanded="false">Subscriber ID</a>
					</li>
					<li class="">
						<a href="#s4" data-toggle="tab" aria-expanded="false">Product Information</a>
					</li>
					<li class="">
						<a href="#s5" data-toggle="tab" aria-expanded="false">Device Information</a>
					</li>
				</ul>
				
				<div id="myTabContent1" class="tab-content padding-10">
				
					<div class="tab-pane fade active in" id="s3">
						<div class="row">
							<div class="col-md-6">
							<div class="table-responsive">
								<table class="table table-condensed table-bordered">
										<tbody>
											<tr>
												<th class="bg-color-blue txt-color-white">Subscriber ID</th>
												<td><input type="text" id="subEntrNo" name="entrNo"  readonly="readonly" style="width: 100%;"></td>
												<th class="bg-color-blue txt-color-white">Bill ID</th>
												<td><input type="text" id="subBillAcntNo" name="billAcntNo" readonly="readonly" style="width: 100%;"></td>
											</tr>
											<tr>
												<th class="bg-color-blue txt-color-white">Phone Number</th>
												<td><input type="text" id="subProdNo" name="prodNo" readonly="readonly" style="width: 100%;"></td>
												<th class="bg-color-blue txt-color-white">Sub. Date</th>
												<td><input type="text" id="subFrstDttm" name="frstDttm" readonly="readonly" style="width: 100%;"></td>
											</tr>
											<tr>
												<th class="bg-color-blue txt-color-white">Change Date</th>
												<td><input type="text" id="subChngDttm" name="chngDttm" readonly="readonly" style="width: 100%;"></td>
												<th class="bg-color-blue txt-color-white">Branch</th>
												<td><input type="text" id="subDlrCd" name="dlrCd" readonly="readonly" style="width: 100%;"></td>
											</tr>
											<tr>
												<th class="bg-color-blue txt-color-white">Reseller</th>
												<td><input type="text" id="subIndcId" name="indcId" readonly="readonly" style="width: 100%;"></td>
												<th class="bg-color-blue txt-color-white">Manager ID</th>
												<td><input type="text" id="subMngrId" name="mngrId" readonly="readonly" style="width: 100%;"></td>
											</tr>
										
										</tbody>
									</table>
									<table class="table table-bordered">
										<tr>
											<th class="bg-color-blue txt-color-white">Grade</th>
											<td colspan="3"><input type="text" id="customerGrade" name="customerGrade" class="form_readonly" style="width: 100%;" readonly value="" /></td>
										</tr>
									</table>
								</div>
							</div>
							
							<div class="col-md-6">
								<div class="table-responsive">
									<table class="table table-condensed table-bordered">
										<tr>
											<th class="bg-color-blue txt-color-white">Name</th>
											<td>
												<input id="subRealCustNm"  name="realCustNm" type="text" class="form_readonly" style="width: 30%;" readonly />
												<input id="subRealCustNm1"  name="realCustNm1" type="text" class="form_readonly" style="width: 32%;" readonly  />
												<input id="subRealCustNm2"  name="realCustNm2" type="text" class="form_readonly" style="width: 32%;" readonly />
											</td>
											<th class="bg-color-blue txt-color-white">Gender</th>
											<td><input id="subCustGender"  name="custGender" type="text" class="form_readonly" style="width: 100%;" readonly/></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">SSN</th>
											<td><input id="subCustrnmNo"  name="custrnmNo" type="text" class="form_readonly" style="width: 100%;" readonly /></td>
											<th class="bg-color-blue txt-color-white">Birthday</th>
											<td><input id="subCustBirthday"  name="custBirthday" type="text" class="form_readonly" style="width: 100%;" readonly /></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Phone No</th>
											<td><input id="subFullTelNo"  name="fullTelNo" type="text" class="form_readonly" style="width: 100%;"  readonly />
											<th class="bg-color-blue txt-color-white">E-MAIL</th>
											<td><input id="subEmailAddr" name="emailAddr" type="text" class="form_readonly" style="width: 100%;" readonly/></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Position</th>
											<td colspan="3"><input id="subPosition" name="position" type="text" class="form_readonly" style="width: 100%;" readonly /></td>
										</tr>									
										<tr>
											<th class="bg-color-blue txt-color-white">Base Address</th>
											<td colspan="3"><input id="subFullAddr" name="fullAddr" type="text" class="form_readonly" style="width: 100%;" readonly /></td>
										</tr>
										<tr>
											<th class="bg-color-blue txt-color-white">Install Address</th>
											<td colspan="3"><input id="subInstallAddr" name="installAddr" type="text" class="form_readonly" style="width: 100%;" readonly /></td>
										</tr>
									</table>
								</div>
							</div>
													
						</div>
					</div>
					
					<div class="tab-pane fade" id="s4">
						<div class="row">
							<div class="col-md-9" id="productEntrListDiv">
								<table id="productEntrList"></table>
								<div id="pagerOfproductEntrList"></div>
							</div>
							<div class="col-md-3" id="productDepositListDiv">
								<table id="productDepositList"></table>
								<div id="pagerOfproductDepositList"></div>
							</div>
						</div>
					</div>
					
					<div class="tab-pane fade" id="s5">
						<div class="row">
							<div class="col-md-7">
								<table id="deviceEntrList"></table>
								<div id="pagerOfdeviceEntrList"></div>
							</div>
							<div class="col-md-5">
								<table style="width: 100%;border : 0px solid red">
									<tr>
										<td width="48%"><table id="csCust00PlcyBenPList"></table></td>
										<td width="4%">&nbsp;</td>
										<td width="48%"><table id="csCust00PlcyBenSList"></table></td>
									</tr>
								</table>
							</div>
						</div>

					</div>
				
				</div>
			</div>			
		</div>
	</article>
	
	<article class="col-sm-12 col-md-12 col-lg-12">
		<div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="true" data-widget-custombutton="false">
			<header>
				<span class="widget-icon"><i class="fa fa-edit"></i></span>
				<h2>Counsel Information</h2>
			</header>
			<div class="widget-body">
				<div class="row-fluid">
					<div class="col-md-6">
						<div id="counselEntrListDiv">
							<table id="counselEntrList"></table>
							<div id="pagerOfcounselEntrList"></div>
						</div>
					</div>
					<div class="col-md-6" id="counselInfo">
						<table class="table table-condensed table-bordered">
							<colgroup>
								<col width="90PX" />
								<col width="130px" />
								<col width="80PX" />
								<col width="100px" />
								<col width="90PX" />
								<col width="90px" />
								<col width="170px" />
							</colgroup>
							<tr>
								<th class="bg-color-blue txt-color-white" required="required"><s:message code="ccs.csCccs000.taskHistoryListTable.lable.CustName"/></th>
								<td colspan="6" id="counselNames">
								<input type="text" style="width:140px" id="counselName" name="counselName"  required="required" title="<s:message code="ccs.csCccs000.taskHistoryListTable.lable.CustName"/>"/>&nbsp;
								<input type="text" style="width:140px" id="counselName2" name="counselName2"  title="<s:message code="ccs.cccs000_1.title.000007"/>"/>&nbsp;
								<input type="text" style="width:140px" id="counselName3" name="counselName3"  title="<s:message code="ccs.cccs000_1.title.000008"/>"/>&nbsp;
								<span class="btns3 save"><input type="submit" value="<s:message code="ccs.btn.000010"/>" id="crmLeadsButton" style="display:none;" /></span>
								</td>
								
							</tr>
				
							<tr id="trServiceType">
								<th class="bg-color-blue txt-color-white"><s:message code="cos.label.000121"/></th>
								<td colspan="6">
								<div id="serviceCodeControl"> 
								<c:forEach items="${serviceDomain}" var="svcDomain" varStatus="status">
									<input type="checkbox" id="counselSrvcCode_${status.index}" name="counselSrvcCode" value="${svcDomain.codeId}"/> <label for="counselSrvcCode_${status.index}" >${svcDomain.codeName}</label>
								</c:forEach>
								&nbsp;&nbsp;&nbsp;<span id="softPhoneCheck" style="display:none"><input type="checkbox" id="softPhoneCheckBox" name="softPhoneCheckBox"/> <s:message code="cs.label.000155"/>  <s:message code="cs.label.000166"/></span> 
								</div>	
								</td>	
												
							</tr>
							
							<tr>
								<th class="bg-color-blue txt-color-white"><s:message code="ccs.ccsWork006.CounselListGrid.lable.000001"/></th>
								<td><input id="counselId" name="counselId" type="text" class="form_disable"
									style="width: 100%;" readonly
									value="" /></td>
								<th class="bg-color-blue txt-color-white"><s:message code="bs.bs6.grid.000003"/></th>
								<td>
									<select id="counselStatus" name="counselStatus" title="<s:message code="ccs.cccs000_1.title.000004"/>" required="required" style="width:97%; border=1" class="form_select01">
									<option value="T"><s:message code="ccs.ccsWork004.orgGrid.lable.000001"/></option>
									<option value="R"><s:message code="ccs.ccsWork004.orgGrid.lable.000002"/></option>
									<option value="C"><s:message code="ccs.lable.000022"/></option>
									</select>
								</td>
								
								<input type="hidden" class="counsel_field" id="counselDivision" name="counselDivision" />
								<input type="hidden" class="counsel_field" id="counselTypeCd" name="counselTypeCd" />
								<input type="hidden" class="counsel_field" id="counselDtlCd" name="counselDtlCd" />
								<input type="hidden" class="counsel_field" id="counselDtlCd2" name="counselDtlCd2" />
								<input type="hidden" class="counsel_field" id="counselDtlCd3" name="counselDtlCd3" />
								<input type="hidden" class="counsel_field" id="counselDtlCd4" name="counselDtlCd4" />
								<input type="hidden" class="counsel_field" id="counselDtlCd5" name="counselDtlCd5" />
								<input type="hidden" class="counsel_field" id="counselDtlCd6" name="counselDtlCd6" />
								<input type="hidden" class="counsel_field" id="counselDtlCd7" name="counselDtlCd7" />
								<input type="hidden" class="counsel_field" id="counselDtlCd8" name="counselDtlCd8" />
								<input type="hidden" class="counsel_field" id="actMode" name="actMode" value=""/>
						        <input type="hidden" class="counsel_field" id="custNo" name="custNo" value=""/>
						        <input type="hidden" class="counsel_field" id="orderNum" name="orderNum" value=""/>
						        <input type="hidden" class="counsel_field" id="entrNo" name="entrNo" value=""/>
						        <input type="hidden" class="counsel_field" id="serviceType" name="serviceType" value=""/>
						        <input type="hidden" class="counsel_field" id="svcCd" name="svcCd" value=""/>
						        <input type="hidden" class="counsel_field" id="activitySeqNo" name="activitySeqNo" value=""/>
						        <input type="hidden" class="counsel_field" id="cccs000OfferYn" name="cccs000OfferYn" value=""/>
									
								<th class="bg-color-blue txt-color-white"><s:message code="ccs.ccs001.title.000002"/></th>
								<td colspan="2" style="height:24px"> <span id="maximizeBtn" class="btns7 save"><input type="submit" value="Type" /></span>
								    <b>
								    <%-- <span id="counselDivisionTxt"></span> <span id="counselDiv2"></span>
									<span id="counselTypeCdTxt"></span> <span id="counselType2"></span> --%>
									<span id="activityDesc"></span>
									</b>
								</td>			
							</tr>
							
							
							<tr>
								<th class="bg-color-blue txt-color-white"><s:message code="ccs.title.000016"/></th>
								<td><input type="number" class="form_normal01" id="counselTel" name="counselTel" title="<s:message code="cs.label.000108"/>"
									style="width: 100%;" required="required"/></td>
								<th class="bg-color-blue txt-color-white"><s:message code="ccs.lable.000014"/></th>
								<td>
									<div>
										<input type="checkbox" id="custType1" name="custType" value='1' checked/>&nbsp;Personal&nbsp; 
									</div>
									<div>
										<input type="checkbox" id="custType2" name="custType" value='2'/>&nbsp;Group&nbsp; 
									</div>
								</td>
								<th class="bg-color-blue txt-color-white"><s:message code="cs.label.000088"/></th>
								<td colspan="2">
									<input type="text" class="form_normal01"  style="width:75px" id="hopeDate" name="hopeDate"  readonly required="required" title="<s:message code="cs.label.000088"/>" placeholder="YYYY-MM-DD"/>&nbsp;
									<input type="text" class="form_normal01"  style="width:50px" id="hopeTime" name="hopeTime"  required="required"  placeholder="HH:MM" maxlength="6" title="<s:message code="cs.label.000088" />"/>
								</td>
							</tr>
							<tr id="trInstallAddr">
								<th class="bg-color-blue txt-color-white"><s:message code="ccs.csCccs000.subscriberList.lable.InstallAddress"/></th>
								<td colspan="6">
								 <span class="btns3 save"><input type="submit" value="<s:message code="ar.ar22.label.000001"/>" id="installAddrBtn" /></span>
								 <span class="btns3 save"><input type="submit" value="<s:message code="cs.label.000110"/>" id="crmCustRegstBtn"  style="display:none;"/></span>
								 <input type="text" class="form_readonly" id="fullAddr" name="fullAddr" style="width:70%;" readonly/>
								 <input type="hidden" id="addNum" name="addNum" />
								 <input type="hidden" id="custVilgAbvAddr" name="custVilgAbvAddr" />
								 <input type="hidden" id="custVilgBlwAddr" name="custVilgBlwAddr" />
								 <input type="hidden" id="doorCode" name="doorCode" />
								</td>									
							</tr>
							<tr id="trAsDate">
								<th class="bg-color-blue txt-color-white"><s:message code="ccs.cccs000_1.title.000005"/></th>
								<td colspan="6">
								 <input type="text" class="form_normal01"  style="width:140px" id="occurrenceDate" name="occurrenceDate"  readonly  title="<s:message code="ccs.cccs000_1.title.000005"/>" placeholder="YYYY-MM-DD"/>&nbsp;
								 <input type="text" class="form_normal01"  style="width:140px" id="occurrenceTime" name="occurrenceTime"  placeholder="hour:min ex)14:10" title="<s:message code="ccs.cccs000_1.title.000005"/>" maxlength="5"/>
								</td>									
							</tr>
						
							<tr>
								<th class="bg-color-blue txt-color-white"><s:message code="cs.label.policy.000010"/></th>
								<td colspan="3"><textarea class="form_normal01" id="custReq" name="custReq"
										style="width: 100%; height:30px" required="requiredx" title="<s:message code="cs.label.policy.000010"/>"></textarea>
								</td>
								<th class="bg-color-blue txt-color-white"><s:message code="ccs.ccsWork006_20130328.CounselListGrid.lable.000001"/></th>
								<td colspan="2"><textarea class="form_normal01" id="counselRes" name="counselRes" style="width: 100%; height:30px"></textarea>
								</td>
							</tr>				
							<tr>
								<th class="bg-color-blue txt-color-white"><s:message code="ccs.lable.000032"/></th>
								<td><input type="text" class="form_normal01"  style="width:140px" id="counselEndDate8" name="counselEndDate8"  readonly/> 
								</td>
								<th class="bg-color-blue txt-color-white">Offer</th>
								<td ><textarea id="crmOffersInCrm" style="display:none;"></textarea>
								<span class="btns3 save"><input type="submit" value="<s:message code="cos.title.000015"/>" id="cccs000getOfferBtn"/></span>  
								<span class="btns3 save"><input type="submit" value="<s:message code="ar.ar22.label.000001"/>" id="cccs000OfferBtn"/></span> 
								</td>
								<th class="bg-color-blue txt-color-white"><s:message code="ccs.cccs000.btn.label.000001"/></th>
								<td colspan="2"><img id="imgtransferBtn" src="<s:url value="/resources/images/btn/tiny_button_on.gif"/>" />
								     <span class="btns3 save"><input type="submit" value="<s:message code="ccs.cccs000.btn.label.000001"/>" id="cccs000TrnsBtn"/></span> 
								</td>
							</tr>
						</table>
						<div style="display:none"><table id="counselOffers" name="counselOffers" ></table></div>
						<div style="display:none"><table id="counselOrgOffers" name="counselOrgOffers" ></table></div>
						<div class="contents_box mt_5 both">
							<!-- 버튼 //-->
							<div class="f_right">
							    <span class="btns9 save"><input id="counselSatisFactionBtn" type="submit" value="<s:message code="ccs.btn.000013"/>" style="display:none"/></span>
							    <span class="btns9 save"><input id="counselProcessBtn" type="submit" value="<s:message code="bs.bs6.label.000011"/>" style="display:none"/></span>
							    <span class="btns9 save"><input type="submit" value="<s:message code="cmn.btn.save"/>" id="counselRegistBtn"/></span>
							    <span class="btns9 save"><input type="submit" value="<s:message code="ccs.btn.000014"/>" id="counselModifyBtn"/></span>
								<span class="btns7 save"><input type="submit" value="<s:message code="cmn.btn.new"/>" id="clearBtn"/></span>
							</div>
							<!--// 버튼 -->
						</div>
					</div>
				</div>
			</div>
		</div>
	
	</article>

</div>
<!-- END ROW -->

<script type="text/javascript">
// Rate - S

var getEntrNo = null;
var getCustNo = null;
var getCustRnmNo = null;
var checkSearchYN = 0;

initCodeListlist();

function initCodeListlist(){
	CODE.clear(); //기존에 가져온 코드데이타를 clear한다.
	CODE.push("SmsTypeCd", "CustomerLevel", "Position", "ImsiPrefix", "BusinessType","OcsSubStatus", "SttsCd","BillType", "SaleCd"); //조회하고자 하는 코드그룹을 설정한다.
	CODE.sync(); 
}

function searchEntranceInfo(entrNo){
	
	if ($("#withTerminated_0").is(":checked")){
		$("#withTerminated").val("Y");
	}else{
		$("#withTerminated").val("N");
	}
	if ($("#showSelectedOnly_0").is(":checked")){
		$("#showSelectedOnly").val("Y");
	}else{
		$("#showSelectedOnly").val("N");
	}
	if ($("#showSelectedTree_0").is(":checked")){
		$("#showSelectedTree").val("Y");
	}else{
		$("#showSelectedTree").val("N");
	}
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

function getCustormerGrade(pCustNo, pEntrNo){
	var custNo = pCustNo;
	var entrNo = pEntrNo;

	if ( custNo ==null || custNo=='' ){
		return;
	}
	
	//2013.03.20 수정
	$.ajax({
		type : "POST",  
		async : false,
		url : '<s:url value="/cs/getCustomerGradeFromCust"/>',
		data : { realCustNo:custNo , entrNo : entrNo},
		dataType : 'json',
		success : function(data) {
			if ( data.grade!=null && data.grade!='' ){
				data.grade = CODE.name('CustomerLevel',data.grade);
				$("#customerGrade").val(data.grade);
			}else{
				var grade = CODE.name('CustomerLevel',"4");
				$("#customerGrade").val(grade);
			}
		},	error:function(data){
		}, complete:function(jqXHR, textStatus){
		}
	});	
	
}

/* 메모  */
function clickMenu_dialog(menuObject){
	var entrNo = getEntrNo;
	var custNo = getCustNo;
	
	if(checkSearchYN == 1){
		Dialog.open({
			div : '#workHistoryDialog', 
			url : '<s:url value="/subscriber/listDialog?dialogName=workHistoryDialog&selectOp=subscriber&entrNo='+entrNo+'&custNo='+custNo+'"/>', 
			title :'Operator Work History', 
			width : 1000, 
			height : 800
		}); 
	}else{
		MessageBox.noti("Please run after a subscriber search");
	}
}

function clickMenu_customerChange(menuObject){
	var custNo = getCustNo;
	var custRnmNo = getCustRnmNo;
	
	if(checkSearchYN == 1){
		Dialog.open({
			div: '#customerChangeDialog',
			url: '<s:url value="/subscriber/customerChangeDialog?dialogName=customerChangeDialog&custNo='+custNo+'&custrnmNo='+custRnmNo+'"/>',
			title: 'Customer Change',
			width: 1500,
			height: 1000
		})
	}else{
		MessageBox.noti("Please run after a subscirber search");
	}
}
$("#searchEntrNo").focus();

$(function(e){
	pageSetUp(); //Default Call function
	pagefunction();
	
	function pagefunction(){
		
		run_jqgrid_function();
		loadScript(baseScriptUrl + '/co/form.custom.validator.js');
		
		//resizeJqGridWidth('subscriptionInCust','subscriptionInCustDiv_1',1600 );
		//resizeJqGridWidth('productEntrList','productEntrListDiv',1000 );
		//resizeJqGridWidth('productDepositList','productDepositListDiv',300 );
		//resizeJqGridWidth('deviceEntrList','deviceEntrListDiv',900 );
		
		
		function run_jqgrid_function() {
			$("#subscriptionInCust").jqGrid({
				mtype:'POST',
				datatype:'json',
				height:200,
				width:1600,
				colNames : [
							 	'SID'   
					            ,'Real Customer'
					            ,'Service No.'            
								,'aceno'             
								,'Billing No.'      
								,'Convergence No.'
								,'cnvgKdNm'
								,'Bill Type'
								,'svcCd'            
								,'Service'           
								,'Product'           
								,'CID'            
								,'Customer Name'            
								,'SSN'        
								,'Business No.'          
								,'bizRegNm'         
								,'Reg. Date'
								,'Status Cd'        
								,'Status'
								,'OCS Status'
								,'Status Rsn'
								,'Status Date'
								,'Install Address' 
								,'entrSttsChngRsnCd'  
								,'entrSttsChngRsnDt' 
								,'estbAddrNo'       
								,'cnvgKdCd' 
								,'entrSttsChngRsnDtlCd'
								,'ppayEntrDvCd'
								,'IMSI No'
								,'realUserCustNo'
				            ],
				colModel : [ 
				              { name : 'entrNo',            index : 'entrNo',           	sorttype : "string", width:'70', align:"center"} 
				             ,{ name : 'rlusrCustNm',       index : 'rlusrCustNm',       	sorttype : "string", width:'130' ,align:"left" }
				             ,{ name : 'prodNo',            index : 'prodNo',           	sorttype : "string", width:'70', align:"center"} 
				             ,{ name : 'aceno',             index : 'aceno',            	sorttype : "string", align:"left", hidden:true}
				             ,{ name : 'billAcntNo',        index : 'billAcntNo',       	sorttype : "string", width:'70', align:"center"}
				             ,{ name : 'cnvgNo',            index : 'cnvgNo',           	sorttype : "string",  width:'80', align:"center"}
				             ,{ name : 'cnvgKdNm',          index : 'cnvgKdNm',         	width : "100", sorttype : "string", align:"left"}
				             ,{ name : 'ppayEntrDvNm',      index : 'ppayEntrDvNm',       	sorttype : "string", align:"center", width:'70',}
				             ,{ name : 'svcCd',             index : 'svcCd',            	sorttype : "string", align:"left", hidden:true}
				             ,{ name : 'svcNm',             index : 'svcNm',            	sorttype : "string", width:'80', align:"left"}
				             ,{ name : 'prodNm',            index : 'prodNm',            	sorttype : "string", width:'80', align:"left"}
				             ,{ name : 'custNo',            index : 'custNo',           	sorttype : "string", align:"left", hidden:true}
				             ,{ name : 'custNm',            index : 'custNm',           	sorttype : "string", align:"left", hidden:true}
				             ,{ name : 'custrnmNo',         index : 'custrnmNo',        	sorttype : "string", align:"left", hidden:true}
				             ,{ name : 'bsRegNo',           index : 'bsRegNo',          	sorttype : "string", align:"left", hidden:true}
				             ,{ name : 'bizRegNm',          index : 'bizRegNm',         	sorttype : "string", align:"left", hidden:true}
				             ,{ name : 'frstEntrDttm',      index : 'frstEntrDttm',     	sorttype : "string", width:'120', align:"center" /* formatter : barPlus */}
				             ,{ name : 'entrSttsCd',        index : 'entrSttsCd',       	sorttype : "string", align:"left", hidden:true}
				             ,{ name : 'entrSttsNm',        index : 'entrSttsNm',       	sorttype : "string", width:'70', align:"center"}
				             ,{ name : 'ocsSttsNm',         index : 'ocsSttsNm',       		sorttype : "string", width:'70', align:"center"}
				             ,{ name : 'entrSttsChngRsnNm', index : 'entrSttsChngRsnNm',	sorttype : "string", width:'80',align:"left"}
				             ,{ name : 'entrChngDttm', 		index : 'entrChngDttm',			sorttype : "string", width:'120', align:"center"/* ,  formatter : barPlus */}
				             ,{ name : 'fullAddr',          index : 'fullAddr',         	sorttype : "string",  width:'290', align:"left"}
				             ,{ name : 'entrSttsChngRsnCd', index : 'entrSttsChngRsnCd',	sorttype : "string", align:"left", hidden:true}
				             ,{ name : 'entrSttsChngRsnDt', index : 'entrSttsChngRsnDt',	sorttype : "string", align:"left", hidden:true}
				             ,{ name : 'estbAddrNo',        index : 'estbAddrNo',       	sorttype : "string", align:"left", hidden:true}
				             ,{ name : 'cnvgKdCd',          index : 'cnvgKdCd',         	width : "100", sorttype : "string", align:"left", hidden:true}	             
				             ,{ name : 'entrSttsChngRsnDtlCd',          index : 'entrSttsChngRsnDtlCd',         	width : "100", sorttype : "string", align:"left" , hidden:true}
				             ,{ name : 'ppayEntrDvCd',      index : 'ppayEntrDvCd',       	width : "100", sorttype : "string", align:"left" , hidden:true}
				             ,{ name : 'imsiNo',            index : 'imsiNo',       	width : "100", sorttype : "string", align:"left" , hidden:true}
				             ,{ name : 'rlusrCustNo',       index : 'rlusrCustNo',       	width : "100", sorttype : "string", align:"left" , hidden:true}
				            
				             ],
			    pager: "#pagerOfsubscriptionInCust",
	            multiselect : false,
	         	viewrecords : true,
	         	shrinkToFit : false,
	            onSelectRow: function (id, status) {

	         	}
				
			});
			
			$("#productEntrList").jqGrid({
				mtype:"POST",
				datatype: "json",
				height: 120,
				width : 1000,
			   	colNames:[  'prodCd'
			   	          , 'svcKdCd'
			   	          , 'Product'
			   	          , 'Type'
			   	       	  , 'Status'
			   	          , 'Start Date'
			   	          , 'End Date'
			   	          , 'Monthly Fee'
			   	          , 'Treatment'
			   	          , 'Treatment Yn' 
			   	          , 'Treatment Day' 
			   	          , 'Threshold Yn'
			   	          , 'cfu_no'
			   	          , 'loanPassword'
			   	          , 'prodDvCd'
			   	          , 'dscntPlcyNo'
			   	          , 'devByEntrSeqno'
			   	         ],
			   	colModel:[
							{ name : 'prodCd',          	  index : 'prodCd',             hidden:true} 
						   ,{ name : 'svcKdCd',          	  index : 'svcKdCd',            hidden:true}
						   ,{ name : 'prodName',          	  index : 'prodName',           sorttype : "string", align:"left" , width:"120"} 
						   ,{ name : 'svcKdNm',           	  index : 'svcKdNm',           	sorttype : "string", align:"center", width:"50"}
						   ,{ name : 'svcSttsNm',         	  index : 'svcSttsNm',      	sorttype : "string", align:"center", width:"70"}
						   ,{ name : 'svcFrstStrtDttm',       index : 'svcFrstStrtDttm',    sorttype : "string", align:"center", width:"70"/* , formatter : barPlus */}
						   ,{ name : 'svcEndDttm',       	  index : 'svcEndDttm',       	sorttype : "string", align:"center", width:"70"/* , formatter : barPlus */}
						   ,{ name : 'monthlyFee',        	  index : 'monthlyFee',       	sorttype : "string", align:"right", width:"75"/* , formatter : 'currency', formatoptions: {thousandsSeparator: ',', decimalPlaces: 0} */}
						   ,{ name : 'treatment',        	  index : 'treatment',       	sorttype : "string", align:"right", width:"65"/* , formatter : 'currency', formatoptions: {thousandsSeparator: ',', decimalPlaces: 0} */}
						   ,{ name : 'treatmentYn',        	  index : 'treatmentYn',       	sorttype : "string", align:"right", width:"85"}
						   ,{ name : 'limitDay',        	  index : 'limitDay',       	sorttype : "string", align:"right", width:"85"}
						   ,{ name : 'thresholdYn',        	  index : 'thresholdYn',       	sorttype : "string", align:"right", width:"85"}
						   ,{ name : 'cfuNo',        	  	  index : 'cfuNo',       	    hidden : true}
						   ,{ name : 'loanPassword',          index : 'loanPassword',       sorttype : "string", align:"right", width:"85"}
						   ,{ name : 'prodDvCd',        	  index : 'prodDvCd',       	hidden : true}
						   ,{ name : 'dscntPlcyNo',        	  index : 'dscntPlcyNo',       	hidden : true}
						   ,{ name : 'devByEntrSeqno',        index : 'devByEntrSeqno',     hidden : true}
						],
				pager: '#pagerOfproductEntrList',
			   	multiselect: false,
			   	viewrecords: true,
			   	shrinkToFit: false
			});
			
			$("#productDepositList").jqGrid({
				mtype:"POST",
				datatype: "json",
				height: 120,
				width : 300,
			   	colNames:[	'Product' 
			   	          , 'Name' 
			   	          , 'Deposit' 
			   	          , 'Threshold'
			   	         ],
			   	colModel:[
							{ name : 'prodName',            index : 'prodName',           	hidden : true} 
						   ,{ name : 'ftrName',             index : 'ftrName',           	sorttype : "string", align:"left"} 
						   ,{ name : 'deposit',             index : 'deposit',              sorttype : "string", align:"right", width:"60"/* , formatter : 'currency', formatoptions: {thousandsSeparator: ',', decimalPlaces: 0} */} 
						   ,{ name : 'threshold',           index : 'threshold',           	sorttype : "string", align:"right", width:"60"/* , formatter : 'currency', formatoptions: {thousandsSeparator: ',', decimalPlaces: 0} */}
			   			],
			   	pager:"#pagerOfproductDepositList",
			   	multiselect: false,
			   	viewrecords: true,
			   	shrinkToFit: false
			});
			
			$("#deviceEntrList").jqGrid({
				mtype:"POST",
				datatype: "json",
				height: 120,
				width : 900,
			   	colNames :[		
			   	           		'Status' //Status
			   	           ,	'Entr No ' //Entr No 
			   	           ,	'Service Name  ' //Service Name  
			   	           , 	'Model' //Model 
			   	           , 	'Serial Number' //Serial Number 
			   	           ,	'Sale Type' //Sale Type 
			   	           ,	'Deposit' //Deposit
			   	           ,	'Agreement' //약정기간
			   	           ,	'Sale' //판매금액
			   	           ,	'Cash' //선납금액
			   	           ,	'Lease' //할부기간
			   	           ,	'Lease Fee' //월할부금액
			   	           ,	'Regist Date' //월할부금액
			   	           ,	'Lease End Date' //할부종료일
			   	           ,	'Remaining Lease Months' //잔여할부개월
			   	           ,	'Remaining Lease Amount' //잔여할부개금액
			   	           ,	'dscntPlcyNo' //관련 정책번호
			   	           ,	'devByEntrSeqno' //장비번호
			   	          ],  
			    colModel :[ 
				              { name : 'devcSttsNm',         index : 'devcSttsNm',     sorttype : "string", align:"center", width:"50"} 
				             ,{ name : 'entrNo',             index : 'entrNo',         sorttype : "string", align:"left", hidden:true} 
				             ,{ name : 'prodName',           index : 'prodName',       sorttype : "string", align:"left", hidden:true}
				             ,{ name : 'devcMdlNm',          index : 'devcMdlNm',      sorttype : "string", align:"left", width:"100"}
				             ,{ name : 'devcNo',             index : 'devcNo',         sorttype : "string", align:"left", width:"100"}
				             ,{ name : 'eqipSaleCd',         index : 'eqipSaleCd',     sorttype : "string", align:"left", width:"65"}
				             ,{ name : 'deposit',         	 index : 'deposit',        sorttype : "string", align:"right", width:"80"/*, formatter : 'currency', formatoptions: {thousandsSeparator: ',', decimalPlaces: 0}*/}
				             ,{ name : 'agmtMnbr',         	 index : 'agmtMnbr',       sorttype : "string", align:"right", width:"80"}
				             ,{ name : 'saleAmt',         	 index : 'saleAmt',        sorttype : "string", align:"right", width:"80"/*, formatter : 'currency', formatoptions: {thousandsSeparator: ',', decimalPlaces: 0}*/}
				             ,{ name : 'cashSaleAmt',        index : 'cashSaleAmt',    sorttype : "string", align:"right", width:"80"/*, formatter : 'currency', formatoptions: {thousandsSeparator: ',', decimalPlaces: 0}*/}
				             ,{ name : 'insttMnbr',          index : 'insttMnbr',      sorttype : "string", align:"right", width:"80"}
				             ,{ name : 'insttSaleAmt',       index : 'insttSaleAmt',   sorttype : "string", align:"right", width:"80"/*, formatter : 'currency', formatoptions: {thousandsSeparator: ',', decimalPlaces: 0}*/}
				             ,{ name : 'devRgstDt',	    	 index : 'devRgstDt', 	   align:'center' , width:'80'}
				             ,{ name : 'leaseEndDt',	     index : 'leaseEndDt',   	align:'right' , width:'80'}
				             ,{ name : 'monthRemainLease',	 index : 'monthRemainLease',align:'right' , width:'80'}
				             ,{ name : 'remainLeaseAmt',	 index : 'remainLeaseAmt',	align:'right' , width:'80'/*, formatter : 'currency', formatoptions: {thousandsSeparator: ',', decimalPlaces: 0}*/}
				             ,{ name : 'dscntPlcyNo',	     index : 'dscntPlcyNo', 	hidden : true}
				             ,{ name : 'devByEntrSeqno',	 index : 'devByEntrSeqno', 	hidden : true}
				 		  ],
			   	multiselect: false,
			   	shrinkToFit: false,
			   	viewrecords: true,
			   	onSelectRow: function (rowId, status) {
					/*
			   		$("#csCust00PlcyBenPList").jqGrid("clearGridData", true);
				   	$("#csCust00PlcyBenSList").jqGrid("clearGridData", true);
			   		$("#csCust000SearchDiv").searching();
			   		var deviceList = $("#deviceEntrList").jqGrid('getRowData', rowId) ;	
			   		var entrNo = $("#subscriptionCustomerSearchForm #entrNo").val();
			   		var url = "cs/plcy/policyList?entrNo="+entrNo;
			   		$.ajax({
			   			type : "GET",  
			   			async : true,
			   			url : url,
			   			dataType : 'json',
			   			data : "",
			   			success : function(data) {
			   				//gf_console.json("policy list", data);
			   				if(data.list.length>0){
			   					for(var i = 0; i < data.list.length; i++) {
			   						if(data.list[i].plcySeqno == deviceList.dscntPlcyNo){
				   						var chngdate = gf_getTodayDate(data.list[i].svcDutyUseStrtDt, '-');
				   						data.list[i].svcDutyUseStrtDt = chngdate;
				   						chngdate = gf_getTodayDate(data.list[i].svcDutyUseEndDt, '-');
				   						data.list[i].svcDutyUseEndDt = chngdate;
				   						
				   				   		$("#csCust000PlcyName").text(data.list[i].plcyName ); //+ " ["+ data.list[i].svcDutyUseStrtDt + " ~ " + data.list[i].svcDutyUseEndDt +"]"
				   				   		
				   				   		var products = gf_getAllGridData("#productEntrList");
					   				   	for(var k=0; k < products.length;k++){
					   				   		//benefit으로 부여받은 상품이 현재 살아 있을때만 benfit으로 보여준다.
				   				   			if(products[k].devByEntrSeqno == deviceList.devByEntrSeqno){
				   				   				var benefit = {plcyBenefitCd:'', plcyBenefitName:'', restrictYn:'', restrictPeriod :''};
				   				   				benefit.plcyBenefitCd = products[k].prodCd ;
				   				   				benefit.plcyBenefitName = products[k].prodName ;
				   				   				//alert(JSON.stringify(data.list[i].benefits));
				   				   				var benefitInfo = getBenefitInfo(data.list[i].benefits);
				   				   				if(benefitInfo != null){
					   				   				benefit.restrictYn = benefitInfo.restrictYn;
					   				   				benefit.restrictPeriod = benefitInfo.restrictPeriod;	
				   				   				}
				   				   				
				   				   				gf_addGridList("#csCust00PlcyBenPList", benefit);
				   				   			}
				   				   		}
					   				   	
					   					var discountEntrList = gf_getAllGridData("#discountEntrList");
					   				   	for(var k=0; k < discountEntrList.length;k++){
					   				   		//등록된 할인중 장비 시퀀스가 동일한 할인에 대해서만.. 
				   				   			if(discountEntrList[k].devSaleSeqno == deviceList.devByEntrSeqno){
				   				   				var discntInfo = {plcyBenefitCd:'', plcyBenefitName:''};
				   				   				discntInfo.plcyBenefitCd = discountEntrList[k].dscntSvcCd ;
				   				   				discntInfo.plcyBenefitName = discountEntrList[k].dscntSvcCd ;
				   				   				gf_addGridList("#csCust00PlcyBenSList", discntInfo);
				   				   			}
				   				   		}
				   				
			   						}
			   					}
			   				};

			   			},	error:function(data){
			   				//서버 비정상 동작시 구현
			   				MessageBox.error(data, "err.500");
			   				
			   			}, complete:function(jqXHR, textStatus){
			   				$("#csCust000SearchDiv").complete();
			   			}
			   		});	*/   
			   	},
				pager : "#pagerOfdeviceEntrList"
			});
			
			$("#counselEntrList").jqGrid({
				mtype: "POST",
				datatype: "json",
				height: 180,
				width:750,
			   	colNames:[
			   	            "Counsel No"
			   	          ,'Process' //Process Status
			   	          , "Counsel Div"
			   	          , "Counsel Type"
			   	          ,'Counsel Detail' //"Counsel Detail"
			   	          , "Counsel Detail2"
			   	          , "Counsel Detail3"
			   	          , "Counsel Detail4"
			   	          , "Counsel Detail5"
			   	          , "Counsel Detail6"
			   	          , "Counsel Detail7"
			   	          , "Counsel Detail8"
			   	          , "activityDesc"
			   	          ,'Cust No' //"Cust No"
			   	          ,'Cust name' //"Cust name"
			   	          ,'Cust name2' //"Cust name2"
			   	          ,'Cust name3' //"Cust name3"
			   	          ,'Comment' //"Comment"
			   	          ,'Receipt Date' //"Receipt Date"
			   	          ,'End Date' //"End Date" 
			   	          , "Hope Date"
			   	          , "Hope Time"
			   	          , "Counsel Tel"
			   	          , "Answer"
			   	          , "counselDivision"
			   	          , "counselDivision2"
			   	          , "counselDivision3"
			   	          , "counselDivision4"
			   	          , "counselDivision5"
			   	          , "counselDivision6"
			   	          , "counselDivision7"
			   	          , "counselDivision8"
			   	          , "counselDivision9"
			   	          , "counselDivision10"
			   	          , "counselStatus"
			   	          , "entrNo"
			   	          , "orderNum"
			   	          , "custType"
			   	          , "serviceType"
			   	          , "svcCd"
			   	          , 'activityCd'
			   	          , 'addNum'
			   	          , 'custVilgAbvAddr'
			   	          , 'custVilgBlwAddr'
			   	          , 'activitySeqNo'
			   	          , 'occurrenceDate'
			   	          , 'occurrenceTime'
			   	          , 'satisfactionYn'
			   	          , 'doorCode'
			   	          , 'softPhoneCheck'
			   	         ],
			   	colModel:[
			   		{name:'counselId',index:'counselId',  sorttype:"string", width:"100", hidden:true},
			   		{name:'counselStatusText',index:'counselStatusText',  sorttype:"string" , width:"100" , align:"left"},	
			   		{name:'counselDivisionText',index:'counselDivisionText',  sorttype:"string" , width:"100" , hidden:true},
			   		{name:'counselTypeCdText',index:'counselTypeCdText',  sorttype:"string" , width:"100" , hidden:true},
			   		{name:'counselDtlCdText',index:'counselDtlCdText',  sorttype:"string" , width:"100", align:"left"},	
			   		{name:'counselDtlCd2Text',index:'counselDtlCd2Text',  hidden:true},	
			   		{name:'counselDtlCd3Text',index:'counselDtlCd3Text',  hidden:true},	
			   		{name:'counselDtlCd4Text',index:'counselDtlCd4Text',  hidden:true},	
			   		{name:'counselDtlCd5Text',index:'counselDtlCd5Text',  hidden:true},	
			   		{name:'counselDtlCd6Text',index:'counselDtlCd6Text',  hidden:true},	
			   		{name:'counselDtlCd7Text',index:'counselDtlCd7Text',  hidden:true},	
			   		{name:'counselDtlCd8Text',index:'counselDtlCd8Text',  hidden:true},	
			   		{name:'activityDesc',index:'activityDesc',  hidden:true},	
			   		{name:'custNo',index:'custNo',  sorttype:"string" , width:"100", align:"left"},
			   		{name:'counselName',index:'counselName',  sorttype:"string" , width:"100", align:"left"} ,
			   		{name:'counselName2',index:'counselName2',  sorttype:"string" , width:"100", align:"left"} ,
			   		{name:'counselName3',index:'counselName3',  sorttype:"string" , width:"100", align:"left"} ,
			   		{name:'custReq',index:'custReq',  sorttype:"string" , width:"150", align:"left"},
			   		{name:'regDate',index:'regDate',  sorttype:"string" , width:"120", align:"left"},
			   		{name:'counselEndDate8',index:'counselEndDate8',  sorttype:"string" , width:"120", align:"left"} ,	   		
			   		{name:'hopeDate',index:'hopeDate',  hidden:true},
			   		{name:'hopeTime',index:'hopeTime',  hidden:true},
			   		{name:'counselTel',index:'counselTel',  hidden:true},
			   		{name:'counselRes',index:'counselRes',  hidden:true} ,
			   		{name:'counselDivision',index:'counselDivision',  hidden:true},
			   		{name:'counselTypeCd',index:'counselTypeCd',  hidden:true},
			   		{name:'counselDtlCd',index:'counselDtlCd',  hidden:true},
			   		{name:'counselDtlCd2',index:'counselDtlCd2',  hidden:true},
			   		{name:'counselDtlCd3',index:'counselDtlCd3',  hidden:true},
			   		{name:'counselDtlCd4',index:'counselDtlCd4',  hidden:true},
			   		{name:'counselDtlCd5',index:'counselDtlCd5',  hidden:true},
			   		{name:'counselDtlCd6',index:'counselDtlCd6',  hidden:true},
			   		{name:'counselDtlCd7',index:'counselDtlCd7',  hidden:true},
			   		{name:'counselDtlCd8',index:'counselDtlCd8',  hidden:true},
			   		{name:'counselStatus',index:'counselStatus',  hidden:true},
			   		{name:'entrNo',index:'entrNo',  hidden:true},
			   		{name:'orderNum',index:'orderNum',  hidden:true},
			   		{name:'custType',index:'custType',  hidden:true},
			   		{name:'serviceType',index:'serviceType',  hidden:true},
			   		{name:'svcCd',index:'svcCd',  hidden:true},
			   		{name:'activityCd',index:'activityCd',  hidden:true},
			   		{name:'addNum',index:'addNum',  hidden:true},
			   		{name:'custVilgAbvAddr',index:'custVilgAbvAddr',  hidden:true},
			   		{name:'custVilgBlwAddr',index:'custVilgBlwAddr',  hidden:true},
			   		{name:'activitySeqNo',index:'activitySeqNo',  hidden:true},
			   		{name:'occurrenceDate',index:'occurrenceDate',  hidden:true},
			   		{name:'occurrenceTime',index:'occurrenceTime',  hidden:true},
			   		{name:'satisfactionYn',index:'satisfactionYn',  hidden:true},
			   		{name:'doorCode',index:'doorCode',  hidden:true},
			   		{name:'softPhoneCheck',index:'softPhoneCheck',  hidden:true}
			   	],
			   	multiselect: false,
			   	viewrecords: true,
			   	shrinkToFit: false,
			   	onSelectRow: function (ids) {
			   		$("#csCust000SearchDiv").loading();
			   		$("#counselInfo").find(":input").not(":checkbox").not(":submit").val("");
			   		$("#counselInfo").find(":input").not(":submit").removeAttr('disabled');
			   		
			   		$("[name=counselSrvcCode]:checked").each(function(e){
			   			$(this).attr('checked',false);
			   		});
			   		
		        	var rowId = jQuery("#counselEntrList").jqGrid('getGridParam','selrow');
		    		var rowData = $("#counselEntrList").getRowData(rowId);
		    		var hopeDate = '' ;
		    		var counselEndDate8 = '';
		    		if(rowData.hopeDate !=''){
		    		    hopeDate = rowData.hopeDate.substr(0,4)+"-"+rowData.hopeDate.substr(4,2)+"-"+rowData.hopeDate.substr(6,2);
		    		}
		    		if(rowData.counselEndDate8!=''){
		 		    	counselEndDate8 = rowData.counselEndDate8.substr(0,4)+"-"+rowData.counselEndDate8.substr(4,2)+"-"+rowData.counselEndDate8.substr(6,2);
		 		    }
		    		
		    		$("#counselDiv2").show();	
					$("#counselType2").show();	
					
		    		$("#counselInfo").find("[id=counselId]").val(rowData.counselId);
		    		$("#counselInfo").find("[id=counselStatus]").val(rowData.counselStatus);    		
		    		$("#counselInfo").find("[id=counselDivision]").val(rowData.counselDivision);
		    		$("#counselInfo").find("[id=counselTypeCd]").val(rowData.counselTypeCd);
		    		$("#counselInfo").find("[id=counselDtlCd]").val(rowData.counselDtlCd);
		    		$("#counselInfo").find("[id=counselDtlCd2]").val(rowData.counselDtlCd2);
		    		$("#counselInfo").find("[id=counselDtlCd3]").val(rowData.counselDtlCd3);
		    		$("#counselInfo").find("[id=counselDtlCd4]").val(rowData.counselDtlCd4);
		    		$("#counselInfo").find("[id=counselDtlCd5]").val(rowData.counselDtlCd5);
		    		$("#counselInfo").find("[id=counselDtlCd6]").val(rowData.counselDtlCd6);
		    		$("#counselInfo").find("[id=counselDtlCd7]").val(rowData.counselDtlCd7);
		    		$("#counselInfo").find("[id=counselDtlCd8]").val(rowData.counselDtlCd8);
		    		$("#counselInfo").find("[id=activityDesc]").text(rowData.activityDesc);
		    		$("#counselInfo").find("[id=custNo]").val(rowData.custNo);
		    		$("#counselInfo").find("[id=hopeDate]").val(rowData.hopeDate);
		    		$("#counselInfo").find("[id=hopeTime]").val(rowData.hopeTime);
		    		$("#counselInfo").find("[id=custReq]").val(rowData.custReq);
		    		$("#counselInfo").find("[id=counselRes]").val(rowData.counselRes); 
		    		$("#counselInfo").find("[id=orderNum]").val(rowData.orderNum); 
		    		$("#counselInfo").find("[id=entrNo]").val(rowData.entrNo); 
		    		$("#counselInfo").find("[id=counselEndDate8]").val(rowData.counselEndDate8); 
		    		$("#counselInfo").find("[id=counselName]").val(rowData.counselName); 
		    		$("#counselInfo").find("[id=counselName2]").val(rowData.counselName2); 
		    		$("#counselInfo").find("[id=counselName3]").val(rowData.counselName3); 
		    		$("#counselInfo").find("[id=counselTel]").val(rowData.counselTel); 
		    		$("#counselInfo").find("[id=custType]").val(rowData.custType); 
		    		$("#counselInfo").find("[id=svcCd]").val(rowData.svcCd); 
		    		$("#counselInfo").find("[id=actMode]").val(rowData.activityCd); 
		    		$("#counselInfo").find("[id=addNum]").val(rowData.addNum); 
		    		$("#counselInfo").find("[id=custVilgAbvAddr]").val(rowData.custVilgAbvAddr); 
		    		$("#counselInfo").find("[id=custVilgBlwAddr]").val(rowData.custVilgBlwAddr); 
		    		$("#counselInfo").find("[id=fullAddr]").val(rowData.custVilgAbvAddr +" "+rowData.custVilgBlwAddr); 
		    		$("#counselInfo").find("[id=activitySeqNo]").val(rowData.activitySeqNo); 
		    		$("#counselInfo").find("[id=occurrenceDate]").val(rowData.occurrenceDate); 
		    		$("#counselInfo").find("[id=occurrenceTime]").val(rowData.occurrenceTime); 
		    		$("#counselInfo").find("[id=doorCode]").val(rowData.doorCode); 
		    		
		    		if ( rowData.custType =='1' || rowData.custType == ''){
		    			$("#custType1").attr('checked',true);
		    			$("#custType2").attr('checked',false);
		    		}else if ( rowData.custType =='2'){
		    			$("#custType2").attr('checked',true);
		    			$("#custType1").attr('checked',false);
		    		}
		    		
		    		if ( rowData.serviceType !=''){
		    			var srvcCodes = rowData.serviceType.split(",");
		    			for ( var i=0 ; i < srvcCodes.length ; i ++){
		    				$("[id^=counselSrvcCode_]").each(function (e){
		    					if ( $(this).val() == srvcCodes[i]){
		    						$(this).attr('checked',true);
		    					}
		    				});
		    			}
		    		}  
		    		if ( rowData.softPhoneCheck =='Y'){
		    			$("#counselInfo #softPhoneCheckBox").attr('checked',true);
		    		}else{
		    			$("#counselInfo #softPhoneCheckBox").attr('checked',false);
		    		}
		    		
		    		$("#counselInfo").find("[id=serviceType]").val(rowData.serviceType); 
		    		
		    		
		    		if( $("#counselInfo #actMode").val() == null || $("#counselInfo #actMode").val()=='' || $("#counselInfo #actMode").val()=='&nbsp;' ){
		    			$("#counselProcessBtn").hide();
		    		}else{
		    			$("#counselProcessBtn").val($("#counselInfo #activityDesc").text());
		    			//$("#counselProcessBtn").show();;//아래에서 제어됨
		    		}
		    		if ( $("#actMode").val() =='AS'){
		    			$("#trAsDate").show();
		    		}else{
		    			$("#trAsDate").hide();
		    		}
		    		if ( $("#actMode").val() =='NAC' || $("#actMode").val() =='NAA'){
		    			$("#trServiceType").show();
		    			
		    			
		    			var checkedSvcCdLength = $("#counselInfo [name=counselSrvcCode]:checked").length ;
		    			var includeMobileService = false ;
		    			var includeVoipService = false ;
		    			var onlyMobile = false ;
		    			$("#counselInfo [name=counselSrvcCode]:checked").each(function(e){
		    				if($(this).val() == '2'){
		    					includeMobileService = true ;
		    				}
		    				if($(this).val() == '5'){
		    					includeVoipService = true ;
		    				}
		    			});
		    			
		    			//mobile 단독일 경우에는 설치 주소 체크 안함
		    			if ( checkedSvcCdLength > 0 ){
		    				if(includeMobileService &&  checkedSvcCdLength == 1){
		    					onlyMobile = true ;
		    				}else{
		    					onlyMobile = false ;
		    				}
		    				
		    				if(!onlyMobile){
		    					if((includeVoipService &&  checkedSvcCdLength == 1) || (includeMobileService &&  includeVoipService &&  checkedSvcCdLength == 2)){
		    						$("#counselInfo #softPhoneCheck").show();
		    						if ( $("#counselInfo #softPhoneCheckBox").attr('checked') == 'checked'){
		    							$("#counselInfo #trInstallAddr").hide();
		    						}else{
		    							$("#counselInfo #trInstallAddr").show();
		    						}
		    					}else{
		    						$("#counselInfo #softPhoneCheck").hide();
		    						$("#counselInfo #softPhoneCheckBox").attr('checked',false);
		    						$("#counselInfo #trInstallAddr").show();
		    					}
		    					/* if( rowData.hopeDate == null || rowData.hopeDate==''){
		    						$("#counselInfo #hopeDate").val(getTodayDate(1));
		    					} */
		    				}else{
		    					$("#counselInfo #softPhoneCheck").hide();
		    					$("#counselInfo #softPhoneCheckBox").attr('checked',false);
		    					$("#trInstallAddr").hide();
		    					$("#counselInfo #addrNum").val("");
		    					$("#counselInfo #custVilgAbvAddr").val("");
		    					$("#counselInfo #custVilgBlwAddr").val("");
		    					$("#counselInfo #fullAddr").val(""); 
		    					/* if( rowData.hopeDate == null || rowData.hopeDate!=''){
		    						$("#counselInfo #hopeDate").val(getTodayDate());
		    					} */
		    				}
		    			}else{
		    				$("#counselInfo #softPhoneCheck").hide();
		    				$("#counselInfo #softPhoneCheckBox").attr('checked',false);
		    				$("#trInstallAddr").hide();
		    				$("#counselInfo #addrNum").val("");
		    				$("#counselInfo #custVilgAbvAddr").val("");
		    				$("#counselInfo #custVilgBlwAddr").val("");
		    				$("#counselInfo #fullAddr").val("");
		    				/* if( rowData.hopeDate == null || rowData.hopeDate!=''){
			    				if ( marketCode =='1'){
			    					$("#counselInfo #hopeDate").val(getTodayDate());
			    				}else{
			    					$("#counselInfo #hopeDate").val(getTodayDate(1));
			    				}
		    				} */
		    			}
		    			
		    		}else{
		    			
		    			$("[name=counselSrvcCode]:checked").each(function(e){
		    				$(this).attr('checked',false);
		    			});
		    			$("#trServiceType").hide();
		    			$("#trInstallAddr").hide();
		    			$("#counselInfo #softPhoneCheck").hide();
						$("#counselInfo #softPhoneCheckBox").attr('checked',false);
		    		}
		    		
		    		
		    		if ( rowData.counselStatus=="C"){
		    			$("#counselInfo").find(":input").not(":submit").attr('disabled','disabled');
		    			$("#counselRegistBtn").hide();
		    			$("#counselProcessBtn").hide(); 
		    			
		    			$("#cccs000getOfferBtn").show();
						$("#cccs000OfferBtn").hide();
						$("#cccs000TrnsBtn").hide();
						$("#imgtransferBtn").hide();
						$("#installAddrBtn").hide();
						if ( rowData.satisfactionYn =='N'){
							$("#counselSatisFactionBtn").show();
						}else{
							$("#counselSatisFactionBtn").hide();
						}
		    		}else{
		    			$("#counselSatisFactionBtn").hide();
		    			if ( rowData.counselDivision =='A003'){
		        			$("#counselInfo").find(":input").not(":submit").attr('disabled','disabled');
		        			$("#counselRegistBtn").hide();
		        			
		        			$("#cccs000getOfferBtn").hide();
							$("#cccs000OfferBtn").hide();
							//$("#cccs000TrnsBtn").show();//아래에서 제어됨
							$("#imgtransferBtn").show();
							$("#installAddrBtn").hide();
		        		}else{
		        			$("#counselInfo").find(":input").not(":submit").removeAttr('disabled');
		        			//$("#counselRegistBtn").show();
		        			$("#maximizeBtn").show();
		        			
		        			//$("#cccs000getOfferBtn").show();
		    				//$("#cccs000OfferBtn").show();
		    				//$("#cccs000TrnsBtn").show();;//아래에서 제어됨
		    				$("#imgtransferBtn").show();
		    				$("#installAddrBtn").show();
		        		}
		    		}
		    		$("#maximizeBtn").hide();
		    		
					// getCrmOfferByCounselId(rowData.counselId);    		
		    		// getControlButton(rowData.counselId,rowData.counselDivision,rowData.activityCd,rowData.counselStatus,rowData.satisfactionYn);
		    		
		    		//var check = setInterval(function(){
						//gf_console.log('counselCountForUnmask=' + counselCountForUnmask) ;
						//if(counselCountForUnmask >= 2){
						//	$("#csCust000SearchDiv").complete();
						//	clearInterval(check);
						//}				
					//}, 500);
					
			   		
				
			   	},
			   	pager: "#pagerOfcounselEntrList",
			   	loadComplete: function(data){
			   		console.log("loadCompleteEvent Start --------");
			   		console.log("loadComplete ::" +$("#counselEntrList").getGridDataByRowId(1));
			   		var rowData = $("#counselEntrList").getGridDataByRowId(1);
			   		console.log("JSON DATA :: "+JSON.stringify(rowData));
			   		
			   		$("#counselInfo").find("[id=counselId]").val(rowData.counselId);
		    		$("#counselInfo").find("[id=counselStatus]").val(rowData.counselStatus);    		
		    		$("#counselInfo").find("[id=counselDivision]").val(rowData.counselDivision);
		    		$("#counselInfo").find("[id=counselTypeCd]").val(rowData.counselTypeCd);
		    		$("#counselInfo").find("[id=counselDtlCd]").val(rowData.counselDtlCd);
		    		$("#counselInfo").find("[id=counselDtlCd2]").val(rowData.counselDtlCd2);
		    		$("#counselInfo").find("[id=counselDtlCd3]").val(rowData.counselDtlCd3);
		    		$("#counselInfo").find("[id=counselDtlCd4]").val(rowData.counselDtlCd4);
		    		$("#counselInfo").find("[id=counselDtlCd5]").val(rowData.counselDtlCd5);
		    		$("#counselInfo").find("[id=counselDtlCd6]").val(rowData.counselDtlCd6);
		    		$("#counselInfo").find("[id=counselDtlCd7]").val(rowData.counselDtlCd7);
		    		$("#counselInfo").find("[id=counselDtlCd8]").val(rowData.counselDtlCd8);
		    		$("#counselInfo").find("[id=activityDesc]").text(rowData.activityDesc);
		    		$("#counselInfo").find("[id=custNo]").val(rowData.custNo);
		    		$("#counselInfo").find("[id=hopeDate]").val(rowData.hopeDate);
		    		$("#counselInfo").find("[id=hopeTime]").val(rowData.hopeTime);
		    		$("#counselInfo").find("[id=custReq]").val(rowData.custReq);
		    		$("#counselInfo").find("[id=counselRes]").val(rowData.counselRes); 
		    		$("#counselInfo").find("[id=orderNum]").val(rowData.orderNum); 
		    		$("#counselInfo").find("[id=entrNo]").val(rowData.entrNo); 
		    		$("#counselInfo").find("[id=counselEndDate8]").val(rowData.counselEndDate8); 
		    		$("#counselInfo").find("[id=counselName]").val(rowData.counselName); 
		    		$("#counselInfo").find("[id=counselName2]").val(rowData.counselName2); 
		    		$("#counselInfo").find("[id=counselName3]").val(rowData.counselName3); 
		    		$("#counselInfo").find("[id=counselTel]").val(rowData.counselTel); 
		    		$("#counselInfo").find("[id=custType]").val(rowData.custType); 
		    		$("#counselInfo").find("[id=svcCd]").val(rowData.svcCd); 
		    		$("#counselInfo").find("[id=actMode]").val(rowData.activityCd); 
		    		$("#counselInfo").find("[id=addNum]").val(rowData.addNum); 
		    		$("#counselInfo").find("[id=custVilgAbvAddr]").val(rowData.custVilgAbvAddr); 
		    		$("#counselInfo").find("[id=custVilgBlwAddr]").val(rowData.custVilgBlwAddr); 
		    		$("#counselInfo").find("[id=fullAddr]").val(rowData.custVilgAbvAddr +" "+rowData.custVilgBlwAddr); 
		    		$("#counselInfo").find("[id=activitySeqNo]").val(rowData.activitySeqNo); 
		    		$("#counselInfo").find("[id=occurrenceDate]").val(rowData.occurrenceDate); 
		    		$("#counselInfo").find("[id=occurrenceTime]").val(rowData.occurrenceTime); 
		    		$("#counselInfo").find("[id=doorCode]").val(rowData.doorCode);
		    		
		    		if ( rowData.custType =='1' || rowData.custType == ''){
		    			$("#custType1").attr('checked',true);
		    			$("#custType2").attr('checked',false);
		    		}else if ( rowData.custType =='2'){
		    			$("#custType2").attr('checked',true);
		    			$("#custType1").attr('checked',false);
		    		}
		    		
		    		if ( rowData.serviceType !=''){
		    			var srvcCodes = rowData.serviceType.split(",");
		    			for ( var i=0 ; i < srvcCodes.length ; i ++){
		    				$("[id^=counselSrvcCode_]").each(function (e){
		    					if ( $(this).val() == srvcCodes[i]){
		    						$(this).attr('checked',true);
		    					}
		    				});
		    			}
		    		}  
		    		if ( rowData.softPhoneCheck =='Y'){
		    			$("#counselInfo #softPhoneCheckBox").attr('checked',true);
		    		}else{
		    			$("#counselInfo #softPhoneCheckBox").attr('checked',false);
		    		}
		    		
		    		$("#counselInfo").find("[id=serviceType]").val(rowData.serviceType); 
		    		
		    		
		    		if( $("#counselInfo #actMode").val() == null || $("#counselInfo #actMode").val()=='' || $("#counselInfo #actMode").val()=='&nbsp;' ){
		    			$("#counselProcessBtn").hide();
		    		}else{
		    			$("#counselProcessBtn").val($("#counselInfo #activityDesc").text());
		    			//$("#counselProcessBtn").show();;//아래에서 제어됨
		    		}
		    		if ( $("#actMode").val() =='AS'){
		    			$("#trAsDate").show();
		    		}else{
		    			$("#trAsDate").hide();
		    		}
		    		if ( $("#actMode").val() =='NAC' || $("#actMode").val() =='NAA'){
		    			$("#trServiceType").show();
		    			
		    			
		    			var checkedSvcCdLength = $("#counselInfo [name=counselSrvcCode]:checked").length ;
		    			var includeMobileService = false ;
		    			var includeVoipService = false ;
		    			var onlyMobile = false ;
		    			$("#counselInfo [name=counselSrvcCode]:checked").each(function(e){
		    				if($(this).val() == '2'){
		    					includeMobileService = true ;
		    				}
		    				if($(this).val() == '5'){
		    					includeVoipService = true ;
		    				}
		    			});
		    			
		    			//mobile 단독일 경우에는 설치 주소 체크 안함
		    			if ( checkedSvcCdLength > 0 ){
		    				if(includeMobileService &&  checkedSvcCdLength == 1){
		    					onlyMobile = true ;
		    				}else{
		    					onlyMobile = false ;
		    				}
		    				
		    				if(!onlyMobile){
		    					if((includeVoipService &&  checkedSvcCdLength == 1) || (includeMobileService &&  includeVoipService &&  checkedSvcCdLength == 2)){
		    						$("#counselInfo #softPhoneCheck").show();
		    						if ( $("#counselInfo #softPhoneCheckBox").attr('checked') == 'checked'){
		    							$("#counselInfo #trInstallAddr").hide();
		    						}else{
		    							$("#counselInfo #trInstallAddr").show();
		    						}
		    					}else{
		    						$("#counselInfo #softPhoneCheck").hide();
		    						$("#counselInfo #softPhoneCheckBox").attr('checked',false);
		    						$("#counselInfo #trInstallAddr").show();
		    					}
		    					/* if( rowData.hopeDate == null || rowData.hopeDate==''){
		    						$("#counselInfo #hopeDate").val(getTodayDate(1));
		    					} */
		    				}else{
		    					$("#counselInfo #softPhoneCheck").hide();
		    					$("#counselInfo #softPhoneCheckBox").attr('checked',false);
		    					$("#trInstallAddr").hide();
		    					$("#counselInfo #addrNum").val("");
		    					$("#counselInfo #custVilgAbvAddr").val("");
		    					$("#counselInfo #custVilgBlwAddr").val("");
		    					$("#counselInfo #fullAddr").val(""); 
		    					/* if( rowData.hopeDate == null || rowData.hopeDate!=''){
		    						$("#counselInfo #hopeDate").val(getTodayDate());
		    					} */
		    				}
		    			}else{
		    				$("#counselInfo #softPhoneCheck").hide();
		    				$("#counselInfo #softPhoneCheckBox").attr('checked',false);
		    				$("#trInstallAddr").hide();
		    				$("#counselInfo #addrNum").val("");
		    				$("#counselInfo #custVilgAbvAddr").val("");
		    				$("#counselInfo #custVilgBlwAddr").val("");
		    				$("#counselInfo #fullAddr").val("");
		    				/* if( rowData.hopeDate == null || rowData.hopeDate!=''){
			    				if ( marketCode =='1'){
			    					$("#counselInfo #hopeDate").val(getTodayDate());
			    				}else{
			    					$("#counselInfo #hopeDate").val(getTodayDate(1));
			    				}
		    				} */
		    			}
		    			
		    		}else{
		    			
		    			$("[name=counselSrvcCode]:checked").each(function(e){
		    				$(this).attr('checked',false);
		    			});
		    			$("#trServiceType").hide();
		    			$("#trInstallAddr").hide();
		    			$("#counselInfo #softPhoneCheck").hide();
						$("#counselInfo #softPhoneCheckBox").attr('checked',false);
		    		}
		    		
		    		
		    		if ( rowData.counselStatus=="C"){
		    			$("#counselInfo").find(":input").not(":submit").attr('disabled','disabled');
		    			$("#counselRegistBtn").hide();
		    			$("#counselProcessBtn").hide(); 
		    			
		    			$("#cccs000getOfferBtn").show();
						$("#cccs000OfferBtn").hide();
						$("#cccs000TrnsBtn").hide();
						$("#imgtransferBtn").hide();
						$("#installAddrBtn").hide();
						if ( rowData.satisfactionYn =='N'){
							$("#counselSatisFactionBtn").show();
						}else{
							$("#counselSatisFactionBtn").hide();
						}
		    		}else{
		    			$("#counselSatisFactionBtn").hide();
		    			if ( rowData.counselDivision =='A003'){
		        			$("#counselInfo").find(":input").not(":submit").attr('disabled','disabled');
		        			$("#counselRegistBtn").hide();
		        			
		        			$("#cccs000getOfferBtn").hide();
							$("#cccs000OfferBtn").hide();
							//$("#cccs000TrnsBtn").show();//아래에서 제어됨
							$("#imgtransferBtn").show();
							$("#installAddrBtn").hide();
		        		}else{
		        			$("#counselInfo").find(":input").not(":submit").removeAttr('disabled');
		        			//$("#counselRegistBtn").show();
		        			$("#maximizeBtn").show();
		        			
		        			//$("#cccs000getOfferBtn").show();
		    				//$("#cccs000OfferBtn").show();
		    				//$("#cccs000TrnsBtn").show();;//아래에서 제어됨
		    				$("#imgtransferBtn").show();
		    				$("#installAddrBtn").show();
		        		}
		    		}
		    		$("#maximizeBtn").hide();
			   	}
			    
			});
			
				//혜택(요금상품) 그리드
			$("#csCust00PlcyBenPList").jqGrid({
				datatype : "local",
				width : 250,
				height : 80,
				colNames : [ 'plcyBenefitCd', 'plcyBenefitName'
				             ,'restrictYn', 'restrictPeriod', "actInd", "ftrCd", "dscntKdCd"],
				colModel : [ { name : 'plcyBenefitCd', index : 'plcyBenefitCd', hidden:true}, 
				             { name : 'plcyBenefitName', index : 'plcyBenefitName', sorttype : "string" , width:"140px",align:"left"},
				             { name : 'restrictYn', index : 'restrictYn', sorttype : "string" , width:"40px",align:"center"},
				             { name : 'restrictPeriod', index : 'restrictPeriod', sorttype : "string" , width:"60px",align:"center"},
				             { name : 'actInd', index : 'actInd', sorttype : "string", hidden:true},
				             { name : 'ftrCd', index : 'ftrCd',  hidden:true},
				             { name : 'dscntKdCd', index : 'dscntKdCd', sorttype : "string", hidden:true},
				           ],
				viewrecords : true,
				shrinkToFit : false,
			});

			//혜택(할인) 그리드
			$("#csCust00PlcyBenSList").jqGrid(
				{
					datatype : "local",
					width : 250,
					height : 80,
					colNames : [ 'plcyBenefitCd', 'plcyBenefitName', "actInd", "ftrCd", "dscntKdCd"],
					colModel : [ { name : 'plcyBenefitCd', index : 'plcyBenefitCd', hidden:true}, 
					             { name : 'plcyBenefitName', index : 'plcyBenefitName', sorttype : "string" , width:"240px",align:"left"},
					             { name : 'actInd', index : 'actInd', sorttype : "string", hidden:true},
					             { name : 'ftrCd', index : 'ftrCd',  hidden:true},
					             { name : 'dscntKdCd', index : 'dscntKdCd', sorttype : "string", hidden:true},
					           ],
					viewrecords : true,
					shrinkToFit : false,
			});
		}
		
	}
	
	//저장
	$("#counselInfo #counselRegistBtn").click(function(e){
		e.preventDefault();
	
	});
	
	function checkSearchValue(){
		var chkType = $("#subscriptionCustomerSearchForm #searchString").val();
		var chkValue = $("#subscriptionCustomerSearchForm [id=searchEntrNo]").val();
		var flag = true;
		if ($("#subscriptionCustomerSearchForm").find("[id=searchEntrNo]").val() == "") {
			MessageBox.error('<s:message code="code.msg.000012"/>');
			flag = false ;
		} else if(chkType == '2BILL' || chkType == '1PROD' ){ // || chkType == '92IMSI' || chkType =='93HPNO' || chkType == '6DEV' ||  chkType == '8ENTR' ||
			var ch = "\0";
		    for (var i = 0, ch = chkValue.charAt(i);
		        (i < chkValue.length) && (flag); ch = chkValue.charAt(++i)) {
		        if ((ch >= '0') && (ch <= '9'))
		        	;
		        else if( (i == 0)&&(ch == '-'))
		        	;
		        else
		            flag = false;
		    }
			if (!flag) {
				alert($("#subscriptionCustomerSearchForm #searchString :selected").text() +  '\'s value is only Number!');
				//$("#subscriptionCustomerSearchForm [id=searchValue_1]").val('');
			}
		}
		if(chkType == '5CUST' || chkType == 'RL_CUST' || chkType == '3BIZ'){ 
			var chkValue = $("#subscriptionCustomerSearchForm [id=searchEntrNo]").val();
			$("#subscriptionCustomerSearchForm [id=searchEntrNo]").val(chkValue.toUpperCase());
		}
		return flag ;
	}
	
	$("#searchBtn").on("click",function(e){
		e.preventDefault();
		
		if(!checkSearchValue()){
			return;
		}
		
		var searchEntrNo = $("#searchEntrNo").val();
		var data = {'entrNo':searchEntrNo};
		var jsonData = JSON.stringify(data);
		console.log(jsonData);
	
		initCodeListlist();
		
		$.ajax({
			type : 'POST',
			async : true,
			url : '<s:url value="/subscribe/cutomerInfo"/>',
			contentType: "application/json",
			dataType : 'json',
			data : jsonData,
			success : function(data) {
			
					console.log(data.custNo);
					
					getEntrNo = data.entrNo;
					getCustNo = data.custNo;
					getCustRnmNo = data.custrnmNo;
					checkSearchYN = 1;
					
					$("#csCust000ViewFrom #custFullName").val(data.custFullNm); 			
				 	$("#csCust000ViewFrom #custrnmNo").val(data.custNo); 				
					$("#csCust000ViewFrom #phoneNo").val(data.hpno); 				
					$("#csCust000ViewFrom #custDvNm").val(data.custDvNm); 				
					$("#csCust000ViewFrom #userId").val(data.userId);			 		
					$("#csCust000ViewFrom #custPswdDisplay").val(data.custPswd); 		
					$("#csCust000ViewFrom #cntctFullNm").val(data.hpno); 			
					$("#csCust000ViewFrom #emailAddr").val(data.emailAddr); 				
					$("#csCust000ViewFrom #position").val(data.position); 				
					$("#csCust000ViewFrom #fullAddr").val(data.fullAddr);
					
					
					$("#subEntrNo").val(data.entrNo); 	
					$("#subBillAcntNo").val(data.billAcntNo);
					$("#subProdNo").val(data.prodNo); 	
					$("#subFrstDttm").val(data.frstDttm); 	
					$("#subChngDttm").val(data.chngDttm); 	
					$("#subDlrCd").val(data.dlrCd); 	
					$("#subIndcId").val(data.indcId); 	
					$("#subMngrId").val(data.mngrId); 
					
					$("#subRealCustNm").val(data.custNm);
					$("#subRealCustNm1").val(data.custNm1);
					$("#subRealCustNm2").val(data.custNm2);
					$("#subCustGender").val(data.custGender);
					$("#subCustrnmNo").val(data.custrnmNo);
					$("#subCustBirthday").val(data.custBday);
					$("#subFullTelNo").val(data.hpno);
					$("#subEmailAddr").val(data.emailAddr);
					$("#subPosition").val(data.position);
					$("#subFullAddr").val(data.fullAddr);
					//$("#subInstallAddr").val();
					
					getCustormerGrade(data.custNo, data.entrNo);
					
					var filterMap = {'entrNo':data.entrNo,'custNo':data.custNo};
					var postData = {'filterMaps': JSON.stringify(filterMap)};
					
					jQuery("#subscriptionInCust").jqGrid('setGridParam',{url:'<s:url value="/subscribe/custList"/>', postData:postData});
					jQuery("#subscriptionInCust").trigger("reloadGrid",[{page:1}]);
					
					var deviceFilterMap = {'entrNo':data.entrNo};
					var devicePostData = {'filterMaps':JSON.stringify(deviceFilterMap)};
					
					jQuery("#deviceEntrList").jqGrid('setGridParam',{url:'<s:url value="/subscibe/deviceList"/>', postData:devicePostData});
					jQuery("#deviceEntrList").trigger("reloadGrid",[{page:1}]);
					
					jQuery("#productEntrList").jqGrid('setGridParam',{url:'<s:url value="/subscribe/productList"/>', postData:devicePostData});
					jQuery("#productEntrList").trigger("reloadGrid",[{page:1}]);
					
					jQuery("#productDepositList").jqGrid('setGridParam',{url:'<s:url value="/subscribe/depositList"/>', postData:devicePostData});
					jQuery("#productDepositList").trigger("reloadGrid",[{page:1}]);
			
					$("#csCust000ViewFrom #userId").val();			 		
					$("#csCust000ViewFrom #custPswdDisplay").val(); 		
					$("#csCust000ViewFrom #cntctFullNm").val(data.custFullNm); 			
					$("#csCust000ViewFrom #emailAddr").val(); 				
					$("#csCust000ViewFrom #position").val(); 				
					$("#csCust000ViewFrom #fullAddr").val();
					
					var filterMap = {'entrNo':data.entrNo,'custNo':data.custNo};
					var postData = {'filterMaps': JSON.stringify(filterMap)};
					
					jQuery("#subscriptionInCust").jqGrid('setGridParam',{url:'<s:url value="/subscribe/custList"/>', postData:postData});
					jQuery("#subscriptionInCust").trigger("reloadGrid",[{page:1}]);
					
					var deviceFilterMap = {'entrNo':data.entrNo};
					var devicePostData = {'filterMaps':JSON.stringify(deviceFilterMap)};
					
					jQuery("#deviceEntrList").jqGrid('setGridParam',{url:'<s:url value="/subscibe/deviceList"/>', postData:devicePostData});
					jQuery("#deviceEntrList").trigger("reloadGrid",[{page:1}]);
					
					jQuery("#productEntrList").jqGrid('setGridParam',{url:'<s:url value="/subscribe/productList"/>', postData:devicePostData});
					jQuery("#productEntrList").trigger("reloadGrid",[{page:1}]);
					
					jQuery("#productDepositList").jqGrid('setGridParam',{url:'<s:url value="/subscribe/depositList"/>', postData:devicePostData});
					jQuery("#productDepositList").trigger("reloadGrid",[{page:1}]);
					
					var counselFilterMap = {'custNo':data.custNo};
					var counselPostData = {'filterMaps':JSON.stringify(counselFilterMap)};
					
					jQuery("#counselEntrList").jqGrid('setGridParam', {url:'<s:url value="/search/counseList"/>',postData:counselPostData});
					jQuery("#counselEntrList").trigger("reloadGrid",[{page:1}]);
			
				
			},	error:function(data){
			}, complete:function(jqXHR, textStatus){
			}
			
		});

	});
	
	
	
		
});

</script>