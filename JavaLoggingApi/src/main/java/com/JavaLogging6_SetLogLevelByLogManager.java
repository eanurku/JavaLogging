package com;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JavaLogging6_SetLogLevelByLogManager {
    public static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        LogManager.getLogManager().getLogger("").setLevel(Level.SEVERE);//log level set to SEVERE for rootLogger

        logger.log(Level.INFO,"test message will not be logged");
    }
}
