package javadesign.pattern.intend.composites.treeprogram;

import java.util.ArrayList;

/**
 * component
 * @author jenny
 *
 */
public abstract class Moive {
	
	public String name;
	
	public ArrayList<Moive> list;
	
	public abstract void add(Moive moive);
	
	public abstract void remove(Moive moive);
	
	public abstract void display();

	
}
