package com.top.sttop.system.mapper;

import com.top.sttop.system.pojo.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sttop2
 * @date 2019/11/21 17:12
 */

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<UserPo> {

    @Select("select * from user")
    List<UserPo> findAll();
}
