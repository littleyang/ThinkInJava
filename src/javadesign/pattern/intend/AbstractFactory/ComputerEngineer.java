package javadesign.pattern.intend.AbstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-3
 * Time: 下午1:58
 * To change this template use File | Settings | File Templates.
 */
public class ComputerEngineer {

    // 定义Cpu
    private Cpu  cpu = null;
    // 定义main board
    private MainBoard mainBoard = null;

    public void prepareTheComputer(AbstractFactory factory){
        this.cpu = factory.createCpu();
        this.mainBoard = factory.createMainboard();
        this.cpu.installCpu();
        this.mainBoard.installMainboard();
    }

    public void makeComputer(AbstractFactory factory){
        prepareTheComputer(factory);
    }
}
