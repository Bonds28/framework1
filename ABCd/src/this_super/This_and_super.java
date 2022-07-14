package this_super;

public class This_and_super extends sample {
	
	int abc= 123;
	String name= "Java";
	
	public static void main(String[] args) {
		
		This_and_super ts= new This_and_super();
		ts.m11();
	}
	
	public void m11() {
		int abc=456;
		String name="Coding";
		
		System.out.println(abc);                             //local variable
		System.out.println(this.name);                      //Global variable from same class
		System.out.println(super.rollno);                   //Global variable from different class
	}
	
}
