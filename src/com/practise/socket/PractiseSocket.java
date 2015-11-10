package com.practise.socket;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
import java.nio.*;
import java.nio.channels.ServerSocketChannel;
import java.lang.Thread;

class Server extends Thread{
	private ServerSocket svrSocket = null;
	private final static int svrPort = 9946;
	
	public void run(){
		try {
			svrSocket = new ServerSocket(svrPort);
			Socket clientSocket = svrSocket.accept();
			BufferedReader in = new BufferedReader(
						new InputStreamReader(
								clientSocket.getInputStream()
						)
					);
			PrintWriter out = new PrintWriter(
					
							clientSocket.getOutputStream()
							
					);
			
			String inputLine;
			while((inputLine = in.readLine()) != null){
				System.out.println("Received message: " + inputLine + " from " + clientSocket.toString());
				out.println(inputLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class PractiseSocket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server svr = new Server();
		svr.start();
	}

}
