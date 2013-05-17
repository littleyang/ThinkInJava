package javadesign.pattern.intend.proxy.dynamicproxy;

/** 
 * 真实对象(Real Subject)角色 
 * 被代理对象
 * 
 */  
public class AudiCarFactory implements CarSeller {  
  
    /* 
     * 实现了抽象主题（Subject）角色的方法 
     */  
    public Object sellCars(int type) {  
        System.out.println("奥迪工厂出售汽车。");  
        if(type == 1){  
            return "AudiA6";  
        }else{  
            return "AudiA8";  
        }  
    }  
}  
