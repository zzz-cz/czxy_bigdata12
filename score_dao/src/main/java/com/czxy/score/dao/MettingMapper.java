package com.czxy.score.dao;

import com.czxy.score.domain.Metting;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface MettingMapper extends Mapper<Metting> {
    @Select("SELECT * FROM tab_metting WHERE metting_starttime - (SELECT NOW())>=0 AND  metting_starttime - (SELECT NOW())<=75999600 AND `status`='未开始' and metting_id=#{id}")
    Metting findBymId(@Param("id") Integer id);


    @Select("SELECT * FROM tab_metting WHERE metting_id=#{id}")
    Metting find(@Param("id") Integer id);
}
