package com.moon.admin.dao.mapper;

import com.moon.admin.po.CompanyLoad;
import com.moon.admin.po.CompanyLoadExample;
import com.moon.admin.po.CompanyLoadWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyLoadMapper {
    int countByExample(CompanyLoadExample example);

    int deleteByExample(CompanyLoadExample example);

    int deleteByPrimaryKey(String id);

    int insert(CompanyLoadWithBLOBs record);

    int insertSelective(CompanyLoadWithBLOBs record);

    List<CompanyLoadWithBLOBs> selectByExampleWithBLOBs(CompanyLoadExample example);

    List<CompanyLoad> selectByExample(CompanyLoadExample example);

    CompanyLoadWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CompanyLoadWithBLOBs record, @Param("example") CompanyLoadExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanyLoadWithBLOBs record, @Param("example") CompanyLoadExample example);

    int updateByExample(@Param("record") CompanyLoad record, @Param("example") CompanyLoadExample example);

    int updateByPrimaryKeySelective(CompanyLoadWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CompanyLoadWithBLOBs record);

    int updateByPrimaryKey(CompanyLoad record);
}