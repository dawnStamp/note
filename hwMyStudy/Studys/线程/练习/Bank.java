package �߳�.��ϰ;

public class Bank implements Runnable{
	private double money = 500;//���
	
	public void getMoney(){
		Bank bank= new Bank();
		Thread th = new Thread(bank,"���������п�");
		Thread th2 = new Thread(bank,"���������п�");	
		
		th.start();
		th2.start();
	}

	@Override
	public void run() {
		synchronized (this) {//ͬ�������
			System.out.println(Thread.currentThread().getName()+"��ʼȡǮ");
			double yue = money-400;
			if(yue<0){
				System.out.println("���� ����Ҫȡ��400�����Ϊ��"+money);
			}else{
				money-=400;
				System.out.println("ȡǮ�ɹ������Ϊ��"+money);
			}
			synchronized (this){}//ͬ�������
		}
	}
}

	

