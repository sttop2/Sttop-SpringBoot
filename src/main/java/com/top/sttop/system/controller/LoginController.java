package com.top.sttop.system.controller;

import com.top.sttop.common.utils.JsonResult;
import com.top.sttop.system.model.User;
import com.top.sttop.system.model.vo.UserVo;
import com.top.sttop.system.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author sttop2
 * @date 2019/11/28 11:47
 */

@Controller
@RequestMapping("/login")
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    UserService userService;

    @RequestMapping("/userLogin")
    @ResponseBody
    public JsonResult<User> toLogin(User user , HttpServletRequest request){

        JsonResult<User> result = userService.userLogin(user);
        if(result.getState() == 0){
            User u = userService.selectUserById(result.getData().getUserId());
            request.getSession().setAttribute("user",u);
            request.getSession().setAttribute("loginName",user.getUsername());
            logger.warn(user.getUsername()+" 登陆成功");
        }
        return result;
    }
}
