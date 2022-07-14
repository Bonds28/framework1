package array;

public class Arrays_all{
	
	public static void main(String[] args) {
		Object o[]= new Object[5];
		o[0]= 10;
		o[1]= 20.5;
		o[2]= "Welcome";
		o[3]= 'b';
		o[4]= true;
		
		System.out.println(o.length);
		
		for( int i=0; i<o.length; i++) {
			System.out.println(o[i]);
		}
	}

}
