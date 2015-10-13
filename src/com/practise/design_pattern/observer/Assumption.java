package com.practise.design_pattern.observer;

public class Assumption extends ConceptualObject{
	public int value = 1;
	public void setValue(){
		value += 1;
		this.setChanged();
	}
	public int getValue(){
		return value;
	}
	
}
