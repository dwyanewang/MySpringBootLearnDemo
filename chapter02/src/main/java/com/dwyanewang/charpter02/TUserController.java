package com.dwyanewang.charpter02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TUserController {
    private final TUserService userService;

    @Autowired
    public TUserController(TUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/list")
    public List<TUser> list(){
        return userService.listUsers();
    }

    @PostMapping("/api/addUser")
    public int addUser(TUser user){
        return userService.addUser(user);
    }

    @PostMapping("/api/updateUser")
    public void updateUser(String name,int id){
        userService.updateUserName(name,id);
    }

    @PostMapping("/api/deleteUser")
    public void deleteUser(int id){
        userService.deleteUser(id);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
