package cn.io��.�ݹ�.���ֲ���;

public class Test {
	
	//��Ҫ���ҵ�����
	int num = 7;
	boolean res = true;
	
	public static void main(String[] args) {
		int[] b = {1,3,5,7,9,12,18};
		
		int max = b.length-1;//maxΪ����±�
		int min = 0;//minΪ��С�±�
		
		Test t = new Test();
		t.diGui(b,max,min);
	}

	public int diGui(int[] b,int max,int min){
		
		if(min<=max){

			//������С������±������е���±�
			int mid = (min+max)/2;

			//�ж��������
			if(b[mid]==num){
				System.out.println("�ɹ��ҵ�����,������ĵ�"+(mid+1)+"��Ԫ��");
				res=false;
			}else if(b[mid]>num){
				max = mid-1;
				diGui(b,max,min);
			}else if(b[mid]<num){
				min = mid+1;
				diGui(b,max,min);
			}
		}
		if(res==true){
			System.out.println("�Ҳ���");
		}
		return -1;
	}
}
