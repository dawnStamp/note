//�û����� ���ܷ֡�ƽ���֡���߷֡���ͷ�
import java.util.Scanner;

class Zuoye {

	public static void main(String[] args){ 	
		double[] a = new double[5] ; 		
		double num = 0.0;
		//��������ɼ�
		Scanner sc = new Scanner(System.in); 
			for(int b=0;b<5;b++){
				System.out.println("��������ĳɼ�");
			
			//��ƽ���֡��ܷ֡���߷֣���ͷ�
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
			//����ܷ֡�ƽ���֡���߷֡���ͷ�		
			System.out.println("����ܷ�Ϊ:"+num);
			System.out.println("���ƽ����Ϊ:"+num/5);
			System.out.println("�����߷�Ϊ:"+a[4]);
			System.out.println("�����ͷ�Ϊ:"+a[0]);
		
	} 
}

