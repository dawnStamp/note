/*import java.util.Scanner;
import java.util.Random;*/
class text{

	public static void main(String[] args){
	

		/*Scanner sc = new Scanner(System.in);
		System.out.println("������0�� ʯͷ��1�� ����2��");
		int play = sc.nextInt();

		
		Random rd = new Random();
		int com = rd.nextInt(3);
		
		if(play==com){
			System.out.println("ƽ��");
		}else if((play==0&&com==2 )||( play==1&com==0 )|| (play==2&&com==1)){
			System.out.println("ʤ��");
		}else{	
			System.out.println("ʧ��");
}*/





		/*��ѡһ
		if(i==1){
			System.out.println("����");
		}else if(i==2){
			System.out.println("ʯͷ");
		}else if(i==3){
			System.out.println("��");
		}else{
			System.out.println("�����Ĳ����Ϲ���");
		}*/

		//ѡ���
		/*if(3==4){
			System.out.println(1111);
		}
		if(1==1){
			System.out.println(2222);
		}
		if(2==2){
			System.out.println(3333);
		}*/
		
		
		//switch���
		/*int i = 1;
		switch(i){
			case 1:
				System.out.println(1111);
				break;
			case 2:
				System.out.println(2222);
				break;
			case 3:
				System.out.println(3333);
				break;
			default:
				System.out.println(4444);
		}*/



		/*int a = 0;
		for(int i = 1;i<=100;i++){
			if(i%2==0){
			a+=i;
			}		
		}
		System.out.println(a);*/


		/*for(int i = 1;i<=3;i++){
			System.out.println("i="+i);
			for(int j = 1;j<=3;j++){
				System.out.println("j="+j);
				for(int h = 1;h<=3;h++){
					System.out.println("h="+h);
						for(int g = 1;g<=3;g++){
							System.out.println("g="+g);
					}
				}
			}
			
		}*/

				

		//ˮ�ɻ���
		//��һ�ַ���
		/*for(int i = 100;i<1000;i++){
			int a =(i/100);//��λ
			int b =i/10%10;//ʮλ
			int c =i%10;//��λ
			
			if(i== a*a*a+b*b*b+c*c*c){
			System.out.println(i);
			}
		}*/


		//�ڶ��ַ���
		/*for(int a = 1 ; a<10;a++){
			for(int b = 0;b<10;b++){
				for(int c = 0;c<10;c++){
					int sum = a*100+b*10+c;
					int num = a*a*a+b*b*b+c*c*c;

				if(sum==num){
					System.out.println(sum);
					}
				}
			}
		}*/

		/*
		���İټ�		

		5��Ǯ������һֻ����
		3��Ǯ������һֻĸ��
		1��Ǯ������3ֻС��

		100��Ǯ��100ֻ��
		

		for(int m = 0; m<=20;m++){
			for(int g = 0;g<=33;g++){
				for(int c =0; c<=100;c++ ){
				
				  //�㼸ֻ��      �����Ǯ            С��������ֻ��
				if((m+g+c==100)&&(m*5+g*3+c/3==100)&&(c%3==0)){
					System.out.println(m+"ֻ������"+g+"ֻĸ����"+c+"ֻС����");
					}
				}		
			}
		}*/		

		
		//�žų˷���
		
		for(int a = 1;a<=9;a++){
			for(int b = 1;b<=a;b++){
				
			System.out.print(b+"*"+a+"="+a*b+"\t");
			}
			System.out.println();
		}
		
	}
}	