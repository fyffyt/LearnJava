package com.practise.design_pattern.mediator;

public class Tutor {
	private EducationMediator mediator = null;
	public Tutor(EducationMediator m){
		this.mediator = m;
		this.mediator.registerTutor(this);
	}
	public void teach(){
		mediator.findStudent();
		System.out.println("start teaching.");
	}
}
