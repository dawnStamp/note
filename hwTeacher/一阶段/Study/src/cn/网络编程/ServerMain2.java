package cn.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain2 {
	//�ͻ��˴�����Ӣ����ĸ��������  ���������ش�дӢ����ĸ���ͻ���
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);//���ö˿ں�
		Socket socket = ss.accept();//����accept������ȡSocket����
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		String str = null;
		while((str=br.readLine())!=null){
			if(str.equals("over")){
				break;
			}
			System.out.println(str);//����û�����������Ϣ����over�Ļ������������
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
