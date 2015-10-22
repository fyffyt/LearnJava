package com.practise.design_pattern.state;

public class PractiseState {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WarriorContext warriorContext = new WarriorContext();
		warriorContext.combat();
		
		warriorContext.setWarriorState(new WoundedWarriorState());
		warriorContext.combat();
	
	}

}
