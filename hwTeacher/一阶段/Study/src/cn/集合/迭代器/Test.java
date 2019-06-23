package cn.集合.迭代器;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 迭代器
 * 		Iterable
 * 		用于遍历
 * 
 * 		foreach相对简单，Iterable相对强大
 * 		foreach是一次性遍历所有内容，Iterable可以控制遍历过程
 * 
 */
public class Test {

	public static void main(String[] args) {
		/*List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		Iterator<String> it = list.iterator();//获取迭代器对象
		
		while (it.hasNext()) {//判断还有没有下一条数据
			String type = it.next();//移动指针，并获取上一条内容
			System.out.println(type);
		}
		
		Set<String> set = new HashSet<String>();
		set.add("333");
		set.add("666");
		set.add("999");
		Iterator<String> it2 =set.iterator();
		while (it2.hasNext()) {
			String string = it2.next();
			System.out.println(string);
		}*/
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");
		
		Iterator<Entry<String, String>> itt = map.entrySet().iterator();
//		Set<Entry<String, String>> ses = map.entrySet();
//		Iterator<Entry<String, String>> ie = ses.iterator();
		
		while (itt.hasNext()) {
			if(3%2!=0){
				Map.Entry<String, String> entry = itt.next();
			}else{
				itt.next();
			}
			
			Map.Entry<String, String> entry = itt.next();
			System.out.println("key="+entry.getKey()+",value="+entry.getValue());
		}
		
		for (Entry<String, String> en : map.entrySet()) {
			String key = en.getKey();
			String value = en.getValue();
		}
	}
}
