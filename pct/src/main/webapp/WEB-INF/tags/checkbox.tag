<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<c:set var="baseUrl"><s:url value="/"/></c:set>
<%@ attribute name="id" required="true" rtexprvalue="true" description="ID of corresponding property in bean object" %>
<%@ attribute name="label" required="true" rtexprvalue="true" description="Label appears in red color if input is considered as invalid after submission" %>
<%@ attribute name="name" required="false" rtexprvalue="true" description="Name of corresponding property in bean object" %>
<%@ attribute name="placeHolder" required="false" rtexprvalue="true" %>
<%@ attribute name="labelClass" required="false" rtexprvalue="true" %>
<%@ attribute name="inputClass" required="false" rtexprvalue="true" %>
<%@ attribute name="codeType" required="false" rtexprvalue="true" %>
<%@ attribute name="value" required="false" rtexprvalue="true" %>
<%@ attribute name="disabled" required="false" rtexprvalue="true" %>
<%@ attribute name="required" required="false" rtexprvalue="true" %>
<c:set value="${name }" var="yourName"/> 
<c:set value="${value }" var="yourValue"/>
<c:set value="${placeHolder }" var="yourPlaceHolder"/> 
<c:set value="${labelClass }" var="yourLabelClass"/>
<c:set value="${inputClass }" var="yourInputClass"/>
<c:if test="${empty name }"><c:set value="${id }" var="yourName"/></c:if>
<c:if test="${empty placeHolder}"><c:set value="${label }" var="yourPlaceHolder"/></c:if>
<c:if test="${empty labelClass}"><c:set value="col-xs-3 col-sm-3 col-md-3 col-lg-3" var="yourLabelClass"/></c:if>
<c:if test="${empty inputClass}"><c:set value="col-xs-9 col-sm-9 col-md-9 col-lg-9" var="yourInputClass"/></c:if>
<c:if test="${not empty disabled}"><c:set value=" disabled=\"${disabled }\"" var="yourDisabled"/></c:if>
<c:if test="${not empty required}"><c:set value=" required=\"${required }\"" var="yourRequired"/></c:if>
<c:set value="${fn:split(value, ',') }" var="values"/>
<code:list codeType="${codeType }" var="codeList"/>
<div class="form-group">
	<label class="${yourLabelClass } control-label">${label }</label>
	<div class="${yourInputClass }">
		<c:if test="${not empty codeList}">
			<c:forEach items="${codeList }" var="code">
			<div class="checkbox">
				<label>
				<c:forEach items="${values }" var="itemVal">
					<c:set value="" var="checkedCode"/>
					<c:if test="${itemVal eq code.code }">
					<c:set value=" checked=\"checked\"" var="checkedCode"/>
					</c:if>
				</c:forEach>
					<input type="checkbox" id="${id }" name="${yourName}" value="${code.code }"${yourDisabled }${checkedCode }${yourRequired }>
					${code.meaning }
				</label>
			</div>
			</c:forEach>
		</c:if>
	</div>
</div>