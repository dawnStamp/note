import java.util.Scanner;
import java.util.Random;
class Demo{

	public static void main(String[] args){
		
		/*
		5文钱可以买一只公鸡
		3文钱可以买一只母鸡
		1文钱可以买3只小鸡

		100文钱买100只鸡
		*/

		//i=0 j=0 k=1,2,3...100
		//i=0 j=1 k=1,2,3...100
		//i=20 j=33 k=100
		for(int i=0;i<=20;i++){
			for(int j=0;j<=33;j++){
				for(int k=0;k<=100;k++){
					if((i+j+k==100)&&(i*5+j*3+k/3==100)&&(k%3==0)){
						System.out.println(i+"只公鸡,"+j+"只母鸡,"+k+"只小鸡。");
					}
				}
			}
		}
	}
}