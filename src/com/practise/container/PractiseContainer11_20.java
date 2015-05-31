package com.practise.container;

import java.util.*;

class ContainerP11<T> {
	ContainerP11(){
		container = new ArrayList<T>(10);
		size = 0;
		capacity = 10;		
	}
	ContainerP11(final int initCapacity){
		container = new ArrayList<T>(initCapacity);//parameter initCapacity's validity will be checked by ArrayList()
		size = 0;
		capacity = initCapacity;
	}
	
	public boolean isEmpty(){
		return 0 == size;
	}
	
	public void add(T t){
		container.add(t);
		size = size + 1; 
	}
	
	public void add(int index, T t){
		container.add(index, t);
		size = size + 1;
	}
	
	public T get(int index){
		return container.get(index);
	}
	
	public T get(){
		return container.get(size-1);
	}
	
	public T remove(int index){
		T tmp = container.remove(index);
		size = size - 1;
		return tmp;
	}
	
	public boolean remove(Object obj){
		boolean tag = container.remove(obj);
		size = size - 1;
		return tag;
	}
	
	public void push(T t){
		this.add(t);
	}
	
	public T pop(){
		return this.remove(size - 1);
	}
	
	public void enque(T t){
		this.add(t);
	}
	
	public T deque(){
		return this.remove(0);
	}
	
	Iterator<T> iterator(){
		return new Ite();
	}
	private class Ite implements Iterator<T>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	private int size;
	private int capacity;
	private ArrayList<T> container;
}
public class PractiseContainer11_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
