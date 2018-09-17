<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div align="center">

	<form action="addClassroom" method="post">
		<table border='1'>
			<tr>
				<td>
				<select id="district" name="district">
					<option>奉贤</option>
					<option>徐汇</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>
				机房号：<input name="roomId"> <br>
				可容纳人数：<input id='studentNumber' name="studentNumber">
				软件条件：<input name="software">
				</td>
			</tr>
		</table>
				<button type="submit">提交</button>
	</form>
</div>
<script src="https://code.jquery.com/jquery-3.2.0.js"></script>

<script type="text/javascript">

$('#studentNumber').keypress(function(event) { 
    var keyCode = event.which;
     if (keyCode == 46 || (keyCode >= 48 && keyCode <=57)) 
         ;
     else
    	 {
    	 alert("只允许输入数字"); 
    	 $('#studentNumber').val('');
    	 }
    }).focus(function() { 
            this.style.imeMode='disabled'; 
    });
</script>