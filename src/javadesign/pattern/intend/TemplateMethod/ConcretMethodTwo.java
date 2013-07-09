package javadesign.pattern.intend.TemplateMethod;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-8
 * Time: 上午9:38
 * To change this template use File | Settings | File Templates.
 */
public class ConcretMethodTwo extends AbstractMethod {
    @Override
    protected void methodTwo() {
        System.out.println("This is the concret class two and it's method two!!");
    }

    @Override
    protected void methodThree() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("This is the concret class two and it's method three!!");
    }

    @Override
    protected void methodOne() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("This is the concret class two and it's method one!!");
    }
}
