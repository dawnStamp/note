package 线程;

public class MySyn extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=30;i++){
			//获取当前执行这段代码的线程的名字
			System.out.println(Thread.currentThread().getName()+""+i);
		}
	}
}
