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
	void sayHi(){System.out.println("Hi, this is Base.");}
}
class Derived extends Base {
	void sayHi(){
		System.out.println("Hi, this is Derived.");
		super.sayHi();
	}
}
public class LearnJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base instance = new Derived();
		instance.sayHi();
	}

}
