package ioÁ÷.µİ¹é.Á·Ï°1;

public class Test {

	
	int i = 0;
	int sum =0;
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
		sss();
		
		System.out.println(sum);
	}
		
	
}


