package io��.ɾ���ļ���;

import java.io.File;

public class Test {


	public static void main(String[] args) {
		File fi = new File("D:/file");
		del(fi);


	}



	public static void del(File fi){
		if(fi.exists()){//·���Ƿ����
			if(fi.isDirectory()){//�ж��Ƿ����ļ���
				File[] file = fi.listFiles();
				for (File file2 : file) {
					del(file2);
				}
			}
			fi.delete();
		}
		


	}

}
