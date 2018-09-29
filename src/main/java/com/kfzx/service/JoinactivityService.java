package com.kfzx.service;

import com.kfzx.entity.Joinactivity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 参加众筹Service
 *
 * @author VicterTian
 * @version V1.0
 * @Date 2018/9/18
 */
public interface JoinactivityService {
	/**
	 * 查询用户已参加的众筹项目
	 * @param request
	 * @param response
	 * @return
	 */
	List<Joinactivity> selectJoinactivity(HttpServletRequest request, HttpServletResponse response);

	/**
	 * 添加用户参加的众筹项目
	 * @param request
	 * @param response
	 */
	void addJoinactivity(HttpServletRequest request, HttpServletResponse response);
}
