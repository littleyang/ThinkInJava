package javadesign.pattern.intend.absfactory;

public class MainTest {
	
	public static void main(String[] args){
		
		// create an china factory
		ChineseFruitAndVigatableFactory cf = new ChineseFruitAndVigatableFactory();
		// create taiwan factory
		TaiWanFruitAndVigetableFactory tf = new TaiWanFruitAndVigetableFactory();
		
		cf.createFruit("Apple");
		cf.createVigetable("bb");
		tf.createFruit("aa");
		tf.createVigetable("ss");
		
		
	}

}
