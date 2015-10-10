package com.practise.io;

import java.io.*;
import java.util.Arrays;

public class PractiseByteArrayInputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer strBuf = new StringBuffer("fyffyt");
		ByteArrayInputStream bin2;
		try {
			bin2 = new ByteArrayInputStream(strBuf.toString().getBytes("US-ASCII"));
			byte b2 = (byte) bin2.read();
			while(b2 != (byte)(-1&0xff)){
				System.out.print(b2);
				b2 = (byte) bin2.read();
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//System.out.println(Arrays.toString(new int[][]{{1,1},{2,2},{3,3}}));
		
		try {
			DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
		    byte[] buf = null;
		    in.readFully(buf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
