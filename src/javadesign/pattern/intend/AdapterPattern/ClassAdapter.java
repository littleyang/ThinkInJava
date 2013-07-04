package javadesign.pattern.intend.AdapterPattern;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-4
 * Time: 下午2:37
 * To change this template use File | Settings | File Templates.
 */
public class ClassAdapter extends Adaptee implements Target {


    @Override
    public void doAdapteeWork() {
        super.doAdapteeWork();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void doTargetMethod() {
        //To change body of implemented methods use File | Settings | File Templates.
        doAdapteeWork();
    }
}
