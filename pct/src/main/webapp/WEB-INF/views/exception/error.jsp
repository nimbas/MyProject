<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html;charset=utf-8"  %><%--한글깨짐방지,자바/홈페이지는 기본UTF-8문자셋--%>
<c:choose>
<c:when test="${returnType eq 'view' }">
<font color='red'>1. Error Code = ${result.exceptionMsg.errorCode}</font><br>
<font color='blue'>2. Error Message = ${result.exceptionMsg.errorMessage}</font><br>
3. Error Detail = ${result.exceptionMsg.detailMessage}<br>
</c:when>
<c:otherwise>
${exception}
</c:otherwise>
</c:choose>
