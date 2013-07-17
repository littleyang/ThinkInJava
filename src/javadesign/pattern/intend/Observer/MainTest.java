package javadesign.pattern.intend.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-17
 * Time: 下午1:23
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    public static void main(String[] args){
        ConcretSubject subject = new ConcretSubject();
        ConcretObserverOne one = new ConcretObserverOne();
        ConcretObserverTwo two = new ConcretObserverTwo();
        ConcretObserverThree  three = new ConcretObserverThree();
        subject.addObserver(one);
        subject.addObserver(two);
        subject.addObserver(three);
        subject.updateStates("hello,world!!!");
    }
}
