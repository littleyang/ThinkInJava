package javadesign.pattern.intend.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* 
 * 实际提供代理商服务的一个类 
 * （很多地方把这个类称为代理类，个人觉得不准确。 
 * 它是一个会完成动态代理类的实际工作的类。） 
 */  
public class CarProxyInvocationHandler implements InvocationHandler {  
      
    Object carSeller = null;  
      
    public CarProxyInvocationHandler(Object carSeller){  
        this.carSeller = carSeller;  
    }  
      
    /* 
     * 代理角色提供服务的真正方法。 
     * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]) 
     */  
    public Object invoke(Object proxy, Method method, Object[] args){  
        Object result = null;  
          
        try {  
              
            serveBeforeSell();  
            result = method.invoke(carSeller,args);  
            serveAfterSell();  
  
        } catch (Exception e) {  
            System.exit(1);  
        }  
          
//      System.out.println("result:" + result +";" + args[0]);  
          
        return result;  
    }  
      
    protected void serveBeforeSell(){  
        System.out.println("汽车代理商为客户提供了一些售前服务");  
    }  
      
    protected void serveAfterSell(){  
        System.out.println("汽车代理商为客户提供了一些售后服务");  
    }  
  
}  