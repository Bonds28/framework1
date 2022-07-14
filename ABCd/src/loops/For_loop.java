package loops;

public class For_loop {
	public static void main(String[] args) {
		
		//print 1 to 5 no.
		//for (initialization, Conditional, increment/decrement)
		
		for (int i=1; i<=5; i++)
		{	System.out.println(i);   }
	
    System.out.println("loop continued");

	
	 {System.out.println("*******************");}
	 
	 
	for(int i=5; i>=1; i--)
		{System.out.println(i);}
	System.out.print("loop completed");

	
	//print 1 to 20 odd numbers using for loop
	for (int k=1; k<=20; k=k+2) {
		System.out.println(k);}
	
	
	System.out.println("***********************");
	//WAP addition of first 5 number
	//1+2+3+4+5=15
	int sum=0;
	for(int m=1; m<=5; m++) {
		sum=sum+m;
	}

		{System.out.println(sum);}
		
	System.out.println("*************************");	
	//print table of 5
	int m=5;
	for(int h=1; h<=10; h++) {
		System.out.println(" "+h*m);}
	
	System.out.println("**************************");
	//print table of 10 in reverse order
	int n=10;
	for(int i=10; i>=1; i--) {
		System.out.print(" "+i*n);}
	
	
	
	System.out.println("**************************");
	//sum of first 4 even no.
	int add=0;
	for(int i=0;i<=7; i=i+2) {
		add= add+i;}
		{System.out.println(add);}	
	}
	

}


	
