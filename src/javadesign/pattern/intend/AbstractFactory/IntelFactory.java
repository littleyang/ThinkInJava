package javadesign.pattern.intend.AbstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-3
 * Time: 下午1:40
 * To change this template use File | Settings | File Templates.
 */
public class IntelFactory extends AbstractFactory {
    @Override
    public MainBoard createMainboard() {
        return new IntelMainboard();
    }

    @Override
    public Cpu createCpu() {
        return  new IntelCpu();
    }
}
