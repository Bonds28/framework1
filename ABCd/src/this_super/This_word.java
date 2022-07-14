package this_super;

public class This_word {
	int rollno=20;
	int rollno1=30;                                             //non static global v
	
	public static void main(String[] args) {
		
		int rollno=40;
		int rollno1=50;                                        //non static local v     
		
		
		This_word t= new This_word();
		t.test();
		System.out.println(t.rollno);
	}
	
		public void test() {	
		int rollno=90;
		int rollno1=5;

		
		System.out.println(rollno);
		System.out.println(rollno1);
		System.out.println(this.rollno);
		System.out.println(this.rollno1);
	}
}
