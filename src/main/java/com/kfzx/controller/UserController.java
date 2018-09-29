package com.kfzx.controller;

import com.kfzx.entity.User;
import com.kfzx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
/**
 * 用户controller
 *
 * @author VicterTian
 * @version V1.0
 * @Date 2018/9/18
 */
@Controller
@RequestMapping
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping("/selectUser")
	@ResponseBody
	public List<User> selectUser(HttpServletRequest request, HttpServletResponse response) {
		return userService.selectUser(request, response);
	}

	@RequestMapping("/register")
	@ResponseBody
	public void register(HttpServletRequest request, HttpServletResponse response) {
		userService.register(request, response);
	}

	@RequestMapping("/sendcode")
	@ResponseBody
	public int sendCode(HttpServletRequest request, HttpServletResponse response) {
		return userService.sendMessage(request, response);
	}

	@RequestMapping("login")
	@ResponseBody
	public User login(HttpServletRequest request, HttpServletResponse response) {
		return userService.login(request, response);
	}

	@RequestMapping("updatecode")
	@ResponseBody
	public String loginByTel(HttpServletRequest request, HttpServletResponse response) {
		return userService.updateCode(request, response);
	}
}
