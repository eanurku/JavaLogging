package com;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JavaLogging2_LogManager {
    public static Logger locallogger = Logger.getLogger(JavaLogging2_LogManager.class.getName());

    public static void main(String[] args) {

        LogManager logManager = LogManager.getLogManager();
        Logger logger = logManager.getLogger(locallogger.getName());

        logger.log(Level.INFO,"this is log message");




    }
}
