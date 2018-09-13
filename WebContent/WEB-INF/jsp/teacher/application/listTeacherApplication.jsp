<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>ApplicationList</title>
申请信息
<br>
<c:forEach items="${applicationList }" var="application" varStatus="status">${application.applicationId }<br></c:forEach>
