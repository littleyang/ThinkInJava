package javadesign.pattern.intend.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-2
 * Time: 上午11:00
 * 用累不静态类的方式实现单例。
 * 多线程缺省同步锁的知识
 * 1.由静态初始化器（在静态字段上或static{}块中的初始化器）初始化数据时
 * 2.访问final字段时
 * 3.在创建线程之前创建对象时
 * 4.线程可以看见它将要处理的对象时
 * 5.类级内部类以及对象及内部类：类级：有static修饰,即是静态内部类,对象级:无static修饰
 * To change this template use File | Settings | File Templates.
 */
public class InnerClassSingleton {

    // 构造方法
    public InnerClassSingleton() {
    }

    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */

    private static  class SingletonHolder{
        // 静态化构造器方法，由jvm实现同步
        private  static InnerClassSingleton instance = new InnerClassSingleton();
    }

    /**
     * 获取单例方法
     */
    public static InnerClassSingleton getInstance(){
      return  SingletonHolder.instance;
    }
}
