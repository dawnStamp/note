package cn.io��.�ݹ�.����1;

/**
 *�ݹ�
 *			�����������ı�̼��ɳ�Ϊ�ݹ�
 *
 *			ʹ�õݹ飬������һ����ȷ�ĵݹ������������Ϊ�ݹ����
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
