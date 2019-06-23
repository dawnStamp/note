package 集合.List;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 集合
 * 	ArrayList(是接口类型)
 * 		特点：有序且可重复
 * 				按照什么顺序存入List集合，取出来就是什么顺序
 * 				值可以重复
 * 				允许插入null值
 * 			最常用的两个实现类是ArrayList和LinkedList
 * 
 * 常用方法：
 * 	add()      		添加元素
 * 	get()      		获取元素
 *	set()     		 覆盖/替换
 * 	remove()  		 删除元素(可根据索引或内容删除)
 *	size()     		获取集合长度
 * 	contains()		 查找值在集合中是否存在
 * 	add()(两个参数的)	插入
 * 	indexof()		值第一个出现的索引
 * 	lastIndexof()	值最后一次出现的索引
 * 	subList()       截取集合，得到一个新的集合
 * 	equals()        对比两个集合，元素完全一样为true
 * 	isEmpty()       判断为空
 * 	toString()      将集合转换为String类型
 * 	toArray()	 	将集合转换为数组
 * 
 * 
 * 
 * 
 * ArrayList--动态数组
 * 		更适合取
 * 
 * 
 * 
 * LinkedList--链表
 * 		更适合存,更适合对集合中的元素进行修改
 * 		addFirst(x);       将x添加在集合的第一个位置
 *		addLast(x);		         将x添加在集合的最后一个位置
 *		removeFirst();	   移除集合中的第一个元素
 *  	removeLast();    移除集合中的最后一个元素
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

		/*boolean bo = list.contains(true);//查询
		System.out.println(bo);*/

		/*list.set(1,7);
		list.add(0,"abc");*/



		//foreach循环获取集合长度
		/*for (Object object : list) {
			System.out.println(object);
		}*/
		//for循环获取集合长度
		/*for(int ob=0;ob<list.size();ob++){
			System.out.println(list.get(ob));
		}*/

	}
}
