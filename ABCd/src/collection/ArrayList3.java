package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {
	
	public static void main(String[] args) {
		
		String arr[]= {"Dog","Elephant","cat"};                  //string value:arr
		
		ArrayList al= new ArrayList(Arrays.asList(arr));         //convert array to arraylist
		System.out.println(al);
	}

}
