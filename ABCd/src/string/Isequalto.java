package string;

public class Isequalto {
	
	public static void main(String[] args) {
		
		String s1= new String("java");             
		String s2= new String ("java");
		
		System.out.println(s1==s2);                     //-----------ref. points are not same
		System.out.println(s1.equals(s2));              //-----------content is same    
		
		String s5= "JAva";
		String s6= "JAva";
		
		System.out.println(s5==s6);                     //--------ref points are same, in both are stored in same scp memory
		System.out.println(s5.equals(s6));              //--------content is same
	}

}
