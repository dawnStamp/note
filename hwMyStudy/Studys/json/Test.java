package json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

/**
 * Json(JavaScript Object Notation)
 * 		��һ�������������ݽ�����ʽ
 * 		��ʹ�����Ǻ����׵Ľ����Ķ��ͱ�д
 * 		ͬʱҲ�����˻������н���������
 * 
 * Json������ɶ����ڳ������Ե��ı���ʽ������Ҳʹ������C���Ե�ϰ��
 * ��Щ����ʹJson��Ϊ��������ݽ�������
 * 
 * Json�Ľṹ��
 * 		"����/ֵ"��
 * 			
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) throws Exception{
		//����JSON������
		/*JsonParser parser = new JsonParser();

		JsonObject object = (JsonObject) parser.parse(new FileReader("E:/MyJava/lianxi/Study/Studys/json/abc.json"));


		System.out.println(object.get("pig"));

		JsonArray ja = object.get("animal").getAsJsonArray();

		for (JsonElement jsonElement : ja) {
			System.out.println(jsonElement);
		}

		for (int i = 0; i < ja.size(); i++) {
			System.out.println(ja.get(i));	
		}

		JsonObject jo = object.get("pig").getAsJsonObject();
		System.out.println(jo.get("name"));

		JsonArray array= object.get("box").getAsJsonArray();
		for (int i = 0; i < array.size(); i++) {

			JsonObject json =array.get(i).getAsJsonObject();

			System.out.print("id="+json.get("id").getAsInt()+" ");

			System.out.print("name="+json.get("name").getAsString()+" ");

			System.out.print("age="+json.get("age").getAsInt()+" ");
			System.out.println("    ");
			}*/




			ObjectMapper om = new ObjectMapper();
			//Json��ʽ���ַ���ת��Ϊ����		ת���ַ�
			String ss = "{\"name\":\"liuweijian\",\"sex\":\"Gay\",\"age\":\"20\",\"height\":\"1.7m\"}";
			User user = om.readValue(ss,User.class);
			System.out.println(user.getName());		
			
			
			//����ת��ΪJson��ʽ���ַ���
			String str = om.writeValueAsString(new User("liuweijian","Gay","20","1.70m"));
			System.out.println(str);
		
	}
}
