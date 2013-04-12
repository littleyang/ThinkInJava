package concurrence.join.and.fork.result.join;

import java.util.concurrent.RecursiveTask;

public class LineTask extends RecursiveTask<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Declare the serial version UID of the class. This element is necessary because the
	// parent class of the RecursiveTask class, the ForkJoinTask class, implements
	// the Serializable interface. Declare a private String array attribute named line
	// and two private int attributes named start and end. Finally, declare a private
	// String attribute named word.
	private String line[];
	private int start, end;
	private String word;
	
	/*
	 * implement the constructor method 
	 */
	public LineTask(String[] line, int start, int end, String word) {
		// TODO Auto-generated constructor stub
		this.start = start ;
		this.end = end ;
		this.line = line ;
		this.word = word ;
	}

	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		// Implement the compute() method of the class. If the difference between the
		// end and start attributes is smaller than 100, the task searches for the word in
		// the fragment of the line determined by the start and end attributes using the
		// count() method.
		int result = 0;
		if(end - start < 100){
			result=count(line, start, end, word);
		}else{
			int middle = (start+end)/2;
			// divide task into two sub-task
			LineTask lineTaskOne = new LineTask(line, start, middle, word);
			LineTask lineTaskTwo = new LineTask(line, middle, end, word);
			invokeAll(lineTaskOne, lineTaskTwo);
			try{
				result = groupResults(lineTaskOne.get(),lineTaskTwo.get());
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return result;
	}

	private int groupResults(Integer integer, Integer integer2) {
		// TODO Auto-generated method stub
		Integer result;
		result = integer+integer2;
		return result;
	}

	private int count(String[] line2, int start2, int end2, String word2) {
		// TODO Auto-generated method stub
		int counter;
		counter=0;
		for (int i=start; i<end; i++){
			if (line[i].equals(word)){
				counter++;
			}
		}
		return counter;
	}

}
