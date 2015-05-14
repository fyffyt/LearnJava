package com.practise.Final;

class Base{
	private String name;
	public Base(){
		name = "nonym";
	}
	public Base(String nameInitializer){
		name = nameInitializer;
	}
	final void showName(){
		System.out.println(name);
	}
}

class Derived extends Base{
//	void showName(){} //Cannot override the final method from Base
}

public class TestFinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d1 = new Derived();
		d1.showName();
		//test Egit
	}

}
