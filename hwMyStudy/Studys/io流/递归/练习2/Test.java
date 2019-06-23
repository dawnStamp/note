package io流.递归.练习2;

import java.io.File;

public class Test {


	public static void main(String[] args) {
		File f = new File("D:/file");
		show(f);



	}


	public static void show(File f){
		if(f.exists()){
			for(File file :f.listFiles()){
				if(file.isDirectory()){
					System.out.println("文件为："+file.getName());
					show(file);
				}else if(file.isFile()){
					System.out.println("文件夹为："+file.getName());
				}

			}

		}
		if(f.isFile()){
			File[] file1 = f.listFiles();
			for (File file3 : file1) {
				show(file3);
			}
		}
	}

}




