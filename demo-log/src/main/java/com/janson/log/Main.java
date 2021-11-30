package com.janson.log;

import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Description:
 * @Author: shanjian
 * @Date: 2021/11/30 2:03 下午
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        ServiceLoader<Log> serviceLoader = ServiceLoader.load(Log.class);
        Iterator<Log> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            Log next = iterator.next();
            next.log("JDK SPI");
        }

    }
}
