package com;

import java.io.IOException;
import java.util.logging.*;

public class JavaLogging13_Customhandler {

    public static Logger logger=Logger.getLogger(JavaLogging13_Customhandler.class.getName());


    public static void main(String[] args) throws IOException {

        FileHandler filehandler=new FileHandler("JavaLoggingApi/logs/customHandler.txt");
        filehandler.setFormatter(new SimpleFormatter());
        logger.addHandler(filehandler);
        logger.addHandler(new MyHandler());

        logger.log(Level.INFO,"log the mesg");

    }
}

class MyHandler extends StreamHandler{

    @Override
    public void publish(LogRecord logRecord) {

        //add logic
//        if(logRecord.getLevel()==Level.INFO)
//        return;

        super.publish(logRecord);

    }

    @Override
    public void flush() {
        super.flush();

    }

    @Override
    public void close() throws SecurityException {

        super.close();
    }
}