package javadesign.pattern.intend.composites.treeprogram;

/**
 * leaf class
 * @author jenny
 *
 */
public class Program extends Moive {
	
	public Program(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void add(Moive moive) {
		// TODO Auto-generated method stub
		 System.out.println("you can't add component to a proagram object");
		
	}

	@Override
	public void remove(Moive moive) {
		// TODO Auto-generated method stub
		 System.out.println("you can't remove component to a proagram object");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("----------"+name);
		
	}

}
