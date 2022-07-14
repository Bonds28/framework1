package access_specifiers;

public class Default_sample {

	int no=10;
	public static void main(String[] args) {
	
		Default_sample DF =new Default_sample();
		DF.m1();
		DF.m2();
		
		System.out.println("Dafault variable :"+DF.no);

	}
	void m1() {
		System.out.println("Default method :1");
	}
	void m2() {
		System.out.println("Default method :2");
	}


}
