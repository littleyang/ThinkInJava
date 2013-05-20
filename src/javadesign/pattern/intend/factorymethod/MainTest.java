package javadesign.pattern.intend.factorymethod;

public class MainTest {

	public static void main(String[] args){
		
		// create an factory
		Factory factory = new FactoryMethod();
	
		Cup cup1 = factory.make("Բ��", "��ɫ");//��Ҫһ��Բ�Σ���ɫ�ı���   
        System.out.println("���������");  
        System.out.println("��״��"+cup1.getShape());  
        System.out.println("��ɫ��"+cup1.getColor());  
          
        Cup cup2 = factory.make("����", "��ɫ");//��Ҫһ�����Σ���ɫ�ı���   
        System.out.println("���������");  
        System.out.println("��״��"+cup2.getShape());  
        System.out.println("��ɫ��"+cup2.getColor()); 
		
	}

}
