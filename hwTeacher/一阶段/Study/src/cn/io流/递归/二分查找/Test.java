package cn.io流.递归.二分查找;

public class Test {
	
	//需要查找的数字
	int num = 7;
	boolean res = true;
	
	public static void main(String[] args) {
		int[] b = {1,3,5,7,9,12,18};
		
		int max = b.length-1;//max为最大下标
		int min = 0;//min为最小下标
		
		Test t = new Test();
		t.diGui(b,max,min);
	}

	public int diGui(int[] b,int max,int min){
		
		if(min<=max){

			//根据最小和最大下标来求中点的下标
			int mid = (min+max)/2;

			//判断三种情况
			if(b[mid]==num){
				System.out.println("成功找到数字,是数组的第"+(mid+1)+"个元素");
				res=false;
			}else if(b[mid]>num){
				max = mid-1;
				diGui(b,max,min);
			}else if(b[mid]<num){
				min = mid+1;
				diGui(b,max,min);
			}
		}
		if(res==true){
			System.out.println("找不到");
		}
		return -1;
	}
}
