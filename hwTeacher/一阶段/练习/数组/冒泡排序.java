class Demo{

	public static void main(String[] args){
		
		int[] b = {21,6,9,1,12,33};
		
		
		/*
			һ��i=0 j=0  		b[j]>b[j+1] -> b[0]>b[1] -> 21>6    true    {6,21,9,1,12,33}
				    j=1			b[j]>b[j+1] -> b[1]>b[2] -> 21>9    true    {6,9,21,1,12,33}
					j=2
					j=3
					j=4
					
			����i=1 j=0
					j=1
					j=2
					j=3
					j=4
			
		
		*/
		//һ��ѭ��  ȷ��һ������λ��
		for(int i=0;i<b.length-1;i++{
			
			//һ��ѭ��  �������е�����Ԫ�������Ƚ�
			for(int j=0;j<b.length-1-i;j++){
				
				//�ж��Ƿ���Ҫ����λ��
				if(b[j]>b[j+1]){
					//temp = 0   b[j] = 1   b[j+1] = 2
					//temp = 1   b[j] = 1   b[j+1] = 2
					//temp = 1   b[j] = 2   b[j+1] = 2
					//temp = 1   b[j] = 2   b[j+1] = 1
					int temp = b[j+1];
					b[j+1] = b[j];
					b[j] = temp;
				}
				
			}
			
		}
		
		for(int k=0;k<b.length;k++){
			System.out.println(b[k]);
		}
		
		
	}
}