package javadesign.pattern.intend.AbstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-3
 * Time: 下午1:40
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    public static void main(String[] args){
        // 定义那个工厂生产
        AbstractFactory factory = new IntelFactory();
        ComputerEngineer ce = new ComputerEngineer();
        ce.makeComputer(factory);
    }
}
