package com.janson.log.impl;

import com.janson.log.Log;

/**
 * @Description:
 * @Author: shanjian
 * @Date: 2021/11/30 11:40 上午
 */
public class Logback implements Log {
    @Override
    public void log(String info) {
        System.out.println("Logback："+info);
    }
}
