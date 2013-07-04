package javadesign.pattern.intend.factorymethod;

/**
 * factory method pattern:
 * StaticFactory Method Pattern�ڸ���涨����Ĵ�������������û�����뵽�Ͼ��������
 * ���о�����������ݶ���������
 * @author jenny
 *
 */
public abstract class Factory {

	public final Cup make(String shape,String color){
		Cup cup = makeCup(shape);
		smearColor(cup,color);
		return cup;
	}
	 //���󷽷�������ˮ����shape����ָ��ˮ��������  
	protected abstract Cup makeCup(String shape);
	 //���󷽷�����ˮ��Ϳ����ɫ 
    protected abstract void smearColor(Cup cup,String color); 
}
