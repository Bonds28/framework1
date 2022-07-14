package interface__;

public class AdvanceCal implements Calculator, Casio {
	
	@Override
	public void addition() {
		
		System.out.println("i am in addition method");
	}
	@Override
	public void Substraction() {	
		
		System.out.println("i am in sub method");
	}
	@Override
	public void multiplication() {
		
		System.out.println("i am in mul method");
	}

	@Override
	public void log() {
		System.out.println("Casio interface : log");
		
	}
	@Override
	public void Tan() {
	System.out.println("Casio interface : Tan");
		
	}
	public void cos() {
		System.out.println("AdvanceCal class : Cos");
	}
	public void sin() {
		System.out.println("AdvanceCal class : sin");

	}


}
