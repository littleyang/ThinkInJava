package javadesign.pattern.intend.proxy.dynamicproxy;

/** 
 * ��ʵ����(Real Subject)��ɫ 
 * ���������
 * 
 */  
public class AudiCarFactory implements CarSeller {  
  
    /* 
     * ʵ���˳������⣨Subject����ɫ�ķ��� 
     */  
    public Object sellCars(int type) {  
        System.out.println("�µϹ�������������");  
        if(type == 1){  
            return "AudiA6";  
        }else{  
            return "AudiA8";  
        }  
    }  
}  
