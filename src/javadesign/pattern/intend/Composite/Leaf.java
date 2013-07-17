package javadesign.pattern.intend.Composite;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-16
 * Time: 上午11:57
 * To change this template use File | Settings | File Templates.
 */
public class Leaf extends Component{

    private String name;

    public Leaf(String name) {
        this.name = name;
    }


    @Override
    public void printStack(String str) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println(str + " "+ this.name);
    }
}
