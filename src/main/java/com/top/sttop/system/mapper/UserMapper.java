package com.top.sttop.system.mapper;

import com.top.sttop.system.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author sttop2
 * @date 2019/11/21 17:12
 */

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {

//    @Select("select * from user")
    List<User> findAll();
}
