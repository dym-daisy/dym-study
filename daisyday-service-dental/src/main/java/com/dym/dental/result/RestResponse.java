package com.dym.dental.result;

import com.alibaba.fastjson.JSONObject;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.dym.dental.result.AppConstant.success;
import static com.dym.dental.result.AppMessageCode.*;


public class RestResponse {
    /**
     * success返回数据
     * @param map
     * @return
     */
    public  static JSONObject success(Map<String,Object> map ,Integer code,String info){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", SUCCESS);
        jsonObject.put("data", map);
        jsonObject.put("info", info);
        return jsonObject;
    }
    /**
     * success返回数据
     * @param map
     * @return
     */
    public  static JSONObject success(Map<String,Object> map){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", SUCCESS);
        jsonObject.put("data", map);
        jsonObject.put("info", ErrorInfo(SUCCESS));
        return jsonObject;
    }

    /**
     * 成功响应参数
     * @param msg
     * @return
     */
    public  static JSONObject success(String msg){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", SUCCESS);

        jsonObject.put("info", msg);
        return jsonObject;
    }
    /**
     * success返回状态
     * @return
     */
    public  static JSONObject success(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", SUCCESS);
        jsonObject.put("info", ErrorInfo(SUCCESS));
        return jsonObject;
    }
    /**
     * 返回错误信息
     * @return
     */
    public  static JSONObject error(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", SERVER_ERROR);
        jsonObject.put("info", ErrorInfo(SERVER_ERROR));
        return jsonObject;
    }

    /**
     * 返回错误信息
     * @param msg
     * @return
     */
    public  static JSONObject error(String msg){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", SERVER_ERROR);
        jsonObject.put("info", msg);
        return jsonObject;
    }

    /**
     * 返回错误信息
     * @param info
     * @return
     */
    public  static JSONObject json(String info){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", NOT_NULL);
        jsonObject.put("info", info);
        return jsonObject;
    }

    /**
     * 返回参数不能为空
     * @return
     */
    public  static JSONObject notNull(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", NOT_NULL);
        jsonObject.put("info", "参数不能为空");
        return jsonObject;
    }
    /**
     * 返回错误状态
     * @param code
     * @return
     */
    public  static JSONObject json(Integer code){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", code);
        jsonObject.put("info", ErrorInfo(code));
        return jsonObject;
    }
    /**
     * 返回错误状态，错误信息
     * @param code
     * @return
     */
    public static JSONObject json(Integer code,String info){
        JSONObject result = new JSONObject();
        result.put("status", code);
        result.put("info",info);
        return result;
    }

    /**
     * 判断json里的值是否为空
     * @param param
     * @return
     */
    public static String validataParam(JSONObject param,Map<String,Object> map){
        String info = success;
        if(map != null){
            Set<String> keyMap = map.keySet();
            Iterator<String> iteratorMap = keyMap.iterator();
            while(iteratorMap.hasNext()) {
                String key = (String) iteratorMap.next();
                if(param == null){
                    info = "paramMap is null";
                    break;
                }
                String value = param.getString(key);
                if (isEmpty(value)) {
                    info = key + " is null";
                    break;
                }
            }
        }
        return info;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

}


