package com.practise.semaphore;

import java.lang.Thread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;


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
		
        // 线程池
        ExecutorService exec = Executors.newCachedThreadPool();
        // 只能5个线程同时访问
        final Semaphore semp = new Semaphore(5);
        // 模拟20个客户端访问
        for (int index = 0; index < 50; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        // 获取许可
                        semp.acquire();
                        System.out.println("Accessing: " + NO);
                        Thread.sleep((long) (Math.random() * 10000));
                        // 访问完后，释放
                        semp.release();
                        //availablePermits()指的是当前信号灯库中有多少个可以被使用
                        System.out.println("-----------------" + semp.availablePermits()); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            exec.execute(run);
        }
        // 退出线程池
        exec.shutdown();
		
		
	}

}
