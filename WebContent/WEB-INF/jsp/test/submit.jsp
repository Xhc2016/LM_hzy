<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用AJAX以JSON方式提交数据</title>
<script type="text/javascript" src="jquery.min.js"></script>
</head>
<body>
	<form>
		id：<input type="text" id="id" value="123" /><br /> 名称：<input
			type="text" id="name" value="category xxx" /><br /> <input
			type="button" value="提交" id="sender">
	</form>
	<div id="messageDiv"></div>

	<script>  
    $('#sender').click(function(){  
        var id=document.getElementById('id').value;  
        var name=document.getElementById('name').value;  
        var category={"name":name,"id":id};  
        var jsonData = JSON.stringify(category);
        var page="submitCategory";  
        
        $.ajax({
        		type:"post",
        	   url: page,
        	   data:jsonData,
               dataType:"json",
               contentType : "application/json;charset=UTF-8",
        	   success: function(result){
        	   }
        	});
		   alert("提交成功，请在Tomcat控制台查看服务端接收到的数据");

    });
    </script>
</body>

</body>
</html>