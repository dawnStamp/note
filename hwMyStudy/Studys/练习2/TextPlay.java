package 练习2;
import java.util.Scanner;
public class TextPlay {
	
	public void textPlay(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要欣赏的乐器：(1)钢琴(2)小提琴");
		int num = sc.nextInt();
		
		if(num==1){
			Piano pi =new Piano();
			pi.play();
			
		}else if(num==2){
			Violin pi2 =new Violin();
			pi2.play();
			
		}else{
			System.out.println("你输入有误");
		}
	}
	
}
