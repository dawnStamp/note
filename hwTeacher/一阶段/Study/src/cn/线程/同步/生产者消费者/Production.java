package cn.�߳�.ͬ��.������������;

public class Production implements Runnable{

	int num = 0;//�ֿ�

	@Override
	public void run() {
		while(true){
			String name = Thread.currentThread().getName();
			if(name.equals("������")){
				production();
			}else{
				custom();
			}
		}
	}

	/**
	 * ������
	 */
	public void production(){
		synchronized (this) {
			if(num==0){
				num = 1;//����һ����Ʒ
				notify();//���������ߣ�����Ʒ���Թ���
				System.out.println(Thread.currentThread().getName()+"������һ����Ʒ���ֿ���"+num+"����Ʒ��������ɣ�");
			}else{
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * ������
	 */
	public void custom(){
		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if(num == 1){
				num = 0;//������Ʒ
				notify();
				System.out.println(Thread.currentThread().getName()+"������һ����Ʒ���ֿ���"+num+"����Ʒ����������");
			}
		}
	}
}
