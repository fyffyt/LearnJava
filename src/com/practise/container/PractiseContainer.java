package com.practise.container;

import java.util.*;
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
		
		List l = new ArrayList();
		for (int i=0;i<10;i++){
			l.add(Integer.toString(i));
			
		}
		ListIterator lit = l.listIterator();
		lit.
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add("a");
		TreeSet ts = new TreeSet();
		
		HashMap hm = new HashMap();
		
		TreeMap tm = new TreeMap();
		
	}

}
