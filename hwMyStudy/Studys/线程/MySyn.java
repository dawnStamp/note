package �߳�;

public class MySyn extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=30;i++){
			//��ȡ��ǰִ����δ�����̵߳�����
			System.out.println(Thread.currentThread().getName()+""+i);
		}
	}
}
