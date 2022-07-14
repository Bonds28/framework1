package collection;

import java.util.LinkedList;

public class LinkedList_3 {
	
	public static void main(String[] args) {
		LinkedList L3= new LinkedList();
		
		L3.add("Dog");
		L3.add("Cat");
		L3.add("Dog");
		L3.add("Horse");
		System.out.println(L3);
		
		
		//addFirst
		//L3.addFirst(L3);                       //output= [(this Collection), Dog, Cat, Dog, Horse]
		//System.out.println(L3);            
		
		L3.addFirst("Tiger");
		System.out.println(L3);
		
		//Last index
		L3.addLast("Elephant");
		System.out.println(L3);
		
		//getFirst
		System.out.println(L3.getFirst());
		System.out.println(L3.getLast());
		
		
		
	}

}
