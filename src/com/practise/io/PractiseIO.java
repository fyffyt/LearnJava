/**
 * 
 */
package com.practise.io;

import java.util.*;
import java.io.*;
import java.util.regex.*;

/**
 * @author jolyon
 *
 */
public class PractiseIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File(".");
		String[] list = dir.list();
		System.out.println(Arrays.toString(list));
	}

}
