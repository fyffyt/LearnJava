package com.practise.design_pattern.observer;

import java.util.Observable;

public class Conclusion extends ConceptualObject{
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("got the change of " + o.toString());
	}
}
