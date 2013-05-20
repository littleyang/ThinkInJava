package javadesign.pattern.intend.absfactory;


/**
 * this is concrete productA
 * @author jenny
 *
 */

public class AppleFruit implements Fruit {
	
	private String name;
	
	public AppleFruit(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("Apple fruit created!"+string);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
