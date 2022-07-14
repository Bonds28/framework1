package variables;

public class This_test {
	
	static String name="Suraj";
	static int a= 25;
	
	public static void main(String[] args) {
		String name="Aishu";
		System.out.println(name);
		
		This_test TT =new This_test();
		TT.m11();}
	
	public void m11() {
		String name="Admin";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(this.a);
	}

}
