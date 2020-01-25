package com;

import java.util.logging.Logger;

public class JavaLogging7_RootLogger {

    public static  Logger rootLogger=Logger.getLogger("");//root logger
    public static  Logger logger=Logger.getLogger(JavaLogging7_RootLogger.class.getName());//this class level logger is also instance of root logger
    public static  Logger globalLogger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);//global logger is child of root logger

    public static void main(String[] args) {

        System.out.println(rootLogger);
        System.out.println(rootLogger.getParent());
        System.out.println(logger.getParent());
        System.out.println(globalLogger.getParent());

    }
}
