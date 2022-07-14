package polymorphism;

public class Basic {


	public static void main(String[] args) {
		Basic b= new Basic();
		b.demo();
		
	}
	
	public void demo() {
		System.out.println("non static m.");
	}
	
	public void demo2() {
		System.out.println("static m.");
	}
}
