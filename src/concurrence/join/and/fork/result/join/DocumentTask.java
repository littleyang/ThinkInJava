package concurrence.join.and.fork.result.join;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * Create a class named DocumentTask and specify that it extends the
 * RecursiveTask class parameterized with the Integer class.
 * 
 * @author jenny
 * 
 */

public class DocumentTask extends RecursiveTask<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// declare a String matrix name document and two attributes named start and
	// last,also a string attribute
	// named word as private
	private String document[][];
	private int start;
	private int end;
	private String word;

	/*
	 * implements the constructor method
	 */
	public DocumentTask(String document[][], int start, int end, String word) {
		this.document = document;
		this.start = start;
		this.end = end;
		this.word = word;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.concurrent.RecursiveTask#compute()
	 */
	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		// If the difference between the end and start attributes is smaller
		// than 10,
		// the task calculates the number of appearances of a word in the lines
		// between
		// those positions calling the processLines() method.
		// declare the return type for the result
		int result = 0;
		if (end - start < 10) {
			result = processLines(document, start, end, word);
		} else {
			// divide the task into two sub-task and process
			int middle = (start + end) / 2;
			DocumentTask subTaskOne = new DocumentTask(document, start, middle,word);
			DocumentTask subTaskTwo = new DocumentTask(document, middle, end,word);
			invokeAll(subTaskOne, subTaskTwo);
			try {
				result = groupResults(subTaskOne.get(), subTaskTwo.get());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	private int groupResults(Integer integer, Integer integer2) {
		// TODO Auto-generated method stub
		Integer result;
		result=integer+integer2;
		return result;
	}

	private int processLines(String[][] document2, int start2, int end2,String word2) {
		// TODO Auto-generated method stub
		List<LineTask> tasks=new ArrayList<LineTask>();
		for (int i=start; i<end; i++){
			LineTask task=new LineTask(document[i], 0, document[i].length, word);
			tasks.add(task);
		}
		invokeAll(tasks);
		int result=0;
		for (int i=0; i<tasks.size(); i++) {
			LineTask task=tasks.get(i);
			try {
				result=result+task.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return new Integer(result);
	}
}
