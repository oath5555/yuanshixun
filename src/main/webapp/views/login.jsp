<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>OA系统----登陆页面</title>

<link rel="stylesheet" type="text/css" href="css/login.css"/> 
</head>
<body>
	<div id="login">  
        <h1>Login</h1>  
        <form action="user/login" method="post">  
            <input type="text" required="required" placeholder="用户名" name="u"></input>  
            <input type="password" required="required" placeholder="密码" name="p"></input>  
            <button class="but" type="submit">登录</button>  
        </form>  
    </div>
</body>
</html>