package com.top.sttop.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author sttop2
 * @date 2019/11/21 16:06
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return  "hello";
    }
}
