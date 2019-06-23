package 集合.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Set
 * 		无序不可重复
 * 		最多只能包含一个null		
 * 
 * HashSet
 * 		散列表
 * 		没有定义任何超过它的父类和接口提供的其他方法
 * 		HashSet的背部操作的底层数据是HashMap,只是我们操作的是HashMap的Key
 * 		存更快	
 * 	
 * TreeSet
 * 		红黑树
 * 		取更快
 * 		 在存储了大量的需要进行快速检索的排序信息的情况下，TreeSet是一个很好的选择
 * 		HashSet的背部操作的底层数据是TreeMao,只是我们操作的是TreeMap的Key
 * 
 * @author oracleOAEC
 *
 */
public class Text {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add("a");
	}
}
