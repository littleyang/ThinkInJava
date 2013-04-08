package concurrence.multiple.task.first.result;

import java.util.concurrent.Callable;

/**
 * this is the main task for the UserValidate which implements the Call-able interface
 * @author yangyang
 *
 */
public class ValidateTask implements Callable<String> {
	
	//declare The user validate object as an private
	private UserValidate userValidate;
	
	//declare user name;
	private String name;
	// declare user password
	private String password;
	
	/*
	 * implements the constructor for the class 
	 * 
	 */
	public ValidateTask(UserValidate uv,String user,String pwd){
		this.name = user;
		this.password = pwd;
		this.userValidate = uv;
	}
	
	/*
	 * implements the call method
	 */
	@Override
	public String call() throws Exception{
		//If the user is not validated by the UserValidator object, write a message to the
		//console indicating this circumstance and throw an Exception exception.
		if (!userValidate.validateName(name, password)) {
			System.out.printf("%s: The user has not been found /n",userValidate.getName());
			throw new Exception("Error validating user");
			}
		System.out.printf("%s: The user has been found\n",userValidate.getName());
		return userValidate.getName();
	}

}
