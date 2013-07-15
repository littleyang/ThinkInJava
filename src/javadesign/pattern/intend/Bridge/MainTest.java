package javadesign.pattern.intend.Bridge;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-10
 * Time: 上午9:58
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {
    public static void main(String[] args){
        BridgeCommonInterface one = new ConcretBridgeOne();
        BridgeCommonInterface two = new ConcretBridgeTwo();
        BridgeCommonInterface three = new ConcretBridgeThree();

        BridgeCommonAbstraction abstractionOne = new AbsMessageOne(one);
        BridgeCommonAbstraction abstractionTwo = new AbsMessageTwo(two);
        BridgeCommonAbstraction abstractionThree = new AbsMessageThree(three);

    }
}
