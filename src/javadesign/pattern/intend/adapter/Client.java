package javadesign.pattern.intend.adapter;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args)
	{
		ArrayList<String> list=new  ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		Adapter pl = new Adapter();
		pl.printList(list);
		
	}

}
