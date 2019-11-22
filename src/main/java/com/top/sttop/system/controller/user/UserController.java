package com.top.sttop.system.controller.user;

import com.top.sttop.system.pojo.UserPo;
import com.top.sttop.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author sttop2
 * @date 2019/11/21 17:08
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/userList")
    public String listUser(Model model){
        List<UserPo> list = userService.findAll();
        model.addAttribute("userList",list.get(0));
        return "modules/user/userList";
    }
}
