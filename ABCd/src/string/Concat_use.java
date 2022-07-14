package string;

public class Concat_use {
	
	public static void main(String[] args) {
		
	String s1= new String("java");
	String s2= new String ("java");
	String s3= "java";
	String s4= "java";
	
	s1.concat("python");
	System.out.println(s1);
	
	s1= s1.concat("c++");
	System.out.println(s1);
	
	s4= s4.concat("Python");
	System.out.println(s4);
	}

}
