package cn.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientMain2 {
	//�ͻ��˴�����Ӣ����ĸ��������  ���������ش�дӢ����ĸ���ͻ���
	public static void main(String[] args) throws Exception, IOException {
		Socket socket = new Socket("192.168.0.215",8888);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//���ͻ���������ݱ��浽����

//		PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader brr = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		while(true){
			String str = br.readLine();//str�����û����������
//			pw.println(str);//���û���������ݴ���������
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
