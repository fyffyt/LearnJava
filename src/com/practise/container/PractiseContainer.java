package com.practise.container;

import java.util.*;
import java.lang.reflect.*;
import java.lang.Math;


class ListTester{
	public ListTester(int quan){
		scale = (int)Math.pow(10,quan);
	}
	public void test(List l){
		System.out.println("start test "+l.toString()+" with scale "+scale);
		for(int i = 0; i < scale; i++){
			l.add(i);
		}
		for(int i = 0; i < scale; i++){
			l.get(i);
		}
		for(int i = 0; i < scale; i++){
			l.contains('a');
		}
		for(int i = 0; i < scale; i++){
			l.add(i);
		}
	}
	
	private final int scale;
}

public abstract class PractiseContainer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList al = new ArrayList();
		
		LinkedList ll = new LinkedList();
		
		HashSet hs = new HashSet();
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		TreeSet ts = new TreeSet();
		
		HashMap hm = new HashMap();
		
		LinkedHashMap lhm = new LinkedHashMap();
		
		TreeMap tm = new TreeMap();
		
		System.out.println((int)Math.pow(3, 3));
		
		
	}

}
