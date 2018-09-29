package com.kfzx.controller;

import com.kfzx.entity.Activity;
import com.kfzx.service.ActivityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 参加众筹controller
 *
 * @author VicterTian
 * @version V1.0
 * @Date 2018/9/18
 */
@Controller
public class ActivityController {
	@Resource
	private ActivityService activityService;
	@RequestMapping("/selectActivityByUid")
	public List<Activity> selectActivityByUid(HttpServletRequest request, HttpServletResponse response){
		return activityService.selectActivity(request,response);
	}
	@RequestMapping("/addActivity")
	public void addActivity(HttpServletRequest request, HttpServletResponse response){
		activityService.addActivity(request,response);
	}
}
