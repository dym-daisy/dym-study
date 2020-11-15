package com.dym.dental.controller.sso;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 查询物流接口
 * @author daisyday
 *
 */
@Controller
public class IndexController {


    @RequestMapping("/")
    public String hello(){
        return  "vue_net";
    }
    @RequestMapping("/login")
    public String login(){
        return  "form-login";
    }

    @RequestMapping("/login1")
    public String login1(){
        return  "list-1";
    }

}
