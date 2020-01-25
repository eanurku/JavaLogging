package com;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLogging1_ClassLoggerInstance {
    public static Logger logger = Logger.getLogger(JavaLogging1_ClassLoggerInstance.class.getName());

    public static void main(String[] args) {

        logger.log(Level.INFO,"this is info");

    }
}
