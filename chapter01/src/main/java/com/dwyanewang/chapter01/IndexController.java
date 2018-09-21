package com.dwyanewang.chapter01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dwyanewang
 */
@RestController
public class IndexController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
