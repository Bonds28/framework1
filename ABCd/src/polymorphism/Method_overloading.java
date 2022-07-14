package polymorphism;

 class Method_overloading {
	 public static void main(String[] args) {
		
		Method_overloading Mo= new Method_overloading();
		Mo.m1();
		Mo.m2(10.12);
		Mo.m2(200.8f);
		Mo.m2(666666l);
	}
	 
	 public void m1() {
	 System.out.println("No argument method");	 
	 }
	 
	 public void m2(int a) {
	 System.out.println("int argument method");
	 }
	 
	 public void m2(float b) {
	 System.out.println("float argument method");
	 }
	 
	 public void m2(long a) {
	 System.out.println("long argument method");
	 }
	 
	 public void m2(double c) {
	 System.out.println("double argument method");	 
	 }

}
