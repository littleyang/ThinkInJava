package concurrence.collection.blocking.navigablemap;

/**
 * create a model class for the navigable map class
 * ConcurrentNavigableMap class is an interface, this class will store the elements
 * by two parts:
 * key: A key that uniquely identifies an element
 * element: The rest of the data that defines the element
 * @author jenny
 *
 */
public class Contact {
	
	private String name;
	private String phone;
	public Contact(String name, String phone) {
		this.name=name;
		this.phone=phone;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
