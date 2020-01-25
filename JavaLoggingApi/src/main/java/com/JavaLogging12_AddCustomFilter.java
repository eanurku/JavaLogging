package com;

import java.io.IOException;
import java.util.logging.*;

public class JavaLogging12_AddCustomFilter {
    public  static Logger logger = Logger.getLogger(JavaLogging12_AddCustomFilter.class.getName());
    public static void main(String[] args) throws IOException {

        FileHandler filehandler = new FileHandler("JavaLoggingApi/log/abc.txt");
        filehandler.setFormatter(new SimpleFormatter());

        filehandler.setFilter(new MyFilter());
        logger.addHandler(filehandler);

        logger.setLevel(Level.FINE);
        logger.log(Level.INFO,"log the mesg");
        logger.log(Level.CONFIG,"config message");
        logger.log(Level.FINE,"Fine message");

    }
}

class MyFilter implements Filter{


    @Override
    public boolean isLoggable(LogRecord logRecord) {

        if(logRecord.getLevel()==Level.CONFIG)
            return  false;
        return true;
    }
}
