import java.util.Scanner;
import java.util.Random;
class 九九乘法表{

	public static void main(String[] args){
		//九九乘法表
		//i=1  j=1  j<=1
		//i=2  j<=2  j=1,2
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}