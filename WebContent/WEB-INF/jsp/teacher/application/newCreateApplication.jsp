<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"

	import="javax.servlet.http.Cookie"
	
	isELIgnored="false"
    %> 
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta>
        <title>
        </title>
        <script type="text/javascript" src="js/jquery/3.3.1/jquery-3.3.1.min.js"></script>
        <!-- 引入jQuery-validate 进行表单验证 -->
        <script type="text/javascript" src="js/jquery-validate/jquery.validate.min.js"></script>
        <script type="text/javascript">
        $(document).ready(function(){
        	$('#applicationForm').validate();
        	
        });
        </script>
        <script type="text/javascript">
            $('#submitApplication').click(function(){
            	
            	var data = {
            			
            			//
            			"softwareRequirement":$('#softwareRequirement').val(),
            			"ideaTime1":$('#idaelTime1Week').val()+$("#idealTime1Time").val(),
            			"ideaTime2":$('#idaelTime2Week').val()+$("#idealTime2Time").val(),
            			"applicationRemark":$('#applicationRemark'),
            			"":$('#'),
            			"":$('#'),
            			"":$('#'),
            			"":$('#'),
            			
            	};
            	
            });
        </script>
    </head>
    <title>
    </title>
    <body>
        <div >
            <form id="applicationForm">
            
                
                
                <div>
                                                       个人信息 <br>
                                                       教师姓名 : ${user.fullName} <br>
                                                       教师工号 : ${user.userId } <br> 
                                                       电话号码 : ${user.phoneNumber } <br>
                                                       电子邮箱 : ${user.email } <br>
                                                       学院        :   ${user.institute } <br> 
                                                       
                                   </div>
               <br>
                <div>
                                                       课程信息 <br>
                                                       课程编号 :
                    <input class="requir digits" type="text" id="courseId" title="请输入正确的课程编号">
                    
                    <br>
                    
                                                       课程名称 :
                    <input class="reuqire" type="text" id="courseName" title="请输入课程名称"> 
                   
                    <br>
                   
                                                        实验类别 :
                    <select id="classType">
                        <option>基础</option>
                        <option>专业基础</option>
                        <option>专业</option>
                        <option>其他</option>
                    </select>
                    
                    <br>
                    
                                                       实验校区 :
                    <select id="classCampus">
                        <option>徐汇校区</option>
                        <option>奉贤校区</option>
                    </select>
                    
                    <br>
                    
                    <!-- 
                                                       实验单双周
                    <select id="weekType">
                        <option>每周</option>
                        <option>单周</option>
                        <option>双周</option>
                    </select>
                    
                     
                    
                    
                    <br>
                    -->
                    
                    <fieldset style="width:200px; " id="courseStartEndTime" name="courseStartEndTime">
                    
                                                       实验起始周
                    <input  style="width:50px; " class="require digits" type="text" id="courseStratTime" name="courseStratTime" title="请输入正确的起始时间">
                    
                    <br>
                    
                    
                                                        实验结束周
                    <input style="width:50px; " class="require digits" type="text" id="courseEndTime" name="courseEndTime" title="请输入正确的结束时间"> 
                    
                    </fieldset>
                    
                    <br>
                    
                                                        课程总学时
                    <input class="require digits" type="text" id="courseTotalCredit" name="courseTotalCredit" title="请输入正确的课程学分">
                    
                    <br>
                    
                                                       实验学时
                    <input class="require digits" type="text" id="courseExperimentTime" name="courseExperimentTime" title="请输入正确的实验学时">
                    
                                                       实验学分
                    <input class="require digits" type="text" id="courseExperimentCredit" name="courseExperimentCredit" title="请输入正确的实验学分">
                    
                    
                </div>
                
                
                <div>
                                                        申请信息 
                    <fieldset style="width:200px; " id="idealTime1" name="idealTime1">
                        <legend> 理想时间1</legend>
                        
                        <select id="idealTime1Week" name="idealTime1Week">
                            <option>星期一</option>
                            <option>星期二</option>
                            <option>星期三</option>
                            <option>星期四</option>
                            <option>星期五</option>
                            
                            
                        </select>
                        
                        <select id="idealTime1Time" name="idealTime1Time">
                            <option>1-2</option>
                            <option>3-4</option>
                            <option>5-6</option>
                            <option>7-8</option>
                            <option>9-11</option>
                            
                        </select>
                        
                    </fieldset>
                    
                    <fieldset style="width:200px; " id="idealTime2" name="idealTime2">
                        <legend> 理想时间2</legend>
                        
                        <select id="idealTime2Week" name="idealTime2Week">
                            <option>星期一</option>
                            <option>星期二</option>
                            <option>星期三</option>
                            <option>星期四</option>
                            <option>星期五</option>
                            
                            
                        </select>
                        
                        <select id="idealTime2Time" name="idealTime2Time">
                            <option>1-2</option>
                            <option>3-4</option>
                            <option>5-6</option>
                            <option>7-8</option>
                            <option>9-11</option>
                            
                        </select>
                        
                    </fieldset>
                    
                                                       软件需求<br>
                    <textarea id="softwareRequirement" name="softwareRequirement" rows="3" cols="30"></textarea>                                                   
                    <br>
                    
                                                       备注    <br>
                                                       
                    <textarea id="applicationRemark" name="applicationRemark" rows="5" cols="30"></textarea> 
                    
                                                                      
                    <br>    
                    
                    <input id="submitApplication" type="submit" value="提交申请">                   
                </div>   
                
                                             
            
            </form>
        </div>
    </body>
</html>
