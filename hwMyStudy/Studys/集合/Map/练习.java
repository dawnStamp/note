package ����.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Map
 * 		�Լ�/ֵ�Ե���ʽ���洢����
 * �ص㣺
 * 		1.��������Ψһ�ģ�ֵ�����ظ�
 * 
 * 
 * HashMap
 * 		put()     ��ֵ
 * 		get()     ȡֵ
 * 		remove()  �Ƴ�ֵ
 * 		clear()   ���map
 * 
 * 		containsKey()    �ж��Ƿ������
 * 		containsValue()  �ж�ֵ�Ƿ����	
 * 		isEmpty()        �ж�Ϊ��
 * 		size()           �жϳ���
 * 		toString()       ��mapת��ΪString
 * 		values()  		 ȡ��map�е�����ֵ
 * 		keySet()		 ȡ��map�е����м�
 * 		entrySet()		 ȡ��map�е����м�/ֵ��
 * 
 * HashMap��ʹ��ɢ�б�ʵ��Map�ӿڣ���ʹһЩ����������get()��put()������ʱ�䱣�ֺ㶨����ʹ�Դ��ͼ���Ҳ�����
 * HashMap����û�������κ��µķ���
 * ɢ�б����˳�򲢲�һ����ȡ������˳��
 * 
 * 
 * TreeMap
 * 		ͨ��ʹ�ú����ʵ��Map�ӿ�
 * 		�ṩ������˳��洢��/ֵ�Ե���Ч�ֶ�
 * 		���ؼ�����������
 * 		������û�ж�����������
 * 
 * @author oracleOAEC
 *
 */
public class ��ϰ {

	public static void main(String[] args) {
		//HashMap map =new HashMap();
		TreeMap map =new TreeMap();
		map.put("username","abc");
		map.put("c","����");
		map.put("b","����");
		map.put("a","����");
		map.put("7","��");
		map.put("9","��");
		
		//�����ֱ�������
		Set set = map.entrySet();
		for (Object object : set) {
			System.out.println(object);
		}
		
		//�ڶ��ֱ�������
		/*Set set = map.keySet();
		for (Object object : set) {
			System.out.println(object);
		}*/
		
	/*	Collection col = map.values();
		//����
		for (Object ob: col) {
			System.out.println(ob);
		}*/
		
		/*map.remove("c");
		map.clear();*/
		/*boolean bo =map.containsKey("c");
		boolean bo1 = map.containsValue("����");
		
		System.out.println(bo1);*/
	}
}
