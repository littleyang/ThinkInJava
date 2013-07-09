package javadesign.pattern.intend.AbstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-3
 * Time: 下午1:43
 * To change this template use File | Settings | File Templates.
 */
public class AmdCpu implements Cpu {
    @Override
    public void installCpu() {
        System.out.println("this is amd cpu!!");
    }
}
