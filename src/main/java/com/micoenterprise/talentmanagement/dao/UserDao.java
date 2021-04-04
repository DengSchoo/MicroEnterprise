package com.micoenterprise.talentmanagement.dao;

import com.micoenterprise.talentmanagement.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("SELECT username, password, type FROM users WHERE username=#{username} AND password=#{password}")
    User getUserByUsernameAndPassword(String username, String password);
}
