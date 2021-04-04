package com.micoenterprise.talentmanagement.controller;

import com.micoenterprise.talentmanagement.dao.UserDao;
import com.micoenterprise.talentmanagement.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    UserDao userDao;

    @GetMapping("/loginPage")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(String username, String password){
        User user = null;
        user = userDao.getUserByUsernameAndPassword(username, password);
        if(user != null){
            System.out.println(user);
            return "登陆成功";
        }else{
            return "登陆失败";
        }
    }
}
