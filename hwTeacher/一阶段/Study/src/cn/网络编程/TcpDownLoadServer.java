package cn.com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpDownLoadServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		System.out.println("���������������ȴ��ͻ��˵�����.....");
		Socket socket = ss.accept();
		System.out.println(socket.getInetAddress().getHostAddress()+"�����ӣ�");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//��ȡ������
		String path = br.readLine();//���ͻ��˴����������ݱ��浽path��
		
		File file = new File(path);//���û�������������File������
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));//��file��ָ�����ļ������ݶ�ȡ������������bis����
		
		BufferedOutputStream pw = new BufferedOutputStream(socket.getOutputStream());//����socket��ȡһ�������
		
		byte[] by = new byte[1024];
		int len = 0;
		while((len = bis.read(by))!=-1){//��bis���е����ݶ�ȡ����
			pw.write(by,0,len);//����ȡ����������������ͻ���
		}
		
		pw.close();
		bis.close();
		br.close();
		socket.close();
		ss.close();
	}
}
