<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>教室列表</title>
<div align="center">
<table border='1'>
	
	<tr>
	     <td id="a11">校区</td>
	     <td>机房号</td>
	     <td>可纳人数</td>
	     <td>软件条件</td>
	</tr>
	
	<c:forEach items="${cs}"  var="c" varStatus="st">
		<tr>
			<td>${c.district}</td>
			<td>${c.roomId}</td>
			<td>${c.studentNumber}</td>
			<td>${c.software}</td>
			<td><a href="deleteClassroom?id=${c.id }">删除</a></td>
		</tr>
	</c:forEach>

</table>
<a href="to_addClassroom">add</a>
</div>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.0.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#a11').text("所在校区");
});
//修改文本值
</script>