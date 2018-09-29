package com.kfzx.service;

import com.kfzx.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;



public interface UserService {
	List<User> selectUser(HttpServletRequest request, HttpServletResponse response);
	void register(HttpServletRequest request, HttpServletResponse response);
	int sendMessage(HttpServletRequest request, HttpServletResponse response);
	User login(HttpServletRequest request, HttpServletResponse response);
	String updateCode(HttpServletRequest request, HttpServletResponse response);
}
