package javadesign.pattern.intend.absfactory;

/**
 * this is concrete factory B
 * @author jenny
 *
 */
public class TaiWanFruitAndVigetableFactory implements AbsFactoryFruit {

	@Override
	public Fruit createFruit(String name) {
	
		return new AppleFruit("TaiWan Apple Fruit"+name);
	}

	@Override
	public Vigetable createVigetable(String name) {

		return new GreenVigitable("TaiWan Green Vigatbale!"+name);
		
	}
	
}
