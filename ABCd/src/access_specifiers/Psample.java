package access_specifiers;

public class Psample {

	

	public int Rollno=10;
	public static void main(String[] args) {

		Psample Ps=new Psample();
		Ps.m1();
		Ps.name();
		System.out.println("Public variables: "+Ps.Rollno);
				
	}
	
	public void name() {
		System.out.println("Public method :m2");
	}
	
	public void m1() {
		System.out.println("Publicmethod :m1");
	}

}

