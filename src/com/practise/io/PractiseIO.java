/**
 * 
 */
package com.practise.io;

import java.util.*;
import java.io.*;
import java.util.regex.*;
import java.util.Comparator;
import java.nio.*;
import java.nio.charset.Charset;

/**
 * @author jolyon
 *
 */

class AlphabeticComparator<T> implements Serializable,Comparator<T>{

	@Override
	public int compare(Object o1, Object o2) {
	    String s1 = (String)o1;
	    String s2 = (String)o2;
	    return s1.toLowerCase().compareTo(s2.toLowerCase());
	}	
}

class DirFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

public class PractiseIO {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		File dir = new File(".");
		String[] list;
		if(args.length == 0)
			list = dir.list();
		else
			list = dir.list(new FilenameFilter(){
				Pattern pattern = Pattern.compile(args[0]);
				@Override
				public boolean accept(File dir, String name){
					return pattern.matcher(new File(name).getName()).matches();
				}
				
			});
		System.out.println(Arrays.toString(list));

		try {
//			FileReader fileReader = new FileReader("test");
//			char c;
//			System.out.println();
//			//while((c = (char)fileReader.read())!= -1){//infinite loop, why? -1-->char? char --> int?
//			while((c = (char)fileReader.read())!= (char)-1){
//						System.out.print(c);
//			}
//			fileReader.close();
			
//			CharArrayReader caReader = new CharArrayReader(new FileReader("test"));
			
//			StringReader strReader = new StringReader(new FileReader("test"));
			
//			PipedReader pipedReader = new PipedReader(new FileReader("test"));
			try {
				DataOutputStream out2 = new DataOutputStream(
				new BufferedOutputStream(
				new FileOutputStream("Data.txt")));
				out2.writeDouble(3.14159);
				out2.writeUTF("That was pi");
				out2.writeDouble(1.41413);
				out2.writeUTF("Square root of 2");
				out2.close();
				DataInputStream in5 = new DataInputStream(
				new BufferedInputStream(
				new FileInputStream("Data.txt")));
				// Must use DataInputStream for data:
				System.out.println(in5.readDouble());
				// Only readUTF() will recover the
				// Java-UTF String properly:
				System.out.println(in5.readUTF());
				// Read the following double and String:
				System.out.println(in5.readDouble());
				System.out.println(in5.readUTF());
//				
				Charset csetUTF8 = Charset.forName("UTF-8");
				Charset csetUTF16 = Charset.forName("UTF-16");
				
				ByteBuffer bbuf8 = csetUTF8.encode("1234");
				ByteBuffer bbuf16 = csetUTF16.encode("1234");
				
				System.out.println(Arrays.toString(bbuf8.array()));
				System.out.println(Arrays.toString(bbuf16.array()));
				
				System.out.println(csetUTF8.decode(bbuf8).toString());
//				System.out.println((csetUTF8.decode(bbuf16).charAt(0)));
//				System.out.println(csetUTF16.decode(bbuf8).toString());
				System.out.println(csetUTF16.decode(bbuf16).toString());
				DataInputStream in6 = new DataInputStream(
						new BufferedInputStream(
						new FileInputStream("Data.txt")));
				System.out.println(in6.readDouble());
				
				
			} catch(EOFException e) {
				throw new RuntimeException(e);
			}
//			BufferedReader stdin = new BufferedReader(new FileReader("test"));
//			 String line;
//			 while((line = stdin.readLine()) != null){
//				 System.out.println(line);
//			 }
			ObjectOutputStream out = new ObjectOutputStream(
									 new BufferedOutputStream(
									 new FileOutputStream("obj.dat")));
			out.writeObject(new AlphabeticComparator());
			out.close();
			ObjectInputStream in = new ObjectInputStream(
					 new BufferedInputStream(
					 new FileInputStream("obj.dat")));			

			AlphabeticComparator diff = (AlphabeticComparator)in.readObject();
			
			System.out.println(diff.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
