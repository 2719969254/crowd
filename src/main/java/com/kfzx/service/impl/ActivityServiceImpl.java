package com.kfzx.service.impl;

import com.kfzx.entity.Activity;
import com.kfzx.entity.ActivityExample;
import com.kfzx.entity.Initiate;
import com.kfzx.entity.InitiateExample;
import com.kfzx.mapper.ActivityMapper;
import com.kfzx.mapper.InitiateMapper;
import com.kfzx.service.ActivityService;
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
public class ActivityServiceImpl implements ActivityService {
	@Resource
	private ActivityMapper activityMapper;
	@Resource
	private InitiateMapper initiateMapper;

	@Override
	public List<Activity> selectActivity(HttpServletRequest request, HttpServletResponse response) {

		ActivityExample activityExample = new ActivityExample();
		return activityMapper.selectByExample(activityExample);
	}

	@Override
	public Integer addActivity(HttpServletRequest request, HttpServletResponse response) {
		//获取用户参与众筹商品id
		Integer pid = Integer.valueOf(request.getParameter("pid"));
		Double addNumber = Double.valueOf(request.getParameter("mynumber"));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Activity activity = new Activity();
		activity.setPid(pid);
		activity.setNumber(addNumber);
		activity.setEnjoytime(df.format(new Date()));
		activityMapper.insert(activity);
		//查询当前时商品目前的数量
		InitiateExample initiateExample = new InitiateExample();
		InitiateExample.Criteria criteria = initiateExample.createCriteria();
		criteria.andIdEqualTo(pid);
		List<Initiate> initiates = initiateMapper.selectByExample(initiateExample);
		//查询到结果后对查询结果进行处理
		for (Initiate initiate : initiates) {
			Double mynumber = initiate.getMynumber();
			mynumber += addNumber;
			initiate.setMynumber(mynumber);
			return initiateMapper.updateByPrimaryKey(initiate);
		}
		return null;
	}
}
