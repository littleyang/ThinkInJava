package javadesign.pattern.intend.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-18
 * Time: 下午1:37
 * To change this template use File | Settings | File Templates.
 */
public class Structure {

    private List<Node> lists = new ArrayList<Node>();

    public void add(Node node){
        lists.add(node);
    }

    public void action(IVisitor visitor){

        for(Node node :lists){
            node.accept(visitor);
        }
    }
}
