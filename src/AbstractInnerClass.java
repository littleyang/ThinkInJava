abstract class Contents{
	abstract public int values();
}

interface Destination{
	String readLable();
}


public class AbstractInnerClass {

	private static class MyContents extends Contents{
		private int i = 11;
		@Override
		public int values() {
			// TODO Auto-generated method stub
			return i;
		}
	}
	
	protected static class MyDestination implements Destination{
		private String label;
		private MyDestination(String WhereTo){
			label = WhereTo;
		}
		
		@Override
		public String readLable() {
			// TODO Auto-generated method stub
			return label;
		}

	}
	
	public static Destination dest(String s){
		return new MyDestination(s);
	}
	
	public static Contents cont(){
		return new MyContents();
	}
	
	public static void main(String[] args){
		Contents c = cont();
		Destination d = dest("Tanzania");
	}
}
