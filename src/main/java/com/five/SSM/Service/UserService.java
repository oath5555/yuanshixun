package com.five.SSM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.SSM.Domain.User;
import com.five.SSM.IDao.UserMapper;
import com.five.SSM.Service.UserService;

//将UserService交给spring管理
@Service
public class UserService{

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 根据用户ID查询
	 * @param userid
	 * @return
	 */
	public User selectByPrimaryKey(String userid) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userid);
	}

	/**
	 * 根据用户名查询
	 * @param username
	 * @return
	 */
	public User selectByUserName(String username) {
		// TODO Auto-generated method stub
		return userMapper.selectByUserName(username);
	}

}
