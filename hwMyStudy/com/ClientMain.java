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
		
		//ͨ��Socket����ȡ�ֽ�������
		//InputStream is= socket.getInputStream();
		
		//ͨ��Socket����ȡ�ֽ������
		/*OutputStream os = socket.getOutputStream();
		os.write("111".getBytes());*/
		System.out.println("�ɹ����ӷ�������");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//���ͻ���������ݱ��浽����
		
		PrintWriter bw = new PrintWriter(socket.getOutputStream(),true);
		//BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader brr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		while(true){
			System.out.println("�����룺");
			String str = br.readLine();//str�����û����������
			bw.println(str);//���û���������ݴ���������
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
