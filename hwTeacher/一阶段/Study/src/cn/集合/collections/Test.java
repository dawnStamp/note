package cn.集合.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections
 * 			类集工具类，定义了若干用于集合的算法
 *	常用方法：
 *				sort()										排序
 *				reverse()								反转
 *				shuffle()								随机排序
 *				swap()									交换集合中两个位置的内容
 *				binarySearch()					对集合进行二分查找法，返回找到的值的索引
 *				fill()										将集合的所有内容全部替换成指定内容
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
