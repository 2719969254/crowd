package com.kfzx.service.impl;

import com.kfzx.entity.Activity;
import com.kfzx.entity.ActivityExample;
import com.kfzx.mapper.ActivityMapper;
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
	@Override
	public List<Activity> selectActivity(HttpServletRequest request, HttpServletResponse response) {
//		Integer uid = Integer.valueOf(request.getParameter("uid"));
		ActivityExample activityExample = new ActivityExample();
//		ActivityExample.Criteria criteria = activityExample.createCriteria();
//		criteria.andUidEqualTo(uid);
		return activityMapper.selectByExample(activityExample);
	}

	@Override
	public void addActivity(HttpServletRequest request, HttpServletResponse response) {
		Integer uid = Integer.valueOf(request.getParameter("uid"));
		Double number = Double.valueOf(request.getParameter("number"));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Activity activity = new Activity();
		activity.setUid(uid);
		activity.setNumber(number);
		activity.setEnjoytime(df.format(new Date()));
		activityMapper.insert(activity);
	}
}
