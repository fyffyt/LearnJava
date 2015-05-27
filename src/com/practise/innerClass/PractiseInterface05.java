package com.practise.innerClass;

interface A01{
	void a01f();
	void a01g();
}
interface A02{
	void a02f();
	void a02g();
}

interface B01 extends A01,A02{
	
}
class C01 implements B01{
	public void a01f(){System.out.println("implementation of a01f in C01");}
	public void a01g(){System.out.println("implementation of a01g in C01");}
	public void a02f(){System.out.println("implementation of a02f in C01");}
	public void a02g(){System.out.println("implementation of a02g in C01");}
	C01(){
		System.out.println("constructor of C01");
	}
}
class C02 {
	
}
//class D02 extends C01,C02{
//	
//}

public class PractiseInterface05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C01 c = new C01();
		c.a01f();
		c.a01g();
		c.a02f();
		c.a02g();
	}

}
