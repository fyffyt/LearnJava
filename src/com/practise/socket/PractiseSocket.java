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

class Client extends Thread{
	private Socket echoSocket = null;
	private final String hostname = "127.0.0.1";
	private final static int svrPort = 9946;
	
	public void run(){
		try {
			echoSocket = new Socket(hostname, svrPort);

			BufferedReader in = new BufferedReader(
						new InputStreamReader(
								echoSocket.getInputStream()
						)
					);
			PrintWriter out = new PrintWriter(
					
					echoSocket.getOutputStream()
							
					);
			BufferedReader stdIn = new BufferedReader(
					new InputStreamReader(
							System.in
					)
				);
			String inputLine;
			while((inputLine = stdIn.readLine()) != null){
				System.out.println("tag1");
				out.println(inputLine);
				System.out.println("echo: " + in.readLine());
			}
			System.out.println("terminate client");
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
		Client client = new Client();
		svr.start();
		client.start();
	}

}
