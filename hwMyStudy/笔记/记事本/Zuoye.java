//用户输入 求总分、平均分、最高分、最低分
import java.util.Scanner;

class Zuoye {

	public static void main(String[] args){ 	
		double[] a = new double[5] ; 		
		double num = 0.0;
		//键盘输入成绩
		Scanner sc = new Scanner(System.in); 
			for(int b=0;b<5;b++){
				System.out.println("请输入你的成绩");
			
			//求平均分、总分、最高分，最低分
				int score = sc.nextInt(); 	
				a[b]=score;
				num+=score; 
				for(int f = 0;f<a.length-1;f++){
					if(a[b]<a[f]){
					 double x= a[b];
					  a[b]=a[f];
					  a[f]=x;  
				

				}
			}
		}
			//输出总分、平均分、最高分、最低分		
			System.out.println("你的总分为:"+num);
			System.out.println("你的平均分为:"+num/5);
			System.out.println("你的最高分为:"+a[4]);
			System.out.println("你的最低分为:"+a[0]);
		
	} 
}

