package lianxi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
 
public class UpLoading {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		System.out.println("服务器已启动，等待客户端的连接-------------");
		Socket socket = ss.accept();
		System.out.println(socket.getInetAddress().getHostAddress()+"已连接！");



		InputStream is = socket.getInputStream();
		FileOutputStream fos = new FileOutputStream("E:/file/123.txt");

		byte[] by = new byte[1024];
		int len = 0;
		while((len = is.read(by))!=-1){
			fos.write(by,0,len);
		}

		
		fos.close();
		is.close();
		socket.close();
		ss.close();


	}
}