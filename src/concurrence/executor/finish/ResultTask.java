package concurrence.executor.finish;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * this class is an subclass of the FutureTask
 * 
 * @author jenny
 * 
 */

public class ResultTask extends FutureTask<String> {

	// declare a private string name
	private String name;

	/*
	 * implement the contructor method ,it contain a callable object as
	 * parameter.
	 */
	@SuppressWarnings("unchecked")
	public ResultTask(Callable<String> callable) {
		super(callable);
		this.name = ((ExectutorTask) callable).getName();
	}

	@Override
	protected void done() {
		if (isCancelled()) {
			System.out.printf("%s: Has been canceled\n", name);
		} else {
			System.out.printf("%s: Has finished\n", name);
		}
	}
}
