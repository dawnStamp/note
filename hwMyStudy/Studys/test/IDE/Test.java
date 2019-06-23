package test.IDE;

/**
 * 
 * IDE介绍(Integrated Development Environment)
 * 		集成开发环境
 * 
 * 		一般包括代码编辑器、编译器、调试器、图形用户界面工具
 * 		就是继承了代码编写功能，分析功能，编译功能，调试功能等一体的开发软件服务套
 * 
 * java领域常见的IDE
 * 		NetBeans       
 * 		JBuilder	
 * 		IntellijIDEA
 * 		Eclipse	
 * 
 * 
 * 调试步骤
 * 	1.初步判断程序出错的位置
 * 	2.给指定的程序设置断点
 * 	3.点击小甲虫
 * 	4.按F6单步运行程序
 * 	5.观察变量或表达式的值
 * 	6.找到问题并修改问题
 * 	7.运行最终程序
 * 
 * @author oracleOAEC
 *
 */
public class Test {
	
	public static void main(String[] args) {
		int i = 10;
		try{
			if(i==10){
				i=50;
				int num = i/0;
				System.out.println(num);
			}
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}
}
