package com.practise.awt;

import java.awt.*;
import java.nio.CharBuffer;
import java.io.*;

public class PractiseAWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubf
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		String ln;
		try {
			while((ln = in.readLine())!= null){
				System.out.println(ln);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
