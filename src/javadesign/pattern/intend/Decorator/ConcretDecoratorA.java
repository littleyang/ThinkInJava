package javadesign.pattern.intend.Decorator;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-15
 * Time: 下午2:26
 * To change this template use File | Settings | File Templates.
 */
public class ConcretDecoratorA extends Decorator  {

    protected ConcretDecoratorA(ComponmentInterface componmentInterface) {
        super(componmentInterface);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public void decoratorMethodA(){
        System.out.println("This is a decaortor method a!");
    }

    public void afterDecoratorMethodA(){
        System.out.println("after a decorator method! ");
    }

    @Override
    public void decorateMethod() {
        decoratorMethodA();
        super.decorateMethod();    //To change body of overridden methods use File | Settings | File Templates.
        afterDecoratorMethodA();
    }
}
