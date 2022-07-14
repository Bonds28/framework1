package array;

import java.util.Arrays;

public class array_new_new {
	
	public static void main(String[] args) {
		
		//int arr[]= new arr[];
		
		int arr[]= {10,35,85,9,55};
		System.out.println(arr.length);
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
