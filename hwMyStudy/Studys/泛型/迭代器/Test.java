package 泛型.迭代器;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 迭代器
 * 	Iterable
 * 	用于遍历
 * 
 * foreach相对简单,Iterable相对强大
 * foreach是一次性遍历所有内容，Iterable可以控制遍历过程
 * 
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) {
		/*List<String>list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		Iterator<String> it = list.iterator();//获取迭代器对象
		while (it.hasNext()) {//判断还有没有下一条数据
		String type = it.next();//移动指针，并获取上一条内容
		System.out.println(type);
		}
		
		Set<String>set = new HashSet<String>();
		set.add("777");
		set.add("666");
		set.add("555");
		Iterator<String> it2 = set.iterator();
		while(it2.hasNext()){
			String string = it2.next();
			System.out.println(string);
		}*/
		
		Map<String,String>map = new HashMap<String,String>();
		map.put("1","111");
		map.put("2","222");
		map.put("3","333");
		
		Iterator<Entry<String,String>> itt = map.entrySet().iterator();
		
		
		while(itt.hasNext()){
			Map.Entry<String,String>entry = itt.next();
			System.out.println("key="+entry.getKey()+",value="+entry.getValue());
		}
		
		for (Entry<String,String>en:map.entrySet()) {
			String key = en.getKey();
			String value = en.getValue();
			System.out.println(key+"+"+value);
		}
	}
}

