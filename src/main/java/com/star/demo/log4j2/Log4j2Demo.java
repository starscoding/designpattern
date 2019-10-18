package com.star.demo.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @version V1.0
 * @class: Log4j2Demo
 * @description:
 * @author: xuzheng
 * @create: 2019-10-17 17:31
 **/
public class Log4j2Demo {

    static Logger logger = LogManager.getLogger(Log4j2Demo.class);
    static Logger logge2 = LogManager.getLogger(Log4j2Demo.class);

    public static void main(String[] args) {
        logger.info("Hello log4j2 !");
        logge2.debug("Hello log4j2 !");
    }
}
