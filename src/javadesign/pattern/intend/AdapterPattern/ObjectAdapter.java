package javadesign.pattern.intend.AdapterPattern;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-4
 * Time: 下午2:35
 * To change this template use File | Settings | File Templates.
 */
public class ObjectAdapter implements Target {

    Adaptee adaptee = new Adaptee();

    @Override
    public void doTargetMethod() {
        //To change body of implemented methods use File | Settings | File Templates.
        adaptee.doAdapteeWork();
    }
}
