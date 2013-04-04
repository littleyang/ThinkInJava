package syncthroniztion.attributes;

/**
 * this is the main test class
 * 
 * @author yangyang
 * 
 */
public class MainTest {

	public static void main(String[] args) {

		// declare the cinema object
		Cinema cinema = new Cinema();

		// declare the OfficeOne object and the one thread
		TicketOneOffice one = new TicketOneOffice(cinema);
		Thread officeOneThread = new Thread(one, "OfficeTicketOne");

		// declare officeTwo object and the two thread
		TicketTwoOffice two = new TicketTwoOffice(cinema);
		Thread officeTwoThread = new Thread(two, "OfficeTicketTwo");

		// start the thread
		officeOneThread.start();
		officeTwoThread.start();

		// wait for the two thread complete
		try {
			officeOneThread.join();
			officeTwoThread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// output some information

		System.out.printf("Room 1 Vacancies: %d\n",cinema.getVacanciesCinemaOne());
		System.out.printf("Room 2 Vacancies: %d\n",cinema.getVacanciesCinemaTwo());

	}

}
