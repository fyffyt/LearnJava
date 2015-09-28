package com.practise.design_pattern.singleton;



public class PractiseSingleton {
	//eager mode
	public static class EagerSingleton {
		private static int memberVar;
		private final static EagerSingleton instance = new EagerSingleton();
		private EagerSingleton(){
			memberVar = 1;
		}
		private EagerSingleton(int input){
			memberVar = input;
		}
		public static EagerSingleton getInstance(){
			return instance;
		}
		public int getMemberVar(){
			return memberVar;
		}		
		public void setMemberVar(int input){
			memberVar = input;
		}
	}
	
	//exist race-condition with lazy mode
	public static class LazySingleton{
		private static LazySingleton instance = null;
		private LazySingleton(){
			//constructing operations here
		}
		public static LazySingleton getInstance(){
			if(null == instance){
				instance = new LazySingleton();
			}
			return instance;
		}
		
	}
	
	//add lock for Lazy mode
	public static class SafeLazySingleton{
		private static SafeLazySingleton instance = null;
		private SafeLazySingleton(){
			//constructing operations here
		}
		public static SafeLazySingleton getInstance(){
			if(null == instance){
				synchronized(SafeLazySingleton.class){
					instance = new SafeLazySingleton();
				}
			}
			return instance;
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerSingleton inst = EagerSingleton.getInstance();
		System.out.println(inst.getMemberVar());
		inst.setMemberVar(123);
		System.out.println(inst.getMemberVar());
		
	}

}
