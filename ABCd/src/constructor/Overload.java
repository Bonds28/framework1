package constructor;

public class Overload {
	
	public Overload() {
		System.out.println("Zero para");
	}
	
	public Overload(int i) {
		System.out.println("para 1");
	}
	
	public Overload(int a, int b) {
		System.out.println("para 2");
	}
	
	
	public Overload(String s, int p, int q) {
		System.out.println("para 3");
	}
	
	
	public Overload(String name) {
		System.out.println("para 4");
	}

	public static void main(String[] args) {
		
	}
}
