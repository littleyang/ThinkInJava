package javadesign.pattern.intend.Builder;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-8
 * Time: 下午3:04
 * To change this template use File | Settings | File Templates.
 */
public class Director {
    private BuilderInterface goodBuilder;
    private BuilderInterface welcomeBuilder;

    public Director(){
         this.goodBuilder = new GoodbyeBuilder();
         this.welcomeBuilder = new WelcomeBuilder();
    }
    public void construct(){

    }
}
