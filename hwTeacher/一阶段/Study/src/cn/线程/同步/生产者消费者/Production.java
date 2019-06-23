package cn.线程.同步.生产者消费者;

public class Production implements Runnable{

	int num = 0;//仓库

	@Override
	public void run() {
		while(true){
			String name = Thread.currentThread().getName();
			if(name.equals("生产者")){
				production();
			}else{
				custom();
			}
		}
	}

	/**
	 * 生产者
	 */
	public void production(){
		synchronized (this) {
			if(num==0){
				num = 1;//生产一个商品
				notify();//唤醒消费者，有商品可以购买
				System.out.println(Thread.currentThread().getName()+"生产了一件商品！仓库有"+num+"件商品，快来买吧！");
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
	 * 消费者
	 */
	public void custom(){
		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if(num == 1){
				num = 0;//购买商品
				notify();
				System.out.println(Thread.currentThread().getName()+"买走了一件商品，仓库有"+num+"件商品，快生产！");
			}
		}
	}
}
