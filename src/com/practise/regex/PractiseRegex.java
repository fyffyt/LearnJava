/**
 * 
 */
package com.practise.regex;

import java.util.regex.*;
/**
 * @author jolyon
 *
 */
public class PractiseRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("\\d{4}");
		Matcher m = pattern.matcher("03-04-2015-2017");
		System.out.println(m.matches());
		while(m.find()){
			System.out.println(m.group());
		}
		

	}

}
