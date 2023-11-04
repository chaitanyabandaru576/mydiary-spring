<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyDiary App Homepage</title>
<link rel="stylesheet" href="<c:url value="/resources/styles/style.css"/>">
</head>
<body>
<div class="header">
	<div class="first">
		<img src="<c:url value="/resources/images/diary.jpg"/>" width="60" height="60">
		
	</div>
	<div class="second">MyDiary App</div>

</div>

<br/><br/>
<hr/>
<div class="bodypart">
	<div class="bodypart1">
	<img src="<c:url value="/resources/images/diary.jpg"/>">
	</div>
	<div class="bodypart2">
	<h1>LOGIN HERE</h1><br/><br/>
	<form action="authenticate" method="POST">
		<label>Username </label> <input type="text" name="username" class="formcontrol" required><br/><br/>
		<label>Password </label> <input type="password" name="password" class="formcontrol" required><br/><br/></br>
		<button type="submit">LOGIN</button>
	
	</form>
	<br/><br/>
	New User?<a href="./register">Register</a> here
	</div>

</div>


</body>
</html>