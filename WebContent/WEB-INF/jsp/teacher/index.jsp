<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"
	import="javax.servlet.http.Cookie" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script src="js/jquery.min.js"></script>

<title>TeacherIndex</title>

${user.fullName},你好 欢迎教师登陆
<a href="teacherInfomation">个人信息</a>
<a href="toApply">提交申请</a>
<a href="applicationList">查看申请</a>
<a href="toUpdatePassword">修改密码</a>
<a href="loginOut">退出</a>