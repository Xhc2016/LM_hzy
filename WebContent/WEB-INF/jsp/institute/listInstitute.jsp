<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<table align="center" border="1" cellspacing="0">
    <tr>
        <td>编号</td>
        <td>学院</td>
        <td colspan=2>编辑</td>
    </tr>
    <c:forEach items="${is}" var="i" varStatus="st">
        <tr>
            <td>${i.id}</td>
            <td>${i.name}</td>
            <td><a href="deleteInstitute?id=${i.id }">删除</a></td>
            <td><a href="updateInstitute?id=${i.id }">修改</a></td>   
        </tr>
    </c:forEach>
</table>
<a href="addInstitute">添加</a>