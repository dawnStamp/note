package cn.集合.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Set
 * 		无序不可重复
 * 		最多只能包含一个Null
 * 
 * HashSet
 * 		散列表
 * 		没有定义任何超过它的父类和接口提供的其他方法
 * 		HashSet的内部操作的底层数据是HashMap，只是我们操作的是HashMap的key
 * 		存更快
 * 
 * TreeSet
 * 		红黑树
 * 		在存储了大量的需要进行快速检索的排序信息的情况下，TreeSet是一个很好的选择
 * 		HashSet的内部操作的底层数据是TreeMap，只是我们操作的是TreeMap的key
 */
public class Test {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
	}
}
