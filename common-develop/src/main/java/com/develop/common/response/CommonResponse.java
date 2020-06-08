package com.develop.common.response;

import com.develop.common.content.CommonContent;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用response返回格式
 */
public class CommonResponse {

    /**
     * 成功调用 无数据返回
     * 返回格式为 {"msg":"success","code":"0000"}
     *
     * @return map
     */
    public static Map success() {

        HashMap<String, Object> map = new HashMap<>();
        map.put(CommonContent.RESPONSE_CODE, CommonContent.RESPONSE_CODE_SUCCESS);
        map.put(CommonContent.RESPONSE_MSG, CommonContent.RESPONSE_MSG_SUCCESS);

        return map;
    }


    /**
     * 成功调用 有数据返回
     * 返回格式为 {"msg":"success","code":"0000","data":object}
     *
     * @param object
     * @return map
     */
    public static Map success(Object object) {

        HashMap<String, Object> map = new HashMap<>();
        map.put(CommonContent.RESPONSE_CODE, CommonContent.RESPONSE_CODE_SUCCESS);
        map.put(CommonContent.RESPONSE_MSG, CommonContent.RESPONSE_MSG_SUCCESS);
        map.put(CommonContent.RESPONSE_DATA, object);

        return map;
    }


    /**
     * 失败调用 无数据返回
     * 返回格式为 {"msg":"failed","code":"9999"}
     *
     * @return map
     */
    public static Map failed() {

        HashMap<String, Object> map = new HashMap<>();
        map.put(CommonContent.RESPONSE_CODE, CommonContent.RESPONSE_CODE_FAILED);
        map.put(CommonContent.RESPONSE_MSG, CommonContent.RESPONSE_MSG_FAILED);

        return map;
    }


    /**
     * 失败调用 有数据返回
     * 返回格式为 {"msg":"failed","code":"9999","data":object}
     *
     * @return map
     */
    public static Map failed(Object object) {

        HashMap<String, Object> map = new HashMap<>();
        map.put(CommonContent.RESPONSE_CODE, CommonContent.RESPONSE_CODE_FAILED);
        map.put(CommonContent.RESPONSE_MSG, CommonContent.RESPONSE_MSG_FAILED);
        map.put(CommonContent.RESPONSE_DATA, object);

        return map;
    }


    /**
     * 自定义调用 无数据返回
     * 返回格式为 {"msg":msg,"code":code}
     *
     * @return map
     */
    public static Map custom(String code, String msg) {

        HashMap<String, Object> map = new HashMap<>();
        map.put(CommonContent.RESPONSE_CODE, code);
        map.put(CommonContent.RESPONSE_MSG, msg);

        return map;
    }


    /**
     * 自定义调用 有数据返回
     * 返回格式为 {"msg":msg,"code":code,"data":data}
     *
     * @return map
     */
    public static Map custom(String code, String msg, Object object) {

        HashMap<String, Object> map = new HashMap<>();
        map.put(CommonContent.RESPONSE_CODE, code);
        map.put(CommonContent.RESPONSE_MSG, msg);
        map.put(CommonContent.RESPONSE_DATA, object);

        return map;
    }
}
