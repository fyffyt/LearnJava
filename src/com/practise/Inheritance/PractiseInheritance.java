/**
 * 
 */
package com.practise.Inheritance;

/**
 * @author jolyon
 *
 */

class Base{
	protected void show(){
		System.out.println("show in Base.");
	}
	public void alias_show(){
		show();
	}
}

class Derived1 extends Base {
	public void show(){
		System.out.println("show in Derived1");
	}
	
}
class Derived2 extends Base {
	public void show(){
		System.out.println("show in Derived2");
	}
}


public class PractiseInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1 = new Derived1();
		Base b2 = new Derived2();
		b1.show();
		b1.alias_show();
		b2.show();
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}

}
