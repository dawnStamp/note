package io��.�ݹ�.��ϰ2;

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
					System.out.println("�ļ�Ϊ��"+file.getName());
					show(file);
				}else if(file.isFile()){
					System.out.println("�ļ���Ϊ��"+file.getName());
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




