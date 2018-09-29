package com.kfzx.service.impl;

import com.kfzx.entity.Buyer;
import com.kfzx.entity.BuyerExample;
import com.kfzx.entity.Initiate;
import com.kfzx.entity.InitiateExample;
import com.kfzx.mapper.BuyerMapper;
import com.kfzx.mapper.InitiateMapper;
import com.kfzx.service.BuyerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author VicterTian
 * @version V1.0
 * @Date 2018/9/18
 */
@Service
public class BuyerServiceImpl implements BuyerService {
	@Resource
	private InitiateMapper initiateMapper;
	@Resource
	private BuyerMapper buyerMapper;
	@Override
	public List<Initiate> selectBuyerItem(HttpServletRequest request, HttpServletResponse response) {
		Integer aid = Integer.valueOf(request.getParameter("aid"));
		InitiateExample initiateExample = new InitiateExample();
		InitiateExample.Criteria criteria = initiateExample.createCriteria();
		criteria.andIdEqualTo(aid);
		return initiateMapper.selectByExample(initiateExample);
	}

	@Override
	public void insertBuyItem(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String desces = request.getParameter("desces");
		String place = request.getParameter("place");
		Integer aid = Integer.valueOf(request.getParameter("aid"));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Buyer buyer = new Buyer();
		buyer.setName(name);
		buyer.setDescs(desces);
		buyer.setPlace(place);
		buyer.setAid(aid);
		buyer.setBuytime(df.format(new Date()));
		buyerMapper.insert(buyer);
	}

	@Override
	public List<Buyer> selectBuyer(HttpServletRequest request, HttpServletResponse response) {
		BuyerExample buyerExample = new BuyerExample();
		return buyerMapper.selectByExample(buyerExample);
	}
}
