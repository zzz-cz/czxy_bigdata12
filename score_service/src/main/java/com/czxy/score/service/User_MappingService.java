package com.czxy.score.service;

import com.czxy.score.dao.User_MettingMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class User_MappingService {

    @Resource
    private User_MettingMapper user_mettingMapper;


    public List<Integer> findbyId(Integer id){
        return user_mettingMapper.findByUserId(id);
    }
}
