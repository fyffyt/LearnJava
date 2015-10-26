/**
 * 
 */
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Vector;
/**
 * @author jolyon
 *
 */
class Base {
	void sayHi(){System.out.println("Hi, this is Base.");}
	class BaseState{
		String msg = "status in base.";
	}
	BaseState state = null;
	void getState(){
		System.out.println(state.msg);
	}
	void setState(BaseState specifiedState){
		state = specifiedState;
	}
	void initState(){
		setState(new BaseState());
		//TODO operations to initiate the state
	}
	public Base(){
		initState();
	}
}
class Derived extends Base {
	void sayHi(){
		System.out.println("Hi, this is Derived.");
		super.sayHi();
	}
	class DerivedState extends BaseState{
		String msg = "status in derived.";
		String extMsg = "more msg.";
	}

	void getState(){
		System.out.println(this.state.msg);
		System.out.println(super.state.msg);
		System.out.println(((DerivedState)this.state).msg);
		System.out.println(((DerivedState)this.state).extMsg);
	}
	void setState(BaseState specifiedState){
		state = specifiedState;
	}	
	void initState(){
		setState(new DerivedState());
		//TODO operations to initiate the state
	}
	public Derived(){
		initState();
	}
}
public class LearnJava {
	private enum Month{
		Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base instance = new Derived();
		instance.sayHi();
		instance.getState();
		
		Month month = Month.Jan;
		System.out.println("abc".equals(null));
		
		long time = System.currentTimeMillis();
		
		for(int i = 0; i < 1000*1000; i++){
			final long t = System.nanoTime();
//			long t = System.currentTimeMillis();
		}
		
		System.out.println(System.currentTimeMillis() - time);
		
		
		Vector<Object> vec = new Vector<Object>(10);
		
		System.out.println(vec.get(0));
		
	}

}
