package javadesign.pattern.intend.Decorator;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-15
 * Time: 下午2:02
 * To change this template use File | Settings | File Templates.
 */
public class ConcretComponent extends ComponmentInterface {
    @Override
    public void decorateMethod() {
        //To change body of implemented methods use File | Settings | File Templates.   \
        System.out.println("This is concret method and doing some thing!!!!");
    }
}
