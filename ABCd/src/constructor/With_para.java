package constructor;

public class With_para {
	//VD
	int xyz;
	int pqr;
	String name;
	
	//VI
	//Constructor
	public With_para() {                      //without parameter
	xyz=20;
	pqr=50;
	}
	
	public With_para(int a, int b) {          //with parameter
		xyz=a;
		pqr=b;
	}
	
	//method
	public void addition() {
		int sum= xyz+pqr;
		System.out.println(sum);
	}
	public void add(int a, int b) {
		int addition= a+b;  
		System.out.println("Sum of two no. are "+addition);                                     
	}
	
	public static void main(String[] args) {      //main method
		
		With_para W= new With_para();
		W.addition();
		With_para Wp= new With_para();            
		Wp.add(5,60);                              
		Wp.add(50,110);
		
		
	}
	

}
