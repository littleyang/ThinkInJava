package javadesign.pattern.intend.Decorator;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-15
 * Time: 下午1:50
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    public static void main(String[] args){

        ComponmentInterface abc = new ConcretComponent();
        abc = new ConcretDecoratorA(abc);
        ComponmentInterface another = new ConcretComponent();
        another = new ConcretDecoratorB(another);
        abc.decorateMethod();
        another.decorateMethod();

    }
}
