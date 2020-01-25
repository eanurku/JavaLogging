package com;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JavaLogging3_LogManagerWithGlobalLoggerInstance {

    public static void main(String[] args) {

        LogManager logManager = LogManager.getLogManager();
        Logger logger = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);

        logger.log(Level.INFO,"this is log message");




    }
}
