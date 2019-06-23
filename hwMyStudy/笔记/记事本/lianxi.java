//第一题

class lianxi{
		
	public static void main(String[] args){
		int zhi = 8;
		int heig = 884813000;	
		for(int i = 1;i<=100;i++){
		zhi=zhi*2;
			if(zhi>=heig){
			System.out.println(i);	
			}
		
		}			
	}
}












//第二题

class lianxi1{
		
	public static void main(String[] args){
	


	
			
	for(int a = 1;a<=5;a++){
		for(int b = 1;b<=a;b++){
			System.out.print("*");
			}
			System.out.println();
		}
	}			
}

//第三题

class lianxi2{
		
	public static void main(String[] args){
	
	
	for(int a = 1;a<=5;a++){
		for(int b = 1;b<=5-a;b++){
			System.out.print(" ");	
			}
 		for(int c = 1;c<=1+(a-1)*2;c++){
			System.out.print("*");
				}
			System.out.println();
		}
	}
}








