package javadesign.pattern.intend.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-1
 * Time: 上午11:18
 * 策略的目的是为了选择，选择最适合的方法或者是对象来完成既定的目标和工作
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    public static  void main(String[] args){
        // declare an strategy instance
        MemberStrategy advanceMember = new AdvanceMember();
        // initialize the respondent price
        Price price = new Price(advanceMember);
        // calculate the price
        System.out.println("total price: " + price.quote(300));

    }

}
