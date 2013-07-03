package javadesign.pattern.intend.StaticFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-3
 * Time: 上午10:31
 * 这个测试时为了实现静态工厂方法模式，也称谓简单工厂方法模式。
 * 很简单，就是把创建对象的方法申明为静态方法即可。
 * 工厂模式： 工厂的目的就是为了生产出对象和产品，即是创造对象，bean。spring中大量运用了工厂模式。根据具体不同的要求创建不同的对象。
 * 这个与策略模式相当的相似。只是一个是做出最优方法决策，一个是根据具体需要创建对象。
 * 比如说登录验证模块：一个系统的登录，1)、可以是直接的表单登录.2)、可以是SSO,单点登录.3)、可以是web service的验证登录。
 * 那么工厂方法具体就要根据具体的标志来确定创建什么样子的登录对象，执行登录功能。
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {
    public static void main(String[] args){
        String type = "sso";
        CommonInterface login = LoginFactory.createLogin(type);
        login.login();

       CommonInterface anyLogin = LoginFactory.anyLogin();
        anyLogin.login();
    }
}
