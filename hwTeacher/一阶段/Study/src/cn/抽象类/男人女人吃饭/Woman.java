package cn.抽象类.男人女人吃饭;

public class Woman extends AbsDemo{

	@Override
	public String eat(String hands, String mouse, String eyes) {
		System.out.println("女人先"+eyes+"看了看饭菜，又闻了闻，再舔了舔，最后用"+hands+"端起了碗，将一些食物放进了"+mouse+"中");
		return "没吃饱";
	}

}
