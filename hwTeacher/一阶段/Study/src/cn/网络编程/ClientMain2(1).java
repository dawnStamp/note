package cn.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientMain2 {
	//客户端传任意英文字母给服务器  服务器返回大写英文字母给客户端
	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("192.168.0.215",8888);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//将客户输入的内容保存到流中

//		PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader brr = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		while(true){
			String str = br.readLine();//str就是用户输入的内容
//			pw.println(str);//将用户输入的内容传给服务器
			bw.write(str);
			bw.newLine();
			bw.flush();
			if(str.equals("over")){
				break;
			}
			System.out.println(brr.readLine());
		}

		bw.close();
		brr.close();
//		pw.close();
		br.close();
		socket.close();
	}
}
