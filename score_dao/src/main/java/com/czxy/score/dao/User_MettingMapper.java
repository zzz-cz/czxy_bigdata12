package com.czxy.score.dao;

import com.czxy.score.domain.User_Metting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface User_MettingMapper  extends tk.mybatis.mapper.common.Mapper<User_Metting> {

@Select("select metting_id from tab_user_metting where user_id=#{id}")
    List<Integer> findByUserId(@Param("id") Integer id);


    @Select("select user_id from tab_user_metting where metting_id=#{id}")
    List<Integer> findByMId(@Param("id") Integer id);
}
