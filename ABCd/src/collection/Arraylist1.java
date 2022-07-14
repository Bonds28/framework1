package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {
public static void main(String[] args) {
		
		int[] a= new int[5];
		
		ArrayList al= new ArrayList ();
		//List l= new ArrayList();
		
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		al.add(200);
		al.add(null);
		
		                //print array
		System.out.println(al);
		
		
		                //size
		System.out.println("no. of elements= "+al.size());
		
		
		                //Remove
		al.remove(2);
		System.out.println(al);
	    al.remove(15.5);
		System.out.println(al);
		
		
		                 //insert new element
		al.add(2,15.5);
		System.out.println(al);
		al.add(3, "python");
		System.out.println(al);
		
		
		                  // specific element
		System.out.println(al.get(3));
		System.out.println(al.get(5));
		
		
		                  //change element/ replace
		al.set(3, "Ruby");
		System.out.println(al);
		al.set(3,"Python");
		System.out.println(al);
		
		
		                   //contains- search element
		System.out.println(al.contains("Python"));
		System.out.println(al.contains("Ruby"));
    
		
		                   //isEmpty
		System.out.println(al.isEmpty());
		
		
		                   //Read/print the data from Arraylist
		System.out.println("Reading element using loop****************");
		for(int i=0; i<al.size(); i++){
		System.out.println(al.get(i));
		}  
		
		System.out.println("Reading elements using each loop**************");
		for(Object obj:al) {
		System.out.println(obj);       
		}
		
		                  //Iterator
		System.out.println("reading element using iterator***************");
		Iterator it= al.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
		
}
}