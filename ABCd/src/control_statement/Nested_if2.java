package control_statement;

public class Nested_if2 {

	public static void main(String[] args) {	
	 
		int age=25;
		int weight=50;
     /* if(age>= 18) {
			{if (weight>= 45) 
				System.out.println("You are eligible");}
		
		    else if (age>=18 && weight<45) {
			System.out.println("Your weight is less than 45, so you are not eligible");}
			
		
		else {
			System.out.println("Your age is less than 18, so you are not eligible");}
	
		else {System.out.println("You are not eligible");}  
		}   */
		
	if(age>=18) {
		    if(weight>=45) {
			    System.out.println("You can donate blood.");}
		   else {System.out.println("Underweight! You can not donate blood.");}
		}
		else {
			if(weight>=45) {
				System.out.println("underage! You can't donate blood.");}
			else {System.out.println("Underage & underweight! ");}
		}	
	}
}
