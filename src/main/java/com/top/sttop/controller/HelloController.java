package com.top.sttop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sttop2
 * @date 2019/11/21 16:06
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return  "Hello Spring  Boot ";
    }
}
