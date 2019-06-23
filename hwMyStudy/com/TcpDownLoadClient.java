package cn.com;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TcpDownLoadClient {

	public static void main(String[] args) throws IOException {

		Socket socket = new Socket("127.0.0.1",8888);

		System.out.println("请输入需要下载的文件的路径：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter bw = new PrintWriter(socket.getOutputStream(),true);
		String str = br.readLine();//将用户输入的内容存到str中
		bw.println(str);//将用户输入的内容输出给服务器

		InputStream is = socket.getInputStream();//根据socket获取一个字节输入流  is中有服务器传过来的数据，即文件中读取出来的内容

		FileOutputStream fos = new FileOutputStream("D:/file/000.jpg");//创建一个输出流，并且指定了往哪个文件中输出

		byte[] by = new byte[1024];
		int len = 0;
		while((len = is.read(by))!=-1){
			fos.write(by,0,len);
		}

		fos.close();
		is.close();
		bw.close();
		br.close();
		socket.close();
	}
}
