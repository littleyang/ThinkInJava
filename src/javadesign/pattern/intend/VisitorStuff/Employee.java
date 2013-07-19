package javadesign.pattern.intend.VisitorStuff;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-19
 * Time: 下午1:20
 * To change this template use File | Settings | File Templates.
 */
public abstract class Employee {

    public final static int MALE = 0;
    public final static int FEMALE =1;
    private String name;
    public  int salary;
    private int sex;

    public int getSex() {
        return sex;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSex(int sex) {

        this.sex = sex;
    }

    public String getName() {

        return name;
    }

    public abstract void accetp(IVisitor visitor);

}
