package lianxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Lianxi {

	public static void main(String[] args) {
		Random ro = new Random();
		String value;

		List<String> list = new ArrayList<String>();
		list.add("科特迪瓦");
		list.add("阿根廷");
		list.add("澳大利亚");
		list.add("塞尔维亚");
		list.add("荷兰");
		list.add("尼日利亚");
		list.add("日本");
		list.add("美国");
		list.add("中国");
		list.add("新西兰");
		list.add("巴西");
		list.add("比利时");
		list.add("韩国");
		list.add("喀麦隆");
		list.add("洪都拉斯");
		list.add("意大利");

		for(int i =1;i<=4;i++){//循环完一轮，一组的名单就确定
			System.out.println("第"+i+"组：");
			for(int j=1;j<=4;j++){//每一次循环，从集合中取一个值出来

				value = list.get(ro.nextInt(list.size()));

				System.out.print(value+"    ");

				list.remove(value);
			}
			System.out.println();
		}



	}
}
