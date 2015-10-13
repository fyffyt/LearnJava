package com.practise.design_pattern.observer;

public class PractiseObserver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assumption a = new Assumption();
		Conclusion c = new Conclusion();
		
		a.addObserver(c);
		
		System.out.println(a.countObservers());
		
		a.setValue();
		System.out.println(a.hasChanged());
		System.out.println(a.getValue());
		a.notifyObservers();
	}

}
