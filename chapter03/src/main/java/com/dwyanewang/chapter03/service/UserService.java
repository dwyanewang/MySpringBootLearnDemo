package com.dwyanewang.chapter03.service;

import com.dwyanewang.chapter03.entity.TUser;

import java.util.List;

public interface UserService {
    List<TUser> select(TUser user);
    void insert(TUser user);
    void update(TUser user);
    void delete(TUser user );
}
