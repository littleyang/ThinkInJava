package concurrence.join.and.fork.result.join;

import java.util.Random;

/**
 * this class is used to test gain results in Java concurrence API about
 * join/fork framework
 * 
 * @author jenny
 * 
 */

public class Document {
	// Create an array of strings with some words.
	// This array will be used in the generation of the strings matrix.
	private String words[] = { "the", "hello", "goodbye", "packt", "java",
			"thread", "pool", "random", "class", "main" };

	/*
	 * Implement the generateDocument() method. It receives as parameters the
	 * number of lines, the number of words per line, and the word the example
	 * is going to look for. It returns a matrix of strings.
	 */
	public String[][] generateDocument(int numLines, int numWords, String word) {
		// First, create the necessary objects to generate the document: the
		// String matrix
		// and a Random object to generate random numbers.
		int counter = 0;
		String document[][] = new String[numLines][numWords];
		Random random = new Random();

		// Fill the array with strings.
		for (int i = 0; i < numLines; i++) {
			for (int j = 0; j < numWords; j++) {
				int index = random.nextInt(words.length);
				document[i][j] = words[index];
				if (document[i][j].equals(word)) {
					counter++;
				}
			}
		}
		System.out.println("DocumentMock: The word appears " + counter+ " times in the document");
		return document;
	}
}
