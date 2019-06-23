import java.util.Scanner;
import java.util.Random;
class Demo{

	public static void main(String[] args){
		
		int sum = 0;
		//1-100的和
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		System.out.println(sum);
		
		
		int sum = 0;
		//1-100的偶数和
		//方式1
		for(int i=0;i<=100;i+=2){
			sum+=i;
		}
		System.out.println(sum);
		

		int sum = 0;
		//1-100的偶数和
		//方式2
		for(int i=0;i<=100;i++){
			if(i%2==0){
				sum+=i;
			}
			
		}
		System.out.println(sum);
	}
}