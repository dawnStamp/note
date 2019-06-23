package cn.集合.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 集合
 * 		List
 * 				有序且可重复
 *							按照什么顺序存入List集合，取出来就是什么顺序
 *							值可以重复
 *					允许插入null值
 *			最常用的两个实现类是ArrayList和LinkedList
 *
 *常用方法：
 *			add()								添加元素
 *			get()								获取元素
 *			remove()						删除元素(可根据索引或内容删除)
 *			size()								获取集合的长度
 *			contains()					查找值在集合中是否存在
 *			set()								替换
 *
 *			indexof()						值第一次出现的索引
 *			lastindexof()				值最后一次出现的索引
 *			subList()						截取集合，得到一个新的集合
 *			equals()						对比两个集合，元素完全一样为true
 *			isEmpty()					判断为空
 *			toString()					将集合转换为String类型
 *			toArray()						将集合转换为数组
 *
 *ArrayList--动态数组
 *			更适合取
 *	LinkedList  --链表
 *			更适合存
 *			addFirst(x)				将x添加在集合的第一个位置
 *			addLast(x)				将x添加在集合的最后一个位置
 *			removeFirst()		移除集合中的第一个元素
 *			removeLast()		移除集合中的最后一个元素
 *
 *例子：
 *				1.以get(10)方法为例，
 *							ArrayList会根据索引：10,直接找到对应的值
 *							LinkedList需要移动指针，将指针从最前面移到10这个位置，才找到对应的值				
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
