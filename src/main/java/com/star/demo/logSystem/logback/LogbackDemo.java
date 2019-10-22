package com.star.demo.logSystem.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version V1.0
 * @class: LogbackDemo
 * @description:
 * @author: xuzheng
 * @create: 2019-10-18 16:37
 **/
public class LogbackDemo {

    static Logger logger = LoggerFactory.getLogger(LogbackDemo.class);

    public static void main(String[] args) {
        logger.info("Hello Logback !");
    }
}
