package javadesign.pattern.intend.Observer;

import java.util.ArrayList;
import  java.util.List;
/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-17
 * Time: 下午2:00
 * To change this template use File | Settings | File Templates.
 */
public abstract class ObserverSubject {

    private List<InterfaceObserver> observers = new ArrayList<InterfaceObserver>();

    protected void addObserver(InterfaceObserver observer){
        this.observers.add(observer);
    }

    protected void deleteObserver(InterfaceObserver observer){
         this.observers.remove(observer);
    }

    public void notifyObervers(String message){
        for(InterfaceObserver observer : observers){
            observer.update(message);
        }
    }
}
