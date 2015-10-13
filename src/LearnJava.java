/**
 * 
 */
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
/**
 * @author jolyon
 *
 */
class Base {
	class Tag1{
		public Tag1(){
			System.out.println("Tag1.");
			System.out.println(i1);
		}
	}
	
	public Base(){
		System.out.println("Base constructor.");
	}
	int i1=101;
	private Tag1 tag = new Tag1();
}
class Derived extends Base {
	class Tag2{
		public Tag2(){
			System.out.println("Tag2.");
		}
	}
	
	public Derived(){
		System.out.println("Derived constructor.");
		System.out.println(i2);
	}
	int i2=202;
	private Tag2 tag = new Tag2();
}
public class LearnJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		s1 += "d";
		System.out.println(s2);
		System.out.println(s1 == s2);
		
	}

}
