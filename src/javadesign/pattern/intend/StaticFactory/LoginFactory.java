package javadesign.pattern.intend.StaticFactory;

import java.util.List;
import java.lang.Class;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-3
 * Time: 上午11:14
 * To change this template use File | Settings | File Templates.
 */
public class LoginFactory {
    public static CommonInterface createLogin(String type){
        if(type.equals("form")){
            return new FormLogin();
        }else if(type.equals("sso")){
            return new SsoLogin();
        }else if(type.equals("service")){
            return new WebServiceLogin();
        }else{
            throw new RuntimeException("login exception!");
        }
    }

    public static CommonInterface createAnyLogin(Class c){

        CommonInterface login = null;
        try{
            login = (CommonInterface)Class.forName(c.getName()).newInstance() ;
        }catch (Exception e){
            e.printStackTrace();
        }
        return login;

    }

    /**
     * 创建任意的登录login实例
     * @return
     */
    public static CommonInterface anyLogin(){
        List<Class> loginList = ClassUtils.getAllClassByInterface(CommonInterface.class);
        Random random = new Random();
        int rand = random.nextInt(loginList.size());
        return createAnyLogin(loginList.get(rand));
    }
}
