package com;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.*;

public class JavaLogging14_LogManagerReadingConfigurationFile {
    public  static Logger logger = Logger.getLogger(JavaLogging14_LogManagerReadingConfigurationFile.class.getName());

    public static void main(String[] args) throws IOException, URISyntaxException {


        LogManager.getLogManager().readConfiguration(JavaLogging14_LogManagerReadingConfigurationFile.class.getClassLoader().getResourceAsStream("logging.properties"));


        FileHandler filehandler = new FileHandler("%h/java%u.log");
        filehandler.setFormatter(new SimpleFormatter());

        logger.addHandler(filehandler);


        logger.setLevel(Level.FINE);
        logger.log(Level.INFO,"log the mesg");
        logger.log(Level.CONFIG,"config message");
        logger.log(Level.FINE,"Fine message");

    }
}

