package polymorphism;

public class CarTest_overriding {
	
	public static void main(String[] args) {
		
		Maruti m= new Maruti();
		                                          //all methods will run
		m.start();                               // 1stly it go to child class and if any object not found, it will go to parent class
		m.refuel();
		m.Theftsafety();

		
		System.out.println("   ");
		
		Car c= new Car();                        // only parent class properties will show
		c.start();
		c.stop();
		//c.Theftsafety();
		
		System.out.println("    ");
		                                         //only common methods will run
		Car c1= new Maruti();                    // 1stly found out common method & run child class common method, & then run parent class method
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.Theftsafety();
		
		
		
		System.out.println("   ");
		
		Static_parent s= new Static_child();           
		s.m1();                                         //in case of static method, parent class method will run    //hiding
		s.m2();                                        //in case of static & non static, parent class method will run
		s.m3();                                        //in case of non static, child class method will run   
	}

}
