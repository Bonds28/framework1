package constructor;

public class Default1 {
	
	public static void main(String[] args) {
		
		//create object
		Default1 D= new Default1();
		D.Multiplication();        //Method calling
		D.m22();
		Default D1= new Default();
		D1.m2();
	
	}
	public void Multiplication(){
	int a=20;
	int b=4;
	int mul=a*b;
	
	System.out.println(mul);}
	
	public void m22() {
		int a=20;
		int b=12;
		int add=a+b;	
		System.out.println(add);
	}
		
	}


