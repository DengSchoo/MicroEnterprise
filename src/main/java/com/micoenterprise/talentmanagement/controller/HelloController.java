package com.micoenterprise.talentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Controller
public class HelloController {
    public String index() {
        return "index";
    }
}
