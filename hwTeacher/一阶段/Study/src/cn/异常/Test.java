package cn.异常;

import java.util.Scanner;

import cn.传参.Animal;

/**
 * 什么是异常？
 * 		所谓异常是指在程序运行过程中发生的一些不正常事件。
 * 
 * NullPointerException
 * ArrayIndexOutOfBoundsException
 * ArithmeticException: / by zero	
 * RuntimeException
 * IOException
 * SQLException
 * ClassNotFoundException
 * 
 *异常导致的后果：
 *			程序直接中断
 *
 *如何防止程序中断：
 *			设计良好的程序应该在程序异常发生时提供处理这些异常的方法，
 *			使得程序不会因为异常的发生而阻断或产生不可预见的后果
 *
 *Java的异常是通过两种机制来处理的：
 *			1.捕获
 *						try-catch-finally
 *			2.抛出
 *						throw		手动抛出异常，当发生了某些我们处理不了的事情，手动抛出异常，在catch代码块中给出相应处理
 *						throws		将方法中可能出现的异常抛给上一层处理
 *
 *
 *内部类
 *matchs正则
 *MD5加密
 *
 *自定义异常：
 *			1.自定义异常类必须从已有的异常类继承
 *			2.对于异常来说，最重要的部分就是它的类名
 *	
 *
 *		
 */
public class Test {

	public static void main(String[] args) {
		//定义异常
		try {
			abc();
			throw new ArrayIndexOutOfBoundsException();
		} catch (Exception e) {
			System.out.println("您输入错误");
		}
	}
	public static void abc() throws Exception{
	}
	public static void test() throws Exception{
		int i = 1/0;
		/*Scanner sc = new Scanner(System.in);
		String str = null;

		while(true){
			try{//捕获
				String num = sc.next();
				if(num.equals("length")){
					int i = 1/0;
				}
				//				return;//立即返回方法的调用处
			}catch(NullPointerException ec){//处理捕获到的异常
				ec.printStackTrace();
			}catch(Exception exc){//处理捕获到的异常
				exc.printStackTrace();
			}finally{
				//善后处理，无论是否发生异常，代码总能执行(在最后执行)
				System.out.println("1111");
				sc.close();
			}
		}*/
	}
}
