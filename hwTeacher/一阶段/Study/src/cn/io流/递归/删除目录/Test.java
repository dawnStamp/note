package cn.io��.�ݹ�.ɾ��Ŀ¼;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File f = new File("E:/file");
		delDir(f);
	}

	/**
	 * E:/file
	 * file2 = E:/file/abc  E:/file/123.txt         Ƿ��һ��deleteûִ��
	 * 
	 * E:/file/abc
	 * file2=  E:/file/abc/xxx								Ƿ��һ��delete
	 * 
	 * E:/file/abc/xxx
	 * file2 = E:/file/abc/xxx/123.txt				Ƿ��һ��delete
	 * 
	 * E:/file/abc/xxx/123.txt
	 */

	public static void delDir(File f){
		if(f.isDirectory()){//�ж��Ƿ����ļ���
			File[] file = f.listFiles();
			for (File file2 : file) {
				delDir(file2);
			}
		}
		
		f.delete();
	}
}
