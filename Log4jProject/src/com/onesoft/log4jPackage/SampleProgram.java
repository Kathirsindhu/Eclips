package com.onesoft.log4jPackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SampleProgram {
	static Logger log = Logger.getLogger(FirstProgram.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.info("Information");
		log.warn("warning");
		log.error("ErrorOccurs");
		log.debug("debugging");
		log.fatal("critical error");
	}
}
