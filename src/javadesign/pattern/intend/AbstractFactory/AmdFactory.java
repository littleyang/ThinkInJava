package javadesign.pattern.intend.AbstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-3
 * Time: 下午1:41
 * To change this template use File | Settings | File Templates.
 */
public class AmdFactory extends AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public MainBoard createMainboard() {
        return new IntelMainboard();
    }
}
