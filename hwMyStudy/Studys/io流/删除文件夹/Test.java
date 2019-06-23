package io流.删除文件夹;

import java.io.File;

public class Test {


	public static void main(String[] args) {
		File fi = new File("D:/file");
		del(fi);


	}



	public static void del(File fi){
		if(fi.exists()){//路径是否存在
			if(fi.isDirectory()){//判断是否是文件夹
				File[] file = fi.listFiles();
				for (File file2 : file) {
					del(file2);
				}
			}
			fi.delete();
		}
		


	}

}
