<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<c:set var="baseUrl"><s:url value="/"/></c:set>
<%@ attribute name="id" required="true" rtexprvalue="true" description="Id of corresponding property in bean object" %>
<%@ attribute name="label" required="true" rtexprvalue="true" description="Label appears in red color if input is considered as invalid after submission" %>
<%@ attribute name="name" required="false" rtexprvalue="true" description="Name of corresponding property in bean object" %>
<%@ attribute name="placeHolder" required="false" rtexprvalue="true" %>
<%@ attribute name="labelClass" required="false" rtexprvalue="true" %>
<%@ attribute name="inputClass" required="false" rtexprvalue="true" %>
<%@ attribute name="value" required="false" rtexprvalue="true" %>
<%@ attribute name="disabled" required="false" rtexprvalue="true" %>
<%@ attribute name="required" required="false" rtexprvalue="true" %>
<c:set value="${name }" var="yourName"/> 
<c:set value="${value }" var="yourValue"/>
<c:set value="${placeHolder }" var="yourPlaceHolder"/> 
<c:set value="${labelClass }" var="yourLabelClass"/>
<c:set value="${inputClass }" var="yourInputClass"/>
<c:if test="${empty yourName }"><c:set value="${id }" var="yourName"/></c:if>
<c:if test="${empty placeHolder}"><c:set value="${label }" var="yourPlaceHolder"/></c:if>
<c:if test="${empty labelClass}"><c:set value="col-xs-3 col-sm-3 col-md-3 col-lg-3" var="yourLabelClass"/></c:if>
<c:if test="${empty inputClass}"><c:set value="col-xs-9 col-sm-9 col-md-9 col-lg-9" var="yourInputClass"/></c:if>
<c:if test="${not empty disabled}"><c:set value=" disabled=\"${disabled }\"" var="yourDisabled"/></c:if>
<c:if test="${not empty required}"><c:set value=" required=\"${required }\"" var="yourRequired"/></c:if>
<div class="form-group">
	<label class="control-label ${yourLabelClass }" for="prepend">${label }</label>
	<div class="${yourInputClass }">
		<div class="input-group">
			<input type="text" id="${id }" name="${yourName }"	placeholder="${placeHolder }" class="form-control${not empty required and required eq 'required' ? ' required' : ''}" value="${yourValue}"	${yourDisabled } ${yourRequired }>
			<div class="input-group-btn">
				<button class="btn btn-default btn-primary" type="button" id="${id }SearchBtn" ${yourDisabled }>
					<i class="fa fa-search"></i> Search
				</button>
			</div>

		</div>
	</div>
</div>