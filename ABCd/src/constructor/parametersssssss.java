package constructor;

public class parametersssssss {

	String name;                                                                                          //VD
	String model;
	int price;
	String Engin;
	
	
	public parametersssssss(String name1, String model1, int price1, String Engin1 ) {                    //Constructor
		name=  name1;
		model= model1;
		price= price1;
		Engin= Engin1;
	}
	public parametersssssss(String name1, String model1, int price1) {
		this.name=  name1;
		model= model1;
		price= price1;
	}
	
	 public static void main(String[] args) {
		
		 parametersssssss p= new parametersssssss("Kia","Seltos",2500,"Automatic");
		 parametersssssss pp= new parametersssssss("Tata","Nexon", 1700,"Manual");
		 parametersssssss ppp= new parametersssssss("tata","maruti",5000);
		 
		 System.out.println(p.name+" "+p.model+" "+p.price+" "+p.Engin);
		 System.out.println(pp.name+" "+pp.model+" "+pp.price+" "+pp.Engin);
		 System.out.println(ppp.name+" "+ppp.model+" "+ppp.price);
	}
	
}
