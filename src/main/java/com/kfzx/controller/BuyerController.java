package com.kfzx.controller;

import com.kfzx.entity.Initiate;
import com.kfzx.service.BuyerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
public class BuyerController {
	@Resource
	private BuyerService buyerService;
	@RequestMapping("/selectBuyItem")
	@ResponseBody
	public List<Initiate> selectBuyItem(HttpServletRequest request, HttpServletResponse response){
		return buyerService.selectBuyerItem(request,response);
	}
	@RequestMapping("/addBuyItem")
	public void addBuyItem(HttpServletRequest request, HttpServletResponse response){
		buyerService.insertBuyItem(request,response);
	}
	@RequestMapping("/selectBuy")
	@ResponseBody
	public void selectBuy(HttpServletRequest request, HttpServletResponse response){
		buyerService.selectBuyer(request,response);
	}
}
