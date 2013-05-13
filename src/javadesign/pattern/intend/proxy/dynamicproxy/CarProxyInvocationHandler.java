package javadesign.pattern.intend.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* 
 * ʵ���ṩ�����̷����һ���� 
 * ���ܶ�ط���������Ϊ�����࣬���˾��ò�׼ȷ�� 
 * ����һ������ɶ�̬�������ʵ�ʹ������ࡣ�� 
 */  
public class CarProxyInvocationHandler implements InvocationHandler {  
      
    Object carSeller = null;  
      
    public CarProxyInvocationHandler(Object carSeller){  
        this.carSeller = carSeller;  
    }  
      
    /* 
     * �����ɫ�ṩ��������������� 
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
        System.out.println("����������Ϊ�ͻ��ṩ��һЩ��ǰ����");  
    }  
      
    protected void serveAfterSell(){  
        System.out.println("����������Ϊ�ͻ��ṩ��һЩ�ۺ����");  
    }  
  
}  