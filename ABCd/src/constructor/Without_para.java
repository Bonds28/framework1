package constructor;

public class Without_para {
	
	//variable declaration
	int i;
	int j;
	
	//variable initialization
	Without_para(){
		i=500;
		j=70;
	}
		
	public void division() {
	    float div=(i/j);
	    System.out.println(div);
	}
	
	public void multiplication() {
		int mul=(i*j);
		System.out.println(mul);
	}
	
public static void main(String[]args) {
	Without_para wp = new Without_para();
		wp.division();
		wp.multiplication();
		}
    }


