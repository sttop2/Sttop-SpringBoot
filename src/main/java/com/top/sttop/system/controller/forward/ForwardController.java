package com.top.sttop.system.controller.forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sttop2
 * @date 2019/11/26 16:07
 */

@Controller
public class ForwardController {

    /**
     *  初始页面跳转
     */

    //去登录页面
    @RequestMapping(value={"/toLogin","/",""})
    public String toLog(){
        return "login";
    }

    //去首页
    @RequestMapping(value="/toIndex")
    public String toIndex(){
        return "index";
    }

    //欢迎页面
    @RequestMapping(value="/toWelcome")
    public String toWelcome(){
        return "welcome";
    }

    //设置密码
    @RequestMapping(value="/setPWD")
    public String setPWD(){
        return "password/password";
    }

}
