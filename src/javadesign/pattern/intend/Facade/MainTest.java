package javadesign.pattern.intend.Facade;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-4
 * Time: 下午3:28
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    public static void main(String[] args){
        ACompanyFrontGirl aCompanyFrontGirl = new ACompanyFrontGirl();
        aCompanyFrontGirl.findDevelopmentCenter();
        aCompanyFrontGirl.findSalesCenter();
        aCompanyFrontGirl.findServiceCenter();
        aCompanyFrontGirl.findSupportCentet();
    }

}
