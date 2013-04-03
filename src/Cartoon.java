class Art{
	Art(){
		System.out.println("Art constructor!");
	}
}

class Drawing extends Art{
	Drawing() {
		// TODO Auto-generated constructor stub
		System.out.println("Drawing Constructor!");
	}
}
public class Cartoon extends Drawing {

	 Cartoon() {
		// TODO Auto-generated constructor stub
		System.out.println("Cartoon Constructor!");
	}
	 
	 public static void main(String[] args){
		 Cartoon cartoon = new Cartoon();
	 }
}
