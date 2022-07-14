package access_specifiers;

public class Protected {
	int a=25;
	public static void main(String[] args) {
		
		Protected pp= new Protected();
		pp.m22();
		pp.m33();
		System.out.println(pp.a);
	}
	
	protected void m22() {
		System.out.println("Protected 22");
	}
	
	protected void m33() {
		System.out.println("Protected 33");
	}
	

}
