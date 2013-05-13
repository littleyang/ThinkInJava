package javadesign.pattern.intend.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/** 
 * �ͻ��˵��� 
 */  
public class Customer {  
  
    public static void main(String[] args) {  
  
//      ������ʵ�������  
        CarSeller carSeller = new AudiCarFactory();  
  
//      ͨ����̬�ķ�ʽ���õ��������Ĵ����ɫ����  
//      ������ʱ����ʵ������󣬴����ɫ�Լ�ʵ����ɴ���������౻���������ˡ�  
        CarSeller carProxy = (CarSeller) Proxy.newProxyInstance(carSeller.getClass()  
                .getClassLoader(), carSeller.getClass().getInterfaces(),  
                new CarProxyInvocationHandler(carSeller));  
          
//      �ɴ�������������  
        Object car = carProxy.sellCars(2);  
        System.out.println("�˿ʹӴ�������������һ��" + car);  
          
    }  
  
}  