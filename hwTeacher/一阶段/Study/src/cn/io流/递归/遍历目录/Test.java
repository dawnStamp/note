package cn.ioÁ÷.µÝ¹é.±éÀúÄ¿Â¼;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File f = new File("E:/file");
		bianli(f);
	}
	
	public static void bianli(File f){
		if(f.exists()){
			for (File file : f.listFiles()) {
				if(file.isDirectory()){
					System.out.println("DIR:"+file.getName());
					bianli(file);
				}else if(file.isFile()){
					System.out.println("FILE:"+file.getName());
				}
			}
		}
	}
}
