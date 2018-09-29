package com.kfzx.mapper;

import com.kfzx.entity.Initiate;
import com.kfzx.entity.InitiateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InitiateMapper {
    int countByExample(InitiateExample example);

    int deleteByExample(InitiateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Initiate record);

    int insertSelective(Initiate record);

    List<Initiate> selectByExample(InitiateExample example);

    Initiate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Initiate record, @Param("example") InitiateExample example);

    int updateByExample(@Param("record") Initiate record, @Param("example") InitiateExample example);

    int updateByPrimaryKeySelective(Initiate record);

    int updateByPrimaryKey(Initiate record);
}