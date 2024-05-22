package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

class infoLog {
    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public void sampleLog(String message) {

        LOGGER.log(Level.INFO, message);
    }
}
