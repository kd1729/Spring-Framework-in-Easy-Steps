<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js">
</script>
<script>
	$(document).ready(function(){
		$("#userID").change(function(){
			$.ajax({
				url: "validateEmail",
				data: {id:$("#userID").val()},
				success: function(responseText){
					$("#errMsg").text(responseText);
					if(responseText != ""){
						$("#userID").focus();
					}
				}
			});
			
		});
	});
</script>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
    Id: <input type="text" name="id" id="userID" /> <span id="errMsg"></span>
    Name: <input type="text" name="name" />
    Email: <input type="text" name="email" />
    <input type="submit" name="register" />
  </pre>
	</form>
	<br /> ${result}
</body>
</html>