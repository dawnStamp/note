package cn.抽象类.男人女人吃饭;

public class Man extends AbsDemo{

	@Override
	public String eat(String hands, String mouse, String eyes) {
		System.out.println("男人用"+eyes+"瞄了瞄，马上就用"+hands+"端起了碗，将食物全都吃到了"+mouse+"中");
		return "吃饱了";
	}

}
