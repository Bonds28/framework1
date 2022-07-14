package generalisation;

public class BSNL implements SIMCard {
	
	public static void main(String[] args) {
		
		BSNL b= new BSNL();
		b.SMS();
		b.Audiocalling();
		b.internet();
		b.netflix();
	}
	@Override
	public void SMS() {
		System.out.println("BSNL sms");
	}
	@Override
	public void Audiocalling() {
		System.out.println("BSNL Audiocalling");
	}
	@Override
	public void internet() {
		System.out.println("BSNL internet");
	}
	
	public void netflix() {
		System.out.println("BSNL netflix");
	}
	
}
