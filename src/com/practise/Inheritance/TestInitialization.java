package com.practise.Inheritance;



class Insect {
	 private int i = 9;
	 protected int j;
	 private Insect() {
	 System.out.println("i = " + i + ", j = " + j);
	 j = 39;
	 }
	 Insect(int i1) {
		 System.out.println("i = " + i + ", j = " + j);
		 j = i1;		 
	 }
	 protected static int x1 =
	 printInit("static Insect.x1 initialized");
	 static int printInit(String s) {
		 System.out.println(s);
		 return 47;
	 }		
}

class Beetle extends Insect {
	 Insect ins1 = new Insect(50);
	 private int k = printInit("Beetle.k initialized");
	 private int m = printInit(" = "+j);
	 Insect ins2 = new Insect(51);
	 public Beetle() {
		 super(49);
		 System.out.println("k = " + k);
		 System.out.println("j = " + j);
	 }
	 private static int x2 =
	 printInit("static Beetle.x2 initialized");
}

public class TestInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Beetle constructor");
		 Beetle b = new Beetle();
		 Beetle d = new Beetle();
		 

	}

}
