package com.top.sttop.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sttop2
 * @date 2019/11/26 17:08
 */
@RequestMapping("/test")
@Controller
public class TestController {

    @RequestMapping("/{fileName}")
    public String index(@PathVariable String fileName){
        return fileName;
    }
}
