package string;

public class String_methods {
	public static void main(String[] args) {
		
		//is empty
		String s4= "java";
		System.out.println(s4.isEmpty());
		
		//replace
		String s5= "Velocity";
		System.out.println(s5.replace('e', 'h'));
		System.out.println(s5.replace('c', 'k'));
		String s55=" 04-05-1994";
		System.out.println(s55.replace("-", "/"));
		
		//replace All
		String s6="Python Java class";
		System.out.println(s6.replaceAll("Java","Ruby"));
		System.out.println(s6.replaceAll("class","Tution"));
		
		//substring
		String s7= "Java class";
		System.out.println(s7.substring(2));
		System.out.println(s7.substring(3,8));
		
		//indexOf
		String s8="Calender Date";
		System.out.println(s8.indexOf('l'));
		System.out.println(s8.indexOf('e'));                                      //1st occurrence
		System.out.println(s8.indexOf('e', s8.indexOf('e')+1));                    // 2nd occurrence
		System.out.println(s8.indexOf('e',s8.indexOf('e', s8.indexOf('e')+1)+1));   // 3rd occurrence
		
		
		//last index Of
		String s9="Laptop";
		System.out.println(s9.lastIndexOf('p'));
		
		
		//to lower case
		String s10="WELCOME";
		System.out.println(s10.toLowerCase());
		
		//to upper case
		String s11="welcome";
		System.out.println(s11.toUpperCase());
		
		
		//trim
		String s12="  Good Morning ";
		System.out.println(s12.trim());
		
		//split
		String s13= "Hello_World_java_test";
		String s14[]= s13.split ("_");
		  for(int i=0; i<s13.length(); i++) {
			  System.out.println(s14[i]);
		  }
		  
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
		 
		 
		
		
	}

}
