package javadesign.pattern.intend.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-17
 * Time: 下午2:01
 * To change this template use File | Settings | File Templates.
 */
public class ConcretSubject extends ObserverSubject {

    public void updateStates(String context){
        System.out.println("the new message is : " + context);
        this.notifyObervers(context);
        System.out.println("notify the observers  all!");
    }
}
