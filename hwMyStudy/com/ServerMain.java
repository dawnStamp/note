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
		ServerSocket ss = new ServerSocket(8888);//���ö˿ں�
		System.out.println("���������������ȴ��ͻ��˵�����...");
		Socket socket = ss.accept();//����accept������ȡSocket����
									//�ȴ��ͻ��˵�����
		System.out.println(socket.getInetAddress().getHostAddress()+"�����ӣ�");
		//��һ��
		/*InputStream is = socket.getInputStream();//��ȡ������
		byte[] b =new byte[10];
		is.read(b);
		System.out.println(new String(b));*/
		
		//�ڶ���
		//�򻯰�
		/*InputStream  input = socket.getInputStream();//����socket��ȡһ���ֽ�������
		
		InputStreamReader isr = new InputStreamReader(input);//����ȡ�����ֽ���ת�����ַ���
		BufferedReader br = new BufferedReader(isr);
		
		String info = br.readLine();
		System.out.println(info);*/
		
		//���Ӱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
		//BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		String str = null;		
		while((str=br.readLine())!=null){
			if(str.equals("over")){
				break;
			}
			System.out.println(str);//����û�����������Ϣ����over�Ļ��������ͻ���
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
