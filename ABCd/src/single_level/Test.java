package single_level;

public class Test {
	public static void main(String[] args) {
		
		Son s= new Son();
		s.mobile();
		s.home();
		s.car();
		
		System.out.println(" ");
		
		
		Kia k= new Kia();
		k.start();
		k.automatic();
		k.refuel();
	
		
		System.out.println(" ");
		
		Daughter.gold();
		Daughter.hapiness();                   //static method
		Daughter d= new Daughter();
		d.saree();                            //non static_____create the object like above


	}

}
