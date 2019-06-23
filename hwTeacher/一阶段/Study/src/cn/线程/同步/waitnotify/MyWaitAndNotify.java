package cn.线程.同步.waitnotify;

public class MyWaitAndNotify implements Runnable{

	Object obj = new Object(),b = new Object();
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("线程2")){
			notifyy();
		}else{
			waitt();
		}
	}
	
	public void waitt(){
		synchronized (obj) {
			String name = Thread.currentThread().getName();
			System.out.println(name+"获得了锁！");
			try {
				System.out.println(name+"进入了等待！");
				obj.wait();
				System.out.println(name+"醒了");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+"释放了锁！");
		}
	}
	
	public void notifyy(){
		synchronized (obj) {
			obj.notifyAll();
		}
	}
}
