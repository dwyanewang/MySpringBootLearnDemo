package com.deyanewang.chapter04.controller;


import com.deyanewang.chapter04.entity.TUser;
import com.deyanewang.chapter04.service.UserService;
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
