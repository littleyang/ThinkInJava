package javadesign.pattern.intend.TemplateMethod;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-8
 * Time: 上午9:38
 * To change this template use File | Settings | File Templates.
 */
public class ConcertMethodThree extends AbstractMethod {
    @Override
    protected void methodOne() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("This is the concret class three and it's method one!!");
    }

    @Override
    protected void methodThree() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("This is the concret class Three and it's method three!!");
    }

    @Override
    protected void methodTwo() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("This is the concret class three and it's method two!!");
    }
}
