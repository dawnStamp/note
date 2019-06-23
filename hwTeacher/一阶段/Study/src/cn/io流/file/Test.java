package cn.io流.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * IO(Input/Output)
 * 		是计算机输入/输出的接口。
 * 		Java的核心库java.io提供了全方面的IO接口。包括：文件的操作，文件读写
 * 	
 * File类
 * 		表示了磁盘上的文件或目录		
 *			平台无关性
 *			直接处理文件和文件夹。比如：删除文件，获取文件长度大小等信息
 *			File不能操作文件里的内容
 *
 *\\   /	windows中，两种都可以用     linux中 /
 *File.separator就是用来解决这个问题的
 *它会根据你当前的操作系统，自动补充斜杠
 *
 *绝对路径、相对路径
 *			绝对路径：
 *					从盘符开始，一直到目标之间的路径全部写出来了
 *			相对路径
 *					从根目录开始，一层一层往下找	
 *
 */
public class Test {

	public static void main(String[] args) {
		File file = new File("E:/file/abc");
		System.out.println(file.delete());
		/*
		//创建 
		try {
			System.out.println("创建成功了吗？"+file.createNewFile());//创建文件
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("单级文件夹创建成功了吗？"+file.mkdir());//创建单级文件夹
		System.out.println("多级文件夹创建成功了吗？"+file.mkdirs());//创建多级文件夹
		
		File dest = new File("E:\\file\\123\\xxx.txt");
		System.out.println("重命名成功了吗？"+file.renameTo(dest));//重命名
		
		//删除文件或文件夹
		System.out.println("删除成功了吗？"+file.delete());
		
		//判断方法
		System.out.println("文件或文件夹存在吗？"+file.exists());
		System.out.println("是一个文件吗？"+file.isFile());
		System.out.println("是一个文件夹吗？"+file.isDirectory());
		System.out.println("是一个隐藏文件吗？"+file.isHidden());
		System.out.println("此路径是绝对路径吗？"+file.isAbsolute());
		
		//获取
		System.out.println("文件或文件夹的名称是："+file.getName());
		System.out.println("绝对路径是："+file.getPath());
		System.out.println("文件大小是(以字节为单位)："+file.length());
		System.out.println("父路径："+file.getParent());
		
		long lo = file.lastModified();//文件或文件夹的最后一次修改时间
		Date date = new Date(lo);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);
		
		File[] fil = File.listRoots();//可用的盘符
		
		for (File file2 : fil) {
			System.out.println(file2);
		}
		
		String[] str = file.list();//指定文件夹下的文件或文件夹
		for (String string : str) {
			System.out.println(string);
		}
		
		File[] filee = file.listFiles();//指定文件夹下的文件或文件夹的绝对路径
		for (File file2 : filee) {
			System.out.println(file2);
		}
		*/
		
	}
}
