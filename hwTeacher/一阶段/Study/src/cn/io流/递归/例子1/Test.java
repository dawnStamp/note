package cn.io流.递归.例子1;

/**
 *递归
 *			程序调用自身的编程技巧称为递归
 *
 *			使用递归，必须有一个明确的递归结束条件，称为递归出口
 */
public class Test {

	int i = 0;
	int sum=0;
	
	public static void main(String[] args) {
		Test t = new Test();
		t.sss();
		
	}
	
	public void sss(){
		i++;
		if(i==101){
			return;
		}
		sum+=i;
		System.out.println(sum);
		sss();
	}
}
