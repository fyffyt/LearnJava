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
public class LearnJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter out1 = null;
		BufferedReader in1 = null;
		DataOutputStream out2 = null;
		DataInputStream in2 = null;		
		
		try {
			out1 = new BufferedWriter(new FileWriter("data1.txt"));
			out1.write("汉字");
			out1.close();
			out2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data2.txt")));
			out2.writeUTF("汉字");

			out2.close();
			byte[] byteArr = new byte[3];
			
			in1 = new BufferedReader(new FileReader("data1.txt"));
			System.out.println((char)in1.read());

//			byte[] byteArr = new byte[3];
//			in.read(byteArr);
//			System.out.println(Charset.forName("UTF-8").decode(ByteBuffer.wrap(byteArr)));	
			
			in2 = new DataInputStream(new FileInputStream("data2.txt"));
			in2.read(byteArr);
			System.out.println(byteArr[0]);
			System.out.println(byteArr[1]);
			System.out.println(byteArr[2]);
//			System.out.println(Charset.forName("UTF-8").decode(ByteBuffer.wrap(byteArr)));	
			
//			System.out.println(in2.readUTF());
			
			in1.close();
			in2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}

}
