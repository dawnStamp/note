package �߳�.wilt;

public class MyWaitAndNotify implements Runnable{

	Object obj = new Object();
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
		String name = Thread.currentThread().getName();
		synchronized(obj){
			System.out.println(name+"���������");
			try{
				System.out.println(name+"�����˵ȴ���");
				obj.wait();
				System.out.println(name+"����");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(name+"�ͷ�����");
		}
		
	}
	
	public void notifyy(){
		synchronized(obj){	
			System.out.println("�߳�2���������");
			obj.notifyAll();
			System.out.println("�߳�2�ͷ�����");
		}
	}
	
	
}


