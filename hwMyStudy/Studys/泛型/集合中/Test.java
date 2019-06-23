package 泛型.集合中;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 泛型方法
 * 		泛型方法中的泛型，只可以在本方法中使用
 * 
 * 集合里使用泛型：为了限制集合中保存的参数的类型
 * 
 * 
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) {
		/*List<String> list = new ArrayList<String>();;
		list.add("abc,123");
		list.add("xxx,123");
		
		String str = (String)list.get(2);
		String[] arr = str.split(",");
		for (String string : arr) {
			System.out.println(string);
		}*/
			
		//Set<Integer> set =new HashSet<Integer>();
			
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"张三");
		
		
		
		
	}
}
