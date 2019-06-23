package cn.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);//设置端口号
		System.out.println("服务器已启动，等待客户端的连接...");
		Socket socket = ss.accept();//调用accept方法获取Socket对象
									//等待客户端的连接
		System.out.println(socket.getInetAddress().getHostAddress()+"已连接！");
		//第一种
		/*InputStream is = socket.getInputStream();//获取输入流
		byte[] b =new byte[10];
		is.read(b);
		System.out.println(new String(b));*/
		
		//第二种
		//简化版
		/*InputStream  input = socket.getInputStream();//根据socket获取一个字节输入流
		
		InputStreamReader isr = new InputStreamReader(input);//将获取到的字节流转换成字符流
		BufferedReader br = new BufferedReader(isr);
		
		String info = br.readLine();
		System.out.println(info);*/
		
		//复杂版
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
		//BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		String str = null;		
		while((str=br.readLine())!=null){
			if(str.equals("over")){
				break;
			}
			System.out.println(str);//如果用户传过来的信息不是over的话，传给客户端
			pw.println(str.toUpperCase());
			/*bw.write(str.toUpperCase());
			bw.newLine();
			bw.flush();*/
		}
		
		
	
		
		br.close();
//		pw.close();
		socket.close();
		ss.close();
	}
}
