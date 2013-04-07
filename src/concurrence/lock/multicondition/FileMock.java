package concurrence.lock.multicondition;

/**
 * a class named FileMock with two attributes: a String array named content and
 * int named index. They will store the content of the file and the line of the
 * simulated file that will be retrieved.
 * 
 * @author jenny
 * 
 */

public class FileMock {
	// declare the content array
	private String content[];
	// declare the string index
	private int index;

	/*
	 * Implement the constructor of the class that initializes the content of
	 * the file with random characters.
	 */
	public FileMock(int size, int length) {
		content = new String[size];
		for (int i = 0; i < size; i++) {
			StringBuilder buffer = new StringBuilder(length);
			for (int j = 0; j < length; j++) {
				int indice = (int) Math.random() * 255;
				buffer.append((char) indice);
			}
			content[i] = buffer.toString();
		}
		index = 0;
	}

	/*
	 * Implement the method hasMoreLines() that returns true if the file has
	 * more lines to process or false if we have achieved the end of the
	 * simulated file.
	 */
	public boolean hasMoreLines() {
		return index < content.length;
	}

	/*
	 * Implement the method getLine() that returns the line determined by the
	 * index attribute and increases its value.
	 */
	public String getLine() {
		if (this.hasMoreLines()) {
			System.out.println("Mock: " + (content.length - index));
			return content[index++];
		}
		return null;
	}
}
