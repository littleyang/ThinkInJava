package javadesign.pattern.intend.AbstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-3
 * Time: 下午1:39
 * To change this template use File | Settings | File Templates.
 */
 public abstract class AbstractFactory {

    // 创建cpu方法
    public abstract Cpu createCpu();
    // 创建主板方法
    public abstract MainBoard createMainboard();


}
