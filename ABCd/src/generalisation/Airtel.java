package generalisation;

public class Airtel implements SIMCard {
	
	public static void main(String[] args) {
		
		Airtel a= new Airtel();
		a.Audiocalling();
		a.SMS();
		a.internet();
		a.hotstar();
	}
	
	public void SMS() {
		System.out.println("Airtel sms");
	}
	public void Audiocalling() {
		System.out.println("Airtel audiocalling");
	}
	public void internet() {
		System.out.println("Airtel inertnet");
	}
	
	public void hotstar() {
		System.out.println("Airtel hotstar");
	}

}
