package syncthroniztion.attributes;

/**
 * this class implement the Runnable interface
 * this class is two sell ticket one 
 * @author yangyang
 *
 */
public class TicketOneOffice implements Runnable {
	
	//declare the Cinema object
	private Cinema cinema;
	
	//implement the constructor method
	public TicketOneOffice(Cinema cinema) {
		// TODO Auto-generated constructor stub
		this.cinema = cinema;
	}
	
	/*
	 * to override the run method
	 */
	@Override
	public void run(){
		cinema.sellTicketsOne(2);
		cinema.sellTicketTwo(4);
		cinema.sellTicketsOne(4);
		cinema.sellTicketTwo(3);
		cinema.returnOneTicket(3);
		cinema.sellTicketsOne(10);
		cinema.sellTicketTwo(5);
		cinema.setVacanciesCinemaOne(3);
		cinema.setVacanciesCinemaTwo(4);
	}
	

}
