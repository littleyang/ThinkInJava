package javadesign.pattern.intend.Decorator;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-15
 * Time: 下午2:31
 * To change this template use File | Settings | File Templates.
 */
public class ConcretDecoratorB extends Decorator {

    protected ConcretDecoratorB(ComponmentInterface componmentInterface) {
        super(componmentInterface);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public void decoratorMethodB(){
        System.out.println("This is decorator method b!!!");
    }

    public void afterDecoratorMethodB(){
        System.out.println("This is after decorator method B!");
    }

    @Override
    public void decorateMethod() {
        decoratorMethodB();
        super.decorateMethod();    //To change body of overridden methods use File | Settings | File Templates.
        afterDecoratorMethodB();
    }



}
