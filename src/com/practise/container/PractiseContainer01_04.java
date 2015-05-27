/**
 * 
 */
package com.practise.container;

import java.util.Arrays;
import java.util.Random;

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

	}

}
