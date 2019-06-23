class Demo{

	public static void main(String[] args){
		
		int[] b = {1,3,5,7,9,12,18};
		
		//max为最大下标
		int max = b.length-1;
		
		//min为最小下标
		int min = 0;
		
		//需要查找的数字
		int num = 8;
		boolean res = true;
		while(min<=max){
			
			//根据最小和最大下标来求中点的下标
			int mid = (min+max)/2;
			
			//判断三种情况
			if(b[mid]==num){
				System.out.println("成功找到数字,是数组的第"+(mid+1)+"个元素");
				res=false;
				break;
			}else if(b[mid]>num){
				max = mid-1;
			}else if(b[mid]<num){
				min = mid+1;
			}
		}
		if(res==true){
			System.out.println("找不到");
		}
		
	}
}