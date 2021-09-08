package com.capgemini.log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class LogDemo {

	public static void main(String[] args) {
		Logger myLogger= Logger.getLogger(LogDemo.class.getName());
		PropertyConfigurator.configure("resources/log4j.properties");
		int a=-1;
		boolean flag=false;
		myLogger.info("Logging information for LogDemo");
		myLogger.debug("Code debugging started");
		if(a<0) {
			myLogger.warn("This is last warning");
			
		}
		if(flag==false) {
			myLogger.error("Error occured due to false value ");
		}

	}

}
