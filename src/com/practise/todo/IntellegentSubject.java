package com.practise.todo;

import com.practise.design_pattern.observer.*;

public abstract class IntellegentSubject implements Cloneable, Runnable{
	class ISPhysicalState{
		//
	}
	class ISEmotionalState{
		//
	}
	class ISThinkingPattern{
		//
	}
	class ISBehaviorPattern{
		//
	}
	class ISMemoryPiece extends ConceptualObject{
		//
	}
	class ComprehensiveWorld{
		//
	}
	class ISKnowledge{
		//
	}
	class ISKnowledgeTree{
		//
	}
	class Plan{
		//
	}
	class Question{
		//
	}
	class ExplicitScheduler{
		//
	}
	class ImplicitScheduler{
		//
	}
	class CorrelationCalc{
		//
	}
	class VisionSensor{
		//
	}
	class InfraredVisionSensor{
		//
	}
	class AudioSensor{
		//
	}
	class UltrasonicSensor{
		//
	}
	
	
	//blablabla
	//
	private long birthTime;
	private long deathTime;
	private ISPhysicalState _selfPhyState;
	private ISEmotionalState _selfEmoState;
	
	
	public IntellegentSubject(){
		birthTime = System.currentTimeMillis();
		//
		
	}
	
	abstract void thinking();

	abstract void behave();
	
	public IntellegentSubject clone(){
		return this.clone();
	}
	
}

class ExampleIS extends IntellegentSubject{
	class ExampleISThinkingPattern{
		//
	}
	
	void thinking(){
		//	
	}
	void behave(){
		//
	}
	
	public void run(){
		//
	}
}