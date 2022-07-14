package constructor;

public class With_para22_diff {
	public static void main(String[] args) {
		
		With_para2 Wd= new With_para2(25,5);                       // global variables used
		Wd.division();
	
		With_para2 Wd1= new With_para2(100,25);
		Wd1.Substraction();
		
		With_para2 Wd3= new With_para2("name23");
		Wd3.studentinfo();
		
		With_para Wp= new With_para();            
		Wp.add(5,60);                                                  //local variables used
	}

}
