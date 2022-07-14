package array;

public class Oddeven {
	public static void main(String[] args) {
		
		int arr[]= {2,4,9,11,8,23,54,18};
		
		System.out.println("Odd numbers");
		for( int i=0; i<arr.length; i++) {
			
			if(arr[i]%2  !=0) {
				System.out.println(arr[i]+" ");
			}
		}	
			
			
		System.out.println("Even numbers");	
		for(int j=0; j<arr.length; j++) {
			
			if(arr[j]%2 ==0) {
				System.out.println(arr[j]+ " ");
			}
		}
	}

}

