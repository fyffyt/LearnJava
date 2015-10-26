package com.practise.design_pattern.abstract_factory;

public class ChassisSimpleFactory {
	public static abstract class Chassis{
		// 
	}
	public static class Chassis001 extends Chassis{
		//
	}
	public static class Chassis002 extends Chassis{
		//
	}
	
	public static Chassis produceChassis(String type){
		switch(type){
		case "chassis001":
			return new Chassis001();
		case "chassis002":
			return new Chassis002();
		default:
			return new Chassis001();
		}
	}
}
