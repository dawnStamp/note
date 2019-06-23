package cn.register;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CSocket {

	public void cSocket(String info){
		try {
			Socket socket = new Socket("127.0.0.1",8888);
			
			System.out.println(info);
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			pw.println(info);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println(br.readLine());
			
			br.close();
			pw.close();
			socket.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
