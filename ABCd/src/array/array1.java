package array;

public class array1 {
	
	public static void main(String[] args) {
		
		//array declaration
		int arr[] = new int[5];
		
		//array initialization
		arr[0] = 30;
		arr[1] = 40;
		arr[2] = 50;
		arr[3] = 60;
		arr[4] = 70;
		
		//array usage
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
	}

}
