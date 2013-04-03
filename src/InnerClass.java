
public class InnerClass {

	class Content{
		private int i = 11;
		public int value(){
			return i;
		}
	}
	
	class Destination{
	
		private String lable;
		public Destination( String whereTo) {
			// TODO Auto-generated constructor stub
			 lable = whereTo;
		}
		 String readLable(){
			 return lable;
		 }
	}
	
	public void ship(String dest){
		Content c = new Content();
		c.value();
		System.out.println(c.value());
		Destination d = new Destination(dest);
		d.readLable();
		System.out.println(d.readLable().toString());
	}
	
	public static void main(String[] args){
		InnerClass ic = new InnerClass();
		ic.ship("test");
		System.out.println(ic.toString());
	}
}
