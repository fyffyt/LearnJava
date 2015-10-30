package com.practise.semaphore;

import java.lang.Thread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class Producer extends Thread{
	LinkedBlockingQueue<Object> list = null;
	
	Producer(LinkedBlockingQueue<Object> list){
		this.list = list;
	}
	public void run(){
		for(int i = 0; i < 10; i++){
			try {
				//sleep(5000);
				Object obj = new Object();
				System.out.println("producing " + obj);
				
				list.put(obj);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class Consumer extends Thread{
	LinkedBlockingQueue<Object> list = null;
	
	Consumer(LinkedBlockingQueue<Object> list){
		this.list = list;
	}
	public void run(){
		for(int i = 0; i < 10; i++){
			try {
				//sleep(5500);
				Object obj = list.take();
				
				System.out.println("take and consuming " + obj);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class PractiseSemaphore {
	public static void main(String[] args){
		LinkedBlockingQueue<Object> storeList = new LinkedBlockingQueue<Object>(3);
		Lock lock = new ReentrantLock();
		
		Producer p = new Producer(storeList);
		Consumer c = new Consumer(storeList);
		
		p.start();
		c.start();
		
		
	}

}
