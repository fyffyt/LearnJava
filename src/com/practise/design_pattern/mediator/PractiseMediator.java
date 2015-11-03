package com.practise.design_pattern.mediator;

import java.util.*;

public class PractiseMediator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EducationMediator mediator = new EducationMediator();
		
		
		Student s1 = new Student(mediator);
		Tutor t1  = new Tutor(mediator);
		
		
		s1.learn();
		t1.teach();
	}

}
