<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<h1>已排课程:</h1>
<br><br><br>
<!-- ******************************************************* -->
<div align="center">
<form action="select_passed_class_three" method="post">
	校区:
	<select id="select_district_one" name="district" onchange="district_change_one()">
	   <option value="">全部</option>
		<option value="奉贤">奉贤</option>
		<option value="徐汇">徐汇</option>
	</select>
	星期:
	<select id="select_theDay" name="theDay">
		<option value="日">日</option>
		<option value="一">一</option>
		<option value="二">二</option>
		<option value="三">三</option>
		<option value="四">四</option>
		<option value="五">五</option>
		<option value="六">六</option>
	</select>
	机房:
	<select id="select_classroom_one" name="classroomId">
		<!-- <option value="k333">机房号:k333&nbsp;可容纳人数:&nbsp;111</option>-->
	</select>
<button type="submit">查询</button>
</form>
<table border='1' cellspacing='0'>

		<tr>
			<td>课程代码</td>
			<td>课程名称</td>
			<td>课程时间</td>
			<td>课程始末周</td>
			<td>单双周</td>
			<td>授课教师工号</td>
			<td>授课教师姓名</td>
			<td>上课校区</td>
			<td>上课机房</td>

		</tr>
		
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.classId}</td>
            <td>${c.className}</td>
            <td>${c.classTime}</td>
            <td>${c.classWeek}</td>
            <td>${c.weekType}</td>
            <td>${c.userId}</td>
            <td>${c.userName}</td>
            <td>${c.classCampus}</td>
            <td>${c.classroomId}</td>

          <!--   
          	<td>
            	<input type="radio" name="che" onclick="checkId('${c.id }')">选中
            </td>
            -->
       </tr>
    </c:forEach>
</table>
<br>
<!-- ****************************************************************** -->
</div>
<h2>排课:</h2>
<br><h3>教师申请信息:&nbsp;</h3><br>
<div align="center"><!--style="margin-left:100px;">-->
<table  border="1" cellspacing="0">
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
<input type="radio" name="che" onclick=" checkId('${ck.classId} ','${ck.className }','${ck.teacherId}','${ck.teacherName}') " />选中
            </td>
        </tr>
    </c:forEach>
</table>












<table border='1'>
<tr>
<td>

<br>
	时间:<br>星期:
	<select id="selectTheDayTwo" name="select_theDay2">
		<option value="日">日</option>
		<option value="一">一</option>
		<option value="二">二</option>
		<option value="三">三</option>
		<option value="四">四</option>
		<option value="五">五</option>
		<option value="六">六</option>
	</select>
	<br>
	        实验始末节:第
    <select id="classStartPart" name="class_start_part">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>
        <option value="7">7</option>
        <option value="8">8</option>
        <option value="9">9</option>
        <option value="10">10</option>
        <option value="11">11</option>
        <option value="12">12</option>       
    </select>
    -
    <select id="classEndPart" name="class_end_part">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>
        <option value="7">7</option>
        <option value="8">8</option>
        <option value="9">9</option>
        <option value="10">10</option>
        <option value="11">11</option>
        <option value="12">12</option>       
    </select>节
    <br>
	          实验单双周
    <select id="weekType" name="weekType">
    	<option value='0'>全周</option>
        <option value='1'>单周</option>
        <option value='2'>双周</option>
    </select>
    
    <br>
    
          实验始末周:第
    <select id="class_start_week" name="class_start_week">
        <option value="01">1</option>
        <option value="02">2</option>
        <option value="03">3</option>
        <option value="04">4</option>
        <option value="05">5</option>
        <option value="06">6</option>
        <option value="07">7</option>
        <option value="08">8</option>
        <option value="09">9</option>
        <option value="10">10</option>
        <option value="11">11</option>
        <option value="12">12</option>
        <option value="13">13</option>
        <option value="14">14</option>
        <option value="15">15</option>
        <option value="16">16</option>
        <option value="17">17</option>
        <option value="18">18</option>
      
    </select>
    -
    <select id="class_end_week" name="class_end_week">
        <option value="01">1</option>
        <option value="02">2</option>
        <option value="03">3</option>
        <option value="04">4</option>
        <option value="05">5</option>
        <option value="06">6</option>
        <option value="07">7</option>
        <option value="08">8</option>
        <option value="09">9</option>
        <option value="10">10</option>
        <option value="11">11</option>
        <option value="12">12</option>
        <option value="13">13</option>
        <option value="14">14</option>
        <option value="15">15</option>
        <option value="16">16</option>
        <option value="17">17</option>
        <option value="18">18</option>
        
    </select>周
    
    <br>
    地点:<br>校区:
    <select id="select_district_two" name="selectDistrict" onchange="district_change_two()">
	   <option value="请选择">请选择</option>
		<option value="奉贤">奉贤</option>
		<option value="徐汇">徐汇</option>
	</select>
	机房:
	<select id="select_classroom_two" name="choseClassroom">
	</select><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<button onclick='theTableSubmit()'>提交</button>

</td>
</tr>
</table>
</div>






<script src="https://code.jquery.com/jquery-3.2.0.js"></script>
<script type="text/javascript">
var globalClassId;
var globalClassName;
var globalTeacherId;
var globalTeacherName;

function theTableSubmit()
{	
	console.log("点击");
	var classroomId=$('#select_classroom_two').val();
	if(classroomId==null||classroomId=='')
		alert("请选择机房");
	else
	{
	var timeDay=$('#selectTheDayTwo').val();
	var timePart1=$('#classStartPart').val();
	var timePart2=$('#classEndPart').val();
	var classTime='周'+timeDay+timePart1+timePart2+'节';
	var classWeek1=$('#class_start_week').val();
	var classWeek2=$('#class_end_week').val();
	var classWeek=classWeek1+'-'+classWeek2;
	var weekType=$('#weekType').val();
	var classCampus=$('#select_district_two').val();
	console.log("发送请求");
	$.ajax({
		url:'addPassedClass',
		type:'POST',
		data:{
			'classId':globalClassId,
			'className':globalClassName,
			'userId':globalTeacherId,
			'userName':globalTeacherName,
			'classTime':classTime,
			'classWeek':classWeek,
			'weekType':weekType,
			'classCampus':classCampus,
			'classroomId':classroomId
		},
		success:function(){
			console.log("success");
		},
		error:function(){
			
		},
	});
	}
}

function district_change_two()
{
	$('#select_classroom_two').find('option').remove();
	
	var se=$('#select_district_two').val();
	var valueOfSelect="请选择";
	if(se!=valueOfSelect)
		{
			$.ajax({
				url:'selectClassroom',
				type:'POST',
				data:{
					'selectString':se
				},
				success:function (res){
					$.each(res.cs_classroom,function(key,val){
						var option='<option value="'+val.roomId+'">'+'机房号:'+val.roomId+' 可纳人数:'+val.studentNumber+'</option>';
						$('#select_classroom_two').append(option);
					});
				},
				error:function(){
					alert("请求失败");
				}
			});
		}
}
$(document).ready(function(){
	var op="<option value=''>全部</option>";
	$('#select_classroom_one').append(op);
	$.ajax({
		url:'listClassroom_json',
		type:'POST',
		data:{

		},
		success:function (res){
			$.each(res.cs_classroom,function(key,val){
				var option='<option value="'+val.roomId+'">'+'机房号:'+val.roomId+' 可纳人数:'+val.studentNumber+'</option>';
				$('#select_classroom_one').append(option);
			});
		},
		error:function(){
			alert("请求失败");
		},
	});	
});


function checkId(classId,className,teacherId,teacherName)
{
	console.log(classId);
	globalClassId=classId;
	globalClassName=className;
	globalTeacherId=teacherId;
	globalTeacherName=teacherName;
	console.log(globalTeacherName);	
}

function district_change_one()
{
	$('#select_classroom_one').find('option').remove();
	
	var op="<option value=''>全部</option>";
	$('#select_classroom_one').append(op);
	
	var se=$('#select_district_one').val();
	var valueOfSelect='';
	if(se!=valueOfSelect)
		{
			$.ajax({
				url:'selectClassroom',
				type:'POST',
				data:{
					'selectString':se
				},
				success:function (res){
					//$('#select_2').show();
					$.each(res.cs_classroom,function(key,val){
						var option='<option value="'+val.roomId+'">'+'机房号:'+val.roomId+' 可纳人数:'+val.studentNumber+'</option>';
						$('#select_classroom_one').append(option);
					});
				},
				error:function(){
					alert("请求失败");
				},
			});
		}
	else
		{
		$.ajax({
			url:'listClassroom_json',
			type:'POST',
			data:{			},
			success:function (res){
				$.each(res.cs_classroom,function(key,val){
					var option='<option value="'+val.roomId+'">'+'机房号:'+val.roomId+' 可纳人数:'+val.studentNumber+'</option>';
					$('#select_classroom_one').append(option);
				});
			},
			error:function(){
				alert("请求失败");
			},
		});	
		}

}
</script>