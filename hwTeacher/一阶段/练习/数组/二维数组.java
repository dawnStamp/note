class Demo{

	public static void main(String[] args){
		
		//int[][] array = {{1,2},{2,3},{3,1}};
		//int[][] array2 = new int[][]{{1,2},{2,3},{3,1}};
		
		int[][] arr = new int[][]{
				{3,1,6,3},
				{6,8,9,2},
				{2,3,7,6},
				{1,6,2,1}
			};
			
			
		//按列求和
		for(int i=0;i<arr[0].length;i++){
			int sum =0;	
			for(int j=0;j<arr.length;j++){
				sum+=arr[j][i];
			}
			System.out.println(sum);
		}	
		
		//按行求和
		for(int i=0;i<arr.length;i++){
			int sum =0;	
			for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
			}
			System.out.println(sum);
		}	
		
		/*arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];
		
		
		arr[2][1] = 1;
		
		//动态往二维数组内存值
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		//for循环遍历
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
			}
		}
		//foreach循环遍历
		for(int[] arr1:arr){
			for(int num:arr1){
				System.out.print(num+",");
			}
			System.out.println();
		}
	
		//System.out.println(arr.length);	
		*/
	}
}