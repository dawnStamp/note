package cn.register;

public class ServerMain {

	public static void main(String[] args) {
		UserController uc = new UserController();
		uc.sSocket();
	}
}
