package com.practise.design_pattern.abstract_factory;

public class EngineSimpleFactory {
	public static abstract class Engine{
		// 
	}
	public static class Engine001 extends Engine{
		//
	}
	public static class Engine002 extends Engine{
		//
	}
	
	public static Engine produceEngine(String type){
		switch(type){
		case "engine001":
			return new Engine001();
		case "engine002":
			return new Engine002();
		default:
			return new Engine001();
		}
	}
}
