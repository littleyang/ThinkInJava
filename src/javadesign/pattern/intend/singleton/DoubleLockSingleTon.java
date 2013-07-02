package javadesign.pattern.intend.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-2
 * Time: 上午10:50
 * 双重枷锁方法解决单例同步问题，提高性能和效率
 * To change this template use File | Settings | File Templates.
 */
public class DoubleLockSingleTon {

    // 定义一个静态单例实例变量
    private   volatile  static DoubleLockSingleTon instance = null;

    // 构造方法
    public DoubleLockSingleTon() {
    }

    // 返回实例方法
    public static DoubleLockSingleTon getInstance(){
        // 所谓双重检查，第一先检查实例是否存在
        if(instance == null){// 如果不存在进入同步方法实例化对象，
            synchronized (DoubleLockSingleTon.class){// 在同步方法中再次检查实例是否存在
                if(instance == null){
                    // 最终进行实例化
                    instance = new DoubleLockSingleTon();
                }
            }

        }
        return instance;
    }
}
