package com.practise.design_pattern.mediator;

import java.util.Vector;

public class EducationMediator {
	private Vector<Student> studentsList = new Vector<Student>();
	private Vector<Tutor> tutorsList = new Vector<Tutor>();
	
	public final void registerStudent(Student s){
		studentsList.add(s);
	}
	public final void registerTutor(Tutor t){
		tutorsList.add(t);
	}
	public final void unregisterStudent(Student s){
		studentsList.remove(s);
	}
	public final void unregisterTutor(Tutor t){
		tutorsList.remove(t);
	}
	
	public final void findTutor(){
		System.out.println("find a tutor " + tutorsList.get(0));
	}

	public final void findStudent(){
		System.out.println("find a tutor " + studentsList.get(0));		
	}
}
