package javadesign.pattern.intend.VisitorStuff;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-19
 * Time: 下午1:20
 * To change this template use File | Settings | File Templates.
 */
public interface IVisitor {

    public void visit(Stuff stuff);

    public void visit(Manager manager);

}
