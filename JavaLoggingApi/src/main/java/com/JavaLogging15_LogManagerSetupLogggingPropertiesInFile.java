package com;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.*;

public class JavaLogging15_LogManagerSetupLogggingPropertiesInFile {
    public  static Logger logger = Logger.getLogger(JavaLogging15_LogManagerSetupLogggingPropertiesInFile.class.getName());

    public static void main(String[] args) throws IOException, URISyntaxException {


        LogManager.getLogManager().readConfiguration(JavaLogging15_LogManagerSetupLogggingPropertiesInFile.class.getClassLoader().getResourceAsStream("logging2.properties"));

        logger.setLevel(Level.FINE);
        logger.log(Level.INFO,"log the mesg");
        logger.log(Level.CONFIG,"config message");
        logger.log(Level.FINE,"Fine message");

    }
}

