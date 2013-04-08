package concurrence.executor.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * this class is used to test Java concurrence API call-able-interface with
 * executor pool,and return some information according to call() method there
 * are two interface: 1. Callable 2. Future
 * 
 * @author jenny
 * 
 */
public class FactorialCalculator implements Callable<Integer> {
	// declare the return param
	private Integer number;

	public FactorialCalculator(Integer number) {
		this.number = number;
	}

	/*
	 * override the call method, just like the run method,but a return type
	 */
	public Integer call() throws Exception {
		int result = 1;
		if ((number == 0) || (number == 1)) {
			result = 1;
		} else {
			for (int i = 2; i <= number; i++) {
				result *= i;
				TimeUnit.MILLISECONDS.sleep(20);
			}
		}
		System.out.printf("%s: %d\n", Thread.currentThread().getName(), result);
		return result;
	}

}
