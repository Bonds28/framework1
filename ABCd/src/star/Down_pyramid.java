package star;

public class Down_pyramid {
	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=9; j++) {
				
				if(j>=i+0 && j<=10-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
	}		
	}

}
