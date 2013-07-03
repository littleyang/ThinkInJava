package javadesign.pattern.intend.StaticFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-3
 * Time: 上午11:13
 * To change this template use File | Settings | File Templates.
 */
public class WebServiceLogin implements CommonInterface {
    @Override
    public void login() {
        System.out.println("This is the web service login!");
    }
}
