package ����.������;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * ������
 * 	Iterable
 * 	���ڱ���
 * 
 * foreach��Լ�,Iterable���ǿ��
 * foreach��һ���Ա����������ݣ�Iterable���Կ��Ʊ�������
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
		
		Iterator<String> it = list.iterator();//��ȡ����������
		while (it.hasNext()) {//�жϻ���û����һ������
		String type = it.next();//�ƶ�ָ�룬����ȡ��һ������
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

