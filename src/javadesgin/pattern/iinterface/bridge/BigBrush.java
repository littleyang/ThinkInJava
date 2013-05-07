package javadesgin.pattern.iinterface.bridge;

public class BigBrush extends Brush {
	
	public BigBrush() {
		// TODO Auto-generated constructor stub
		super();
	}

	public BigBrush(Color color) {
		// TODO Auto-generated constructor stub
		super(color);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is big brush and begin to draw!");
		// draw
		mColor.draw();
	}

}
