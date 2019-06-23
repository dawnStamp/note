package 线程.wilt;

public class MyWaitAndNotify implements Runnable{

	Object obj = new Object();
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
		String name = Thread.currentThread().getName();
		synchronized(obj){
			System.out.println(name+"获得了锁！");
			try{
				System.out.println(name+"进入了等待！");
				obj.wait();
				System.out.println(name+"醒了");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(name+"释放了锁");
		}
		
	}
	
	public void notifyy(){
		synchronized(obj){	
			System.out.println("线程2获得了锁！");
			obj.notifyAll();
			System.out.println("线程2释放了锁");
		}
	}
	
	
}


