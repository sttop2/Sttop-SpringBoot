package com.top.sttop.system.mapper;

import com.top.sttop.system.pojo.UserPo;
import com.top.sttop.system.pojo.UserPoExample;
import java.util.List;

public interface UserPoMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserPo record);

    int insertSelective(UserPo record);

    List<UserPo> selectByExample(UserPoExample example);

    UserPo selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserPo record);

    int updateByPrimaryKey(UserPo record);
}