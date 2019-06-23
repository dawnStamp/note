class Demo{

	public static void main(String[] args){
		
		int[] b = {21,6,9,1,12,33};
		
		
		/*
			一：i=0 j=0  		b[j]>b[j+1] -> b[0]>b[1] -> 21>6    true    {6,21,9,1,12,33}
				    j=1			b[j]>b[j+1] -> b[1]>b[2] -> 21>9    true    {6,9,21,1,12,33}
					j=2
					j=3
					j=4
					
			二：i=1 j=0
					j=1
					j=2
					j=3
					j=4
			
		
		*/
		//一轮循环  确定一个数的位置
		for(int i=0;i<b.length-1;i++{
			
			//一轮循环  将数组中的所有元素俩俩比较
			for(int j=0;j<b.length-1-i;j++){
				
				//判断是否需要交换位置
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