package com.practise.design_pattern.abstract_factory;

public abstract class TyreSimpleFactory {
	public static abstract class Tyre{
		// 
	}
	public static class Tyre001 extends Tyre{
		//
	}
	public static class Tyre002 extends Tyre{
		//
	}
	
	public static Tyre produceTyre(String type){
		switch(type){
		case "tyre001":
			return new Tyre001();
		case "tyre002":
			return new Tyre002();
		default:
			return new Tyre001();
		}
	}
}


