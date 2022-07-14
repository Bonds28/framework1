package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_1 {
	
	public static void main(String[] args) {
		
		HashSet Hs= new HashSet();
		
		Hs.add(100);
		Hs.add("Welcome");
		Hs.add(20.5);
		Hs.add('A');
		Hs.add(true);
		Hs.add(false);
		Hs.add(50);
		Hs.add("Java");
		Hs.add(null);
		
		Hs.add(200);                     //it will be added
		Hs.add(50);                      //duplicate element, will not be added
		Hs.add('A');                   
		
		System.out.println(Hs.add(500));               //we can add it, so it will give output= true
		System.out.println(Hs.add(20.5));               //its a duplicate value, output=false
		
		
		System.out.println(Hs);
		System.out.println(Hs.size());
		
       Hs.remove("Java");                         //remove
       System.out.println(Hs);
       
       System.out.println(Hs.contains(null));     //contains
	   System.out.println(Hs.contains("Jav"));
		
	   System.out.println(Hs.isEmpty());          //isEmpty
	   
	   for(Object obj:Hs) {
	   System.out.println(obj);}                  //reading elements     (for each)
	   
	   Iterator it= Hs.iterator();                //(iterator)
	   while(it.hasNext()) {
		   System.out.println(it.next());}
	   }
		    
	      //no get method is present
		
		

}
