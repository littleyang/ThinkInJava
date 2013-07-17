package javadesign.pattern.intend.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-16
 * Time: 上午11:57
 * To change this template use File | Settings | File Templates.
 */
public class Composite extends Component {

    private List<Component> list = new ArrayList<Component>();

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public void addChild(Component child){

        list.add(child);

    }

    public void removeChild(int index){

        list.remove(index) ;
    }

    public List<Component> getInfo(){
             return list;
    }

    @Override
    public void printStack(String str) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("This is the composite pattern!!!");
        System.out.println(str+"+"+this.name);
        if(list != null){
            str = str + "  ";
            for(Component c : list){
                c.printStack(str);
            }
        }
    }
}
