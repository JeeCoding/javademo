package com.huzh.grab.service;

import cn.hutool.http.HttpUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author huzh
 * @date 2020/7/2 9:46
 */
@Slf4j
public class GetHTML {


    public static void urlControl(Map<String, String> bookUrlMap) {

        for (Map.Entry<String, String> entry : bookUrlMap.entrySet()) {

            ParseHTML.parseBook(HttpUtil.get(entry.getValue()), entry.getKey());

            log.info("============" + entry.getKey() + "============");
        }
    }
}
