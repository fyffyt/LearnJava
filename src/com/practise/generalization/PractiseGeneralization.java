package com.practise.generalization;

import java.util.List;
import java.util.ArrayList;

public class PractiseGeneralization {
	private static class Food {}
	private static class Fruit extends Food {}
	private static class Apple extends Fruit {}
	private static class RedApple extends Apple {}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<? extends Apple> ealist = new ArrayList<RedApple>();
		
		List<? super Apple> salist = new ArrayList<Apple>();
		
		//ealist.add(new Apple());
		
		salist.add(new Apple());
		
		//Apple a1 = ealist.get(0);
		
		//Apple a2 = salist.get(0);
		
		Class<?> arr[] = {Food.class, Apple.class, Fruit.class};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		RedApple ra = new RedApple();
		

	}

}
