package com.kfzx.service;

import com.kfzx.entity.Initiate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 发起众筹Service
 *
 * @author VicterTian
 * @version V1.0
 * @Date 2018/9/17
 */
public interface InitiateService {
	/**
	 * 查看所有众筹项目
	 * @param request 请求
	 * @param response 响应
	 * @return List<Initiate>
	 */
	List<Initiate> selectInitiate(HttpServletRequest request, HttpServletResponse response);

	/**
	 * 添加众筹
	 * @param request 请求
	 * @param response 响应
	 * @return Integer
	 */
	Integer addInitiate(HttpServletRequest request, HttpServletResponse response);

	/**
	 * 根据id查找
	 * @param request 请求
	 * @param response 响应
	 * @return Initiate
	 */
	List<Initiate> selectInitiateById(HttpServletRequest request, HttpServletResponse response);

}
