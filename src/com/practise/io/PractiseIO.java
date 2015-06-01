/**
 * 
 */
package com.practise.io;

import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.util.Comparator;

/**
 * @author jolyon
 *
 */

class AlphabeticComparator<T> implements Comparator<T>{

	@Override
	public int compare(Object o1, Object o2) {
	    String s1 = (String)o1;
	    String s2 = (String)o2;
	    return s1.toLowerCase().compareTo(s2.toLowerCase());
	}	
}

class DirFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

public class PractiseIO {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		File dir = new File(".");
		String[] list;
		if(args.length == 0)
			list = dir.list();
		else
			list = dir.list(new FilenameFilter(){
				Pattern pattern = Pattern.compile(args[0]);
				@Override
				public boolean accept(File dir, String name){
					return pattern.matcher(new File(name).getName()).matches();
				}
				
			});
		System.out.println(Arrays.toString(list));
		
		
	}

}
