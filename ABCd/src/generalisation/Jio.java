package generalisation;

public class Jio implements SIMCard {
	
	public static void main(String[] args) {
		
		Jio j= new Jio();
		j.Audiocalling();
		j.amazoneprime();
		j.SMS();
	}
	
	public void Audiocalling() {
		System.out.println("Jio calling");
	}
	
	public void amazoneprime() {
		System.out.println("Jio Amazoneprime");
	}

	@Override
	public void SMS() {	
		System.out.println("Jio SmS");
	}
	@Override
	public void internet() {                         // not declare but have to define it, otherwise program will not run 
		System.out.println("Jio internet");
	}


}
