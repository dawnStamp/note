package cn.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	//�ͻ��˴����ø�������     ����������Ҳ�ø��ͻ���
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);//���ö˿ں�
		Socket socket = ss.accept();//����accept������ȡSocket����
		
		BufferedReader br =new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String val = br.readLine();
		System.out.println(val);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("��Ҳ��");
		bw.newLine();
		bw.flush();
	
		bw.close();
		br.close();
		socket.close();
		ss.close();
	}
}
