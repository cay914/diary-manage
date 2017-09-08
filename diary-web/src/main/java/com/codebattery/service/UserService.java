package com.codebattery.service;

import com.codebattery.dao.UserMapper;
import com.codebattery.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/7/24.
 */
@Service
public class UserService {
    /**
     *
     */
    @Resource
    private UserMapper userMapper;
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
