package com.practise.log4j;

import org.apache.log4j.*;

class BaseClass {
	private Logger logger = Logger.getLogger(getClass());
	public void log (){
			
			// 记录debug级别的信息
			logger.debug("This is debug message.");
			// 记录info级别的信息
			logger.info("This is info message.");
			// 记录error级别的信息
			logger.error("This is error message.");
		
	}
}

class SubClass extends BaseClass{
	private Logger logger = Logger.getLogger(getClass());
}

public class PractiseLog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println("This is println message.");
		
//		SubClass sub1 = new SubClass();
//		sub1.log();
		BaseClass base1 = new BaseClass();
		base1.log();
		
	}
}