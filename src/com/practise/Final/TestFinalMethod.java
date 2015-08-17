package com.practise.Final;

import java.lang.reflect.*;

class Base{
	private String name;
	public Base(){
		name = "nonym";
	}
	public Base(String nameInitializer){
		name = nameInitializer;
	}
	final void showName(){
		System.out.println("Base.showName:");
		System.out.println(name);
	}
	void refFunc(){
		System.out.println("Base.refFunc");
	}
}

class Derived extends Base{
//	void showName(){} //Cannot override the final method from Base
	void refFunc(){
		System.out.println("Derived.refFunc");
	}
}

public class TestFinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d1 = new Derived();
		d1.showName();
		d1.refFunc();
		Base b1 = new Derived();
		
		try {
			Class<?> reflector = Class.forName("com.practise.Final.Base");
			Method[] methods = reflector.getDeclaredMethods();
			for(Method method:methods){
				System.out.println(method.getName());
				method.setAccessible(true);
				method.invoke(b1);
			}
				
			
		} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Object[] objs = {new Derived(),new Base()};
		
		for(Object obj:objs){
			((Derived)obj).showName();
		}
		
		//test Egit
	}

}
