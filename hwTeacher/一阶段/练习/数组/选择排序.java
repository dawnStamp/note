class Demo{

	public static void main(String[] args){
		
		int[] b = {21,6,9,1,12,33};
		
		//用来保存最小的值的下标
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
		//一轮确定一个数的位置
		for(int i=0;i<b.length;i++){
			
			//index，找到最小值之后，应该放在哪个位置
			index=i;
			
			//一轮找到一个最小值
			for(int j=i+1;j<b.length;j++){
				
				//b[1]<b[0]
				if(b[index]>b[j]){
					index = j;
				}
			}
			
			//如果index不等于i，说明找到了比下标为index的数更小的数
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