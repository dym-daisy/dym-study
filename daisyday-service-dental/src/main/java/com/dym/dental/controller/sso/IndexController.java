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


//    @RequestMapping("/")
//    public String hello(){
//        return  "index";
//    }
    @RequestMapping("/login")
    public String login(){
        return  "login";
    }

}
