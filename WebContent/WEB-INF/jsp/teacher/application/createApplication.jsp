<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"

	import="javax.servlet.http.Cookie"
	
	isELIgnored="false"
    %> 
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script type="text/javascript" src="js/jquery/3.3.1/jquery-3.3.1.min.js"></script> 
<script type="text/javascript" src="js/jquery-validate/jquery.validate.min.js"></script>

<script type="text/javascript">
    $(document).ready(function(){
    	$('#applicationForm').validate();
    	
    });
    
   
   

</script>



<title>Create Application</title>
<div  id="title">
    <p>教学使用计算机申请</p>
</div>



<form  id="applicationForm" >

    <input class="required" type="text"  id="teacherName" name="teacherName" value="${user.fullName}" title="require" >
    
    <br>
                    
    <input type="text" id="teacherId" name="teacherId" value="${user.userId }" >
    
    
                    
    <br>
                    
    <input class="required digits" type="text" id="phoneNumber" 
        name="phoneNumber" value="${user.tellNumber }" title="请输入正确的联系方式" > 
        
    <br>
                    
    <input class="required email" type="email" id="teacherEmail" 
        name="teacherEmail" placeholder="${user.email}" title="请输入正确的电子邮箱">
                    
    <br>
       
    <input class="required digits" type="text" id="classId" 
        name="classId" placeholder="课程编号" title="请输入正确的课程编号">
    
    <br>
    
    <input class="required" type="text" id="className" 
        name="className" placeholder="课程名称" title="请输入正确的课程名称">
    
    <br>
    
                    
           实验类别            
    <select  id="classType" name="classType">
     
        <option >基础</option>
        <option>专业基础</option>
        <option>专业</option>
        <option>其他</option>
        
                        
    </select>
    
    <input type="text" id="studentNumber" name="studentNumber" placeholder="实验人数">
    
    <br>
           实验地点
    <select id="classCampus" name="classCampus" >
    
        <option>徐汇校区</option>
        <option>奉贤校区</option>
    
    </select>
    
    
           学院
    <select id="institute" name="institute">
    
        <option>信息科学与工程学院</option>
        <option>理学院</option>
        <option>机械与动力工程学院</option>
        
    
    
    </select>
               
                   
    <br>  
    
    <input type="text" class="required number" id="classTotalTime" 
        name="classTotalTime" placeholder="实验总学时" title="请输入正确的学时数">
    
    
    
    <br>
    
          实验单双周
    <select id="weekType" name="weekType">
        <option value="0">每周</option>
        <option value="1">单周</option>
        <option value="2">双周</option>
    </select>
    
    
    
          实验起始周
    <select id="classStartTime" name="classStartTime">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
        <option>6</option>
        <option>7</option>
        <option>8</option>
        <option>9</option>
        <option>10</option>
        <option>11</option>
        <option>12</option>
        <option>13</option>
        <option>14</option>
        <option>15</option>
        <option>16</option>
        <option>17</option>
        <option>18</option>
        
    </select>
    -
    <select id="classEndTime" name="classEndTime">
        <option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
        <option>6</option>
        <option>7</option>
        <option>8</option>
        <option>9</option>
        <option>10</option>
        <option>11</option>
        <option>12</option>
        <option>13</option>
        <option>14</option>
        <option>15</option>
        <option>16</option>
        <option>17</option>
        <option>18</option>
        
    </select>
    
    <br>
    
    每周课时数
    
    <select id="classWeekTime" name="classWeekTime"  >
        <option>未选择</option>
        <option>1</option>
        <option>2</option>
        <option>3</option>
    </select>
    
<script type="text/javascript">

    $('#classWeekTime').change(function(){
    	
    	var s= '';
    	
    	var mySelectWeek = '<select ><option>周一</option><option>周二</option>option>周三</option><option>周四</option><option>周五</option><option>周六</option><option>周日</option></select>'
        //选择星期
    	var mySelectJici = '<select><option>1-2</option><option>3-4</option><option>5-6</option><option>7-8</option><option>9-11</option></select>' ;
    	//选择节次
    	for(var i = 0; i < $('#classWeekTime').val(); i++){
    		
    		s = s + mySelectWeek +  mySelectJici + '  ';
    		
    	}
    	
    	
    	$('#time1').html('理想时间1 <br>' + s + '<br>');
    	
    	$('#idealTime2').html('理想时间2 <br>' + s + '<br>');
    });

    
</script>

    <div id ="idealTime1" ><p id="time1"></p></div>
    
    <div id ="idealTime2" ><p id="time2"></p></div>
    
    
    <div hidden="ture">
    
    <select >
        <option>周一</option>
        <option>周二</option>
        <option>周三</option>
        <option>周四</option>
        <option>周五</option>
        <option>周六</option>
        <option>周日</option>
    </select>
    
    <select>
        <option>1-2</option>
        <option>3-4</option>
        <option>5-6</option>
        <option>7-8</option>
        <option>9-11</option>
    </select>
    
    </div>
    
    <br>
    
    <input type="text" id="software" name="software" placeholder="软件要求">
    
    <input type="text" id="remark" name="remark" placeholder="备注">
    
    <br>
    
    
    
       
    <input   type="submit" value="提交申请" id ="submitApplication">
    
    <script type="text/javascript">
    
        $('#submitApplication').click(function(){
        	
        	
        	
        	var application = {
        			
        			"classId":$('#classId').val() ,
        			"className":$("#className").val(),
                    "clssType":$('#classType').val(),
                    "classStartEndWeek":$('#classStartTime').val()+'--'+$('#classEndTime').val(),
                    "teacherName":$('#teacherName').val(),
                    "teacherId":$('#teacherId').val(),
                    "phoneNumber":$('#phoneNumber').val(),
                    "studentNumber":$("#studentNumber").val(),
                    "weekType":$('#weekType').val(),
                    "classCampus":$('#classCampus').val(),
                    "institute":$('#institute').val(),
                    "software":$('#software').val(),
                    "idealTime1":$('#idealTime1').val(),
                    "idealTime2":$('#idealTime2').val(),
                    "classTotalTime":$('#classTotalTime').val(),
                    
        	};
        	
        	var jsonData = JSON.stringify(application);
        	
        	//console.log(jsonData);
        	
        	 $.ajax({
                 type:"post",
                url: "submitApplication",
                data:application,
               // dataType:"json",
               // contentType : "application/json;charset=UTF-8",
                success: function(result){
                	
                	alert("提交成功");
                	
                	
                }
             });
            
  
        	
        });
        
    
    </script>
                     
            
       
</form> 








