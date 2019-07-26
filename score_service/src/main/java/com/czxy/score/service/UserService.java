package com.czxy.score.service;

import com.czxy.score.domain.User;

import java.util.List;

public interface UserService {

    public User login(User user);

    User findById(Integer id);
    List<User> find(Integer id);
}
