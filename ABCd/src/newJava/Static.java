package newJava;

public class Static {
public static void main(String[] args) {
	
	//static regular method calling from same class
	
	System.out.println("Main method started");
	
	//direct calling
	//syntax--method name();
	         m1();
	         m2();
	//calling by class name
	//syntax--classname.ethodname();
	      Static.m1();
	      Static.m2();
	
	System.out.println("Main method ended");
	}

public static void m1(){
System.out.println("static Regular method class from same class:m1");}

public static void m2(){
	System.out.println("static regular method class from same class:m2");}

	
}


