package newJava;

public class Para {
	public static void main(String[] args) {
		
		{Studentinformation("Rahul",25,'b',65.12f);
		System.out.println();
		Studentinformation("Akanksha", 20,'A',88.70f);
		System.out.println();
		Employeeinformation("Pawan","data analysisy",75000);}
	}
	
	public static void Studentinformation(String studentname, int studentrollno, char sgrade, float percentage)
	
	{System.out.println("studentname: "+studentname+","+"Student roll no: "+studentrollno+","+
	                    "Student grade: "+sgrade+","+"Student percentage: "+ percentage);
	}
	 public static void Employeeinformation(String employeename, String postname, int salary)
	 {System.out.println("Employee name: "+employeename+","+"Post name: "+postname+","+"Salary: "+salary);
	 }

}
