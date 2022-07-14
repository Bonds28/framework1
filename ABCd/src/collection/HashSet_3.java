package collection;

import java.util.HashSet;

public class HashSet_3 {
	public static void main(String[] args) {
		
		HashSet Hs= new HashSet();
		
		Hs.add(1);
		Hs.add(2);
		Hs.add(3);
		Hs.add(4);
		Hs.add(5);
		Hs.add(6);
		    System.out.println(Hs);
		    
		 HashSet <Integer> HH= new HashSet<Integer> ();
		 HH.add(4);
		 HH.add(5);
		 HH.add(7);
		       System.out.println("new Hashset: "+ HH);
		    
		    //union
		   // Hs.addAll(HH);
		  //  System.out.println("union:" +Hs);
		    
		    //intersection
		  //  Hs.retainAll(HH);
		 //   System.out.println("intersection: "+Hs);
		    
		    //difference
		  //  Hs.removeAll(HH);
		 //  System.out.println(Hs);
		    
		    //subset
		    System.out.println(Hs.containsAll(HH));
		    
	}

}
