package cn.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("192.168.0.209",8888);
		
		//通过Socket来获取字节输入流
		//InputStream is= socket.getInputStream();
		
		//通过Socket来获取字节输出流
		/*OutputStream os = socket.getOutputStream();
		os.write("111".getBytes());*/
		System.out.println("成功连接服务器！");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//将客户输入的内容保存到流中
		
		PrintWriter bw = new PrintWriter(socket.getOutputStream(),true);
		//BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader brr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		while(true){
			System.out.println("请输入：");
			String str = br.readLine();//str就是用户输入的内容
			bw.println(str);//将用户输入的内容传给服务器
			/*bw.write(str);
			bw.newLine();
			bw.flush();*/
			if(str.equals("over")){
				break;
			}
			System.out.println(brr.readLine());
		}
		
		
		bw.close();
		brr.close();
		br.close();
		socket.close();
	}
}
