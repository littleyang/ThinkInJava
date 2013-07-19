package javadesign.pattern.intend.VisitorStuff;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-19
 * Time: 下午1:21
 * To change this template use File | Settings | File Templates.
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(Stuff stuff) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println(this.getStuffInfo(stuff));
    }

    @Override
    public void visit(Manager manager) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBasicInfo(Employee employee){
        String info = "name: " +employee.getName()+"\t";
        info = info +"Sex: " +(employee.getSex()==Employee.FEMALE?"FEMALE":"MALE")+"\t";
        info = info + "salary: "+employee.getSalary()+"\t";
        return info;
    }

    public String getManagerInfo(Manager manager){
         String info = this.getBasicInfo(manager);
        info = info + "performace: "+manager.getPerformance();
        return  info;
    }

    public  String getStuffInfo(Stuff stuff){

        String info = this.getBasicInfo(stuff);
        info = info + "job: " + stuff.getJob();
        return info;
    }
}
