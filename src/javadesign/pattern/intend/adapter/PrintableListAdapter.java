package javadesign.pattern.intend.adapter;

import java.util.ArrayList;

public class PrintableListAdapter implements PrintableList{

	public void printList(ArrayList<String> list) {
	
		//Converting ArrayList<String> to String so that we can pass String to
		// adaptee class
		String listString = "";

		for (String s : list)
		{
		    listString += s + "\t";
		}
		
		// instantiating adaptee class
		PrintString ps=new PrintString();
		ps.print(listString);
	}
}