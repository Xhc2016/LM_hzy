<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>教室选择</title>
<br>
<br>
<div align="center">
	校区：
	<select id="select_1" name="selectDistrict" onchange="districtChange()">
	   <option value="请选择">请选择</option>
		<option value="奉贤">奉贤</option>
		<option value="徐汇">徐汇</option>
	</select>

	<br><br><br>
	可用机房:
	<select id="select_2" name="choseClassroom">
	</select>
	<br>

</div>
<script src="https://code.jquery.com/jquery-3.2.0.js"></script>

<script type="text/javascript">
$(document).ready(function(){
	$('#select_2').hide();
});
function districtChange()
{
	$('#select_2').find('option').remove();
	$('#select_2').hide();
	var se=$('#select_1').val();
	var p="请选择";
	if(se!=p)
		{
			$.ajax({
				url:'selectClassroom',
				type:'POST',
				data:{
					'selectString':se
				},
				success:function (res){
					$('#select_2').show();
					$.each(res.cs_classroom,function(key,val){
						var option='<option value="'+val.id+'">'+'机房号:'+val.roomId+' 可纳人数:'+val.studentNumber+'</option>';
						$('#select_2').append(option);
					});
				},
				error:function(){
					alert("请求失败");
				},
			});
		}
}
</script>
