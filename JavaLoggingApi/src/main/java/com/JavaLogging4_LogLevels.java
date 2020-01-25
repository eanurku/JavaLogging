package com;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLogging4_LogLevels {
    public  static Logger logger = Logger.getLogger(JavaLogging4_LogLevels.class.getName());

    public static void main(String[] args) {


        logger.setLevel(Level.SEVERE);
        logger.log(Level.INFO,"1.test mesg will not be logged");
        logger.log(Level.WARNING,"1.test mesg will not be logged");
        logger.log(Level.CONFIG,"1.test mesg will not be logged");


        logger.setLevel(Level.INFO);
        logger.log(Level.INFO,"2.test mesg will  be logged");
        logger.log(Level.WARNING,"2.test mesg will  be logged");
        logger.log(Level.CONFIG,"2.test mesg will not be logged");

    }
}
