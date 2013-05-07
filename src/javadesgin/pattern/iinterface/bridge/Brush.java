package javadesgin.pattern.iinterface.bridge;

public abstract class Brush {
	// define the bridge for color
	Color mColor;
	// constructor method and set the color interface
	public Brush(Color color) {
		// TODO Auto-generated constructor stub
		this.mColor = color;
	}
	// another constructor for the default color set
	public Brush() {
		// TODO Auto-generated constructor stub
		this.mColor = new BlackColor();
	}
	
	// the set color method
	public void setColor(Color color) {  
        this.mColor = color;  
    }  
	
	// define the draw method
	public abstract void draw();
	
	// the draw shape method
	public  void drawShape(Shape shape){
		draw();
		shape.create();
	}

}
