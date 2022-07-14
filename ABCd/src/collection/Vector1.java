package collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
	
	public static void main(String[] args) {
		 
		Vector <Integer> vc= new Vector();
		vc.add(1);
		vc.add(3);
		vc.add(4);
		vc.add(10);
		vc.add(14);
		vc.add(15);
		vc.add(13);
		vc.add(11);
		System.out.println(vc);
		
		System.out.println(vc.size());
		
		System.out.println(vc.get(3));
		
		vc.remove(3);
		System.out.println(vc);
		
		vc.add(3, 5);
		System.out.println(vc);
		
		vc.set(3, 50);
		System.out.println(vc);
		
		System.out.println("Reading using for loop");
		for(int i=0; i<vc.size(); i++) {
			System.out.println(vc.get(i));
		}
		
		System.out.println("Reading using for each loop");
		for(Object obj : vc) {
			System.out.println(obj);
		}
		
		System.out.println("Reading using iterator");
		Iterator it=vc.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
