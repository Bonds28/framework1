package collection;

import java.util.LinkedHashSet;

public class Linked__Hashset {
	
	public static void main(String[]args) {
		
		LinkedHashSet<Integer>LHS= new LinkedHashSet<Integer>();
		
		LinkedHashSet LHS1 = new LinkedHashSet <>();
		
		LHS.add(200);
		LHS.add(300);
		LHS.add(400);
		LHS.add(500);
		LHS.add(600);
		LHS.add(700);
		
		System.out.println(LHS.add(600));
		System.out.println(LHS);
	}

}
