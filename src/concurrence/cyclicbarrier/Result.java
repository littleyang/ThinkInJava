package concurrence.cyclicbarrier;

/**
 * This class will store, in an array, 
 * the number of occurrences of the searched number in each row of the matrix.
 * @author jenny
 *
 */
public class Result {
	//Declare a private int array named data.
	private int data[];
	
	/*
	 * implements the constructor method
	 */
	public Result(int size){
		data = new int[size];
	}
	
	/*
	 * implement the set data method
	 */
	public void setData(int position,int value){
		data[position]=value;
	}
	
	/*
	 * implement the get data method
	 */
	public int[] getData(){
		return data;
	}

}
