package cn.io流.递归.删除目录;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File f = new File("E:/file");
		delDir(f);
	}

	/**
	 * E:/file
	 * file2 = E:/file/abc  E:/file/123.txt         欠了一个delete没执行
	 * 
	 * E:/file/abc
	 * file2=  E:/file/abc/xxx								欠了一个delete
	 * 
	 * E:/file/abc/xxx
	 * file2 = E:/file/abc/xxx/123.txt				欠了一个delete
	 * 
	 * E:/file/abc/xxx/123.txt
	 */

	public static void delDir(File f){
		if(f.isDirectory()){//判断是否是文件夹
			File[] file = f.listFiles();
			for (File file2 : file) {
				delDir(file2);
			}
		}
		
		f.delete();
	}
}
