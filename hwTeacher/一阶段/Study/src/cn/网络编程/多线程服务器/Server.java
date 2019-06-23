package cn.com.stioServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public void start(){
		try {
			ServerSocket ss = new ServerSocket(8888);
			while(true){
				Socket socket = ss.accept();//等待客户端的连接
				System.out.println(socket.getInetAddress().getHostAddress()+"已连接!");
				new Thread(new ServerImpl(socket)).start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
