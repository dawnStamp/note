package cn.多态.动静态绑定;

import cn.多态.例子3.Bird;

public class Test {

	public static void main(String[] args) {
		//静态绑定
		Bird.abc();
		
		//动态绑定
		Bird an = new Bird();
		an.a();
	}
}
