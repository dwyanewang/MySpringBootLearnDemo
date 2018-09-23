package com.dwyanewang.chapter03.service.impl;

import com.dwyanewang.chapter03.dao.mapper.UserMapper;
import com.dwyanewang.chapter03.entity.TUser;
import com.dwyanewang.chapter03.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

   @Resource
    UserMapper userMapper;

    @Override
    public List<TUser> select(TUser user) {
        return userMapper.select(user);
    }

    @Override
    public void insert(TUser user) {
        userMapper.insert(user);
    }

    @Override
    public void update(TUser user) {
        userMapper.update(user);
    }

    @Override
    public void delete(TUser user) {
        userMapper.delete(user);
    }
}
