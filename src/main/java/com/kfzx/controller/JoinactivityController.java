package com.kfzx.controller;

import com.kfzx.entity.Joinactivity;
import com.kfzx.service.JoinactivityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author VicterTian
 * @version V1.0
 * @Date 2018/9/18
 */
@Controller
public class JoinactivityController {
	@Resource
	private JoinactivityService joinactivityService;
	@RequestMapping("/selectActivityById")
	public List<Joinactivity> selectActivityById(HttpServletRequest request, HttpServletResponse response){
		return joinactivityService.selectJoinactivity(request,response);
	}
	@RequestMapping("/addActivityById")
	public void addActivityById(HttpServletRequest request, HttpServletResponse response){
		joinactivityService.addJoinactivity(request,response);
	}
}
