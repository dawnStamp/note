 class Demo{

	public static void main(String[] args){
		
		int[] b = {21,6,9,1,12,33};
		
		//i������Ҫ��ǰ�������ֵ���±�
		for(int i=1;i<b.length;i++){
			
			//һ��ȷ��һ�������λ��
			for(int j=i;j>0;j--){
				
				//�����������ǰ�����С��ʱ�򣬾ͽ���λ��
				if(b[j-1]>b[j]){
					int temp = b[j-1];
					b[j-1] = b[j];
					b[j] = temp;
				}
			}
		}
		
		
		for(int k=0;k<b.length;k++){
			System.out.println(b[k]);
		}
		
		
	}
}