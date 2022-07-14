package array;

import java.util.Arrays;

public class Reverse_array {
	
	public static void main(String[] args) {
		int arr[]= {22,15,30,5,100};
		
		//System.out.println(arr.length);
		Arrays.sort(arr);
		
		
		//System.out.println("original array");
		//   0<5
		//   4<5
		//   5<5  -------false
		
		//for(int i=0; i<arr.length; i++) {
		//	System.out.println(arr[i]);
		//}
		
		//System.out.println();
		
		
		System.out.println("Reverse array");
		//5-1   4>0 ------True
		//  3>=0 -----True
		//  0>=0 -----True
		
		for(int j=4; j>=0; j--) {
			System.out.println(arr[j]);
		}
	}

}
