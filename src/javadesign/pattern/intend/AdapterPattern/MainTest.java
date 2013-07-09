package javadesign.pattern.intend.AdapterPattern;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-4
 * Time: 下午2:35
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {
    public static void main(String[] args){
        System.out.println("This is the class adapter: ");
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.doTargetMethod();

        System.out.println("This is the Object adapter");
        ObjectAdapter objectAdapter = new ObjectAdapter();
        objectAdapter.doTargetMethod();
    }
}
