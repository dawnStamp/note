class Demo{

	public static void main(String[] args){
		
		int[] b = {21,6,9,1,12,33};
		
		//����������С��ֵ���±�
		int index;
		
		/*
			i=0  index=0  j=1  b[0]>b[1]{index=1}
						  j=2  b[1]>b[2]
						  j=3  b[1]>b[3]{index=3}
			if(0!=3){}
				int temp = b[3];
				b[3] = b[0];
				b[0] = temp;
					
		*/
		//һ��ȷ��һ������λ��
		for(int i=0;i<b.length;i++){
			
			//index���ҵ���Сֵ֮��Ӧ�÷����ĸ�λ��
			index=i;
			
			//һ���ҵ�һ����Сֵ
			for(int j=i+1;j<b.length;j++){
				
				//b[1]<b[0]
				if(b[index]>b[j]){
					index = j;
				}
			}
			
			//���index������i��˵���ҵ��˱��±�Ϊindex������С����
			if(index != i){
				int temp = b[index];
				b[index] = b[i];
				b[i] = temp;
			}
		}
		
		
		for(int k=0;k<b.length;k++){
			System.out.println(b[k]);
		}
		
		
	}
}