package javadesign.pattern.intend.factorymethod;

public class FactoryMethod extends Factory {

	@Override
	protected Cup makeCup(String shape) {
		// TODO Auto-generated method stub
		Cup cup = new Cup();
		cup.setShape(shape);
		return cup;
	}

	@Override
	protected void smearColor(Cup cup, String color) {
		// TODO Auto-generated method stub
		cup.setColor(color);
	}

}
