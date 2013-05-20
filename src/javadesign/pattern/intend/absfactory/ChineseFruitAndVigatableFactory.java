package javadesign.pattern.intend.absfactory;


/**
 * this is the concrete factory A
 * @author jenny
 *
 */
public class ChineseFruitAndVigatableFactory implements AbsFactoryFruit {

	@Override
	public Fruit createFruit(String name) {
		// TODO Auto-generated method stub
		return new AppleFruit("Chinese Apple fruit"+name);
		
	}

	@Override
	public Vigetable createVigetable(String name) {
		// TODO Auto-generated method stub
		return new GreenVigitable("Chinese Green vigatable"+name);
	}

}
