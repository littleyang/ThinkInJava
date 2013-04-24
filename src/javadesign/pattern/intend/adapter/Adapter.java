package javadesign.pattern.intend.adapter;

import java.util.ArrayList;

/**
 * java design pattern: adapter pattern
 * description: adapter pattern help two incompatible interface work together.
 * as it is in real world,The name says it all. Interfaces may be incompatible 
 * but the inner functionality should suit the need. 
 * in real world,your phone just need 12 Volts to charge,but in fact 220V,so you need 
 * an adapter to satisfy your needs.in a word,adapter is a third part that you can satisfy your client's request
 * with two different interface
 * @author jenny
 *
 */
public class Adapter implements Target {
	
	public void printList(ArrayList<String> list) {
		
		//Converting ArrayList<String> to String so that we can pass String to
		// adaptee class
		String listString = "";

		for (String s : list)
		{
		    listString += s + "\t";
		}
		
		// instantiating adaptee class
		Adaptee ps =new Adaptee();
		ps.printString(listString);
	}

}
