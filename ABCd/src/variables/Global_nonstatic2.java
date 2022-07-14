package variables;

public class Global_nonstatic2 {
	//Non static global variable call from same class


	
	    static int i=10;                                   //  Non-static global variable
	    static String s ="Mohit";
		
		public static void main(String[] args) {
			
			Global_nonstatic2 Ns=new Global_nonstatic2();
			
			System.out.println(Ns.i);
			System.out.println(Ns.s);
	        m1();
		}
		
		public static void m1() {
			
			Global_nonstatic2 Ns1=new Global_nonstatic2();
			
			System.out.println(Ns1.i);
			System.out.println(Ns1.s);} 
			
		
		
		}

	
	




