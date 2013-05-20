package javadesign.pattern.intend.factorymethod;

public class MainTest {

	public static void main(String[] args){
		
		// create an factory
		Factory factory = new FactoryMethod();
	
		Cup cup1 = factory.make("圆形", "红色");//我要一个圆形，红色的杯子   
        System.out.println("杯子造好了");  
        System.out.println("形状："+cup1.getShape());  
        System.out.println("颜色："+cup1.getColor());  
          
        Cup cup2 = factory.make("方形", "蓝色");//我要一个方形，蓝色的杯子   
        System.out.println("杯子造好了");  
        System.out.println("形状："+cup2.getShape());  
        System.out.println("颜色："+cup2.getColor()); 
		
	}

}
