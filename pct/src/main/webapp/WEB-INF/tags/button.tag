<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<c:set var="baseUrl"><s:url value="/"/></c:set>
<%@ attribute name="id" required="true" rtexprvalue="true" description="Name of corresponding property in bean object" %>
<%@ attribute name="label" required="true" rtexprvalue="true" description="Label appears in red color if input is considered as invalid after submission" %>
<%@ attribute name="css" required="false" rtexprvalue="true" description="Button Class" %>
<%@ attribute name="size" required="size" rtexprvalue="true" description="Button Size Class" %>
<%@ attribute name="href" required="false" rtexprvalue="true" description="Dialog Url" %>
<%@ attribute name="target" required="false" rtexprvalue="true" description="Dialog Target ID" %>
<%@ attribute name="userDefine" required="false" rtexprvalue="true" description="" %>

<c:set value="default" var="buttonClass"/> <!-- default, primary, info, success, warning, danger -->
<c:set value="" var="buttonSizeClass"/> <!-- lg, sm, xs -->
<c:if test="${not empty css }"><c:set var="buttonClass">${css }</c:set></c:if>
<c:if test="${not empty size }"><c:set var="buttonSizeClass">btn-${size }</c:set></c:if>
<c:choose>
	<c:when test="${not empty href}">
<button class="btn btn-${buttonClass } ${buttonSizeClass}" type="submit" id="${id }" href="${baseUrl}${href }"  data-toggle="modal" data-target="#CommonOnlyOneModalDialog" >
	</c:when>
	<c:otherwise>
<button class="btn btn-${buttonClass } ${buttonSizeClass}" type="submit" id="${id }" ${userDefine }>
	</c:otherwise>
</c:choose>
${label }
</button>
