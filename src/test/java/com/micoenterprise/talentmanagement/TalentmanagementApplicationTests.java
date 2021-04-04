package com.micoenterprise.talentmanagement;

import com.micoenterprise.talentmanagement.dao.UserDao;
import com.micoenterprise.talentmanagement.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.SQLException;

@SpringBootTest
class TalentmanagementApplicationTests {
    @Autowired
    DataSource dataSource;

    @Autowired
    UserDao userDao;

    User user = new User("1", "2", 3);

    @Test
    void contextLoads() {
        System.out.println(userDao.getUserByUsernameAndPassword("admin", "123"));
    }

}
