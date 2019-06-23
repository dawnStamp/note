package 数组的排序和查找;

import java.util.Scanner;
public class Text {

	/**
	 * 冒泡排序
	 * 数组元素两两比较，小的互换位子，直到没有什么比较
	 * 
	 */
	public static void main(String[] args) {
		/*int[] a = {8,4,9,18,16,15};

		for(int i=0;i<a.length-1;i++){
			for(int f=0;f<a.length-1-i;f++){
				if(a[f]>a[f+1]){
					int sum = a[f+1];
					a[f+1] = a[f];
					a[f] = sum;
				}
			}
		}
		for(int h=0;h<a.length;h++){
			System.out.println(a[h]);
		}*/

		/**
		 * 选择排序
		 * 
		 */

		/*int[] a = {8,4,9,18,16,15};
		int index;

		for(int k=0;k<a.length;k++){
			index = k;
			for(int y=k+1;y<a.length;y++){
				if(a[index]>a[y]){
					index = y;
				}
			}
				if(index != k){
					int num = a[index];
					a[index] = a[k];
					a[k] = num;
				}
			}

		for(int r=0;r<a.length;r++){
			System.out.println(a[r]);
		}*/
		
		
		/**
		 * 插入排序
		 */
		
		/*int[] a = {8,4,9,18,16,15};
		
		for(int i=1;i<a.length;i++){
			for(int u=i;u>0;u--){
				
				if(a[u-1]>a[u]){
					int num = a[u-1];
					a[u-1] = a[u];
					a[u] = num;
				}
			}
		}
		
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}*/
		
		
		
		//二分查找法
		int[] a = {1,4,6,8,10};
		
		int max = a.length-1;
		int min = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		boolean res = true;
		int player = sc.nextInt();
		while(min<=max){
			int mid = (min+max)/2;
			
			if(a[mid]==player){
				System.out.println("成功找到数字，是数组的第"+(mid+1)+"个元素");
				res=false;
				break;
			}else if(a[mid]>player){
				max = mid-1;
			}else if(a[mid]<player){
				min = mid+1;
			}
		}
		
		if(res==true){
			System.out.println("无法找到该数字");
		}
	}
}
