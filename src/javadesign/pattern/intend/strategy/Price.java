package javadesign.pattern.intend.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-1
 * Time: 上午11:18
 * To change this template use File | Settings | File Templates.
 */
public class Price  {

    // declare the association with the memberStrategy
    private  MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    /**
     * calculate the book price
     */
   public  double quote(double bookPrice){
       return this.memberStrategy.calcPrice(bookPrice);
   }
}
