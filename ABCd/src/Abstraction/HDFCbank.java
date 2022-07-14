package Abstraction;

public class HDFCbank extends RBIbank{
	
	public static void main(String[] args) {
		
		HDFCbank h= new HDFCbank();
		h.credit();
		h.debit();
		h.loan();
		h.funds();
		
	}
	
	public void loan() {
		System.out.println("bank---loan");
	}
	
	public void funds() {
		System.out.println("bamk---funds");
	}


}
