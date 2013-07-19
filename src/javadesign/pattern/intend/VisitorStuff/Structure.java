package javadesign.pattern.intend.VisitorStuff;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-19
 * Time: 下午1:59
 * To change this template use File | Settings | File Templates.
 */
public class Structure {
    private List<Employee> stuffLists = new ArrayList<Employee>();

    public void addStuff(Employee employee){
        stuffLists.add(employee);
    }

    public  void reporStuff(Visitor visitor){
        if(stuffLists!=null){
            for (Employee employee : stuffLists){
                employee.accetp(visitor);
            }
        }else{
            System.out.println("This is no any stuffs");
        }
    }
}
