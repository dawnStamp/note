package cn.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class �����ϰ�ͻ��� {

	//�ͻ��˴����ø�������     ����������Ҳ�ø��ͻ���
	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("192.168.0.209",8888);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write("����");
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

