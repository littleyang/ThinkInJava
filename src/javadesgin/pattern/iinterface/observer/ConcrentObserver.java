package javadesgin.pattern.iinterface.observer;

/**
 * this is the concrete observer object
 * @author jenny
 *
 */
public class ConcrentObserver implements InterfObserver {

	// define the observer's status
	private String observerStatus;

	@Override
	public void updateStatus(String state) {
		// TODO Auto-generated method stub
		// update the observer's status
		setObserverStatus(state);
		System.out.println("Observer status is: "+observerStatus);
	}

	public String getObserverStatus() {
		return observerStatus;
	}

	public void setObserverStatus(String observerStatus) {
		this.observerStatus = observerStatus;
	}
	
}
