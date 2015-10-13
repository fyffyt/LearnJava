package com.practise.design_pattern.observer;

import java.util.Observable;
import java.util.Observer;

import com.practise.todo.*;

public abstract class ConceptualObject extends Observable implements Observer{
	public ConceptualObject(){
		//
	}
	public ConceptualObject(IntellegentSubject intellegentSubject, Object associateObject){
		//
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("got the change of " + o.toString());
	}
}
