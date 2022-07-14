package newJava;

public class Method {
	public static void main(String[] args) {
		
		//Non static method call from same class
		
		System.out.println("Main method started");
		
		Method mb= new Method();
		mb.m5();
		mb.m6();
		m7();
		System.out.println("Main method ended");
		}
	
		
		public void m5() {
			System.out.println("non static method running from same class:m5");}
		
		public void m6() {
			System.out.println("non static method running from same class:m6");}
			
		public static void m7() {
			System.out.println("Static method");}
	

}
