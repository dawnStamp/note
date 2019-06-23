package 集合.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Collections
 * 		类集工具类，定义了若干用于集合的算法
 * 常用方法：
 * 		sort()        排序
 * 		reverse()     反转
 * 		shuffle()     随机排序(打乱)
 * 		swap()        交换集合中的两个位置的内容
 * 		binarySearch() 对集合进行二分查找法，返回找到的值的索引
 * 		fill()        将集合的所有内容全部替换成指定内容
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
		Collections.fill(list,"诺手光速血怒连招=a接w接q接巨型九头蛇接e接a接诺克萨斯断头台");
		
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
