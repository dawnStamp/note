//ð������
class Paixu{

	public static void main(String[] args){

		/*int[]i = {1,8,9,4,6};
		//���ѭ����һ��ѭ����ȷ��һ������λ��
		for(int a=0;a<i.length-1;a++){
			//�ڲ�ѭ����һ��ѭ�����������е�Ԫ�������Ƚ�
			for(int b=0;b<i.length-1-a;b++){
				
				//�ж��Ƿ���Ҫ����λ��
				if(i[b]>i[b+1]){
					int temp = i[b];
					i[b] = i[b+1];
					i[b+1] = temp;
				}
			}
		}
		
		for(int k=0;k<i.length;k++){
			System.out.println(i[k]);
		}*/
		
		
		/* a=1    b=1    1,8,9,4,6
		  b=8    1,8,9,4,6
		  b=9  	 1,8,4,9,6
		*/	

		
//ѡ������		
		/*int[]i = {8,1,9,4,6};
		//��������Сֵ���±�
		int index;
		//һ��ȷ��һ������λ��
		for(int a=0;a<i.length;a++){
			//index���ҵ���Сֵ֮��Ӧ�÷����ĸ�λ��
			index=a;
			
			//һ���ҵ�һ����Сֵ
			for (int b=a+1; b<i.length; b++) {
				
				if(i[index]>i[b]){
					
					index = b;					
				}
			}
			//���index������i��˵���ҵ��˱��±�Ϊindex������С����
			if(index != a){
				int temp = i[index];
				i[index] = i[a];
				i[a] = temp;
				}
			
			}
			for(int k=0;k<i.length;k++){
			System.out.println(i[k]);
		}*/
		
		
		/*int[]i = {8,1,9,4,6};
		int index;
		for(int r=0;r<i.length;r++){
			index=r;
			for(int o=r+1;o<i.length;o++){
				
				if(i[index]>i[o]){
					index = o;
			}
				if(index !=r){
				int num=i[index];
				i[index]=i[o];
				i[o]=num;
				}
			}
		}
		for(int l=0;l<i.length;l++){
			System.out.println(i[l]);
		}*/
		
		
		
		
//��������
		
		/*int[]i = {8,1,9,4,6};
		int p,d;
		
		//�ٶ���һ��Ԫ�ر��ŵ�����ȷ��λ����
		//�������������1����n-1
		for(int v=1;v<i.length;v++){
			p=v;
			d=i[v];
			while(p>0&&d<i[p-1]){
				i[p]=i[p-1];
				p--;
			}
			i[p]=d;
		}
		for(int l=0;l<i.length;l++){
				System.out.println(i[l]);
		}*/
		
		

//��������		
		/*int[]i = {8,1,9,4,6};
		//a������Ҫ��ǰ�������ֵ���±�
		for(int a=1;a<i.length;a++){
			
			//һ��ȷ��һ������λ��
			for(int b=a;b>0;b--){
				
				//�����������ǰ�����С��ʱ�򣬾ͽ���λ��
				if(i[b-1]>i[b]){
					int num= i[b-1];
					i[b-1]=i[b];
					i[b] =num;
				}
				
			}
		}
			for(int l=0;l<i.length;l++){
				System.out.println(i[l]);
				}*/

//˳����ҷ�
		/*int num = 4;
		int[]i = {8,1,9,4,6};
		for(int k=0;k<i.length;k++){
			if(num==i[k]){
				System.out.println(k);
			}
		}*/
		

		
		
//���ֲ��ҷ�		
		int[]i = {1,4,6,8,9};
		//maxΪ����±�
		int max=i.length-1;
		//minΪ��С�±�
		int min=0;
		//��Ҫ���ҵ�����
		int num=8;
		
		while(true){
			
			
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


