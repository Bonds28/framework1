package multi_level;

public class Whatsapp_v3 extends Whatsapp_v2 {
	
	public void Videocalling() {
		System.out.println("Video calling");
	}
	
	public static void main(String[] args) {
		
		Whatsapp_v3 v = new Whatsapp_v3();
		v.Videocalling();
		v.Audiocalling();
		v.Textmsg();
	}

}
