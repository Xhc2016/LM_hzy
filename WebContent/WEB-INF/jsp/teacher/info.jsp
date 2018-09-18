<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"
	import="javax.servlet.http.Cookie" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container"
	style="background-color: #FFFFFF; background-size: 100% 100%; background-repeat: no-repeat;">
	<div class="row clearfix">
		<div class="col-md-2 column"></div>
		<div class="col-md-6 column">
			<h3 class="text-center">个人信息</h3>
		</div>
		<div class="col-md-4 column"></div>
	</div>
	<div class="row clearfix">
		<div class="col-md-8 column">
			<table class="table">
				<thead>
					<tr>
						<th>姓名</th>
						<th>工号</th>
						<th>真实姓名</th>
						<th>性别</th>
						<th>电话号码</th>
						<th>邮箱</th>
						<th>学院</th>
						<th>年级</th>
					</tr>
				</thead>
				<tbody>

					<tr class="success">
						<td>${user.nickName}</td>
						<td>${user.xh}</td>
						<td>${user.realName}</td>
						<td>${user.gender}</td>
						<td>${user.phoneNumber}</td>
						<td>##@##.com</td>
						<td>${user.college}</td>
						<td>${user.grader}</td>

					</tr>

				</tbody>
			</table>
		</div>
		<div class="col-md-4 column">
			<a class="btn btn-lg btn-primary" href="to_Setting" role="button">修改个人信息</a>
			<a class="btn btn-lg btn-primary" href="to_updatePassword"
				role="button">修改密码</a>
			<h2># ${user.nickName}</h2>
			<p>### 个人介绍${user.introduction}</p>
		</div>
	</div>

</div>
