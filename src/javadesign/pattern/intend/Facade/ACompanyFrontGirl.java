package javadesign.pattern.intend.Facade;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-4
 * Time: 下午3:29
 * To change this template use File | Settings | File Templates.
 */
public class ACompanyFrontGirl implements FrontFunction {
    @Override
    public void findDevelopmentCenter() {
        //To change body of implemented methods use File | Settings | File Templates.
        DevelopmentCenter developmentCenter = new DevelopmentCenter();
        developmentCenter.someBodyDoSomething();
    }

    @Override
    public void findSalesCenter() {
        //To change body of implemented methods use File | Settings | File Templates.
        SaleCenter saleCenter = new SaleCenter();
        saleCenter.doSomeThing();

    }

    @Override
    public void findServiceCenter() {
        //To change body of implemented methods use File | Settings | File Templates.
        ServiceCenter serviceCenter = new ServiceCenter();
        serviceCenter.doSomeThing();
    }

    @Override
    public void findSupportCentet() {
        //To change body of implemented methods use File | Settings | File Templates.
        SupportCenter supportCenter = new SupportCenter();
        supportCenter.doSomeThing();
    }
}
