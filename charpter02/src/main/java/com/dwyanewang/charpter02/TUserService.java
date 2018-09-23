package com.dwyanewang.charpter02;

import java.util.List;

public interface TUserService {
    List<TUser> listUsers();
    int addUser(TUser user);
    void updateUserName(String name,int id);
    void deleteUser(int id);
}
