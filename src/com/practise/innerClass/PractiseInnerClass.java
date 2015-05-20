/**
 * 
 */
package com.practise.innerClass;

import java.util.*;

class Lv1Class {
	class Lv2Class1{
		void show(){
			System.out.println("Square of " + elem + " is " + (elem*elem) );
		}
	}
	static class Lv2Class2{
		void show(){
			System.out.println("Static InnerClass Lv2Class2.");
		}		
	}
	public Lv1Class(){
		Random rand = new Random();
		elem = rand.nextInt(100);
	}
	private int elem;
}

/**
 * @author jolyon
 *
 */
public abstract class PractiseInnerClass {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lv1Class lv1 = new Lv1Class();
		
		Lv1Class.Lv2Class1 lv2_1 = lv1.new Lv2Class1();
		Lv1Class.Lv2Class2 lv2_2 = new Lv1Class.Lv2Class2();
		
		lv2_1.show();
		lv2_2.show();
		
		System.out.println(System.currentTimeMillis());
	}

}
