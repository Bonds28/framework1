package control_statement;

public class If_else_if {

	public static void main(String[] args) {

		int Marks =66;
		if(Marks>=75) {
			System.out.println("Distinction");
		}
		else if(Marks>=65) {
			System.out.println("First Class");
		}
		else if(Marks>=60) {
			System.out.println("Higher Second class");
		}
		else if(Marks>=55) {
			System.out.println("Second class");
		}
		else if(Marks>40){
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
}
