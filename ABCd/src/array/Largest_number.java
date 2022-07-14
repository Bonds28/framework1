package array;

public class Largest_number {
	
	public static void main(String[] args) {
		
		int a[]= {2,4,533,98,50,1120};
		
		//2=2
		int max= a[0];
		   //0<7
          //1<7
		  //2<7
		  //3<7
		  //4<7
		  //5<7
		  //6<7  --------true
		  //7<7  --------false
		
		for(int i=0; i<a.length; i++) {
			//0>2 -------true
			//4>2 -------true
			//533>4 -----true
			//98>533 ----false
			//50>533  ---false
			//1120>533 --true
			
			if(a[i]> max) {
				max= a[i];
			}	
		}
		System.out.println("largest no is:  "+max);
	}

}
