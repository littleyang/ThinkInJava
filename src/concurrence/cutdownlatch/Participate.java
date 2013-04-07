package concurrence.cutdownlatch;

import java.util.concurrent.TimeUnit;

/**
 * Create the Participant class and specify that it implements the Runnable
 * interface. This class represents each participant in the video conference.
 * 
 * @author jenny
 * 
 */
public class Participate implements Runnable {

	// Declare a private Video conference attribute named conference.
	private VideoConference conference;
	// Declare a private string a name

	private String name;

	/*
	 * implements the constructor method
	 */
	public Participate(VideoConference f, String s) {

		this.conference = f;
		this.name = s;
	}

	/*
	 * implements the run method
	 */
	@Override
	public void run() {
		long duration = (long) (Math.random() * 10);
		try {
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		conference.arrive(name);
	}

}
