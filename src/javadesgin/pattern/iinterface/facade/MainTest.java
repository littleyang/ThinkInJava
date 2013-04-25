package javadesgin.pattern.iinterface.facade;

/**
 * this is the main test method of this pattern
 * @author jenny
 *
 */
public class MainTest {
	public static void main(String[] args){
		
		Facade facade = new Facade();
		facade.turnOn();
		facade.turnOff();
	}

}
