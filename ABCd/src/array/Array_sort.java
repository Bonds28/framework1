package array;

import java.util.Arrays;

public class Array_sort {
	
	public static void main(String[] args) {
		
		//array declaration
		 int a[]= new int[5];
		 
		 //array initialization
		 a[0]= 30;
		 a[1]= 80;
		 a[2]= 40;
		 a[3]= 20;
		 a[4]= 10;
		
		
		 System.out.println(a.length);
		Arrays.sort(a);
		
		for( int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
