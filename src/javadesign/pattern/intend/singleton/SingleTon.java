package javadesign.pattern.intend.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-2
 * 用最简单的普通的同步方式实现单例的同步，这是一种饥饿式的同步方式，没有优化，效率极低，一个在使用，其他必须等待
 * Time: 上午10:31
 * To change this template use File | Settings | File Templates.
 */
public class SingleTon{
    private  static final SingleTon sinleTon = new SingleTon();

    /*
     */
    public SingleTon() {
    }

    private  synchronized static  SingleTon getSinleTon(){
        return sinleTon;
    }
}
