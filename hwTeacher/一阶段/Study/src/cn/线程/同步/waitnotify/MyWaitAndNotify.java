package cn.�߳�.ͬ��.waitnotify;

public class MyWaitAndNotify implements Runnable{

	Object obj = new Object(),b = new Object();
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("�߳�2")){
			notifyy();
		}else{
			waitt();
		}
	}
	
	public void waitt(){
		synchronized (obj) {
			String name = Thread.currentThread().getName();
			System.out.println(name+"���������");
			try {
				System.out.println(name+"�����˵ȴ���");
				obj.wait();
				System.out.println(name+"����");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+"�ͷ�������");
		}
	}
	
	public void notifyy(){
		synchronized (obj) {
			obj.notifyAll();
		}
	}
}
