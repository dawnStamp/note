//冒泡排序
class Paixu{

	public static void main(String[] args){

		/*int[]i = {1,8,9,4,6};
		//外层循环，一轮循环，确定一个数的位置
		for(int a=0;a<i.length-1;a++){
			//内层循环，一轮循环，讲数组中的元素两两比较
			for(int b=0;b<i.length-1-a;b++){
				
				//判断是否需要交换位置
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

		
//选择排序		
		/*int[]i = {8,1,9,4,6};
		//用来存最小值的下标
		int index;
		//一轮确定一个数的位置
		for(int a=0;a<i.length;a++){
			//index，找到最小值之后，应该放在哪个位置
			index=a;
			
			//一轮找到一个最小值
			for (int b=a+1; b<i.length; b++) {
				
				if(i[index]>i[b]){
					
					index = b;					
				}
			}
			//如果index不等于i，说明找到了比下标为index的数更小的数
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
		
		
		
		
//插入排序
		
		/*int[]i = {8,1,9,4,6};
		int p,d;
		
		//假定第一个元素被放到了正确的位置上
		//这样，仅需遍历1——n-1
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
		
		

//插入排序		
		/*int[]i = {8,1,9,4,6};
		//a带边需要往前插入的数值的下标
		for(int a=1;a<i.length;a++){
			
			//一轮确定一个数的位置
			for(int b=a;b>0;b--){
				
				//当后面的数比前面的数小的时候，就交换位置
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

//顺序查找法
		/*int num = 4;
		int[]i = {8,1,9,4,6};
		for(int k=0;k<i.length;k++){
			if(num==i[k]){
				System.out.println(k);
			}
		}*/
		

		
		
//二分查找法		
		int[]i = {1,4,6,8,9};
		//max为最大下边
		int max=i.length-1;
		//min为最小下标
		int min=0;
		//需要查找的数字
		int num=8;
		
		while(true){
			
			
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


