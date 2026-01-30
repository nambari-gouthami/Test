package demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j2 {
	private static Logger logger=LogManager.getLogger(log4j2.class);
	public static void main(String[] args) {
		System.out.println("hello world");
		logger.info("This is a information message");
		logger.trace("This is debug message");
		logger.debug("debug mode");
		System.out.println("completed");
	}

}
