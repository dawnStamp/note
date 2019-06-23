 class Demo{

	public static void main(String[] args){
		
		int[] b = {21,6,9,1,12,33};
		
		//i代表需要往前插入的数值的下标
		for(int i=1;i<b.length;i++){
			
			//一轮确定一个数组的位置
			for(int j=i;j>0;j--){
				
				//当后面的数比前面的数小的时候，就交换位置
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