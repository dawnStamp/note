package cn.����.������;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ������
 * 		Iterable
 * 		���ڱ���
 * 
 * 		foreach��Լ򵥣�Iterable���ǿ��
 * 		foreach��һ���Ա����������ݣ�Iterable���Կ��Ʊ�������
 * 
 */
public class Test {

	public static void main(String[] args) {
		/*List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		
		Iterator<String> it = list.iterator();//��ȡ����������
		
		while (it.hasNext()) {//�жϻ���û����һ������
			String type = it.next();//�ƶ�ָ�룬����ȡ��һ������
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
