package com.test.JUnit;
import static org.junit.Assert.assertEquals;

public class Calculator {
    private static int result = 1; // 静态变量，用于存储运行结果
    public void add(int n) {
        result = result + n;
    }
    public void substract(int n) {
        result = result - 1;  //Bug: 正确的应该是 result =result-n
    }
    public void multiply(int n) {
    }         // 此方法尚未写好
    public void divide(int n) {
        result = result / n;
    }
    public void square(int n) {
        result = n * n;
    }
    public void squareRoot(int n) {
        for (; ;) ;            //Bug : 死循环
    }
    public void clear() {     // 将结果清零
        result = 0;
    }
    public int getResult() {
        return result;
    }
    static void test(){
    	assertEquals(1,2);
    } 
    public static void main(String[] args){
    	System.out.println("hello.\n");
    	try{
    		assert(false);
    	}catch(Exception e){
        	System.out.println("Oops.\n");
        	System.out.println(e.getMessage());
    	}
    }
}