package com.kfzx.mapper;

import com.kfzx.entity.Joinactivity;
import com.kfzx.entity.JoinactivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoinactivityMapper {
    int countByExample(JoinactivityExample example);

    int deleteByExample(JoinactivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Joinactivity record);

    int insertSelective(Joinactivity record);

    List<Joinactivity> selectByExample(JoinactivityExample example);

    Joinactivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Joinactivity record, @Param("example") JoinactivityExample example);

    int updateByExample(@Param("record") Joinactivity record, @Param("example") JoinactivityExample example);

    int updateByPrimaryKeySelective(Joinactivity record);

    int updateByPrimaryKey(Joinactivity record);
}