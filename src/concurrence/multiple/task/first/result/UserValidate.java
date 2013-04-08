package concurrence.multiple.task.first.result;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * in this class,you will learn how to use Java concurrence API to solve such problem: when you have various concurrent
 * tasks that solve the problem,but you only care about the first result.
 * such as: you have all kinds of algorithms to sort an array,but you just care about the fastest one,which first
 * return the result
 * @author yangyang
 *
 */
public class UserValidate {
	// declare an private string for the name
	private String name;
	
	/*
	 * implements the constructor
	 */
	
	public UserValidate(String name){
		this.name = name;
	}
	
	/*
	 * to implements the validate name method
	 * if validate it return true
	 * if not return false
	 */
	public boolean validateName(String name,String password){
		
		// create an random object
		Random random = new Random();
		//wait for a random time to simulate the user validate
		try{
			long duration = (long)Math.random()*10;
			System.out.printf("Validator %s: Validating a user during %d seconds\n",this.name,duration);
			TimeUnit.SECONDS.sleep(duration);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return random.nextBoolean();
	}
	
	/*
	 * the get name method
	 */
	public String getName(){
		return name;
	}

}
