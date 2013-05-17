package javadesgin.pattern.iinterface.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * the observer pattern:
 *  A certain object observed by other object(Observer). when the subject object'status 
 *  changes,notify all observers and they change own status that is respondent to subject
 *  maybe there are many observer so,the subject should has an array to store the observers
 *   
 * @author jenny
 *
 */
public abstract class AbsSubject {

	// an array to store the observer
	private List<InterfObserver> observerList = new ArrayList<InterfObserver>();
	
	/*
	 * 添加观察者对象
	 */
	public void addObserver(InterfObserver observer){
		// add observer
		observerList.add(observer);
	}
	
	/*
	 * remove observer
	 */
	public void removeObserver(InterfObserver observer){
		observerList.remove(observer);
	}
	
	/*
	 * notify all observers
	 */
	public void notifyAllObservers(String state){
		
		for(InterfObserver observer : observerList){
			observer.updateStatus(state);
		}
	}
	
}
