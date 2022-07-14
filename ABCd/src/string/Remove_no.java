package string;

public class Remove_no {

	public static void main(String[] args) {
		
		String s= "925Himanshi87";                         //only letters should display
		
		s=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
		
		
		String s2= "@3om89sara*7&";                       //only no. should display
		s2= s2.replaceAll("[^0-9]", "");
		System.out.println(s2);
		
		
		String s3= " I am a Test Engineer ";              //removing spaces
		s3= s3.replaceAll("\\s", "");
		System.out.println(s3);
		
		String s4= " I am a Quality Assurance Engineer ";        //count A
		int totalcount= s4.length();
		int totalcount_2= s4.replace("a", "").length();
		int final_count= totalcount-totalcount_2;
		System.out.println(final_count);
		
	//	String s5= ""
		
		
	}
}
