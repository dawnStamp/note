import java.util.Scanner;
import java.util.Random;
class If{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����(0)   ʯͷ(1)    ��(2)");
		int player = sc.nextInt();

		Random rd = new Random();
		int com = rd.nextInt(3);

		boolean bo1 = player==0&&com==2;
		boolean bo2 = player==1&&com==0;
		boolean bo3 = player==2&&com==1;

		if(player==com){
			System.out.println("ƽ��");
		}else if(bo1 || bo2 || bo3){
			System.out.println("ʤ��");
		}else{
			System.out.println("ʧ��");
		}
		
	}
}