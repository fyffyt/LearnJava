/**
 * 
 */
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.*;
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
		try {
			this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	Derived(Derived d){
		
	}
	void sayHi(){
		System.out.println("Hi, this is Derived.");
		super.sayHi();
	}
	class DerivedState extends BaseState{
		String msg = "status in derived.";
		String extMsg = "more msg.";
	}

	void getState(){
		super.getState();
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
		System.out.println(instance.getClass());
	
		Derived d2 = new Derived();
		
		
	}

}
