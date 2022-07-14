package newJava;

public class Method2 {
	public static void main(String[] args) {
		
		//from same class
		Method2 hb= new Method2();
		hb.m7();
		hb.m8();
		
	//from different class
	Method hb8= new Method();
	hb8.m5();
	hb8.m6();
	Method.m7();
}
	
	public void m7() {
		System.out.println("dog");}
	public void m8() {
		System.out.println("Cat");
	}
	
	
}


