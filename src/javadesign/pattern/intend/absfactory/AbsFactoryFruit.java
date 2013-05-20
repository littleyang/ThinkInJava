package javadesign.pattern.intend.absfactory;

/**
 * this is the abstract factory common interface,and all concrete factory should implements
 * this interface
 * @author jenny
 *
 */
public interface AbsFactoryFruit {
	
	public Fruit createFruit(String name);
	
	public Vigetable createVigetable(String name);
	

}
