package variables;

public class Global_nonstatic3 {
	
	int i=500;
	String s="Akash";
	
	int rollno= 30;
	public void m2() {
		System.out.println("good morning");
	}
	
	public static void main(String[] args) {
		Global_nonstatic3 Gn= new Global_nonstatic3();
		System.out.println(Gn.i);
		System.out.println(Gn.s);
		m1();
	}
	
	public static void m1() {
		Global_nonstatic3 G= new Global_nonstatic3();
				System.out.println(G.rollno);
				System.out.println(G.s);
		
	}

}
