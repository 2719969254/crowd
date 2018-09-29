package com.kfzx.service.impl;

import com.kfzx.entity.Initiate;
import com.kfzx.entity.InitiateExample;
import com.kfzx.mapper.InitiateMapper;
import com.kfzx.service.InitiateService;
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
 * @Date 2018/9/17
 */
@Service
public class InitiateServiceImpl implements InitiateService {
	@Resource
	private InitiateMapper initiateMapper;
	@Override
	public List<Initiate> selectInitiate(HttpServletRequest request, HttpServletResponse response) {
		InitiateExample initiateExample = new InitiateExample();
		return initiateMapper.selectByExample(initiateExample);
	}

	@Override
	public Integer addInitiate(HttpServletRequest request, HttpServletResponse response) {
		String imgpath = request.getParameter("img_path");
		String name = request.getParameter("name");
		Double neednumber = Double.valueOf(request.getParameter("neednumber"));
		Double mynumber = Double.valueOf(request.getParameter("mynumber"));
		String desces = request.getParameter("desces");
		String place = request.getParameter("place");
		String ceasetime = request.getParameter("input_date");
		Initiate initiate = new Initiate();
		initiate.setName(name);
		initiate.setNeednumber(neednumber);
		initiate.setMynumber(mynumber);
		initiate.setDesces(desces);
		initiate.setPlace(place);
		initiate.setImgurl(imgpath);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		initiate.setCreatetime(df.format(new Date()));
		initiate.setCeasetime(ceasetime);
		return initiateMapper.insert(initiate);
	}

	@Override
	public List<Initiate> selectInitiateById(HttpServletRequest request, HttpServletResponse response) {
		Integer id = Integer.valueOf(request.getParameter("id"));
		InitiateExample initiateExample = new InitiateExample();
		InitiateExample.Criteria criteria = initiateExample.createCriteria();
		criteria.andIdEqualTo(id);
		return initiateMapper.selectByExample(initiateExample);
	}
}
