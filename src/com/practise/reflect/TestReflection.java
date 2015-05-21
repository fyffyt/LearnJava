package com.practise.reflect;

import java.lang.reflect.*;

public class TestReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("fyf","male",33);
		System.out.println(p.toString());
		new ReflectDemo(p);
		
		Class<?> demo = null;
		try{
			demo = Class.forName("com.practise.reflect.Person");
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			Method meth = demo.getDeclaredMethod("getName");
			try {
				meth.setAccessible(true);
				Object age = meth.invoke(p);
				System.out.println(age);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Field ff = demo.getDeclaredField("name");
			ff.setAccessible(true);
			System.out.println(ff.get(p));
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
