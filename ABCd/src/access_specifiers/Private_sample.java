package access_specifiers;

public class Private_sample {

	
private int number =30;
	
	public static void main(String[] args) {
  
		Private_sample PR=new Private_sample();
		PR.m1();
		PR.m2();
		System.out.println("Priavte variable :"+ PR.number);
		
	}
	
	private void m1() {
		System.out.println("Private method :m1");
		
	}
	private void m2() {
		System.out.println("Private method :m2");
	}


}
