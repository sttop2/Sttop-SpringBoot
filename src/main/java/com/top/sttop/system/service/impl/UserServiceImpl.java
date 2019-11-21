package com.top.sttop.system.service.impl;

import com.top.sttop.system.mapper.UserMapper;
import com.top.sttop.system.pojo.UserPo;
import com.top.sttop.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sttop2
 * @date 2019/11/21 17:14
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserPo> findAll() {
        return  userMapper.selectAll();
//        return userMapper.findAll();
    }
}
