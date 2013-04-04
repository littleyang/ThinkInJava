package syncthroniztion.attributes;

/**
 * this is the module class
 * 
 * @author yangyang
 * 
 */
public class Cinema {

	// declare two attributes as private
	private long vacanciesCinemaOne;
	private long vacanciesCinemaTwo;

	// declare two final object
	private final Object controlCinemaOne;
	private final Object controlCinemaTwo;

	// implement the constructor
	public Cinema() {
		// TODO Auto-generated constructor stub
		controlCinemaOne = new Object();
		controlCinemaTwo = new Object();
		vacanciesCinemaOne = 20;
		vacanciesCinemaTwo = 20;

	}
	
	/*
	 * implement the getter and setter method
	 */
	public long getVacanciesCinemaOne() {
		return vacanciesCinemaOne;
	}

	public void setVacanciesCinemaOne(long vacanciesCinemaOne) {
		this.vacanciesCinemaOne = vacanciesCinemaOne;
	}

	public long getVacanciesCinemaTwo() {
		return vacanciesCinemaTwo;
	}

	public void setVacanciesCinemaTwo(long vacanciesCinemaTwo) {
		this.vacanciesCinemaTwo = vacanciesCinemaTwo;
	}

	public Object getControlCinemaOne() {
		return controlCinemaOne;
	}

	public Object getControlCinemaTwo() {
		return controlCinemaTwo;
	}


	/*
	 * implement the sell ticket that some tickets are sold for the
	 * controlCinemaOne
	 */

	
	public boolean sellTicketsOne(int number) {
		// to synchronized the controlCinemaOne
		synchronized (controlCinemaOne) {
			if (number < vacanciesCinemaOne) {
				vacanciesCinemaOne = vacanciesCinemaOne - number;
				return true;
			} else {
				System.out.println("some number wrong!");
				return false;
			}
		}
	}

	/*
	 * implement the sell ticket two method
	 */
	public boolean sellTicketTwo(int number) {
		// synchronized the controlCinemaTwo to control to access the code block
		synchronized (controlCinemaTwo) {
			if (number < vacanciesCinemaTwo) {
				vacanciesCinemaTwo = vacanciesCinemaTwo - number;
				return true;
			} else {
				return false;
			}
		}
	}

	/*
	 * implement the return Tickt one number
	 */

	public boolean returnOneTicket(int number) {
		// to synchronized the controlCinemaOne to control access this code
		// block
		synchronized (controlCinemaOne) {
			if (number < vacanciesCinemaOne) {
				vacanciesCinemaOne = vacanciesCinemaOne + number;
				return true;
			} else {
				System.out.println("some number wrong!");
				return false;
			}
		}

	}

	/*
	 * implement the return Ticket Two method
	 */
	public boolean returnTwoTicket(int number) {
		// synchronized the controlCinemaTwo to control to access the code block
		synchronized (controlCinemaTwo) {
			if (number < vacanciesCinemaTwo) {
				vacanciesCinemaTwo = vacanciesCinemaTwo - number;
				return true;
			} else {
				return false;
			}
		}

	}

}
