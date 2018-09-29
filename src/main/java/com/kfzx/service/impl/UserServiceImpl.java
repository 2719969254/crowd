package com.kfzx.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kfzx.entity.User;
import com.kfzx.entity.UserExample;
import com.kfzx.mapper.UserMapper;
import com.kfzx.service.UserService;
import com.kfzx.utils.GetMessageCode;
import org.json.JSONException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> selectUser(HttpServletRequest request, HttpServletResponse response) {
		UserExample userExample = new UserExample();
		List<User> selectUser = userMapper.selectByExample(userExample);
		return selectUser;
	}

	@Override
	public void register(HttpServletRequest request, HttpServletResponse response) {
		String registerJson = "{\"username\": \"admin123\",\"password\": \"1235555555\",\"telephone\":\"15364882057\",\"code\":\"123456\"}";
		User user = JSON.parseObject(registerJson, User.class);
		String createTime = null;
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		createTime = dateFormat.format( now ); 
		System.out.println(createTime); 
		user.setCreatetime(createTime);
		userMapper.register(user);
		System.out.println(user);
	}

	@Override
	public int sendMessage(HttpServletRequest request, HttpServletResponse response) {
		String telephone = "15364882057";
//		String telephone = request.getParameter("telephone");
		String code = null;
		try {
			code = GetMessageCode.getCode(telephone);
			System.out.println(code);

		} catch (JSONException e) {
			System.out.println("发送短信失败");
			e.printStackTrace();
		}
		return Integer.parseInt(code);
	}

	@Override
	public User login(HttpServletRequest request, HttpServletResponse response) {
		//首先判断用户登录方式，有账号密码登录和手机直接登录，手机登录名称：tel 直接登录：common
//		String loginMethod = request.getParameter("loginMethod");
//		String loginJson = "{\"telephone\": \"15364882057\",\"code\":\"123456\"}";
		String loginJson = "{\"username\":\"admin\",\"password\":\"123\"}";
		String loginMethod = "common";
		User user = JSON.parseObject(loginJson,User.class);
		System.out.println(user);
		User loginUser = null;
		if(loginMethod.equals("tel")) {
			loginUser = userMapper.loginByTel(user);
			System.out.println(loginUser);
			System.out.println("登录成功");
		}else if(loginMethod.equals("common")) {
			loginUser = userMapper.loginByCommon(user);
		}
		return loginUser;
	}

	@Override
	public String updateCode(HttpServletRequest request, HttpServletResponse response) {
		String telephone = "15364882057";
		String code = null;
		try {
			code = GetMessageCode.getCode(telephone);
			userMapper.updateCode(code,telephone);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return code;
	}
}
