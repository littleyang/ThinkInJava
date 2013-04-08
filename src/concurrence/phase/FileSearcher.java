package concurrence.phase;

import java.io.File;
import java.util.*;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/***
 * Java concurrence API Phase is a complex and powerful functionalities which
 * have ability to execute concurrent-phased tasks. when you divide a task into
 * few steps , the Phase class will provide us with mechanism to synchronize the
 * threads at the end of each step,so no thread starts its step until all
 * threads have finished the first one. as with other synchronization utilities
 * ,we have to initialize the Phase class with the number of tasks that
 * participate in synchronization in operation. and we dynamically modify this
 * number by increasing or decreasing it this task divide into three steps: 1.
 * get the list of files with extension .log in assigned folder and its
 * sub-folders 2. Filter list the first steps by deleting the files modified
 * more than 24 hours ago. 3. Print the result in the console
 * 
 * unavailable: because java 7 include the Phaser class ,but my JDK is 6. so
 * this will be done some time later.
 * 
 * @author jenny
 * 
 */
public class FileSearcher implements Runnable {

	// declare the init file path
	private String initPath;
	// declare the file extension that will search ;
	private String end;
	// declare a private list the full path that find with the desired
	// characteristics.
	private List<String> results;
	// declare the Phase class phase
	private Phaser phaser;

	/*
	 * implement the constructor
	 */
	public FileSearcher(String initPath, String end, Phaser phaser) {
		this.end = end;
		this.initPath = initPath;
		this.phaser = phaser;
		results = new ArrayList<String>();
	}

	/*
	 * implement the file directory process
	 */
	public void directoryProcess(File file) {
		// list all files in directory
		File list[] = file.listFiles();
		// check whether the file list is null
		if (list != null) {
			// to process the file in the list
			for (int i = 0; i < list.length; i++) {
				// check the list[i] whether is a directory,if true,recurse the
				// directory; if false
				// file process the list[i]
				if (list[i].isDirectory()) {
					directoryProcess(list[i]);
				} else {
					fileProcess(list[i]);
				}
			}
		}
	}

	/*
	 * implements the file process method
	 */
	public void fileProcess(File file) {
		// check the file whether is extended with end string
		if (file.getName().endsWith(end)) {
			results.add(file.getAbsolutePath());
		}
	}

	public void filterResults() {
		// declare the new result for check whether the file modify duration is > 24
		// if the duration > 24, put the file into the new result
		// else go on
		// last return the new result
		List<String> newResults = new ArrayList<String>();
		long actualDate = new Date().getTime();
		for (int i = 0; i < results.size(); i++) {
			File file = new File(results.get(i));
			long fileDate = file.lastModified();
			if (actualDate - fileDate < TimeUnit.MILLISECONDS.convert(1,
					TimeUnit.DAYS)) {
				newResults.add(results.get(i));
			}
		}
		results = newResults;
	}

	/*
	 * check result
	 */
	private boolean checkResults() {
		//
		// first. check the results'size, if the size is 0,call phaser's arriveAndDeregister method
		// to indicate that the thread finished the actual phase and  it leaves the phased operation
		//
		if (results.isEmpty()) {
			System.out.printf("%s: Phase %d: 0 results.\n", Thread
					.currentThread().getName(), phaser.getPhase());
			System.out.printf("%s: Phase %d: End.\n", Thread.currentThread()
					.getName(), phaser.getPhase());
			phaser.arriveAndDeregister();
			return false;
		} else {
			//second, call phase's method,arriveAndAwaitAdvance() to wait for other threads in the 
			// phase to arrived to finish the phase.
			System.out.printf("%s: Phase %d: %d results.\n", Thread
					.currentThread().getName(), phaser.getPhase(), results
					.size());
			phaser.arriveAndAwaitAdvance();
			return true;
		}
	}
	
	/*
	 * this method is used to print the values in the list
	 */
	private void showInfo() {
		for (int i = 0; i < results.size(); i++) {
			File file = new File(results.get(i));
			System.out.printf("%s: %s\n", Thread.currentThread().getName(),
					file.getAbsolutePath());
		}
		// call the arriveAndAwaitAdvance() to wait all the values threads arrived
		phaser.arriveAndAwaitAdvance();
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		phaser.arriveAndAwaitAdvance();
		System.out.printf("%s: Starting.\n", Thread.currentThread().getName());
		File file = new File(initPath);
		if (file.isDirectory()) {
			directoryProcess(file);
		}
		if (!checkResults()) {
			return;
		}
		filterResults();
		if (!checkResults()) {
			return;
		}
		showInfo();
		phaser.arriveAndDeregister();
		System.out.printf("%s: Work completed.\n", Thread.currentThread().getName());
	}

}
