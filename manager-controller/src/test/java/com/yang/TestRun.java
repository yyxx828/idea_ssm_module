package com.yang;

import com.yang.dao.UsersDao;
import com.yang.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContent-dao.xml")
public class TestRun {

    @Autowired
    private UsersDao usersDao;

    @Test
    public void test1(){
        System.out.println(usersDao);
        Users users = new Users();
        users.setUsername("再测测试");
        users.setUserage(332);
        usersDao.insertUsers(users);
        System.out.println("插入成功！！！");
    }
}
