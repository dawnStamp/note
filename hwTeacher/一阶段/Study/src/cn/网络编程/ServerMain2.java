package cn.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain2 {
	//客户端传任意英文字母给服务器  服务器返回大写英文字母给客户端
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);//设置端口号
		Socket socket = ss.accept();//调用accept方法获取Socket对象
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		String str = null;
		while((str=br.readLine())!=null){
			if(str.equals("over")){
				break;
			}
			System.out.println(str);//如果用户传过来的信息不是over的话，就输出内容
//			pw.println(str);
			bw.write(str.toUpperCase());
			bw.newLine();
			bw.flush();
		}

		br.close();
//		pw.close();
		bw.close();
		socket.close();
		ss.close();
	}
}
