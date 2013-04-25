package javadesgin.pattern.iinterface.facade;

/**
 * Facade pattern of Java Design Pattern
 * suppose that,you have Camera,Light,Sensor, but your client how to control them?
 * so we can provide a uniform methods of an interface to control them.
 * the main intend of the facade pattern is: make client easily to use your sub-system
 * so think it should be called remote pattern would much more appropriate.
 * Ordinarily, the methods in the facade are static method, which would not be override. 
 * @author jenny
 *
 */
public class Facade {
	
	private  static Camara camera;
	private  static Lights lights;
	private  static Sensor sensor;
	/*
	 * implements the constructor method or we can use a static method to create instances
	 */
	static  {
		// TODO Auto-generated constructor stub
		camera = new Camara();
		lights = new Lights();
		sensor = new Sensor();
	}
	
	public  void turnOn(){
		camera.turnOn();
		lights.turnOn();
		sensor.turnOn();
	}
	
	public  void turnOff(){
		camera.turnOff();
		lights.turnOff();
		sensor.turnOff();
	}

}
