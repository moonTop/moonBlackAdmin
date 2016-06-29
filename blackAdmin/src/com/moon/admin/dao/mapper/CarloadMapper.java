package com.moon.admin.dao.mapper;

import com.moon.admin.po.Carload;
import com.moon.admin.po.CarloadExample;
import com.moon.admin.po.CarloadWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarloadMapper {
	
    int countByExample(CarloadExample example);

    int deleteByPrimaryKey(String id);

    int insert(CarloadWithBLOBs record);

    int insertSelective(CarloadWithBLOBs record);

    List<CarloadWithBLOBs> selectByExampleWithBLOBs(CarloadExample example);

    List<Carload> selectByExample(CarloadExample example);

    CarloadWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CarloadWithBLOBs record, @Param("example") CarloadExample example);

    int updateByExampleWithBLOBs(@Param("record") CarloadWithBLOBs record, @Param("example") CarloadExample example);

    int updateByExample(@Param("record") Carload record, @Param("example") CarloadExample example);

    int updateByPrimaryKeySelective(CarloadWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CarloadWithBLOBs record);

    int updateByPrimaryKey(Carload record);
}