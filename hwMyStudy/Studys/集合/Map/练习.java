package 集合.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Map
 * 		以键/值对的形式来存储数据
 * 特点：
 * 		1.键必须是唯一的，值可以重复
 * 
 * 
 * HashMap
 * 		put()     存值
 * 		get()     取值
 * 		remove()  移除值
 * 		clear()   清空map
 * 
 * 		containsKey()    判断是否包含键
 * 		containsValue()  判断值是否存在	
 * 		isEmpty()        判断为空
 * 		size()           判断长度
 * 		toString()       将map转换为String
 * 		values()  		 取出map中的所有值
 * 		keySet()		 取出map中的所有键
 * 		entrySet()		 取出map中的所有键/值对
 * 
 * HashMap类使用散列表实现Map接口，这使一些基本操作如get()和put()的运行时间保持恒定，即使对大型集合也是如此
 * HashMap本身没有增加任何新的方法
 * 散列表，存的顺序并不一定是取出来的顺序
 * 
 * 
 * TreeMap
 * 		通过使用红黑树实现Map接口
 * 		提供按排序顺序存储键/值对的有效手段
 * 		按关键字升序排序
 * 		它本身并没有定义其他方法
 * 
 * @author oracleOAEC
 *
 */
public class 练习 {

	public static void main(String[] args) {
		//HashMap map =new HashMap();
		TreeMap map =new TreeMap();
		map.put("username","abc");
		map.put("c","李四");
		map.put("b","王五");
		map.put("a","赵六");
		map.put("7","四");
		map.put("9","五");
		
		//第三种遍历方法
		Set set = map.entrySet();
		for (Object object : set) {
			System.out.println(object);
		}
		
		//第二种遍历方法
		/*Set set = map.keySet();
		for (Object object : set) {
			System.out.println(object);
		}*/
		
	/*	Collection col = map.values();
		//遍历
		for (Object ob: col) {
			System.out.println(ob);
		}*/
		
		/*map.remove("c");
		map.clear();*/
		/*boolean bo =map.containsKey("c");
		boolean bo1 = map.containsValue("王五");
		
		System.out.println(bo1);*/
	}
}
