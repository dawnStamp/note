package cn.����.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections
 * 			�༯�����࣬�������������ڼ��ϵ��㷨
 *	���÷�����
 *				sort()										����
 *				reverse()								��ת
 *				shuffle()								�������
 *				swap()									��������������λ�õ�����
 *				binarySearch()					�Լ��Ͻ��ж��ֲ��ҷ��������ҵ���ֵ������
 *				fill()										�����ϵ���������ȫ���滻��ָ������
 */
public class Test {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(12);
		list.add(8);
		list.add(9);
		list.add(5);
		list.add(2);
		list.add(7);
//		Collections.sort(list);
//		Collections.reverse(list);
//		Collections.shuffle(list);
//		Collections.swap(list, 1, 5);
//		int index = Collections.binarySearch(list, 12);
//		Collections.fill(list, "123");
		
//		System.out.println("index="+index);
		
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
