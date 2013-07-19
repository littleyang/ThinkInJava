package javadesign.pattern.intend.Visitor;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-18
 * Time: 下午1:24
 * To change this template use File | Settings | File Templates.
 */
public class ConcretVisitorA implements IVisitor{
    @Override
    public void visit(ConcretNodeA node) {
        //To change body of implemented methods use File | Settings | File Templates.
        node.operationA();
    }

    @Override
    public void visit(ConcretNodeB node) {
        //To change body of implemented methods use File | Settings | File Templates.
        node.operationB();
    }
}
