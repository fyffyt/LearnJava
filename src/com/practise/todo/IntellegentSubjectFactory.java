package com.practise.todo;

public abstract class IntellegentSubjectFactory {
	//various materials 
	//purchasing agent
	//factory configurations
	//configuration updater
	public abstract IntellegentSubject getInstanceOfIS();
	
}

class ExampleFac extends IntellegentSubjectFactory{
	public IntellegentSubject getInstanceOfIS(){
		IntellegentSubject newInstanceOfIS = new ExampleIS();
		//set initial states, patterns for the instance
		//
		
		return newInstanceOfIS.clone();
	}
}
