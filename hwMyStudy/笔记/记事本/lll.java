class lll{

		//¡‚–Œ
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

		for(int li = 1;li<=4;li++){
			for(int ko = 1;ko<=li;ko++){
				System.out.print(" ");
			}
			for(int xi = 7;xi>=li*2-1;xi--){
				System.out.print("*");	
			}
			System.out.println();
				
		}
	}	
}