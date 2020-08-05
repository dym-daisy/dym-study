package com.dym.daisydaywebmail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @RequestMapping("hello")
    @ResponseBody
    public String hello(){

        return "hello";
    }

    public static void main(String[] args) {
         int num =2147483647;
         num+=2L;
        System.out.println(num);

    }
}
