package constructor;

public class With_para2 {

	int No;                                                           //variable declaration
	int No1;
	String name;
	
	public With_para2() {                                             //Constructor
		System.out.println("I am zero parameter constructor");
	}
	
	public With_para2(int c, int d) {                                 // local variable decl. / initialization
		No=c;
		No1=d;
	}
	
	public With_para2(String name1) {
		name=name1;
	}
	
	public void division() {                                           //void method
		int div= No/No1;
		System.out.println(div);                                                   // (global variables used)
	}                                           //if we enter local variable, then we should have to mentioned them in parenthesis

	public void Substraction() {
		int Sub= No-No1;
		System.out.println(Sub);                                                    
	}
	public void studentinfo() {
		System.out.println(name);
	}
	

//public static void main(String[] args) {
//	
//	With_para2 Wd= new With_para2(25,5);
//	Wd.division();
//
//	With_para2 Wd1= new With_para2(100,25);
//	Wd1.Substraction();
//	
//	With_para2 Wd3= new With_para2("name23");
//	Wd3.studentinfo();
//}
}
