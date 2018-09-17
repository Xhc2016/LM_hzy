<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html >
<title>examining applications</title>
<script src="https://code.jquery.com/jquery-3.2.0.js"></script>
<script type="text/javascript">
function checkId(a)
{
	console.log(a);
}
</script>
<div align='center' border='1' cellspacing='0'>
    <tr>
        <td>课程代码</td>
        <td>课程名</td>
        <td>理想时间1</td>
        <td>理想时间2</td>
        <td>学生人数</td>
        <td>单双周</td>
        <td>教师工号</td>
        <td>教师姓名</td>
        <td>审核状态</td>
        <td>上课校区</td>
        <td>所需软件</td>
        <td>申请时间</td>
        <td>选中</td>
    </tr>
    <c:forEach items="${is}" var="ck" varStatus="st">
        <tr>
            <td>${ck.classId}</td>
            <td>${ck.className}</td>
            <td>${ck.idealTime1}</td>
            <td>${ck.idealTime2}</td>
            <td>${ck.studentNumber}</td>
            <td>${ck.weekType}</td>
            <td>${ck.teacherId}</td>
            <td>${ck.teacherName}</td>
            <td>${ck.state}</td>
            <td>${ck.classCampus}</td>
            <td>${ck.software}</td>
            <td>${ck.applyTime}</td> 
            <td>
            		<input type="radio" name="che" onclick="checkId('${ck.id }')">选中
            </td>
        </tr>
    </c:forEach>
</div>