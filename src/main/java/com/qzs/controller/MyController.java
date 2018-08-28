package com.qzs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("list")
    public String list(){
        System.out.println("-----------------------------------------------------------");
        return "list";
    }
}
