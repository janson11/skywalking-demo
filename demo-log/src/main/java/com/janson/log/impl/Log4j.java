package com.janson.log.impl;

import com.janson.log.Log;

/**
 * @Description:
 * @Author: shanjian
 * @Date: 2021/11/30 1:57 下午
 */
public class Log4j implements Log {
    @Override
    public void log(String info) {
        System.out.println("Log4j:"+info);
    }
}
