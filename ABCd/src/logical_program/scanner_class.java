package logical_program;

import java.util.Scanner;

public class scanner_class {
	
	public static void main(String[] args) {
		
		//create the object of scanner class
		System.out.println("Entre first Element");
	Scanner sc= new Scanner(System.in)	;
	
	    //System.in is standard input stream
	 int a= sc.nextInt();
	
	 System.out.println("Enter Second element");
	 int b= sc.nextInt();
	 
	 System.out.println("addition is: "+(a+b));
		
	}

}
