package com;

import java.io.IOException;
import java.util.logging.*;

public class JavaLogging10_AddSimpleFormatter {
    public  static Logger logger = Logger.getLogger(JavaLogging10_AddSimpleFormatter.class.getName());
    public static void main(String[] args) throws IOException {

        FileHandler filehandler = new FileHandler("JavaLoggingApi/log/abc.txt");
        filehandler.setFormatter(new SimpleFormatter());
        logger.addHandler(filehandler);
        
        logger.log(Level.INFO,"log the mesg");
    }
}
