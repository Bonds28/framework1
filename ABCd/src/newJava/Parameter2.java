package newJava;

public class Parameter2 {
	public static void main (String[]args) {
		
	//with three input 
		addition1(10,20,80);
	//with two body	
		addition(30,50);
		substraction(200,70);
	//with String input	
		Studentname("Himanshi");
	}

		
	
		public static void addition1 (int p, int q, int r){
			int s=p+q+r;
			System.out.println("addition of two three inputs:"+s);}
	
		public static void addition (int x, int y){
			int z=x+y;
			System.out.println(z);}
			
		public static void substraction(int a, int b){
			int c=a-b;
			System.out.println(c);}
		
		public static void Studentname(String name) {
			System.out.println(name);
		}

		}
			

