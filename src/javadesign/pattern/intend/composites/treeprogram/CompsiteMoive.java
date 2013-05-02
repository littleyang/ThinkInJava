package javadesign.pattern.intend.composites.treeprogram;

import java.util.ArrayList;

/**
 * Composite class
 * @author jenny
 *
 */
public class CompsiteMoive extends Moive {
	
	public CompsiteMoive(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.list = new ArrayList<Moive>();
	}

	@Override
	public void add(Moive moive) {
		// TODO Auto-generated method stub
		 list.add(moive);
		
	}

	@Override
	public void remove(Moive moive) {
		// TODO Auto-generated method stub
		 if(list.contains(moive)){
			    list.remove(moive);
		 }
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for(Moive moive:list){
			moive.display();
		}
		
	}

}
