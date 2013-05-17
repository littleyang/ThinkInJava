package javadesgin.pattern.iinterface.observer;

/**
 * this is the certain observed object
 * @author jenny
 *
 */
public class ConcrentSubject extends AbsSubject {
	
	// define the object status
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	/*
	 * change the status and notify all observer
	 */
	public void changeAndNotify(String newStatus){
		status = newStatus;
		System.out.println("new status is: "+ status);
		this.notifyAllObservers(status);
	}

}
