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
									<input type="hidden" id="custNo" name="custNo" value="${customer.custNo}"/>
									<input type="hidden" id="contactSeq" name="contactSeq"/>
									<header>Contacts
										<div class="pull-right">
											<button id="cust003ResetBtn" name="cust003ResetBtn" class="btn btn-default btn-xs">reset</button>
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
														<input type="radio" name="baseContact" id="baseContact_0" value="true"/><i></i>Yes
													</label>
													<label class="radio">
														<input type="radio" name="baseContact" id="baseContact_1" value="false"/><i></i>No
													</label>
												</div>
											</section>
										</div>
											<div class="row">
											<span id="spanContactType"><label class="col col-3">Tel Number</label></span>
											<section class="col col-3" id="sectionContactType">
												<div class="row">
													<section class="col col-4" id="sectionCntctInfo1">
														<label class="input">
															<input type="text" name="cntctInfo1" id="cntctInfo1"/>
														</label>
													</section>
													<section class="col col-2" id="emailSpliter">
														@	
													</section>
													<section class="col col-6" id="sectionCntctInfo2">
														<label class="input">
															<input type="text" name="cntctInfo2" id="cntctInfo2"/>
														</label>
													</section>
												</div>
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
								</form>
								
								<div class="row">
									<div class="col-md-12" align="center">
										<table id="custContactGridList"></table>
									</div>
								</div>
								
								<form id="addressInfoForm" class="smart-form">
									<header>Address
										<div class="pull-right">
											<button id="cust008AddBtn" name="cust008AddBtn" class="btn btn-default btn-xs">add</button>
											<button id="cust008DeleteBtn" name="cust008DeleteBtn" class="btn btn-default btn-xs">delete</button>
											<button id="cust008UpdateBtn" name="cust008UpdateBtn" class="btn btn-default btn-xs">update</button>
										</div>
									</header>
									<fieldset>
									<input type="hidden" name="addrSeq" id="addrSeq"/> 
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
													<input type="radio" name="baseAddr" id="baseAddr0" checked="" value="true">
													<i></i>Yes</label>
												<label class="radio">
													<input type="radio" name="baseAddr" id="baseAddr1" value="false">
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
														<label class="input"><input class="form-control" id="addrNum" name="addrNum" type="text"></label>
														<span class="input-group-addon" id="addrSearchBtn001" style="cursor:pointer;"><i class="fa fa-search"></i></span>
													</div>
												</section>
												<section class="col col-9">
													<label class="input"><input type="text" id="vilageAboveAddr" name="vilageAboveAddr"></label>
												</section>												
											</div>
											<div class="row">
												<section class="col col-10">
													<label class="input"><input type="text" id="vilageBelowAddr" name="vilageBelowAddr"></label>
												</section>
											</div>										
										</section>
									</div>
									</fieldset>
								</form>
								<div class="row">
									<div class="col-md-12" align="center">
										<table id="csAddressGridList"></table>
									</div>
								</div>
								
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
$(function(e){
	pageSetUp();
	
	var accordionIcons = {
			header : "fa fa-plus", // custom icon class
			activeHeader : "fa fa-minus" // custom icon class
	};
	
	$("#addrSearchBtn001").click(function(e){
		e.preventDefault();
		
		Dialog.open({
			div: '#addressDialogSearch',
			url: '<s:url value="/search/addressDialogSearch?dialogName=addressDialogSearch"/>',
			title: 'Address Search',
			width: 1000,
			height: 800
		})
	});
	
	$("#cust003AddBtn").prop('disabled', false);
	$("#cust003UpdateBtn").prop('disabled', true);
	$("#cust003DeleteBtn").prop('disabled', true);
	
	$("#cust008AddBtn").prop('disabled', true);
	$("#cust008UpdateBtn").prop('disabled', true);
	$("#cust008DeleteBtn").prop('disabled', true);

	$("#accordion").accordion({
		autoHeight : false,
		heightStyle : "content",
		collapsible : true,
		animate : 300,
		icons : accordionIcons,
		header : "h4",
	});
	
	// csAddressGridList Event -S
	$("#csAddressGridList").jqGrid({
		datatype:"local",
		height: 200,
		width: 1100,
		colNames:[
		     	 'addrSeq'  
		 		,'Type' // addrDvCode
		 		,'HHS' // addrNum        
		 		,'custNo'      
		 		,'Address' // dvilageAboveAddr
		 		,'SubAddress' // dvilageBelowAddr
		 		,'fullAddress'
		 		,'Base' // baseAddr    
		],
		colModel:[
		       {name:'addrSeq', 			index:'addrSeq', 			hidden: true} 
	          ,{name:'addrDvCode', 		index:'addrDvCode'     						}
	          ,{name:'addrNum', 			index:'addrNum'							}
	          ,{name:'custNo', 			index:'custNo',       		hidden: true	}
	          ,{name:'vilageAboveAddr', 	index:'vilageAboveAddr'					}	
	          ,{name:'vilageBelowAddr', 	index:'vilageBelowAddr'					}
	          ,{name:'fullAddress', 		index:'fullAddress',		hidden: true}
	          ,{name:'baseAddr', 			index:'baseAddr'						}
		],
		viewrecords: true,
		shrikToFit: false,
		onSelectRow: function(idx){
			var gridData = $("#csAddressGridList").getGridDataByRowId(idx);
			var addrDvCodeVal = '';
			
			$("#addressInfoForm #cust008AddBtn").prop('disabled', true);
	   		$("#addressInfoForm #cust008UpdateBtn").prop('disabled', false);
	   		$("#addressInfoForm #cust008DeleteBtn").prop('disabled', false);
	   		
	   		if(gridData.addrDvCode == 'General'){
	   			addrDvCodeVal = '1';
	   		}else if(gridData.addrDvCode == 'Office'){
	   			addrDvCodeVal = '2';
	   		}else{
	   			addrDvCodeVal = '3';
	   		}
	   		
	   		if(gridData.baseAddr='true'){
	   			$("#addressInfoForm #baseAddr0").prop('checked',true);
	   			$("#addressInfoForm #baseAddr1").prop('checked',false);
	   		}else{
	   			$("#addressInfoForm #baseAddr0").prop('checked',false);
	   			$("#addressInfoForm #baseAddr1").prop('checked',true);
	   		}
	   		
	   		$("#addressInfoForm #addrSeq").val(addrSeq);
	   		$("#addressInfoForm #addrDvCode").val(addrDvCodeVal);
	   		$("#addressInfoForm #addrNum").val(gridData.addrNum);
	   		$("#addressInfoForm #vilageAboveAddr").val(gridData.vilageAboveAddr);
	   		$("#addressInfoForm #vilageBelowAddr").val(gridData.vilageBelowAddr);
	   		
	   		
			
			
		}
	});
	
	var csAddressList = [		                   
          		<c:forEach items="${csAddress}" var="csAddress" varStatus="status">
          			{
          				  addrSeq			: '${csAddress.addrSeq}'
          				 ,addrNum			: '${csAddress.addrNum}'
          				 ,custNo			: '${csAddress.custNo}'
          				 ,addrDvCode		: '${csAddress.addrDvCode}'
          				 ,vilageAboveAddr	: '${csAddress.vilageAboveAddr}'
          				 ,vilageBelowAddr	: '${csAddress.vilageBelowAddr}'
          				 ,fullAddress		: '${csAddress.fullAddress}'
          				 ,baseAddr			: '${csAddress.baseAddr}'
          			},
          		</c:forEach>
	];
	   	
	gf_addMultiGridList("#csAddressGridList", csAddressList);
	// csAddressGridList Event -E
	
	$("#custContactGridList").jqGrid({
		datatype: "local",
		height: 200,
		width : 1100,
		colNames:[
		            'contactSeq' 		//contactSeq
		          , 'custNo'
		          , 'contactTypeCode'		//contactTypeCode
		          , 'telDivCode'		//telDivCode
		          , 'relationDivCode'
		          , 'relsPersonName'
		          , 'cntctInfo1'
		          , 'cntctInfo2'
		          , 'cntctInfo3'
		          , 'cntctFullNm'		//cntctFullNm'
		          , 'Contact'		//base Contact
		          ],
	   	colModel:[
			{name:'contactSeq', 		index:'contactSeq', 		hidden:true},
			{name:'custNo', 			index:'custNo', 			hidden: true},
			{name:'contactTypeCode', 	index:'contactTypeCode'},
			{name:'telDivCode', 		index:'telDivCode'},
			{name:'relationDivCode', 	index:'relationDivCode'},
			{name:'relsPersonName', 	index:'relsPersonName', 	hidden:true},
			{name:'cntctInfo1', 		index:'cntctInfo1', 		hidden:true},
			{name:'cntctInfo2', 		index:'cntctInfo2', 		hidden:true},
			{name:'cntctInfo3', 		index:'cntctInfo3', 		hidden:true},
			{name:'cntctFullNm', 		index:'cntctFullNm'},		   				   			
			{name:'baseContact', 		index:'baseContact'}	   				   			
	   	],
	   	viewrecords: true,
	   	shrinkToFit: false,
	   	onSelectRow: function(ids){
	   		var gridData = $("#custContactGridList").getGridDataByRowId(ids);
	   		var contactCodeType = '';
	   		var relationVal = '';
	   		var divisionVal = '';
	   		
	   		$("#cust003AddBtn").prop('disabled', true);
	   		$("#cust003UpdateBtn").prop('disabled', false);
	   		$("#cust003DeleteBtn").prop('disabled', false);
	   		
	   		if(gridData.contactTypeCode == 'Tel'){
	   			contactCodeType = '1';
	   			contactTypeChange(contactCodeType)
	   		}else{
	   			contactCodeType = '2';
	   			contactTypeChange(contactCodeType);
	   		}
	   		
	   		if(gridData.relationDivCode == 'Family'){
				relationVal = '1';
			}else if(gridData.relationDivCode == 'Firend'){
				relationVal = '2';
			}else if(gridData.relationDivCode == 'Couple'){
				relationVal = '3';
			}else if(gridData.relationDivCode == 'Employee'){
				relationVal = '4';
			}else if(gridData.relationDivCode == 'Neighbor'){
				relationVal = '5';
			}else if(gridData.relationDivCode == 'Company'){
				relationVal = '6';
			}else if(gridData.relationDivCode == 'Division'){
				relationVal = '8';
			}else if(gridData.relationDivCode == 'Team'){
				relationVal = '9';
			}else if(gridData.relationDivCode == 'Self'){
				relationVal = '10';
			}
		
			if(gridData.telDivCode == 'General'){
				divisionVal='1';
			}else if(gridData.telDivCode == 'Office'){
				divisionVal='2';
			}else if(gridData.telDivCode == 'Bill'){
				divisionVal='3';
			}
			
			if(gridData.baseContact == 'true'){
				$('#contactInfoForm #baseContact_0').prop('checked',true);
				$('#contactInfoForm #baseContact_1').prop('checked',false);
			}else if(gridData.baseContact == 'false'){
				$('#contactInfoForm #baseContact_0').prop('checked',false);
				$('#contactInfoForm #baseContact_1').prop('checked',true);
			}
			
	   		$("#contactInfoForm #contactTypeCode").val(contactCodeType);
	   		$("#contactInfoForm #telDivCode").val(divisionVal);
	   		$("#contactInfoForm #cntctInfo1").val(gridData.cntctInfo1);
	   		$("#contactInfoForm #cntctInfo2").val(gridData.cntctInfo2);
	   		$("#contactInfoForm #relationDivCode").val(relationVal);
	   		$("#contactInfoForm #relsPersonName").val(gridData.relsPersonName);
	   		$("#contactInfoForm #custNo").val(gridData.custNo)
	   		$("#contactInfoForm #contactSeq").val(gridData.contactSeq);
	   		
	   	}
	});
	
	var contactList = [		                   
         		<c:forEach items="${contact}" var="contact" varStatus="status">
         			{
         				  contactSeq : '${contact.contactSeq}'
         				, custNo : '${contact.custNo}'  
         				, contactTypeCode : '${contact.contactTypeCode}'
         				, telDivCode : '${contact.telDivCode}'
         				, relationDivCode: '${contact.relationDivCode}'
         				, relsPersonName: '${contact.relsPersonName}'
         				, cntctInfo1: '${contact.cntctInfo1}'
         				, cntctInfo2: '${contact.cntctInfo2}'
         				, cntctInfo3: '${contact.cntctInfo3}'
         				, cntctFullNm : '${contact.cntctFullNm}'
         				, baseContact : '${contact.baseContact}'
         			},
         		</c:forEach>
    ];
	
	gf_addMultiGridList("#custContactGridList", contactList);
	
	
	$("#cust003ResetBtn").click(function(e){
		e.preventDefault();
		
		$("#contactInfoForm #cntctInfo1").val('');
   		$("#contactInfoForm #cntctInfo2").val('');
   		$("#contactInfoForm #relsPersonName").val('');
   		
   		$("#cust003AddBtn").prop('disabled', false);
   		$("#cust003UpdateBtn").prop('disabled', true);
   		$("#cust003DeleteBtn").prop('disabled', true);
   		
	});
	
	$("#cust003AddBtn").click(function(e){
		e.preventDefault();
		
		var contactTypeCode = $("#contactInfoForm #contactTypeCode").val();
   		var telDivCode = $("#contactInfoForm #telDivCode").val();
   		var cntctInfo1 = $("#contactInfoForm #cntctInfo1").val();
   		var cntctInfo2 = '@'+$("#contactInfoForm #cntctInfo2").val();
   		var relationDivCode = $("#contactInfoForm #relationDivCode").val();
   		var relsPersonName = $("#contactInfoForm #relsPersonName").val();
   		var baseContact = $('input:radio[name="baseContact"]:checked').val();
   		var custNo = $("#contactInfoForm #custNo").val();
   		var cntctFullNm = cntctInfo1 + cntctInfo1;
   		
   		var data = {   
				  'contactTypeCode': contactTypeCode
				, 'telDivCode' : telDivCode
				, 'cntctInfo1' : cntctInfo1
				, 'cntctInfo2': cntctInfo2
				, 'relationDivCode' : relationDivCode
				, 'relsPersonName' : relsPersonName
				, 'baseContact' : baseContact
				, 'custNo' : custNo
				, 'cntctFullNm' : cntctFullNm
		} ;
			
   		console.log("submit data == "+ JSON.stringify(data));
		$("#content").processing();
		
		$.ajax({
			type : 'POST',
			async : true,
			url : '<s:url value="/contact/addInfo"/>', 
			contentType: "application/json",
			dataType : 'json',
			data : JSON.stringify(data),
			success : function(data) { 
				gf_clearGridList("#custContactGridList");
				gf_addMultiGridList("#custContactGridList", data);
			},	error:function(data){
				MessageBox.error(data, "<s:message code="err.500"/>");
			}, complete:function(jqXHR, textStatus){
				$("#content").complete();
			}
		});
	});
		
	$("#cust003UpdateBtn").click(function(e){
		e.preventDefault();
		
		var contactTypeCode = $("#contactInfoForm #contactTypeCode").val();
   		var telDivCode = $("#contactInfoForm #telDivCode").val();
   		var cntctInfo1 = $("#contactInfoForm #cntctInfo1").val();
   		var cntctInfo2 = '@'+$("#contactInfoForm #cntctInfo2").val();
   		var relationDivCode = $("#contactInfoForm #relationDivCode").val();
   		var relsPersonName = $("#contactInfoForm #relsPersonName").val();
   		var baseContact = $('input:radio[name="baseContact"]:checked').val();
   		var custNo = $("#contactInfoForm #custNo").val();
   		var contactSeq = $("#contactInfoForm #contactSeq").val();
   		var cntctFullNm = cntctInfo1 + cntctInfo2
   		
   		var data = {   
				  'contactTypeCode': contactTypeCode
				, 'telDivCode' : telDivCode
				, 'cntctInfo1' : cntctInfo1
				, 'cntctInfo2': cntctInfo2
				, 'relationDivCode' : relationDivCode
				, 'relsPersonName' : relsPersonName
				, 'baseContact' : baseContact
				, 'custNo' : custNo
				, 'contactSeq' : contactSeq
				, 'cntctFullNm' : cntctFullNm
		} ;
			
   		console.log("submit data == "+ JSON.stringify(data));
		$("#content").processing();
		
		$.ajax({
			type : 'PUT',
			async : true,
			url : '<s:url value="/contact/updateInfo"/>', 
			contentType: "application/json",
			dataType : 'json',
			data : JSON.stringify(data),
			success : function(data) { 
				gf_clearGridList("#custContactGridList");
				gf_addMultiGridList("#custContactGridList", data);
			},	error:function(data){
				MessageBox.error(data, "<s:message code="err.500"/>");
			}, complete:function(jqXHR, textStatus){
				$("#content").complete();
			}
		});
	});
			
	$("#cust003DeleteBtn").click(function(e){
		e.preventDefault();
		
		var contactSeq = $("#contactInfoForm #contactSeq").val();
   		
   		var data = {   
				  'contactSeq': contactSeq
			
		} ;
			
   		console.log("submit data == "+ JSON.stringify(data));
		$("#content").processing();
		
		$.ajax({
			type : 'DELETE',
			async : true,
			url : '<s:url value="/contact/deleteInfo"/>', 
			contentType: "application/json",
			dataType : 'json',
			data : JSON.stringify(data),
			success : function(data) { 
				gf_clearGridList("#custContactGridList");
				gf_addMultiGridList("#custContactGridList", data);
			
			},	error:function(data){
				MessageBox.error(data, "<s:message code="err.500"/>");
			}, complete:function(jqXHR, textStatus){
				$("#content").complete();
			}
		
		});
	});
	
	
});

function contactTypeChange(val){
	
	var telHtmlLabel = "<label class='col col-3'>Tel Number</label>";
	var emailHtmlLabel = "<label class='col col-3'>Email</label>";
	
	if(val == "1"){// Tel
		$("#spanContactType").html(telHtmlLabel);
		$("#sectionCntctInfo1").removeClass().addClass('col col-12');
		$("#emailSpliter").hide();
		$("#sectionCntctInfo2").hide();
	}else if(val == "2"){
		$("#sectionCntctInfo1").removeClass().addClass('col col-4');
		$("#emailSpliter").show();
		$("#sectionCntctInfo2").show();
	}
	
}

	
</script>