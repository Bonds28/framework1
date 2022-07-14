package access_spe_diff;

import access_specifiers.Default_sample;
import access_specifiers.Private_sample;
import access_specifiers.Protected;
import access_specifiers.Psample;

public class Demo1 extends Protected{
	public static void main(String[] args) {
		
	
	Psample ps= new Psample();
	ps.m1();
	ps.name();
	System.out.println(ps.Rollno);

	
	Private_sample P= new Private_sample();
	P.m1();
	P.m2();
	System.out.println(no);
	
	
	Default_sample D= new Default_sample();
	D.m1();
	D.m2();
   System.out.println(no);
   
   
   Protected pp= new Protected();
   pp.m22();
}
}