package com.onesoft.log4jPackage;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class FirstProgram {
	static Logger log = Logger.getLogger(FirstProgram.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("Information");
		log.warn("warning");
		log.error("ErrorOccurs");
		log.debug("debugging");
		log.fatal("critical error");
	}
}
