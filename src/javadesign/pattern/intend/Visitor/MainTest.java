package javadesign.pattern.intend.Visitor;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-18
 * Time: 下午1:23
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    public static void main(){
        Structure st = new Structure();
        st.add(new ConcretNodeA());
        st.add(new ConcretNodeB());
        IVisitor visitor = new ConcretVisitorA();
        IVisitor visitor1 = new ConcretVisitorB();
        st.action(visitor);
        st.action(visitor1);

    }
}
