package cn.io��.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * IO(Input/Output)
 * 		�Ǽ��������/����Ľӿڡ�
 * 		Java�ĺ��Ŀ�java.io�ṩ��ȫ�����IO�ӿڡ��������ļ��Ĳ������ļ���д
 * 	
 * File��
 * 		��ʾ�˴����ϵ��ļ���Ŀ¼		
 *			ƽ̨�޹���
 *			ֱ�Ӵ����ļ����ļ��С����磺ɾ���ļ�����ȡ�ļ����ȴ�С����Ϣ
 *			File���ܲ����ļ��������
 *
 *\\   /	windows�У����ֶ�������     linux�� /
 *File.separator�������������������
 *��������㵱ǰ�Ĳ���ϵͳ���Զ�����б��
 *
 *����·�������·��
 *			����·����
 *					���̷���ʼ��һֱ��Ŀ��֮���·��ȫ��д������
 *			���·��
 *					�Ӹ�Ŀ¼��ʼ��һ��һ��������	
 *
 */
public class Test {

	public static void main(String[] args) {
		File file = new File("E:/file/abc");
		System.out.println(file.delete());
		/*
		//���� 
		try {
			System.out.println("�����ɹ�����"+file.createNewFile());//�����ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�����ļ��д����ɹ�����"+file.mkdir());//���������ļ���
		System.out.println("�༶�ļ��д����ɹ�����"+file.mkdirs());//�����༶�ļ���
		
		File dest = new File("E:\\file\\123\\xxx.txt");
		System.out.println("�������ɹ�����"+file.renameTo(dest));//������
		
		//ɾ���ļ����ļ���
		System.out.println("ɾ���ɹ�����"+file.delete());
		
		//�жϷ���
		System.out.println("�ļ����ļ��д�����"+file.exists());
		System.out.println("��һ���ļ���"+file.isFile());
		System.out.println("��һ���ļ�����"+file.isDirectory());
		System.out.println("��һ�������ļ���"+file.isHidden());
		System.out.println("��·���Ǿ���·����"+file.isAbsolute());
		
		//��ȡ
		System.out.println("�ļ����ļ��е������ǣ�"+file.getName());
		System.out.println("����·���ǣ�"+file.getPath());
		System.out.println("�ļ���С��(���ֽ�Ϊ��λ)��"+file.length());
		System.out.println("��·����"+file.getParent());
		
		long lo = file.lastModified();//�ļ����ļ��е����һ���޸�ʱ��
		Date date = new Date(lo);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);
		
		File[] fil = File.listRoots();//���õ��̷�
		
		for (File file2 : fil) {
			System.out.println(file2);
		}
		
		String[] str = file.list();//ָ���ļ����µ��ļ����ļ���
		for (String string : str) {
			System.out.println(string);
		}
		
		File[] filee = file.listFiles();//ָ���ļ����µ��ļ����ļ��еľ���·��
		for (File file2 : filee) {
			System.out.println(file2);
		}
		*/
		
	}
}
