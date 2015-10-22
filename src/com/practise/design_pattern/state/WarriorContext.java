package com.practise.design_pattern.state;

public class WarriorContext {
	WarriorState warriorState = new HealthyWarriorState();
	
	public WarriorState getWarriorState(){
		return warriorState;
	}
	
	public void setWarriorState(WarriorState specifiedWarriorState){
		warriorState = specifiedWarriorState;
	}
	
	public void combat(){
		warriorState.combat();
	}
	
}
