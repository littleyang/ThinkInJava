package concurrence.lock.readandrwirte;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * this class is test about the read and write lock
 * @author jenny
 *
 */

public class PriceInfo {
	//declare to price info as private and double
	private double priceOne;
	private double priceTwo;
	//declare private ReadAndWrite lock
	private ReadWriteLock lock ;
	/*
	 * implement the constructor method
	 * 
	 */
	public PriceInfo(){
		priceOne = 1.0;
		priceTwo = 2.0;
		lock = new ReentrantReadWriteLock();
	}
	
	/*
	 * read the priceOne price
	 */
	public double getPriceOne(){
		lock.readLock().lock();
		double value = priceOne;
		lock.readLock().unlock();
		return value;
	}
	/*
	 * to get the priceTwo price
	 */
	public double getPriceTwo(){
		lock.readLock().lock();
		double value = priceTwo;
		lock.readLock().unlock();
		return value;
	}
	
	/*
	 * to write priceOne and priceTwo
	 * 
	 */
	public void setPrice(double price1,double price2){
		// get the write lock
		lock.writeLock().lock();
		this.priceOne = price1;
		this.priceTwo = price2;
		lock.writeLock().unlock();
	}
	
}
