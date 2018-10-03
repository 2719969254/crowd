package com.kfzx.service;

import com.kfzx.entity.Activity;
import com.kfzx.entity.Initiate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 用户参加众筹Service
 *
 * @author VicterTian
 * @version V1.0
 * @Date 2018/9/18
 */
public interface ActivityService {
	/**
	 * 查看所有众筹项目
	 * @param request
	 * @param response
	 * @return
	 */
	List<Activity> selectActivity(HttpServletRequest request, HttpServletResponse response);

	/**
	 * 添加众筹
	 * @param request
	 * @param response
	 * @return Integer
	 */
	Integer addActivity(HttpServletRequest request, HttpServletResponse response);
}
