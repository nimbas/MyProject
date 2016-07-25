<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<section id="widget-grid" class="">
	<div class="row">
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<form class="form-horizontal" role="form" id="subscriptionCustomerSearchForm" name="subscriptionCustomerSearchForm" action="">
				<fieldset>
					<div class="form-group" style="_display:inline-block; background:#EFEBDE 5px 5px no-repeat; border:solid 1px #c6c7c6; padding:5px 10px 5px 40px;  font-weight:bold; color:#94657b; white-space:nowrap; aamin-width:930px;">
						
						<table>
							<colgroup>
								<col width="90%" />
								<col width="10%" />
							</colgroup>
							<tr>
								<td>
									<label class="control-label col-md-1">City</label>
									<div class="col-md-3">
									    <select class="form-control" id="cityCode" name="cityCode" onchange="fc_SelectChange(this)">
			                                <option value="">choose</option>
			                                <c:forEach items="${cityCode}" var="cityCode">
			                                	<option value="${cityCode.codeId}">${cityCode.codeName }</option>
			                                </c:forEach>
		                                </select>
		                            </div>
		                            <label class="control-label col-md-1">building</label>
		                            <div class="col-md-3">
									    <select class="form-control" id="buidlingCode" name="buidlingCode" onchange="">
		                                </select>
		                            </div>
								</td>
							</tr>
							<tr height="5px"></tr>
							<tr>
								<td>
									<label class="control-label col-md-1">district</label>
									<div class="col-md-3">
									    <select class="form-control" id="districtSelect" name="districtSelect" onchange="fc_SelectChange(this)">
			                                <option value="">choose</option>
			                                <span id="districtSelectSpan">
			                                
			                                </span>
		                                </select>
		                            </div>
		                            <label class="control-label col-md-1">Entrance Name</label>
		                            <div class="col-md-3">
									    <select class="form-control" id="searchString" name="searchString" searchField="MRKT_CD" searchOper="eq" required="required">
		                                </select>
		                            </div>
								</td>
							</tr>
							<tr>
								<td>
									<label class="control-label col-md-1">Sub District</label>
									<div class="col-md-3">
										<select class="form-control" id="subDistrict" name="subDistrict">
										</select>
									</div>
									<div class="col-md-4">
										<button class="btn btn-defualt">Search</button>
									</div>
								</td>
							</tr>
						</table>
					</div>
				</fieldset>
			</form>
		</article>
	</div>
	<!-- end row -->		
</section>
<script type="text/javascript">
$(function(e){
	
});

function fc_SelectChange(val){
	var selectValue = val.value;
	
	var data = {
			'upCodeId' : selectValue
	}

	$.ajax({
		type : 'POST',
		async : true,
		url : '<s:url value="/address/cityChange"/>', 
		contentType: "application/json",
		dataType : 'json',
		data : JSON.stringify(data),
		success : function(data) { 
			console.log(JSON.stringify(data));
			var jsonData = JSON.stringify(data);
			var list = JSON.parse(jsonData);
			var listLen = list.length;
			var listHtml = '<option value="">choose</option>';
			
			console.log("listCodeID:"+list[0].codeId)+"len::"+listLen;
			
			for(var i=0; i<listLen; i++){
				listHtml+='<option value="'+list[i].codeId+'">'+list[i].codeName+'</option>';
			}
			
			$("#districtSelect").html(listHtml);
			
		},	error:function(data){
			MessageBox.error(data, "<s:message code="err.500"/>");
		}, complete:function(jqXHR, textStatus){
			$("#content").complete();
		}
	});
	
	
}
</script>

