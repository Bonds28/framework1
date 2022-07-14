package constructor;

public class Basic {
 
	String name="Apple";         //   if not initialize  String- Null
	int i;                      //                       int- 0
	String s;
	
	
	public Basic() {
		System.out.println("Default Constructor");}                   //constructor
	
	public static void main(String[] args) {                          //main method
		Basic c1= new Basic();
		Basic c2= new Basic();
		c1.m1();
		c2.m2();
	}
	
	public void m1() {                                                   // void method
	System.out.println(s+" "+i);}
	public void m2() {
		System.out.println(name+" "+i);}
	
}
