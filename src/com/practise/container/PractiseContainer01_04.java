/**
 * 
 */
package com.practise.container;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

class Gerbil {
	Gerbil(){
		gerbilNumber = 100;
	}
	Gerbil(int intVal){
		gerbilNumber = intVal;
	}
	public void hop(){
		System.out.println("gerbilNumber: "+gerbilNumber);
	}
	int gerbilNumber;
}


/**
 * @author jolyon
 *
 */
public class PractiseContainer01_04 {

	/**
	 * 
	 */
	public PractiseContainer01_04() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// practise 01
		Random rand = new Random();
		Double [] arrDouble = new Double[10];
		
		Double[] arrDouble1 = arrDouble.clone();
		Arrays.fill(arrDouble, rand.nextDouble());
		System.out.println(Arrays.toString(arrDouble));
		System.out.println(Arrays.toString(arrDouble1));

		// practise 02
		ArrayList<Gerbil> gerbilArray = new ArrayList<Gerbil>();
		for(int i = 0; i < 10; i++){
			gerbilArray.add(new Gerbil(i));
		}
		int gerbilArrayLen = gerbilArray.size();
		for(int i = 0; i < gerbilArrayLen; i++){
			Gerbil g = (Gerbil)gerbilArray.get(i);
			g.hop();
		}
		
		// practise 03
		ListIterator<Gerbil> gerbilArrayIte = gerbilArray.listIterator();
		while(gerbilArrayIte.hasNext()){
			gerbilArrayIte.next().hop();
			gerbilArrayIte.remove();
		}
		
		// practise 04
		Map<String,Gerbil> m = new HashMap<String,Gerbil>();
		for(int i = 0; i < 3; i++){
			m.put("gerbil"+new Integer(i).toString(),new Gerbil(i));
		}
		Set<String> mKeySet = m.keySet();
		Iterator<String> mKeySetIte = mKeySet.iterator();
		while(mKeySetIte.hasNext()){
			String mKey = mKeySetIte.next();
			System.out.println("Key: " + mKey + "\r\n" + "Value: " + m.get(mKey) + "\r\n" + "gerbilNumber: " + m.get(mKey).gerbilNumber);
		}
		
		// practise 05
		
	}

}
