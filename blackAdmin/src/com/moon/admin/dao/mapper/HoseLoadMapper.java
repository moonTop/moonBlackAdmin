package com.moon.admin.dao.mapper;

import com.moon.admin.po.HoseLoad;
import com.moon.admin.po.HoseLoadExample;
import com.moon.admin.po.HoseLoadWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HoseLoadMapper {
    int countByExample(HoseLoadExample example);

    int deleteByExample(HoseLoadExample example);

    int deleteByPrimaryKey(String id);

    int insert(HoseLoadWithBLOBs record);

    int insertSelective(HoseLoadWithBLOBs record);

    List<HoseLoadWithBLOBs> selectByExampleWithBLOBs(HoseLoadExample example);

    List<HoseLoad> selectByExample(HoseLoadExample example);

    HoseLoadWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HoseLoadWithBLOBs record, @Param("example") HoseLoadExample example);

    int updateByExampleWithBLOBs(@Param("record") HoseLoadWithBLOBs record, @Param("example") HoseLoadExample example);

    int updateByExample(@Param("record") HoseLoad record, @Param("example") HoseLoadExample example);

    int updateByPrimaryKeySelective(HoseLoadWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HoseLoadWithBLOBs record);

    int updateByPrimaryKey(HoseLoad record);
}