package com.yucong.cloudvideo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yucong.cloudvideo.sign.Sign;

@RestController
@RequestMapping("create")
public class CreateVirtualMoble {

    private static String URL = "http://103.20.114.60/access/rest/v200/batchCreateVirtualUser";
    private static String KEY = "e10adc3949ba59abbe56e057f20f883e";
    private static String IDENTITY = "5b357915281c0fef984cd974bcd07f17";
    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "virtual", method = {RequestMethod.POST})
    public String createVirtualMoble() {
        JSONObject jsonObject = new JSONObject();

        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("mobile", "1875233449" + i);
            map.put("name", "Tom" + i);
            map.put("isTrial", "1");// 0 为付费，1 为试用
            list.add(map);
        }

        Map<String, String> parameters = new HashMap<>();
        parameters.put("mobile", "18752334498");
        parameters.put("password", "123456");
        parameters.put("isTrai", "1");
        parameters.put("identity", IDENTITY);
        String sign = Sign.sign(KEY, parameters);

        jsonObject.put("identity", "00b74e215123334560942b4d4fc8a766"); // 厂商标识
        jsonObject.put("orgCode", "220");// 企业编码
        jsonObject.put("timestamp", new Date().getTime());// 请求时间戳
        jsonObject.put("endTime", "");// 截止日期（可选）
        jsonObject.put("sign", sign);// 根据签名算法生成的签名
        jsonObject.put("users", list);// 用户信息数组

        System.out.println("请求参数：" + jsonObject.toJSONString());
        JSONObject object = restTemplate.postForObject(URL, jsonObject, JSONObject.class);
        System.out.println("返回参数：" + object.toJSONString());
        return JSON.toJSONString(object);
    }



}
