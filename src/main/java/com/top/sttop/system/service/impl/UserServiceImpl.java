package com.top.sttop.system.service.impl;

import com.top.sttop.common.utils.JsonResult;
import com.top.sttop.system.mapper.UserMapper;
import com.top.sttop.system.model.User;
import com.top.sttop.system.model.vo.UserVo;
import com.top.sttop.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author sttop2
 * @date 2019/11/21 17:14
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     *  获取用户列表
     */
    @Override
    public List<User> listUser() {
        return  userMapper.selectAll();
    }

    /**
     *  根据ID获取用户信息
     */
    @Override
    public User selectUserById(Integer id) {
        User user=userMapper.selectByPrimaryKey(id);
        return user;
    }

    /**
     *  获取用户登录信息
     */
    @Override
    public JsonResult<User> userLogin(User user) {
        JsonResult<User> result = new JsonResult<User>();

        User u = userMapper.selectOne(user);
        if(null == u){
            result.setState(1);
            result.setMessage("用户名或密码错误");
        }else {
            result.setState(0);
            result.setData(u);
        }
        return result;
    }

}
