package cn.����.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * ����
 * 		List
 * 				�����ҿ��ظ�
 *							����ʲô˳�����List���ϣ�ȡ��������ʲô˳��
 *							ֵ�����ظ�
 *					�������nullֵ
 *			��õ�����ʵ������ArrayList��LinkedList
 *
 *���÷�����
 *			add()								���Ԫ��
 *			get()								��ȡԪ��
 *			remove()						ɾ��Ԫ��(�ɸ�������������ɾ��)
 *			size()								��ȡ���ϵĳ���
 *			contains()					����ֵ�ڼ������Ƿ����
 *			set()								�滻
 *
 *			indexof()						ֵ��һ�γ��ֵ�����
 *			lastindexof()				ֵ���һ�γ��ֵ�����
 *			subList()						��ȡ���ϣ��õ�һ���µļ���
 *			equals()						�Ա��������ϣ�Ԫ����ȫһ��Ϊtrue
 *			isEmpty()					�ж�Ϊ��
 *			toString()					������ת��ΪString����
 *			toArray()						������ת��Ϊ����
 *
 *ArrayList--��̬����
 *			���ʺ�ȡ
 *	LinkedList  --����
 *			���ʺϴ�
 *			addFirst(x)				��x����ڼ��ϵĵ�һ��λ��
 *			addLast(x)				��x����ڼ��ϵ����һ��λ��
 *			removeFirst()		�Ƴ������еĵ�һ��Ԫ��
 *			removeLast()		�Ƴ������е����һ��Ԫ��
 *
 *���ӣ�
 *				1.��get(10)����Ϊ����
 *							ArrayList�����������10,ֱ���ҵ���Ӧ��ֵ
 *							LinkedList��Ҫ�ƶ�ָ�룬��ָ�����ǰ���Ƶ�10���λ�ã����ҵ���Ӧ��ֵ				
 *
 *							
 */
public class Test {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(true);
		list.add(2.22);
		list.add(new Date());
		list.add(2.22);
		
		list.addFirst(65484);
		list.addLast(878);
		list.removeFirst();
		list.removeLast();
		
		/*List list3 = new ArrayList();
		list3.add(1);
		list3.add(true);
		list3.add(2.22);
		list3.add(new Date());
		list3.add(2.22);
		list.remove(0);
		list.remove(true);

		boolean bo = list.contains(new Date());
		System.out.println(bo);

		list.set(2, "23aaa");
		list.add(1, "abc");

		int index = list.indexOf(2.22);
		System.out.println(index);

		int index2 = list.lastIndexOf(2.22);
		System.out.println(index2);

		List list2 = list.subList(1, 3);

		boolean bo2 = list.equals(list3);
		System.out.println(bo2);

		boolean bo3 = list.isEmpty();
		System.out.println(bo3);

		String str = list.toString();
		System.out.println(str);

		Object[] obj = list.toArray();

		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println(list.get(0));
		for (Object object : list2) {
			System.out.println(object);
		}*/
	}
}
