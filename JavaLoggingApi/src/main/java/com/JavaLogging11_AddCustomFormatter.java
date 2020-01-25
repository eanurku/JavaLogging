package com;

import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

public class JavaLogging11_AddCustomFormatter {
    public  static Logger logger = Logger.getLogger(JavaLogging11_AddCustomFormatter.class.getName());
    public static void main(String[] args) throws IOException {

        FileHandler filehandler = new FileHandler("JavaLoggingApi/logs/abc.txt");

        filehandler.setFormatter(new MyFormatter());
        logger.addHandler(filehandler);

        logger.setLevel(Level.FINE);
        logger.log(Level.INFO,"log the mesg");
        logger.log(Level.CONFIG,"config message");
        logger.log(Level.FINE,"Fine message");

    }
}

class MyFormatter extends Formatter {


    @Override
    public String format(LogRecord logRecord) {
        return new Date(logRecord.getMillis())+"::"+logRecord.getThreadID()+"::"+logRecord.getSourceClassName()+"::"+logRecord.getSourceMethodName()+"::"+logRecord.getMessage()+"\n";
    }
}
