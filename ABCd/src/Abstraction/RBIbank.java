package Abstraction;

public abstract class RBIbank {
	
	public static void main(String[] args) {
	
	}
		
		public abstract void loan();                //declare incomplete methods as abstract method
		
		public void credit(){
			System.out.println("Bank---credit");
		}
		
		public void debit() {
			System.out.println("Bank---debit");
		}

}
