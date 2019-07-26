package com.czxy.score.dao;


import com.czxy.score.domain.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {

    @Select("select * from tab_user where username=#{username} and password=#{password}")
    @Results({
            @Result(property = "userId",column = "user_id")
    })
    public User login(User user);

}
