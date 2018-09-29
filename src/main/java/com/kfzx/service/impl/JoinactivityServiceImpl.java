package com.kfzx.service.impl;

import com.kfzx.entity.Joinactivity;
import com.kfzx.entity.JoinactivityExample;
import com.kfzx.mapper.JoinactivityMapper;
import com.kfzx.service.JoinactivityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author VicterTian
 * @version V1.0
 * @Date 2018/9/18
 */
@Service
public class JoinactivityServiceImpl implements JoinactivityService {
	@Resource
	private JoinactivityMapper joinactivityMapper;
	@Override
	public List<Joinactivity> selectJoinactivity(HttpServletRequest request, HttpServletResponse response) {
		Integer uid = Integer.valueOf(request.getParameter("uid"));
		JoinactivityExample joinactivityExample = new JoinactivityExample();
		JoinactivityExample.Criteria criteria = joinactivityExample.createCriteria();
		criteria.andUidEqualTo(uid);
		return joinactivityMapper.selectByExample(joinactivityExample);
	}

	@Override
	public void addJoinactivity(HttpServletRequest request, HttpServletResponse response) {
		Integer uid = Integer.valueOf(request.getParameter("uid"));
		Integer activityId = Integer.valueOf(request.getParameter("activityId"));
		Joinactivity joinactivity = new Joinactivity();
		joinactivity.setUid(uid);
		joinactivity.setActivityid(activityId);
		joinactivityMapper.insert(joinactivity);
	}
}
