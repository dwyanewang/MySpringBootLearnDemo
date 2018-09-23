package com.dwyanewang.chapter03.controller;

import com.dwyanewang.chapter03.entity.TUser;
import com.dwyanewang.chapter03.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/api/select")
    public List<TUser> select(TUser user) {
        System.out.println(user.toString());
//        PageHelper.startPage(1, 2);
        return userService.select(user);
    }

    @PostMapping("/api/insert")
    public void insert(TUser user) {
        System.out.println(user.toString());
        userService.insert(user);
    }

    @PutMapping("/api/update")
    public void update(TUser user) {
        System.out.println(user.toString());
        userService.update(user);
    }

    @DeleteMapping("/api/delete")
    public void delete(TUser user) {
        System.out.println(user.toString());
        userService.delete(user);
    }
}
