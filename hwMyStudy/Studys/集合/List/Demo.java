package ����.List;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * ����
 * 	ArrayList(�ǽӿ�����)
 * 		�ص㣺�����ҿ��ظ�
 * 				����ʲô˳�����List���ϣ�ȡ��������ʲô˳��
 * 				ֵ�����ظ�
 * 				�������nullֵ
 * 			��õ�����ʵ������ArrayList��LinkedList
 * 
 * ���÷�����
 * 	add()      		���Ԫ��
 * 	get()      		��ȡԪ��
 *	set()     		 ����/�滻
 * 	remove()  		 ɾ��Ԫ��(�ɸ�������������ɾ��)
 *	size()     		��ȡ���ϳ���
 * 	contains()		 ����ֵ�ڼ������Ƿ����
 * 	add()(����������)	����
 * 	indexof()		ֵ��һ�����ֵ�����
 * 	lastIndexof()	ֵ���һ�γ��ֵ�����
 * 	subList()       ��ȡ���ϣ��õ�һ���µļ���
 * 	equals()        �Ա��������ϣ�Ԫ����ȫһ��Ϊtrue
 * 	isEmpty()       �ж�Ϊ��
 * 	toString()      ������ת��ΪString����
 * 	toArray()	 	������ת��Ϊ����
 * 
 * 
 * 
 * 
 * ArrayList--��̬����
 * 		���ʺ�ȡ
 * 
 * 
 * 
 * LinkedList--����
 * 		���ʺϴ�,���ʺ϶Լ����е�Ԫ�ؽ����޸�
 * 		addFirst(x);       ��x����ڼ��ϵĵ�һ��λ��
 *		addLast(x);		         ��x����ڼ��ϵ����һ��λ��
 *		removeFirst();	   �Ƴ������еĵ�һ��Ԫ��
 *  	removeLast();    �Ƴ������е����һ��Ԫ��
 *  
 * @author oracleOAEC
 *
 */

public class Demo {

	public static void main(String[] args) {
		/*List list = new ArrayList();


		list.add(1);
		list.add(true);
		list.add(2.22);
		list.add('i');
		list.add(new Date());*/

		LinkedList list1 = new LinkedList();


		list1.add(1);
		list1.add(true);
		list1.add(2.22);
		list1.add('i');
		list1.add(new Date());
		
	
		list1.addFirst(65498);
		list1.addLast(14655);
		list1.removeFirst();
		list1.removeLast();

		/*list.indexOf(1);
		System.out.println(list);*/


		/*list.remove(true);
		list.remove(0);*/

		/*boolean bo = list.contains(true);//��ѯ
		System.out.println(bo);*/

		/*list.set(1,7);
		list.add(0,"abc");*/



		//foreachѭ����ȡ���ϳ���
		/*for (Object object : list) {
			System.out.println(object);
		}*/
		//forѭ����ȡ���ϳ���
		/*for(int ob=0;ob<list.size();ob++){
			System.out.println(list.get(ob));
		}*/

	}
}
