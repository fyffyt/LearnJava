package com.practise.container;

import java.util.*;
import java.lang.reflect.*;
import java.lang.Math;
import com.googlecode.concurrentlinkedhashmap.*;

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
		Stack s = new Stack();
		
		ArrayList al = new ArrayList();
		
		LinkedList ll = new LinkedList();
		
		HashSet hs = new HashSet();
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		TreeSet ts = new TreeSet();
		
		HashMap hm = new HashMap();
		
		LinkedHashMap lhm = new LinkedHashMap();
		
		TreeMap tm = new TreeMap();
		
		ConcurrentLinkedHashMap<Integer,Integer> clhm = new ConcurrentLinkedHashMap.Builder<Integer,Integer>().maximumWeightedCapacity(5).weigher(Weighers.singleton()).build();
		clhm.put(4,4);
		clhm.put(3,3);
		clhm.put(7,7);
		clhm.put(5,5);
		clhm.put(8, 8);
		clhm.put(6, 6);
		Set<Integer> clhmAscendingKeySet = clhm.ascendingKeySet();
		Iterator<Integer> clhmAscendingKeySetIter = clhmAscendingKeySet.iterator();
		while(clhmAscendingKeySetIter.hasNext()){
			System.out.println(clhmAscendingKeySetIter.next());
		}
		System.out.println(clhm.remove(7));
		System.out.println(clhm.ascendingKeySet());
		clhm.get(5);
		System.out.println(clhm.ascendingKeySet());

		
		
	}

}
