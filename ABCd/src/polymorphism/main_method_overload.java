package polymorphism;

public class main_method_overload {
	
	public static void main (int[]arge) {
		main_method_overload mm= new main_method_overload();
		mm.m11();
		mm.m33();	
	}
	
	
	public static void main(String[]args) {                                   //preference is to String 
		main_method_overload m= new main_method_overload();
		m.m11();
		m.m22();	
	}
	
	public void m11() {
		System.out.println("Method 11");
	}
	
	public void m22() {
		System.out.println("Method 22");
	}
	
	public void m33() {
		System.out.println("Method m33");
	}

}
