package concurrence.join.and.fork;

import java.util.List;
import java.util.concurrent.RecursiveAction;


/**
 * this class is used to create task for test product creation
 * @author jenny
 *
 */
public class Task extends RecursiveAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//  create a list about the production 
	private List<Product> products;
	
	// declare two int attributes ,this attributes will determine the block the task has to 
	// process
	private int first;
	private int last;
	
	// declare the product increment
	private double increment;

	/*
	 *  implement the constructor method
	 */
	public Task(int first,int last,List<Product> products,double increment){
		this.first = first;
		this.last = last;
		this.products = products;
		this.increment = increment;
	}
	/*
	 * (non-Javadoc)
	 * @see java.util.concurrent.RecursiveAction#compute()
	 */
	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		// if the difference in last and first less than 10 
		// directly to process the list
		if(last-first<10){
			updatePrice();
		}else{
			int middle = (last+first)/2;
			System.out.printf("Task: Pending tasks:%s\n",getQueuedTaskCount());
			Task task1 = new Task(first,middle,products,increment);
			Task task2 = new Task(middle+1,last,products,increment);
			invokeAll(task1,task2);
		}
		
		
	}
	/*
	 * this the updates price method
	 */
	private void updatePrice() {
		// TODO Auto-generated method stub
		for(int i = first;i<last;i++){
			Product product = products.get(i);
			product.setPrivce(product.getPrivce()*(1+increment));
		}
		
	}
	
	
	

}
