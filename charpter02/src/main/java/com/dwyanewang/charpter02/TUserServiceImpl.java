package com.dwyanewang.charpter02;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TUserServiceImpl implements TUserService {

    @Resource
    private TUserMapper userMapper;
    @Override
    public List<TUser> listUsers() {
        return userMapper.listUsers();
    }

    @Override
    public int addUser(TUser user) {
        return userMapper.addUser(user);
    }

    @Override
    public void updateUserName(String name, int id) {
        userMapper.updateUserName(name, id);
    }

    @Override
    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }
}
