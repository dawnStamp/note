package io��;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  IO(Input/Output)
 *  	�Ǽ��������/����Ľӿ�
 *  	java�ĺ��Ŀ�java.io�ṩ��ȫ�����IO�ӿڡ��������ļ��Ĳ������ļ���д
 *  
 *  File��
 *  	��ʾ�����ϵ��ļ���Ŀ¼
 *  	ƽ̨�޹�
 *  	ֱ�Ӵ����ļ����ļ��С����磺ɾ���ļ�����ȡ�ļ����ȴ�С����Ϣ
 *  	File���ܲ����ļ��������
 *  
 *  \\  / �� windows�У����ֶ�������     linux��  /
 *  File.separator�������������������
 *  ��������㵱ǰ�Ĳ���ϵͳ���Զ�����б��
 *  
 *  ����·�������·��
 *  	����·����
 *  		���̷���ʼ��һֱ��Ŀ��֮���·��ȫ��д������
 *  	���·����
 *  		�Ӹ�Ŀ¼��ʼ��һ��һ��������
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *  
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) {
		File fi = new File("D:/file");
		
		
		//ָ���ļ����µ��ļ����ļ��еľ���·��
		/*File[] filee = fi.listFiles();
		for (File file2 : filee) {
			System.out.println(file2);
		}*/
		
		//ָ���ļ����µ��ļ����ļ���
		/*String[] str = fi.list();
		for (String string : str) {
			System.out.println(string);
		}*/
		
		
		//���õ��̷�
		/*File[] i = File.listRoots();
		for (File file : i) {
			System.out.println(file);
		}*/
		
		
		//���һ���޸��ļ���ʱ��
		/*long lo = fi.lastModified();
		Date date = new Date(lo);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);*/
		
		//����
		/*try {
			System.out.println("�����ɹ�����"+fi.createNewFile());//�����ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�����ļ��д����ɹ�����"+fi.mkdir());//���������ļ���
		System.out.println("�༶�ļ��д����ɹ�����"+fi.mkdirs());//�����༶�ļ���
		File dest = new File("D:/file/AAA.txt");
		System.out.println("�������ɹ�����"+fi.renameTo(dest));//������*/
	
		//ɾ���ļ������ļ���
		//System.out.println("ɾ���ɹ�����"+fi.delete());
		
		//�жϷ���
		/*System.out.println("�ļ����ļ��д�����"+fi.exists());
		System.out.println("��һ���ļ���"+fi.isFile());
		System.out.println("��һ���ļ�����"+fi.isDirectory());
		System.out.println("��һ�������ļ���"+fi.isHidden());
		
		System.out.println("��·���Ǿ���·����"+fi.isAbsolute());*/
		
		
		//��ȡ
		/*System.out.println("�ļ����ļ��е������ǣ�"+fi.getName());
		System.out.println("����·���ǣ�"+fi.getPath());
		System.out.println("�ļ���С��(���ֽ�Ϊ��λ��)��"+fi.length());
		System.out.println("��·����"+fi.getParent());*/
		
	}
}
