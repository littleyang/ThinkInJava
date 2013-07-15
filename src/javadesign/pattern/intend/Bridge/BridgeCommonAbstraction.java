package javadesign.pattern.intend.Bridge;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-10
 * Time: 上午9:59
 * To change this template use File | Settings | File Templates.
 */
public abstract class BridgeCommonAbstraction {

    private BridgeCommonInterface abstraction;

    protected BridgeCommonAbstraction(BridgeCommonInterface abstraction) {
        this.abstraction = abstraction;

    }

    public void thisIsTheOperationOne(){

    }
}
