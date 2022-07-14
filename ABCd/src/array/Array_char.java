package array;

public class Array_char {
	
	public static void main(String[] args) {
		
		//char c[] = new char[-1];
		//negative array size is exception, it starts from 0
		
		char c[] = new char[10];
		c[0]= 4;
		
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'c';	
		
		System.out.println(c.length);
	
	}

}
