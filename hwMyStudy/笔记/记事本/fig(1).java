import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int[] b= {1,3,5,6,8,9,21};
		int max =b.length-1;
		int min = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		
		int user = sc.nextInt();
		boolean count=true;
		for (int i = 0; i < b.length; i++) {
			if(user==b[i]){
			
				System.out.println("���ڸ����֣�"+user);
				count=false;
				break;
			}

			else if(count){
				System.out.println("�����ڸ����֣�");
				break;
			}
		}
		
		while(true){
			num=user;
			
			
			int mid = (min+max)/2;
			
			if(b[mid]==num){
				
				System.out.println("�ҵ�����,������ĵ�"+(mid+1)+"��Ԫ��");
				break;
			}
			 else if(b[mid]>num) {
				max = mid-1;
			}else if(b[mid]<num) {
				min = mid+1;
			}
			else if(b[mid]!=num){
				System.out.println("����������");
			}
		}
		
	}
}


