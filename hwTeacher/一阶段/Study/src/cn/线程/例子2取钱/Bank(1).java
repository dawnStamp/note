package cn.�߳�.����2ȡǮ;

public class Bank implements Runnable{

	private double money=500;//�˺����
	
	/**
	 * ȡǮ
	 */
	public void getMoney(){
		Bank bank = new Bank();
		Thread th = new Thread(bank,"����������");
		Thread th2 = new Thread(bank,"�����ô���");
		
		th.start();
		th2.start();
	}
	
	@Override
	public void run() {
			synchronized (this) {//ͬ�������
				System.out.println(Thread.currentThread().getName()+"��ʼȡǮ��");
				double yue = money-400;
				if(yue<0){
					System.out.println("���㣡��Ҫȡ��400.���Ϊ:"+money);
				}else{
					money -= 400;
					System.out.println("ȡǮ�ɹ������Ϊ��"+money);
				}
			}
	}

}
