package com.tasion.userserver.mapper;

import com.tasion.userserver.entity.Templet;
import com.tasion.userserver.entity.TempletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempletMapper {
    long countByExample(TempletExample example);

    int deleteByExample(TempletExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(Templet record);

    int insertSelective(Templet record);

    List<Templet> selectByExample(TempletExample example);

    Templet selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") Templet record, @Param("example") TempletExample example);

    int updateByExample(@Param("record") Templet record, @Param("example") TempletExample example);

    int updateByPrimaryKeySelective(Templet record);

    int updateByPrimaryKey(Templet record);
}