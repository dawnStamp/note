class Demo{

	public static void main(String[] args){
		
		int[] b = {1,3,5,7,9,12,18};
		
		//maxΪ����±�
		int max = b.length-1;
		
		//minΪ��С�±�
		int min = 0;
		
		//��Ҫ���ҵ�����
		int num = 8;
		boolean res = true;
		while(min<=max){
			
			//������С������±������е���±�
			int mid = (min+max)/2;
			
			//�ж��������
			if(b[mid]==num){
				System.out.println("�ɹ��ҵ�����,������ĵ�"+(mid+1)+"��Ԫ��");
				res=false;
				break;
			}else if(b[mid]>num){
				max = mid-1;
			}else if(b[mid]<num){
				min = mid+1;
			}
		}
		if(res==true){
			System.out.println("�Ҳ���");
		}
		
	}
}