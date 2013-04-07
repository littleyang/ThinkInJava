package concurrence.cutdownlatch;

/**
 * this is the main test method for cut down latch
 * @author jenny
 *
 */
public class MainTest {
	public static void main(String[] args){
		// Declare the conference 
		VideoConference conference = new VideoConference(10);
		
		//declare the conference thread
		Thread conferenceThread = new Thread(conference);
		
		//start the conference thread
		conferenceThread.start();
		
		//create participate thread to join the conference
		for(int i=0;i<10;i++){
			Participate p = new Participate(conference, "Participant"+i);
			Thread pthread = new Thread(p);
			pthread.start();
		}
		
	}

}
