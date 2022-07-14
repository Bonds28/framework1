package final_terms;

public class Finally_block {
	
	public static void main(String[] args) {
		test();
		div();
		//Finally_block f= new Finally_block();
		//f.add();
	}
	
	public static void test() {
		try {
			System.out.println("Test Method");
		}
		catch(Exception e) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}
	}
	
	public static void div() {
		int a=10;
		try {
			System.out.println("div test method");
			int i= a/0;
		}
		catch(ArithmeticException e){
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		}
		finally {
			System.out.println("executed this code even after any execution");
		}
	}
	
	/*public void add() {
		try {
			System.out.println(" Add Test Method");
		}
		catch(Exception e) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block is executed");
		}
	}*/

}
