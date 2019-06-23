class Demo{

	public static void main(String[] args){
		for(int i=1;i<=5;i++) {
		   for(int j=1;j<=5-i;j++) {
			   System.out.print(" ");
		   }
		   for(int a=1;a<=i*2-1;a++) {
			   System.out.print("*");
		   }
		   System.out.println();
		  
	   	}

		for(int i=1;i<=4;i++) {
		   for(int j=1;j<=i;j++) {
			   System.out.print(" ");
		   }
		   for(int a=7;a>=i*2-1;a--) {
			   System.out.print("*");
		   }
		   System.out.println();
		  
	   	}
	}
}

	