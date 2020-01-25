package com;

import java.io.IOException;
import java.util.logging.*;

public class JavaLogging9_AddFilehandler {
    public  static Logger logger = Logger.getLogger(JavaLogging9_AddFilehandler.class.getName());
    public static void main(String[] args) throws IOException {

        FileHandler filehandler = new FileHandler("JavaLoggingApi/log/abc.txt");
        logger.addHandler(filehandler);
        
        logger.log(Level.INFO,"log the mesg");
    }
}
