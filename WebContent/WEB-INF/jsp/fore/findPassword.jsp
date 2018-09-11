<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>找回密码</title>


<span>输入账号 :</span>
<input id="name" name="name" onkeyup="check()" type="text"> 
<span id="checkResult"></span>
 
<script>
var xmlhttp;
function check(){
  var name = document.getElementById("name").value;
  var url = "AjaxTest";
 
  xmlhttp =new XMLHttpRequest();
  xmlhttp.onreadystatechange=checkResult; //响应函数
  xmlhttp.open("GET",url,true);   //设置访问的页面
  xmlhttp.send(null);  //执行访问
}
 
function checkResult(){
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    document.getElementById('checkResult').innerHTML=xmlhttp.responseText;
  
}
 
</script>

