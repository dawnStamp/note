import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int[] b= {1,3,5,6,8,9,21};
		int max =b.length-1;
		int min = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		
		int user = sc.nextInt();
		boolean count=true;
		for (int i = 0; i < b.length; i++) {
			if(user==b[i]){
			
				System.out.println("存在该数字："+user);
				count=false;
				break;
			}

			else if(count){
				System.out.println("不存在该数字！");
				break;
			}
		}
		
		while(true){
			num=user;
			
			
			int mid = (min+max)/2;
			
			if(b[mid]==num){
				
				System.out.println("找到数字,是数组的第"+(mid+1)+"个元素");
				break;
			}
			 else if(b[mid]>num) {
				max = mid-1;
			}else if(b[mid]<num) {
				min = mid+1;
			}
			else if(b[mid]!=num){
				System.out.println("请重新输入");
			}
		}
		
	}
}


