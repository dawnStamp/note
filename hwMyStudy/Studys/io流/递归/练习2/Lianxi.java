package io��.�ݹ�.��ϰ2;

public class Lianxi {
	
	int num = 5;
	boolean res = true;
public static void main(String[] args){
		
		
		
		int[] b = {1,3,5,7,9,12,18};
		
		//maxΪ����±�
		int max = b.length-1;
		
		//minΪ��С�±�
		int min = 0;
		Lianxi li =new Lianxi();
		li.bbb(b,min,max);
		
		//��Ҫ���ҵ�����
		
		
	
		
	}


	public int bbb(int[]b,int min,int max){
		
	if(min<=max){
			
			//������С������±������е���±�
			int mid = (min+max)/2;
			
			//�ж��������
			if(b[mid]==num){
				System.out.println("�ɹ��ҵ�����,������ĵ�"+(mid+1)+"��Ԫ��");
				res=false;
				
			}else if(b[mid]>num){
				max = mid-1;
				bbb(b,min,max);
			}else if(b[mid]<num){
				min = mid+1;
				bbb(b,min,max);
			}
		}
		if(res==true){
			
			System.out.println("�Ҳ���");
		}
		return -1;
		
	}
	

}
