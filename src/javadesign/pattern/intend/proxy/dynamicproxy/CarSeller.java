package javadesign.pattern.intend.proxy.dynamicproxy;

/** 
 * 抽象主题（Subject） 
 *  
 * 汽车的销售商 
 * 
 */  
public interface CarSeller {  
      
    /* 
     * 销售汽车 
     */  
    public Object sellCars(int type);  
  
}  