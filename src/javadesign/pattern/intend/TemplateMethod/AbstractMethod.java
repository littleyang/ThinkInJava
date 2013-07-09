package javadesign.pattern.intend.TemplateMethod;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-8
 * Time: 上午9:30
 * To change this template use File | Settings | File Templates.
 * 模板方法模式：通过抽象层把基本方法和顶级逻辑封装之后，基本方法由具体的子类实现
 * 模板方法模式是类的行为模式。准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，
 * 然后声明一些抽象方法来迫使子类实现剩余的逻辑。不同的子类可以以不同的方式实现这些抽象方法，
 * 从而对剩余的逻辑有不同的实现。这就是模板方法模式的用意
 */
public abstract class AbstractMethod {
   protected abstract void methodOne();
   protected abstract void methodTwo();
   protected abstract void methodThree();
   private  final void toLogic(){
       methodOne();
       methodTwo();
       methodThree();
   }
}
