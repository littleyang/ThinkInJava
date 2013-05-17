package javadesgin.pattern.iinterface.observer;

/**
 * this is the client class
 * @author jenny
 *
 */
public class MainTest {

	public static void main(String[] args){
		
		// create the concrete subject
		ConcrentSubject cs = new ConcrentSubject();
		// create the concrete observer
		ConcrentObserver co = new ConcrentObserver();
		
		cs.addObserver(co);
		cs.changeAndNotify("New status");
	}
}
