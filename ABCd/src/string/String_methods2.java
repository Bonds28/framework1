package string;

public class String_methods2 {
	public static void main(String[] args) {
		
		//concat
		 String s15= "helloww";
		 System.out.println(s15.concat("good afternoon"));
		 
		 String x= "Hello";
		 String y= "India"; 
		 int a = 20;
		 int b = 30;
		
		 System.out.println(x+y);
		 System.out.println(a+b);
		 System.out.println(x+y+a+b);
		 System.out.println(a+b+x+y);
		 System.out.println(x+y+(a+b));
		 
		 //Substring
		 String s17= "Himanshi123";
		 System.out.println(s17.substring(8, 11));
		 
		 String s18= "himanshi123";
		 System.out.println(s18.replaceAll("himanshi123","123"));
	}

}
