package javadesign.pattern.intend.Visitor;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-18
 * Time: 下午1:25
 * To change this template use File | Settings | File Templates.
 */
public abstract class   Node {

    public abstract void accept(IVisitor visitor);

}
