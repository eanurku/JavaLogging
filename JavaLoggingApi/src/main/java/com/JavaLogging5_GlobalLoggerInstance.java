package com;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLogging5_GlobalLoggerInstance {

    public static Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main(String[] args) {

        LOGGER.log(Level.CONFIG,"this is start of app");



    }
}
