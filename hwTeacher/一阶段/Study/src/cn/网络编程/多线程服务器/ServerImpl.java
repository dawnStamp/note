package cn.com.stioServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerImpl implements Runnable{

	private Socket socket;

	public ServerImpl(Socket socket){
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader brx = new BufferedReader(new InputStreamReader(System.in));

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			String str = null;

			while((str=br.readLine())!=null){
				if(str.equals("over")){
					break;
				}
				System.out.println(str);//如果用户传过来的信息不是over的话，就输出内容
				bw.write(brx.readLine());
				bw.newLine();
				bw.flush();
			}

			System.out.println(socket.getInetAddress().getHostAddress()+"断开连接!");
			br.close();
			bw.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
