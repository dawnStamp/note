import java.util.Scanner;
class Zuoye1{

	public static void main(String[] args){
		int[]i = {1,4,6,8,9};
		//max为最大下边
		int max=i.length-1;
		//min为最小下标
		int min=0;
		//需要查找的数字
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字")；
		
		int player = sc.nextInt();
		boolean day = true;
		for(int z=0;z<i)
		
		
		
		
		
		while(true){
			num = player;
			
			//根据最小和最大下标来求中点的下标
			int mid = (min+max)/2;
			
			//判断三种情况
			if(i[mid]==num){
				System.out.println("成功找到数字，是数组的第"+(mid+1)+"个元素");
				break;
			}else if(i[mid]>num){
				max = mid -1;
			}else if(i[mid]<num){
				min = mid+1;
			}
		}
	}	
}	