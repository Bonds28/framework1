package collection;

import java.util.LinkedList;

public class Linkedlist_1 {
	public static void main(String[] args) {
		  
		//Declare Linked List
		
		LinkedList ll= new LinkedList();
		
	// LinkedList< integer> LL1= new LinkedList<integer>();
		
		//Add Element into LL1
	ll.add(100);
	ll.add("Welocome");
	ll.add(15.5);
	ll.add('A');
	ll.add(true);
	ll.add(false);
	System.out.println(ll);
	
	                   //remove
	ll.remove(4);
	System.out.println("After removing new list: "+ll);
	
	                   //Add Element in middle of ll
	ll.add(4,"Rohit");
	System.out.println("After inserting element: "+ll);
	
	                   //Get method
	System.out.println(ll.get(1));
		
	
	                   //Set method
	ll.set(4, "Virat");
	System.out.println("After changing the values:" +ll);
	}

}
