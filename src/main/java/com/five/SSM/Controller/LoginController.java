package com.five.SSM.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.five.SSM.Domain.User;
import com.five.SSM.Service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletResponse response){
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println("登陆中.....");
		System.out.println("用户名："+username+" 密码："+password);
		User user=userService.selectByUserName(username);
		if(password.equals(user.getUserpwd())){
			request.getSession().setAttribute("user", user);
			System.out.println("登陆成功.....");
			return "main";
		}
		System.out.println("登陆失败.....");
		request.getSession().setAttribute("user",null);
		return "login";
	}

}
