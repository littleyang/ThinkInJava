package javadesign.pattern.intend.Visitor;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-18
 * Time: 下午1:24
 * To change this template use File | Settings | File Templates.
 */
public interface IVisitor {

    public void visit(ConcretNodeA node);

    // override
    public void visit(ConcretNodeB node);


}
