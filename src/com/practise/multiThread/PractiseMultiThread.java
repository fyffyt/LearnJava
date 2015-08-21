package com.practise.multiThread;

import java.lang.Thread;
import java.util.Random;
import java.lang.Process;

class DemoThread extends Thread{
	private static int threadCounter; 
	private int countLimit = 5;
	private volatile double d ;
	DemoThread(int priority){
		setPriority(priority);
		start();
	}
	
	public void run(){
		while(true){
			System.out.println(getName()+": "+countLimit);
			for(int i = 0; i < 1000; i++)
				d = d + (Math.PI + Math.E) / (double)i;
//			try {
//				sleep(new Random().nextInt(5));
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			if(--countLimit == 0){
				return;
			}
		}
		
	}
}

class DemoRunnable implements Runnable{
	private int count;
	public void run(){
		System.out.println("Runnable: "+(++count));
	}
}

public class PractiseMultiThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoThread(Thread.MAX_PRIORITY); 	
		for(int i = 0; i < 5; i++){
			new DemoThread(Thread.MIN_PRIORITY); 
		}
		DemoRunnable runnableObj = new DemoRunnable();
		new Thread(runnableObj,"runner-1").start();
		new Thread(runnableObj,"runner-2").start();
		new Thread(runnableObj,"runner-3").start();
	}

}
