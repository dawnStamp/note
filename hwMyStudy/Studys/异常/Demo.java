package 异常;

import java.util.Scanner;

/**
 * 什么是异常？
 * 		所谓异常是指在程序运行过程中发生的一些不正常事件
 * NullPointerException
 * ArrayIndexOutOfBoundsException
 * 除0异常  ArithmeticException: / by zero
 * RuntimeException 运行异常
 * 
 * 
 * 异常导致的后果：程序中断
 * 		
 * 如何防止程序中断：
 * 		设计良好的程序应该在程序异常发生时提供处理这些异常的方法，使得程序不会因为异常的发生
 * 		而阻断或产生不可预见的后果
 * 
 * java的异常是通过两种机制来处理的：
 * 		1.捕获
 * 			try-catch-finally
 * 
 * 			final,finally,finalize
 * 		2.抛出
 * 			throw	手动抛出异常  ，当发生看某些我们处理不了的事情，手动抛出异常，
 * 					在catch代码块中给出相应的处理
 * 			throws  将方法中可能出现的异常抛给上一层处理
 * 
 * 
 * 自定义异常：
 * 		1.自定义异常类必须从已有的异常类继承
 * 		2.对于异常来说，最重要的部分就是它的类名
 * 
 * @author oracleOAEC
 *
 */

public class Demo {

	public static void main(String[] args){
		/*Scanner sc = new Scanner(System.in);
		String str = null;

		while(true){
			System.out.println("请输入你想要的效果");
			String num = sc.next();
			if(num.equals("length")){
				try{//捕获
					str.length();

				}catch(NullPointerException e){//处理捕获到的异常	
					System.out.println("面对疾风吧");
					e.printStackTrace();
				}catch(Exception ec){//处理捕获到的异常
					System.out.println("异常");
					ec.getCause();
				}finally{
					//善后处理，无论是否发生异常，代码总能执行(在最后执行)
					System.out.println("快乐风男");

				}
			}
		}*/

		/*try{
			int i = 1/0;
			System.out.println(i);
		}catch(Exception ec){
			System.out.println(7777);
		}*/
		
		
		try {
			throw new Exception();
		} catch (Exception e) {
		System.out.println("dhaauhdaada");
			e.printStackTrace();
		}
	}
	
	public static void test() throws Exception{
		int i = 1/0;
	}
}
