package com.five.SSM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.SSM.Domain.User;
import com.five.SSM.IDao.UserMapper;
import com.five.SSM.Service.UserService;

//��UserService����spring����
@Service
public class UserService{

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * �����û�ID��ѯ
	 * @param userid
	 * @return
	 */
	public User selectByPrimaryKey(String userid) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userid);
	}

	/**
	 * �����û�����ѯ
	 * @param username
	 * @return
	 */
	public User selectByUserName(String username) {
		// TODO Auto-generated method stub
		return userMapper.selectByUserName(username);
	}

}
