package lianxi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class UpLoad {

	public static void main(String[] args) throws IOException, Exception {

		Socket socket = new Socket("127.0.0.1",8888);

		//PrintWriter bw = new PrintWriter(socket.getOutputStream(),true);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//��ȡ������
		String path = br.readLine();//���ͻ��˴����������ݱ��浽path��
		File file = new File(path);

		
		

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));//��file��ָ�����ļ������ݶ�ȡ������������bis����

		BufferedOutputStream pw = new BufferedOutputStream(socket.getOutputStream());//����socket��ȡһ�������

		byte[] by = new byte[1024];
		int len = 0;
		while((len = bis.read(by))!=-1){//��bis���е����ݶ�ȡ����
			pw.write(by,0,len);//����ȡ����������������ͻ���
			
		}

		pw.close();
		bis.close();
		//bw.close();
		br.close();
		socket.close();

	}
}
