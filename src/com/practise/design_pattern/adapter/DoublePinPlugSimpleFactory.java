package com.practise.design_pattern.adapter;

public class DoublePinPlugSimpleFactory {
	static class Type201Plug implements DoublePinPlug{
		public void connectDoubleHoleSocket(DoubleHoleSocket socket){
			System.out.println("Connect " + this.toString() + " to the double hole socket " + socket.toString());
		}
	}


	static class Type202Plug implements DoublePinPlug{
		public void connectDoubleHoleSocket(DoubleHoleSocket socket){
			System.out.println("Connect " + this.toString() + " to the double hole socket " + socket.toString());
		}
	}	
	
	public static DoublePinPlug getPlug(String name){
		switch(name){
		case "201":
			return new Type201Plug();
		case "202":
			return new Type202Plug();
		default:
			return new Type201Plug();
			
		}
	}
}
