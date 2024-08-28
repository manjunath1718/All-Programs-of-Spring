package com.telusko;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jTest {

	private final static Logger logger=LogManager.getLogger(Log4jTest.class);
		
	public static void main(String[] args) {
		process();
	}
	
	public static void process() {
		
		logger.trace("FROM THE TRACE METHOD");
		logger.debug("FROM THE DEBUG METHOD");
		logger.info("FROM THE INFO METHOD");
		logger.warn("FROM THE WARN METHOD");
		logger.error("FROM THE ERROR METHOD");
		logger.fatal("FROM THE FATAL METHOD");
	}
	
	
}
