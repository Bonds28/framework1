package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist2 {
	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("a");
		a.add("c");
		a.add("d");
		a.add("b");
		
		System.out.println(a);
		
		
		ArrayList duplicate= new ArrayList();
		
		//addall
		duplicate.addAll(a);
		System.out.println(duplicate);
		
		duplicate.removeAll(a);
		System.out.println("After removing:"+duplicate);
		
		//collection method
		System.out.println("arraylist elements:" +a);
		Collections.sort(a);
	    System.out.println("elements after sorting : "+a);
		
		Collections.shuffle(a);
		System.out.println("elements after shuffling : "+a);
	}

}
