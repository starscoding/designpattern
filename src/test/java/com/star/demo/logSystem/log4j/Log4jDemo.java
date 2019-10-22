package com.star.demo.logSystem.log4j;

import org.apache.log4j.Logger;

/**
 * Created by Smile on 2019/10/16.
 */
public class Log4jDemo {

    static Logger logger = Logger.getLogger(Log4jDemo.class);

    public static void main(String[] args) {

        logger.info("Hello log4j!");
    }
}
