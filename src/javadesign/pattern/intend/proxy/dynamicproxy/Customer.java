package javadesign.pattern.intend.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/** 
 * 客户端调用 
 */  
public class Customer {  
  
    public static void main(String[] args) {  
  
//      创建真实主题对象  
        CarSeller carSeller = new AudiCarFactory();  
  
//      通过动态的方式，得到了真正的代理角色对象。  
//      在运行时，真实主题对象，代理角色以及实际完成代理操作的类被关联起来了。  
        CarSeller carProxy = (CarSeller) Proxy.newProxyInstance(carSeller.getClass()  
                .getClassLoader(), carSeller.getClass().getInterfaces(),  
                new CarProxyInvocationHandler(carSeller));  
          
//      由代理商销售汽车  
        Object car = carProxy.sellCars(2);  
        System.out.println("顾客从代理商那里买了一辆" + car);  
          
    }  
  
}  