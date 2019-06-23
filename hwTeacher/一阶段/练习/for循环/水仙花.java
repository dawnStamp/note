import java.util.Scanner;
import java.util.Random;
class Demo{

	public static void main(String[] args){
		
		//水仙花
		//三位数   100-999
		//百位、十位、个位
		//153      1*1*1 + 5*5*5 + 3*3*3=153
		//1个循环   3个循环
		/*
		for(int i=100;i<1000;i++){
			int bai = i/100;//百位
			int shi = i/10%10;//十位
			int ge = i%10;//个位

			int sum = bai*bai*bai + shi*shi*shi + ge*ge*ge;
			if(i==sum){
				System.out.println(i);
			}
		}
		
		//i= 1-9  j= 0-9  k=0-9
		//i=1 j=0 k=0,1,2...9
		//i=1 j=1 k=0,1,2...9
		//i=1 j=2 k=0,1,2...9
		//i=2 j=0 k=0,1,2...9
		for(int i=1;i<10;i++){
			for(int j=0;j<10;j++){
				for(int k=0;k<10;k++){
					int sum = i*100+j*10+k;
					int num = i*i*i + j*j*j + k*k*k;

					if(sum==num){
						System.out.println(sum);
					}
				}
			}
		}
		*/



	}
}