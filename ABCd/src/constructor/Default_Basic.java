package constructor;

public class Default_Basic {

	String name;
	int rollno;
	
	Default_Basic(){                                     //constructor
		System.out.println("Default constructor");
	}
	
	public static void main(String[] args) {
		Default_Basic Dc=  new Default_Basic();
		Default_Basic Dc1= new Default_Basic();
		Default_Basic Dc5= new Default_Basic();
		Dc5.m55();
		
	}
	
	public void m55() {
		System.out.println("Def. Const.");
	}
}

