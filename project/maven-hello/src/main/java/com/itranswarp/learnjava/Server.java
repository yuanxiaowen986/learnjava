package com.itranswarp.learnjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * The <code>Server</code> class is TCP编程服务端经典实现
 * 
 * @author Administrator
 *
 */

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(6666);//监听指定端口
		System.out.println("server is running...");
		for(;;){
			Socket sock=ss.accept();
			System.out.println("conneted from" + sock.getRemoteSocketAddress());
			Thread t = new Handler(sock);
			t.start();
		}
	}
		
}

class Handler extends Thread{
	Socket sock;
	
	public Handler(Socket sock){
		this.sock = sock;
	}
	
	@Override
	public void run(){
		try(InputStream input = this.sock.getInputStream()){
			try(OutputStream output = this.sock.getOutputStream()){
				handle(input,output);
			}
		}catch(Exception e){
			try{
				this.sock.close();
			}catch(IOException e1){				
			}
			System.out.println("client disconnected");
		}		
	}
	
	private void handle(InputStream input,OutputStream output) throws IOException{
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output,StandardCharsets.UTF_8));
		BufferedReader reader = new BufferedReader(new InputStreamReader(input,StandardCharsets.UTF_8));
		writer.write("hello\n");
		writer.flush();
		for(;;){
			String s = reader.readLine();
			if(s.equals("bye")){
				writer.write("bye\n");
				writer.flush();
				break;
			}
			writer.write("ok:" + s + "\n");
			writer.flush();
		}
	}
}

