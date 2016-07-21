<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="col-md-2">
			<div class="well well-sm well-light" style="margin-top: 10px">
				<ul class="list-group">
					<li class="list-group-item"><a href="javascript:tabOpen(0);">Customer</a>
					</li>
					<li class="list-group-item"><a href="javascript:tabOpen(1);">Attache
							File</a></li>
					<li class="list-group-item"><a href="javascript:tabOpen(2);">Customer
							Attributes</a></li>
				</ul>
			</div>
		</div>
		<div class="col-md-10">
			<div id="accordion">
				<div>
					<h4>Customer</h4>
					<div class="padding-10">
						<div class="row">
							<article class="col-md-12">
								<form id="customerTypeForm" class="smart-form" novalidate="novalidate">
								<input type="hidden" id="positionHidden" name="positionHidden" value="${customer.position }"/>
								<input type="hidden" id="custDvCdHidden" name="custDvCdHidden" value="${customer.custDvCode}"/>
								<input type="hidden" id="custKindCdHidden" name="custKindCdHidden" value="${customer.custKindCode}"/>
								<input type="hidden" id="authCodeHidden" name="authCodeHidden" value="${customer.authCode }"/>
								<header>Customer Type</header>
									<fieldset>
										<div class="row">
											<label class="col col-3">Customer Type</label>
											<section class="col col-3">
												<label class="select">
													<select name="custDvCd" id="custDvCd">
														<code:out codeType="CustDvCd" option="listbox"/>
													</select> <i></i> 
												</label>
											</section>
											<label class="col col-3">Customer Sub Type</label>
											<section class="col col-3">
												<label class="select">
													<select name="custKdCd" id="custKdCd">
														<code:out codeType="CustKdCd" option="listbox"/>
													</select> <i></i> 
												</label>
											</section>
										</div>
									</fieldset>
									<header>Customer General Information</header>
									<fieldset>
										<div class="row">
											<label class="col col-3">First Name</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="custName" id="custName" value="${customer.custName}"/></label>
											</section>
												<label class="col col-3">Company Name</label>
											<section class="col col-3">
											<label class="input"><input type="text" name="bizCompName" id="bizCompName"/></label>
											</section>
										</div>
										<div class="row">
											<label class="col col-3">Mid. Name</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="custName1" id="custName1" value="${customer.custName1}"/></label>
											</section>
											<label class="col col-3">Position</label>
											<section class="col col-3">
												<label class="select">
													<select name="position" id="position">
														<option value="choose">choose</option>
														<code:out codeType="Position" option="listbox"/>
													</select><i></i>
												</label>
											</section>
										</div>
										<div class="row">
											<label class="col col-3">Last Name</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="custName2" id="custName2" value="${customer.custName2}"/></label>
											</section>
											<label class="col col-3">Other Doc</label>
											<section class="col col-3">
												<label class="select">
													<select name="authCode" id="authCode">
														<code:out codeType="AuthCode" option="listbox"/>
													</select><i></i>
												</label>
											</section>
										</div>
										<div class="row">
											<label class="col col-3">SSN</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="custrnmNo" id="custrnmNo" value="${custrnmNo}"/></label>
											</section>
											<label class="col col-3">Other Value</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="authNo" id="authNo"/></label>
											</section>
										</div>
										<div class="row">
											<label class="col col-3">Birth Day</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="birthDate" id="birthDate" value="${customer.birthDate}"/></label>
											</section>
											<label class="col col-3">Web Id</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="entransUserId" id="entransUserId" value="${customer.entrancePassword.userId }"/></label>
											</section>
										</div>
										<div class="row">
											<label class="col col-3">Gender</label>
											<section class="col col-3">
												<div class="inline-group">
													<c:if test="${customer.sexCode eq '1'}">
														<label class="radio">
															<input type="radio" name="radio-sexCode" checked="true">
															<i></i>Male</label>
														<label class="radio">
															<input type="radio" name="radio-sexCode">
															<i></i>Female</label>
													</c:if>
													<c:if test="${customer.sexCode eq '2'}">
														<label class="radio">
															<input type="radio" name="radio-sexCode" >
															<i></i>Male</label>
														<label class="radio">
															<input type="radio" name="radio-sexCode" checked="">
															<i></i>Female</label>
													</c:if>
												</div>
											</section>
											<label class="col col-3">Web Password</label>
											<section class="col col-3">
												<label class="input"><input type="password" name="entransPassword" id="entransPassword" value="${customer.entrancePassword.password}"/></label>
											</section>
										</div>
										<div class="row">
											<label class="col col-3">E-mail</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="emailAddr" id="emailAddr" value="${customer.emailAddr}"/></label>
											</section>
											<label class="col col-3">Description</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="dscpt" id="dscpt" value="${customer.dscpt }"/></label>
											</section>
										</div>
										<div class="row">
											<label class="col col-3">Mobile Phone No</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="phoneNo" id="phoneNo" value="${customer.phoneNo }"/></label>
											</section>
											<label class="col col-3">Other Phone number</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="ip77PhoneNo" id="ip77PhoneNo" value="${customer.ip77PhoneNo }"/></label>
											</section>
										</div>
										<div class="row">
											<label class="col col-3">VAT</label>
											<section class="col col-9">
												<div class="inline-group">
													<c:if test="${customer.exceptVat eq 'false' }">
														<label class="radio">
															<input type="radio" id="exceptVat_0" name="exceptVat" checked="">
															<i></i>Yes</label>
														<label class="radio">
															<input type="radio" id="exceptVat_1" name="exceptVat">
															<i></i>No</label>
													</c:if>
													<c:if test="${customer.exceptVat eq 'true' }">
														<label class="radio">
															<input type="radio" id="exceptVat_0" name="exceptVat">
															<i></i>Yes</label>
														<label class="radio">
															<input type="radio" id="exceptVat_1" name="exceptVat" checked="">
															<i></i>No</label>
													</c:if>
												</div>
												
											</section>
										</div>
										<div class="row">
											<label class="col col-3">Registration User</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="registUserName" id="registUserName" value="${customer.custRgstr })"/></label>
											</section>
											<label class="col col-3">Registration Branch(Agency)</label>
											<section class="col col-3">
												<label class="input"><input type="text" name="registAgentCodeName" id="registAgentCodeName" /></label>
											</section>
										</div>
									</fieldset>
								</form>
								<form class="smart-form" id="contactInfoForm">
									<header>Contacts
										<div class="pull-right">
											<button id="cust003ResetBtn" name="cust003ResetBtn" class="btn btn-default btn-xs" onclick="clearCustContactRegForm()">reset</button>
											<button id="cust003AddBtn" name="cust003AddBtn" class="btn btn-default btn-xs">add</button>
											<button id="cust003DeleteBtn" name="cust003DeleteBtn" class="btn btn-default btn-xs">delete</button>
											<button id="cust003UpdateBtn" name="cust003UpdateBtn" class="btn btn-default btn-xs">update</button>
										</div>
									</header>
									<fieldset>
										<div class="row">
											<label class="col col-3">Contact Type</label>
											<section class="col col-3">
												<label class="select">
													<select id="contactTypeCode" name="contactTypeCode" onchange="contactTypeChange(this.value)">
														<code:out codeType="ContactTypeCode" option="listbox"/>
													</select><i></i>
												</label>
											</section>
											<label class="col col-1">Division Type</label>
											<section class="col col-2">
												<label class="select">
													<select id="telDivCode" name="telDivCode">
														<code:out codeType="AddrDvCode" option="listbox"/>
													</select><i></i>
												</label>
											</section>
											<label class="col col-1">Base Contact</label>
											<section class="col col-2">
												<div class="inline-group">
													<label class="radio">
														<input type="radio" name="baseContact" id="baseContact_0"/><i></i>Yes
													</label>
													<label class="radio">
														<input type="radio" name="baseContact" id="baseContact_1"/><i></i>No
													</label>
												</div>
											</section>
										</div>
											<div class="row">
											<span id="spanContactType"><label class="col col-3">Tel Number</label></span>
											<section class="col col-3" id="sectionContactType">
												<label class="input">
													<input type="text" name="cntctInfo1" id="cntctInfo1" placeholder="Tel Number"/>
												</label>
											</section>
											<label class="col col-1">Relation</label>
											<section class="col col-2">
												<label class="select">
													<select id="relationDivCode" name="relationDivCode">
														<code:out codeType="RelationType" option="listbox"/>
													</select><i></i>
												</label>
											</section>
											<label class="col col-1">Contact Name</label>
											<section class="col col-2">
												<label class="input"><input type="text" id="relsPersonName" name="relsPersonName"/></label>
											</section>
										</div>
										
									</fieldset>
									<div class="row">
										<table id="custContactList" width="100%" cellpadding="0" cellspacing="0" class="table table-striped table-hover">
										<colgroup>
											<col width="15%" />
											<col width="15%" />
											<col width="24%" />
											<col width="18%" />
											<col width="18%" />
											<col width="10%" />
										</colgroup>
										 <tr>
											<th><s:message code="cs.lable.cust.000027"/></th>
											<th><s:message code="cs.lable.cust.000028"/></th>
											<th><s:message code="cs.label.000058"/></th>
											<th><s:message code="cs.lable.cust.000124"/></th>
											<th><s:message code="cs.lable.cust.000110"/></th>
											<th><s:message code="cs.lable.cust.000024"/></th>
										</tr>
										<c:set value="0" var="totalCount"/>
										<c:forEach items="${customer.contacts}" var="contact" varStatus="status">
										<c:set value="${totalCount+1}" var="totalCount"/>
										<tr id="contactSeq_${status.count}" onclick="contactInfoBind(${status.count})"> 
											<td><code:out codeType="ContactTypeCode" value="${contact.contactTypeCode}"/></td>
											<td><code:out codeType="AddrDvCode" value="${contact.telDivCode}"/> </td>
											<td><code:out codeType="RelationType" value="${contact.relationDivCode}"/></td>
											<td>${contact.relsPersonName}</td>
											<td>${contact.cntctFullNm}</td>
											<td>${contact.baseContact}</td> 
										</tr>
										</c:forEach>
										
										<c:forEach begin="${totalCount+1}" end="4" step="1" varStatus="status">
										<tr ${status.count % 2 == 0 ? 'class="row02"' : ''}> 
											<td>&nbsp;</td>
											<td>&nbsp;</td>
											<td>&nbsp;</td>
											<td>&nbsp;</td>
											<td>&nbsp;</td>
											<td>&nbsp;</td>
										</tr>
										</c:forEach>
									</table>
									</div>
								</form>

								
								<form id="addressInfoList" class="smart-form">
									<header>Address</header>
									<fieldset>
									<div class="row">
										<label class="col col-3">Address Type</label>
										<section class="col col-3">
											<label class="select">
													<select id="addrDvCode" name="addrDvCode">
														<code:out codeType="AddrDvCode" option="listbox"/>
													</select><i></i>
											</label>
										</section>
										<label class="col col-3">Base Address</label>
										<section class="col col-3">
											<div class="inline-group">
												<label class="radio">
													<input type="radio" name="baseAddr" id="baseAddr0" checked="">
													<i></i>Yes</label>
												<label class="radio">
													<input type="radio" name="baseAddr" id="baseAddr1">
													<i></i>No</label>
											</div>
										</section>
									</div>
									<div class="row">
										<label class="col col-3">Address</label>
										<section class="col col-9">
											<div class="row">
												<section class="col col-3">
													<div class="input-group">
														<label class="input"><input class="form-control" type="text"></label>
														<span class="input-group-addon"><i class="fa fa-search"></i></span>
													</div>
												</section>
												<section class="col col-9">
													<label class="input"><input type="text"></label>
												</section>												
											</div>
											<div class="row">
												<section class="col col-10">
													<label class="input"><input type="text"></label>
												</section>
											</div>										
										</section>
									</div>
									</fieldset>
								</form>
							</article>
						</div>
					</div>
				</div>

				<div>
					<h4>Attache File</h4>
					<div class="padding-10">
						Attache File Section
					</div>
				</div>
				<div>
					<h4>Customer Attributes</h4>
					<div class="padding-10">
						Customer Attributes Section
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(document).ready(function() {
		var position = $("#positionHidden").val();
		var custDvCd = $("#custDvCdHidden").val();
		var custKindCd = $("#custKindCdHidden").val();
		var authCode = $("#authCodeHidden").val();
		
		$("#position").val(position);
		$("#customerTypeForm #custDvCd").val(custDvCd);
		$("#customerTypeForm #custKdCd").val(custKindCd);
		$("#customerTypeForm #authCode").val(authCode);
		
		console.log("data hidden :: "+ position + custDvCd + custKindCd + authCode);

		var accordionIcons = {
			header : "fa fa-plus", // custom icon class
			activeHeader : "fa fa-minus" // custom icon class
		};

		$("#accordion").accordion({
			autoHeight : false,
			heightStyle : "content",
			collapsible : true,
			animate : 300,
			icons : accordionIcons,
			header : "h4",
		});

	});
	
	function clearCustContactRegForm(){
		$("#customerRegistForm #custContactRegForm #cntctInfo1").val("");
		$("#customerRegistForm #custContactRegForm #relsPersonName").val("");
	}

	function tabOpen(num) {

		$("#accordion").accordion({
			active : num
		});
		
	}
	
	/*
		* Function: select box id : custDvCd 의 값이 바뀔때 마다 input box와 Label 내용 변경
		* Input Data: custDvCd의  value값이 들어 간다.
		* Output Data: telHtmlLabel, emailHtmlLabel, telHtml, emailHtml
		* Creater: 박범재
		* Creation Date: 2016.07.20
	*/
	function contactTypeChange(val){
		
		var telHtmlLabel = "<label class='col col-3'>Tel Number</label>";
		var emailHtmlLabel = "<label class='col col-3'>Email</label>";
		var telHtml = "<label class='input'><input type='text' name='cntctInfo1' id='cntctInfo1' placeholder='Tel Number'/></label>";
		var emailHtml = "<label class='input'><input type='text' name='cntctInfo1' id='cntctInfo1' placeholder='Email'/></label>";
		
		if(val == "1"){// Tel
			$("#spanContactType").html(telHtmlLabel);
			$("#sectionContactType").html(telHtml);
		}else if(val == "2"){
			$("#spanContactType").html(emailHtmlLabel);
			$("#sectionContactType").html(emailHtml);
		}
		
	}
	
	// function 기능, input, output, 주의 할점, 만든이, 생성일
	function contactInfoBind(idx){
		
		var contactType = $('#contactSeq_'+idx+' td:eq(0)').text();
		var divisionType = $('#contactSeq_'+idx+' td:eq(1)').text();
		var relationType = $('#contactSeq_'+idx+' td:eq(2)').text();
		var contactNm = $('#contactSeq_'+idx+' td:eq(3)').text();
		var contactInfo1 = $('#contactSeq_'+idx+' td:eq(4)').text();
		var baseType = $('#contactSeq_'+idx+' td:eq(5)').text();
		
		var relationVal = '';
		var divisionVal = '';
		
		if(contactType == 'Tel'){
			contactTypeChange(1);
			$('#contactInfoForm #contactTypeCode').val(1);
		}else if(contactType == 'Email'){
			contactTypeChange(2);
			$('#contactInfoForm #contactTypeCode').val(2);
		}
		
		if(relationType == 'Family'){
			relationVal = '1';
		}else if(relationType == 'Firend'){
			relationVal = '2';
		}else if(relationType == 'Couple'){
			relationVal = '3';
		}else if(relationType == 'Employee'){
			relationVal = '4';
		}else if(relationType == 'Neighbor'){
			relationVal = '5';
		}else if(relationType == 'Company'){
			relationVal = '6';
		}else if(relationType == 'Division'){
			relationVal = '8';
		}else if(relationType == 'Team'){
			relationVal = '9';
		}else if(relationType == 'Self'){
			relationVal = '10';
		}
	
		if(divisionType.trim() == 'General'){
			divisionVal='1';
		}else if(divisionType.trim() == 'Office'){
			divisionVal='2';
		}else if(divisionType.trim() == 'Bill'){
			divisionVal='3';
		}
				
		if(baseType == 'true'){
			$('#contactInfoForm #baseContact_0').prop('checked',true);
			$('#contactInfoForm #baseContact_1').prop('checked',false);
		}else if(baseType == 'false'){
			$('#contactInfoForm #baseContact_0').prop('checked',false);
			$('#contactInfoForm #baseContact_1').prop('checked',true);
		}
		
		$('#contactInfoForm #telDivCode').val(divisionVal);
		$('#contactInfoForm #cntctInfo1').val(contactInfo1);
		$('#contactInfoForm #relationDivCode').val(relationVal);
		$('#contactInfoForm #relsPersonName').val(contactNm);
		
	}
</script>