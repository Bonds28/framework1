package array;

public class ArrayString {
	
	public static void main(String[] args) {
		
		String s[]= new String[4];              //length should be count from 0, i.e.for length=5, indicesS are of- 0,1,2,3,4
		
      //s[0]= "Dhoni";                          //if we not declare index 0, it will print as null
		s[1]= "Rohit";
		s[2]= "Virat";
		s[3]= "Rahul";
	
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		String s1[]= new String[3];
		s1[0]= "Ram";
		s1[1]= "Sita";
		s1[2]= "Lakshman";
		
		for(int j=0; j<s1.length; j++) {
			System.out.println(s1[j]);
		} 
		
	}

}
