package com.top.sttop.system.service;

import com.top.sttop.common.utils.JsonResult;
import com.top.sttop.system.model.User;
import com.top.sttop.system.model.vo.UserVo;

import java.util.List;

/**
 * @author sttop2
 * @date 2019/11/21 17:13
 */
public interface UserService {

    List<User> listUser();

    User selectUserById(Integer id);

    JsonResult<User> userLogin(User user);

}
