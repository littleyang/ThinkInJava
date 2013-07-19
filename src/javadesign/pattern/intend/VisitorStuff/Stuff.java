package javadesign.pattern.intend.VisitorStuff;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-19
 * Time: 下午1:21
 * To change this template use File | Settings | File Templates.
 */
public class Stuff extends Employee {

    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accetp(IVisitor visitor) {
           visitor.visit(this);
    }
}
