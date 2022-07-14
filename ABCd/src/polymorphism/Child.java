package polymorphism;

public class Child extends Parent{
	
	@Override
	public void money() {
		System.out.println("Money----2lakh");
	}
	@Override
	public void m1() {
		System.out.println("Child non static method");
	}
	
	public void m2() {
		System.out.println("Child  method");
	}
	public void mobile() {
		System.out.println("Mobile----i phone");
	}
	
	
	public static void main(String[] args) {
		Parent p= new Parent();
			p.money();
			p.m1();
	System.out.println("***********************************");		
	    Child c= new Child();
	        c.money();
	        c.home();
	        c.m1();
	        c.m2();
	        c.mobile();
   System.out.println("*************************************");   
	     Parent pc= new Child();                               //as methods r non static, it will show child class propertiess
	        pc.money();
	        pc.m1();
	      //  pc.mobile();
		}

}
