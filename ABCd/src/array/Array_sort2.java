package array;

import java.util.Arrays;

public class Array_sort2 {
	public static void main(String[] args) {
		
		int a[]= new int[9];
		
		a[0]= 10;
		a[1]= 50;
		a[2]= 20;
		a[3]= 30;
		a[4]= 40;
		a[5]= 50;
		a[6]= 60;
		a[7]= 70;
		a[8]= 80;
		
		System.out.println(a.length);
		
		Arrays.sort(a);
		//System.out.println(a);
		
		//usage
		//System.out.println(a[1]);
		//System.out.println(a[0]);
		//System.out.println(a[6]);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}	
	}
}
