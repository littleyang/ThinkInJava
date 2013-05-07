package javadesgin.pattern.iinterface.bridge;

/**
 * client
 * @author jenny
 *
 */
public class MainTest {
	
	public static void main(String[] args){
		
		// create colors
		RedColor redColor = new RedColor();
		GreenColor greenColor = new GreenColor();
		BlackColor blackColor = new BlackColor();
		BlueColor blueColor = new BlueColor();
		
		// create shapes
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		Square square = new Square();
		Trangle trangle = new Trangle();
		HeartShape heart = new HeartShape();
		
		// create brushes 
		SmallBrush smallBrush = new SmallBrush();
		MiddleBrush middleBrush = new MiddleBrush();
		BigBrush bigBrush = new BigBrush();
		
		// set color for brush
		// default black color
		smallBrush.setColor(redColor);
		middleBrush.setColor(greenColor);
		bigBrush.setColor(blueColor);
		
		// begin to draw
		smallBrush.draw();
		middleBrush.draw();
		bigBrush.draw();
		
		// draw all kinds of shape
		smallBrush.drawShape(heart);
		smallBrush.drawShape(trangle);
		smallBrush.drawShape(square);
		smallBrush.drawShape(circle);
		smallBrush.drawShape(rectangle);
		bigBrush.drawShape(heart);
		bigBrush.drawShape(trangle);
		bigBrush.drawShape(square);
		bigBrush.drawShape(square);
		bigBrush.drawShape(circle);
		bigBrush.drawShape(rectangle);
	}
	

}
