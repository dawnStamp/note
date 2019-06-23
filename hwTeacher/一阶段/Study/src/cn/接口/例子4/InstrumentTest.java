package cn.½Ó¿Ú.Àý×Ó4;

import java.util.Scanner;

public class InstrumentTest  {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Instrument ins=null;
		if(num == 0){
			ins=new Piano();
		}else if(num == 1){
			ins=new Violin();
		}
		
		testPlay(ins);
	}
	
	public static void testPlay(Instrument ins){
		ins.play();
	}
}


