package array;

public class Array_Double {
	
	public static void main(String[] args) {
		
		//array declaration 
		double d[]= new double[4];
		d[0]= 10d;
		d[1]= 20;
		d[2]= 30;	
		d[3]= 50;
		
		System.out.println(d.length);
		
		for(int i=0; i<d.length; i++) {
			System.out.println(d[i]);
		}
				
	}

}
