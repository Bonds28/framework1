package polymorphism;

public class M_overloading {
	
	public static void main(String[] args) {
		M_overloading mm= new M_overloading();
		mm.addition(20, 50);
		//mm.m1();                                         //will not execute       
		m1();
		mm.m1(55);
		mm.addition(22,33,11);
	}
	
	public void addition(int p, int q) {
		int sum= p+q;
		System.out.println(sum);
	}
	
	public void addition(int a, int b, int c) {
		int sum= a+b+c;
		System.out.println(sum);
	}
	
	public static void m1() {
		System.out.println("zero argument method");
	}
	
	public static void m1(int a) {
		System.out.println("one input static method");
	}
	//public void m1() {                                      //will not execute
	//	System.out.println("non static m1");
	}
	
	
