package variables;

public class Global {

	static int i =5;
	static String name="Aishwrya";
	
	public static void main (String[]arge) {
		
		System.out.println(i);
		System.out.println(name);
		
		Global gg = new Global();
		gg.G1();
		gg.G2();
		}
		
		public void G1() {
			System.out.println(i);
			System.out.println();

		}
		public void G2() {
			System.out.println("Name: "+name);
		}
	}

