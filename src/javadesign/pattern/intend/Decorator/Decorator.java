package javadesign.pattern.intend.Decorator;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-15
 * Time: 下午2:03
 * To change this template use File | Settings | File Templates.
 */
public abstract class Decorator extends ComponmentInterface  {

    private ComponmentInterface componmentInterface;

    protected Decorator(ComponmentInterface componmentInterface) {
        this.componmentInterface = componmentInterface;
    }

    @Override
    public void decorateMethod() {
        //To change body of implemented methods use File | Settings | File Templates.
        componmentInterface.decorateMethod();
    }
}
