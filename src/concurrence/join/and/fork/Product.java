package concurrence.join.and.fork;

/**
 * this is the class model used for test java concurrence API for join/fork
 * framework
 * 
 * @author jenny
 * 
 */
public class Product {

	// declare an private string name
	private String name;
	// declare a private double price to store the product price
	private double privce;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrivce() {
		return privce;
	}

	public void setPrivce(double privce) {
		this.privce = privce;
	}

}
