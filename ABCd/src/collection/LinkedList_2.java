package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_2 {
	
	public static void main(String[] args) {
		
		LinkedList LL= new LinkedList();
		// stores only homogeneous data
		LL.add("A");
		LL.add("D");
		LL.add("C");
		LL.add("Z");
		LL.add("S");
		System.out.println(LL);
		
		//addAll
		LinkedList LLnew= new LinkedList();
		LLnew.addAll(LL);
		System.out.println(LLnew);
		
		//RemoveAll
		LLnew.removeAll(LL);
		System.out.println(LLnew);
		
		//Sort- Collections.sort
		System.out.println("Before sorting: "+LL);
		Collections.sort(LL);
		System.out.println("After sorting: "+LL);
		
		//REverse order
		Collections.sort(LL,Collections.reverseOrder());
		System.out.println("In reverse order: "+LL);
		
		//Shuffling
		Collections.shuffle(LL);
		System.out.println("After shuffling: "+LL);
		
		
			
		
		
	}

}
