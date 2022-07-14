package interface__;

public class Testclass {
	
	public static void main(String[] args) {
		
		AdvanceCal ac= new AdvanceCal();
		ac.addition();
		ac.multiplication();
		ac.Substraction();
		
		System.out.println(ac.x);
		
		ac.log();
		ac.Tan();
		ac.cos();
		ac.sin();
		
		
		
		Calculator c= new AdvanceCal();        //top casting
		c.addition();
		c.Substraction();
		c.multiplication();
		//c.tan();                             //only common methods run, so it will not run
		//c.cos();                             // this will not run too
	
		//System.out.println(x);
		
	}

}
