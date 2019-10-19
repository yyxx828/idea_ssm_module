package com.yang.dao;

import com.yang.pojo.Users;
import org.apache.ibatis.annotations.Insert;

public interface UsersDao {

//    @Insert("insert into users(username,userage) value(#{username},#{userage})")
    void insertUsers(Users users);

//    List<Users> selectUserAll();
}
