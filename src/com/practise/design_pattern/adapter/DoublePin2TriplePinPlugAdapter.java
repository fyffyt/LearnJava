package com.practise.design_pattern.adapter;

public class DoublePin2TriplePinPlugAdapter extends DoubleHoleSocket implements TriplePinPlug {
	DoublePinPlug adaptee = null;
	
	DoublePin2TriplePinPlugAdapter(){
		adaptee = DoublePinPlugSimpleFactory.getPlug("");
		System.out.println("Connect " + adaptee.toString() + " to the doulbe hole socket " + this.toString());
	}
	DoublePin2TriplePinPlugAdapter(DoublePinPlug doublePinPlug){
		adaptee = doublePinPlug;
		System.out.println("Connect " + adaptee.toString() + " to the double hole socket " + this.toString());
	}
	public void connectTripleHoleSocket(TripleHoleSocket socket){
		System.out.println("Connect " + this.toString() + " to the triple hole socket " + socket.toString());
	}
	
}
