package ��ϰ2;
import java.util.Scanner;
public class TextPlay {
	
	public void textPlay(){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���͵�������(1)����(2)С����");
		int num = sc.nextInt();
		
		if(num==1){
			Piano pi =new Piano();
			pi.play();
			
		}else if(num==2){
			Violin pi2 =new Violin();
			pi2.play();
			
		}else{
			System.out.println("����������");
		}
	}
	
}
