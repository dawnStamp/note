package text;
import java.util.Scanner;
public class Text {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ӭ�����ٶ��û���½����");
		System.out.println("�����������˺�");
		int zh = sc.nextInt();
		System.out.println("��������������");
		int mm = sc.nextInt();
		Login lo = new Login();
		if(zh==1&&mm==2){
			System.out.println("��½�ɹ�");
			}else{
				System.out.println("�˺����벻�ԣ���½ʧ��");
			}
		
		
	}
}
