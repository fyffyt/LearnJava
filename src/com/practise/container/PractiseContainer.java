package com.practise.container;

import java.util.Arrays;
import java.lang.reflect.*;

public abstract class PractiseContainer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> demo = null;
		try {
			demo = Class.forName("java.util.Arrays");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method [] methods = demo.getMethods();
		
		for (Method method:methods){
			System.out.println(method.toString());
		}
		

	}

}
