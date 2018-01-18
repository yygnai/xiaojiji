package com.yy.service.impl;

import com.yy.mapper.UserMapper;
import com.yy.service.UserService;
import com.yy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 595703420@qq.com
 * @date 2018/1/18 0018 下午 4:31
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean save(User user) {
        userMapper.insert(user);
        return false;
    }
}
