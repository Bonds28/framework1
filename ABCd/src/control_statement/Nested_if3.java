package control_statement;

public class Nested_if3 {
 public static void main(String[] args) {
	 
	 int a=21;
	 int b=16;
	
		if(a%2==0) {
		    if(b%2==1) {
			    System.out.println("a is even& b is odd number");}
		   else {System.out.println("a & b both are even numbers");}
		}
		else {
			if(b%2==1) {
				System.out.println("both are odd numbers");}
			else {System.out.println("a is odd and b is even number");}
		}	
		
		
		int c=8;
		if(c>10) {
		    if(c%2==0) {System.out.println("c is greater than 10 & even no.");
		}
		    else {System.out.println("c is more than 10 & odd no."); }
		}
		else{
			if(c%2==0){System.out.println("c is less than 10 and even no.");
		}
			else {System.out.println("c is less than 10 & odd no.");}
        }
   }
}



