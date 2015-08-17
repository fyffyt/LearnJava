/**
 * 
 */
import java.io.*;
/**
 * @author jolyon
 *
 */
public class LearnJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);
		System.out.println(s3 == s4);
		
		System.out.println(new File("/home/ab.txt").getName());
		
	}

}
