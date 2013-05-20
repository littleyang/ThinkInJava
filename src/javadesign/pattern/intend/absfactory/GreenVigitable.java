package javadesign.pattern.intend.absfactory;

/**
 * this is concrete productB
 * @author jenny
 *
 */
public class GreenVigitable implements Vigetable {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public GreenVigitable(String string) {
		// TODO Auto-generated constructor stub
		System.out.println("Green vigatable created! " +string);
	}

}
