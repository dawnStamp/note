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
 * 		是一种轻量级的数据交换格式
 * 		它使得人们很容易的进行阅读和编写
 * 		同时也方便了机器进行解析和生成
 * 
 * Json采用完成独立于程序语言的文本格式，但是也使用了类C语言的习惯
 * 这些特性使Json成为理想的数据交换语言
 * 
 * Json的结构：
 * 		"名称/值"对
 * 			
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) throws Exception{
		//创建JSON解析器
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
			//Json格式的字符串转换为对象		转义字符
			String ss = "{\"name\":\"liuweijian\",\"sex\":\"Gay\",\"age\":\"20\",\"height\":\"1.7m\"}";
			User user = om.readValue(ss,User.class);
			System.out.println(user.getName());		
			
			
			//对象转换为Json格式的字符串
			String str = om.writeValueAsString(new User("liuweijian","Gay","20","1.70m"));
			System.out.println(str);
		
	}
}
