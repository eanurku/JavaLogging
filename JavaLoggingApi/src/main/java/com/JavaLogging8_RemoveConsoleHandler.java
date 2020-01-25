package com;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLogging8_RemoveConsoleHandler {
    public  static Logger logger = Logger.getLogger(JavaLogging8_RemoveConsoleHandler.class.getName());
    public static void main(String[] args) throws IOException {


        Logger rootLogger = Logger.getLogger("");

        System.out.println("before :root handlers count:"+rootLogger.getHandlers().length);
        System.out.println("before :local handlers count:"+logger.getHandlers().length);

        Handler[] handlers = rootLogger.getHandlers();
        for(int i=0;i<handlers.length;i++){
            if(handlers[i] instanceof ConsoleHandler)
                rootLogger.removeHandler(handlers[i]);
        }
        System.out.println("After:root handlers count:"+logger.getHandlers().length);
        System.out.println("After:local handlers count:"+rootLogger.getHandlers().length);

        logger.log(Level.INFO,"log the mesg");
    }
}
