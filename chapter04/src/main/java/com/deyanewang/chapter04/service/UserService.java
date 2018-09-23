package com.deyanewang.chapter04.service;


import com.deyanewang.chapter04.entity.TUser;

import java.util.List;

public interface UserService {
    List<TUser> select(TUser user);
    void insert(TUser user);
    void update(TUser user);
    void delete(TUser user);
}
