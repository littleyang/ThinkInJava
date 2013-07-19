package javadesign.pattern.intend.VisitorStuff;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-19
 * Time: 下午1:21
 * To change this template use File | Settings | File Templates.
 */
public class Manager extends Employee {

    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accetp(IVisitor visitor) {
        visitor.visit(this);
    }
}
