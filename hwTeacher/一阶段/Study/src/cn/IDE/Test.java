package cn.IDE;

/**
 * IDE介绍(Integrated Development Environment)
 * 		集成开发环境
 * 
 * 		一般包括代码编辑器、编译器、调试器、图形用户界面工具。
 * 		就是继承了代码编写功能、分析功能、编译功能、调试功能等一体的开发软件服务套。
 * 
 *Java领域常见的IDE
 *			NetBeans					免费
 *			JBuilder					收费
 *			IntellijIDEA			社区版、旗舰版
 *			Eclipse						
 *
 *	万事万物皆为插件
 *			编辑窗口视图、Java包结构浏览视图、控制台视图
 *
 *常用快捷键：
 *			Ctrl+F     							在当前文件中查找和替换
 *			Alt+/									代码提示
 *			Ctrl+I								自动排版
 *			Ctrl+/								单行注释
 *			Ctrl+Shift+/					多行注释
 *			Ctrl+Shift+\					取消多行注释
 *			Ctrl+Shift+O					快速导包
 *			Ctrl+Z								撤回
 *			Ctrl+Y								反撤回
 *			Ctrl+1								快速修复
 *			Alt+Enter						查找项目路径
 *			Ctrl+鼠标左键				查看内容
 *			Ctrl+H								搜索代码出现过的位置
 *			Ctrl+Shift+R					根据文件名搜索文件					
 *			Ctrl+D								整行删除
 *			Alt+方向键						整行移动
 *
 *调试步骤：
 *			1.初步判断程序出错的位置
 *			2.给指定的程序设置断点
 *			3.点击小甲虫
 *			4.按F6单步运行程序
 *			5.观察变量或表达式的值
 *			6.找到问题并修改问题
 *			7.运行最终程序
 *
 */
public class Test {

	public static void main(String[] args) {
		int i = 10;
		try{
			if(i==10){
				i=20;
				int num = i/0;
				System.out.println(num);
			}
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}
}
