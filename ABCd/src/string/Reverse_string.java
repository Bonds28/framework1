package string;

public class Reverse_string {
	public static void main(String[] args) {
	
	String s22= "Atomation";
	int l= s22.length();
	String rev= "";
	
	for( int a= l-1; a>=0; a--) {
		rev= rev + s22.charAt(a);
	}
	
	System.out.println(rev);
	
	}
}

