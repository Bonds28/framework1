package variables;

public class Global_nonstatic {
	static int i=40;
	public static void main(String[] args) {
		
		Global_nonstatic Gv = new Global_nonstatic();
		Gv.m11();
		Gv.m22();
		Gv.m33();
		Gv.m44();
		Gv.m55();
	}
	public void m11(){
		System.out.println(i);}
	
	public void m22(){
		System.out.println(i);}
	
	public void m33(){
		i=150;
		System.out.println(i);}
	
	public void m44() {
		int i=500;
		System.out.println(i);}
	
	public void m55() {
		System.out.println(i);}
	}




