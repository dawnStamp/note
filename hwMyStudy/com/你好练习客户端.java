package cn.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class 你好练习客户端 {

	//客户端传您好给服务器     服务器传您也好给客户端
	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("192.168.0.209",8888);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("您好");
		bw.newLine();
		bw.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String val = br.readLine();
		System.out.println(val);
		
		br.close();
		bw.close();
		socket.close();
	}
}

