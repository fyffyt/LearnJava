package com.practise.design_pattern.mediator;

public class Student {
	private EducationMediator mediator = null;
	public Student(EducationMediator m){
		this.mediator = m;
		this.mediator.registerStudent(this);
	}
	public void learn(){
		mediator.findTutor();
		System.out.println("start learning.");
	}
}
