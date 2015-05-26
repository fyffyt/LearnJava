/**
 * 
 */
package com.practise.innerClass;

/**
 * @author jolyon
 * 证明一个接口的属性在默认情况下是static and final的
 */

interface InterfaceDemo01 {
	int TAG = 101;
}

public class PractiseInterface01 {

	/**
	 * 
	 */
	public PractiseInterface01() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InterfaceDemo01.TAG);
		// InterfaceDemo01.TAG = 202;
	}

}
