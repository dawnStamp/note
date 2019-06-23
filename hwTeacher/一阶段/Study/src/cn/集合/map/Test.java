package cn.����.map;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Map
 * 		�Լ�/ֵ�Ե���ʽ���洢����
 * 
 * 		�ص㣺
 * 				1.��������Ψһ�ģ�ֵ�����ظ�	
 * 
 * HashMap
 *			put()  										��ֵ
 *			get()											ȡֵ
 *			remove()									�Ƴ�ֵ
 *			clear()										���map
 *			containsKey()						�жϼ��Ƿ����
 *			containsValue()					�ж�ֵ�Ƿ����
 *			isEmpty()								�ж�Ϊ��		
 *			size()											�жϳ���
 *			toString()								��mapת��ΪString
 *			values()									ȡ��map�е�����ֵ
 *			keySet()									ȡ��map�е����м�
 *			entrySet()								ȡ��map�еļ�/ֵ��
 *
 *HashMap��ʹ��ɢ�б�ʵ��Map�ӿڣ���ʹһЩ����������get()��put()������ʱ�䱣�ֺ㶨������Դ��ͼ���Ҳ����ˡ�
 *HashMap����û�������κ��µķ���
 *ɢ�б����˳�򲢲�һ����ȡ��˳��
 *
 *TreeMap
 *			ͨ��ʹ�ú����ʵ��Map�ӿ�
 *			�ṩ������˳��洢��/ֵ�Ե���Ч�ֶ�
 *			���ؼ�����������
 *			������û�ж�����������
 */
public class Test {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put("username", new Date());
		map.put("password", "����");
		
		//�����ĵ����ַ�����
		Set set = map.entrySet();
		for (Object object : set) {
			System.out.println(object);
		}
		/*	map.remove("c","����");
		map.clear();
		boolean bo = map.containsKey("z");
		boolean bo2 = map.containsValue("����");
		map.size();
		map.toString();
		map.isEmpty();
		System.out.println(map.get("c"));

		//�����ĵ�һ�ַ�����
		Collection col = map.values();
		for (Object object : col) {
			System.out.println(object);
		}

		//�ڶ��ֱ���������
//		Set set = map.keySet();
		for (Object object : map.keySet()) {
			System.out.println(object);
		}

		//�����ĵ����ַ�����
		Set set = map.entrySet();
		for (Object object : set) {
			System.out.println(object);
		}
		 */
	}
}
