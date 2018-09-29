package com.kfzx.service;

import com.kfzx.entity.Buyer;
import com.kfzx.entity.Initiate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author VicterTian
 * @version V1.0
 * @Date 2018/9/18
 */
public interface BuyerService {
	/**
	 * 显示用户已经购买的东西
	 * @param request
	 * @param response
	 * @return
	 */
	List<Initiate> selectBuyerItem(HttpServletRequest request, HttpServletResponse response);

	/**
	 * 添加购买项
	 * @param request 请求
	 * @param response 相应
	 */
	void insertBuyItem(HttpServletRequest request, HttpServletResponse response);

	/**
	 * 显示所有已购买项目
	 * @param request 请求
	 * @param response 响应
	 * @return List<Initiate>
	 */
	List<Buyer> selectBuyer(HttpServletRequest request, HttpServletResponse response);
}
