package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.trace("Trace log - for fine-grained debugging");
        logger.debug("Debug log - for general debugging");
        logger.info("Info log - for normal application flow");
        logger.warn("Warning log - something unexpected, but not a failure");
        logger.error("Error log - something went wrong");
    }
}
