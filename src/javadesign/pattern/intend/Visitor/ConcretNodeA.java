package javadesign.pattern.intend.Visitor;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-18
 * Time: 下午1:26
 * To change this template use File | Settings | File Templates.
 */
public class ConcretNodeA extends  Node {
    @Override
    public void accept(IVisitor visitor) {
        //To change body of implemented methods use File | Settings | File Templates.
        visitor.visit(this);
    }
     public void operationA(){
         System.out.print("This is Node A");
     }
}
