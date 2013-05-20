package javadesign.pattern.intend.factorymethod;

/**
 * factory method pattern:
 * Factory Method Pattern在父类规定对象的创建方法，但并没有深入到较具体的类名。
 * 所有具体的完整内容都放在子类
 * @author jenny
 *
 */
public abstract class Factory {

	public final Cup make(String shape,String color){
		Cup cup = makeCup(shape);
		smearColor(cup,color);
		return cup;
	}
	 //抽象方法，制作水杯，shape参数指定水杯的外形  
	protected abstract Cup makeCup(String shape);
	 //抽象方法，给水杯涂上颜色 
    protected abstract void smearColor(Cup cup,String color); 
}
