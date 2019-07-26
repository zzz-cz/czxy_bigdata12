package com.czxy.score.service.impl;

import com.czxy.score.dao.UserMapper;
import com.czxy.score.dao.User_MettingMapper;
import com.czxy.score.domain.User;
import com.czxy.score.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Resource
    private User_MettingMapper user_mettingMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> find(Integer mid) {
        List<Integer> byMId = user_mettingMapper.findByMId(mid);
        List<User> userList = new ArrayList<>();
        for (Integer integer : byMId) {
            userList.add(userMapper.selectByPrimaryKey(integer));
        }
        return userList;
    }


}
