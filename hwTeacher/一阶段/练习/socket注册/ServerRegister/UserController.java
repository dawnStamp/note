package cn.register;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserController {

	private ArrayList<User> list = new ArrayList<User>();
	
	public void sSocket(){
		try {
			ServerSocket ss = new ServerSocket(8888);
			
			System.out.println("等待连接！");
			Socket socket = ss.accept();
			System.out.println("连接成功！");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("11111"+br);
			String info = br.readLine();
			
			System.out.println("info="+info);
			
			ObjectMapper om = new ObjectMapper();
			User user = om.readValue(info, User.class);
			String result = check(user);
			
			System.out.println("result="+result);
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			pw.println(result);
			
			
			pw.close();
			br.close();
			socket.close();
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * list
	 * 		abc
	 * 		123			
	 * 
	 * 		xxx
	 * 		123
	 * 
	 * 		yyy
	 * 		123
	 * 
	 */
	public String check(User user){
		int res = 0;
		for (int i = 0; i < list.size(); i++) {
			User us = list.get(i);
			String username = us.getUsername();
			String uName = user.getUsername();
			
			if(username.equals(uName)){
				res = 1;
			}
		}
		
		if(res == 0){
			list.add(user);
			return "注册成功";
		}else{
			return "注册失败";
		}
	}
}
