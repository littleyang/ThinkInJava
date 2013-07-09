package javadesign.pattern.intend.TemplateMethod;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-8
 * Time: 上午9:30
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    public static void main(String[] args){

        AbstractMethod one = new ConcretMethodOne();
        AbstractMethod two = new ConcretMethodTwo();
        AbstractMethod three = new ConcertMethodThree();
        one.methodOne();
        one.methodTwo();
        one.methodThree();
        two.methodOne();
        two.methodTwo();
        two.methodThree();
        three.methodOne();
        three.methodTwo();
        three.methodThree();
    }
}
