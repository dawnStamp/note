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

		System.out.println("��������Ҫ���ص��ļ���·����");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		PrintWriter bw = new PrintWriter(socket.getOutputStream(),true);
		String str = br.readLine();//���û���������ݴ浽str��
		bw.println(str);//���û���������������������

		InputStream is = socket.getInputStream();//����socket��ȡһ���ֽ�������  is���з����������������ݣ����ļ��ж�ȡ����������

		FileOutputStream fos = new FileOutputStream("D:/file/000.jpg");//����һ�������������ָ�������ĸ��ļ������

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
