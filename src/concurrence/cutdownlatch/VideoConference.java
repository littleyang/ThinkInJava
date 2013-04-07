package concurrence.cutdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * use the CountDownLatch class implementing a video conference system. The
 * video-conference system will wait for the arrival of all the participants
 * before it begins
 * 
 * @author jenny
 * 
 */
public class VideoConference implements Runnable {
	// Declare a CountDownLatch object named controller.
	private final CountDownLatch controller;

	/*
	 * Implement the constructor of the class that initializes the
	 * CountDownLatch attribute. The Video conference class will wait for the
	 * arrival of the number of participants received as a parameter.
	 */

	public VideoConference(int number) {
		controller = new CountDownLatch(number);
	}

	/*
	 * Implement the arrive() method. This method will be called each time a
	 * participant arrives to the video conference. It receives a String type
	 * named name as the parameter.
	 */
	public void arrive(String name) {
		System.out.printf("%s has arrived.", name);
		// it calls the countDown() method of the CountDownLatch object.
		controller.countDown();
		System.out.printf("VideoConference: Waiting for %d participants.\n",controller.getCount());
	}

	@Override
	public void run() {
		System.out.printf("VideoConference: Initialization: %d participants.\n",controller.getCount());
		try {
			controller.await();
			System.out.printf("VideoConference: All the participants have come\n");
			System.out.printf("VideoConference: Let's start...\n");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
