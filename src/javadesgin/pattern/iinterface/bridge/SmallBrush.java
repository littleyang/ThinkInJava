package javadesgin.pattern.iinterface.bridge;

public class SmallBrush extends Brush {

	public SmallBrush() {
		// TODO Auto-generated constructor stub
		super();
	}
	// if call this method to create a instance to call super class to constructor the 
	// object
	public SmallBrush(Color color){
		super(color);
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is the small brush and begin to draw !");
		mColor.draw();
	}

}
