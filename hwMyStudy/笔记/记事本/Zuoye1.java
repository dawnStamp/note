import java.util.Scanner;
class Zuoye1{

	public static void main(String[] args){
		int[]i = {1,4,6,8,9};
		//maxΪ����±�
		int max=i.length-1;
		//minΪ��С�±�
		int min=0;
		//��Ҫ���ҵ�����
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������")��
		
		int player = sc.nextInt();
		boolean day = true;
		for(int z=0;z<i)
		
		
		
		
		
		while(true){
			num = player;
			
			//������С������±������е���±�
			int mid = (min+max)/2;
			
			//�ж��������
			if(i[mid]==num){
				System.out.println("�ɹ��ҵ����֣�������ĵ�"+(mid+1)+"��Ԫ��");
				break;
			}else if(i[mid]>num){
				max = mid -1;
			}else if(i[mid]<num){
				min = mid+1;
			}
		}
	}	
}	