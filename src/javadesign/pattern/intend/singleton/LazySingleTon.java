package javadesign.pattern.intend.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-2
 * Time: 上午10:37
 * 用比较笨的方法实现单例的同步，效率上会有影响
 * To change this template use File | Settings | File Templates.
 */
public class LazySingleTon {

    // 首先申明一个空的实例对象
    private static LazySingleTon instance = null;

    // 构造方法
    public LazySingleTon() {
    }

    // 使用线程同步返回实例化对象
    public static synchronized LazySingleTon getInstance(){

        //判断单例对象是否为空
        if(instance == null){
            // 如果对象为空，则实例化一个对象
            instance = new LazySingleTon();
        }
        return instance;
    }
}
