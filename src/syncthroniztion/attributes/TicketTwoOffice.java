package syncthroniztion.attributes;

/**
 * this method is implement to set ticket two office implement Runnable interface
 * @author yangyang
 *
 */
public class TicketTwoOffice implements Runnable {
	
	//declare the cinema object as private
	private Cinema cinema;
	//implement ths constructor method
	public TicketTwoOffice(Cinema cinema){
		//
		this.cinema = cinema;
	}
	
	/*
	 * to override the run method
	 */
	public void run(){
		cinema.sellTicketsOne(3);
		cinema.sellTicketTwo(4);
		cinema.sellTicketsOne(5);
		cinema.sellTicketTwo(6);
		cinema.returnTwoTicket(5);
		cinema.sellTicketTwo(3);
		cinema.sellTicketsOne(4);
	}

}
