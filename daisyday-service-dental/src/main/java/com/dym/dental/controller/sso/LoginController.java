package com.dym.dental.controller.sso;

import com.alibaba.fastjson.JSONObject;
import com.dym.dental.result.RestResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/**
 * 查询物流接口
 * @author daisyday
 *
 */
@Controller
@RequestMapping("/user")
public class LoginController {


//    @ResponseBody
//    @RequestMapping("/login")
//    public JSONObject login(String password,String account,String verification_code){
//        Map<String,Object> map=new HashMap<>();
//        map.put("passpord",password);
//        map.put("account",account);
//        map.put("verification_code",verification_code);
//        return RestResponse.success();
//    }

    @RequestMapping("/login")
    public String  login(String password,String account,String verification_code){
        Map<String,Object> map=new HashMap<>();
        map.put("passpord",password);
        map.put("account",account);
        map.put("verification_code",verification_code);
        return "list-1";
    }

}
