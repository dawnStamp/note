package ����.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Collections
 * 		�༯�����࣬�������������ڼ��ϵ��㷨
 * ���÷�����
 * 		sort()        ����
 * 		reverse()     ��ת
 * 		shuffle()     �������(����)
 * 		swap()        ���������е�����λ�õ�����
 * 		binarySearch() �Լ��Ͻ��ж��ֲ��ҷ��������ҵ���ֵ������
 * 		fill()        �����ϵ���������ȫ���滻��ָ������
 * 		
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(7);
		
		/*Collections.sort(list);
		Collections.reverse(list);
		Collections.shuffle(list);
		Collections.swap(list,1,0);
		int index = Collections.binarySearch(list,7);
		System.out.println("index="+index);*/
		Collections.fill(list,"ŵ�ֹ���Ѫŭ����=a��w��q�Ӿ��;�ͷ�߽�e��a��ŵ����˹��ͷ̨");
		
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
