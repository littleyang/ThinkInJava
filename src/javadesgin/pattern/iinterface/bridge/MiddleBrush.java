package javadesgin.pattern.iinterface.bridge;

public class MiddleBrush extends Brush {

	public MiddleBrush() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public MiddleBrush(Color color) {
		// TODO Auto-generated constructor stub
		super(color);
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is the Middle brush and begin to draw!");
		// class super class to draw
		mColor.draw();
	}
}
