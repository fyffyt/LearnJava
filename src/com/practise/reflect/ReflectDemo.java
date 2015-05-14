package com.practise.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class ReflectDemo {
	public ReflectDemo(Person p){
		Class cla = p.getClass();
		Method[] method =cla.getDeclaredMethods();
		for(Method meth:method){
			System.out.println(meth.toString());
			
		}
		Field[] field = cla.getDeclaredFields();
		for(Field elem:field){
			System.out.println(elem.toString());
		}
	
	}
}
