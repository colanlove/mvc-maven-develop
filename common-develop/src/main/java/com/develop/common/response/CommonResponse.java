package com.develop.common.response;

import com.develop.common.content.CommonContent;

import java.util.HashMap;
import java.util.Map;

public class CommonResponse {

    public static Map success() {

        HashMap<String, Object> map = new HashMap<>();
        map.put(CommonContent.RESPONSE_SUCCESS_CODE, CommonContent.RESPONSE_SUCCESS_CODE_STR);
        map.put(CommonContent.RESPONSE_SUCCESS_MSG, CommonContent.RESPONSE_SUCCESS_MSG_STR);

        return map;
    }


    public static Map success(Object object) {

        HashMap<String, Object> map = new HashMap<>();
        map.put(CommonContent.RESPONSE_SUCCESS_CODE, CommonContent.RESPONSE_SUCCESS_CODE_STR);
        map.put(CommonContent.RESPONSE_SUCCESS_MSG, CommonContent.RESPONSE_SUCCESS_MSG_STR);
        map.put(CommonContent.RESPONSE_DATA, object);

        return map;
    }
}
