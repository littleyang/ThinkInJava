package javadesign.pattern.intend.composites.treeprogram;

/**
 * main test
 * @author jenny
 *
 */
public class MainTest {
	
	public static void main(String[] args){
		// �������ƻ�
		Program one = new Program("������1");
		Program two = new Program("������2");
		Program three = new Program("������3");
		// ���������
		Program  hone = new Program("ٻŮ�Ļ�1");
		Program htwo = new Program("ٻŮ�Ļ�2");
		Program hthree = new Program("ٻŮ�Ļ�3");
		Program tone = new Program("���ν��");
		Program ttwo = new Program("������");
		
		//Ŀ¼����
		// ����Ŀ¼
		CompsiteMoive mone = new CompsiteMoive("����");
		CompsiteMoive mtwo = new CompsiteMoive("����");
		//һ��Ŀ¼
		CompsiteMoive mone1 = new CompsiteMoive("�ƻ�");
		CompsiteMoive mtwo1 = new CompsiteMoive("��");
		// ��Ŀ¼
		CompsiteMoive root = new CompsiteMoive("root");
		// һ��Ŀ¼�������
		mone1.add(ttwo);
		mtwo1.add(tone);
		// ����Ŀ¼�������
		mone.add(hone);
		mone.add(htwo);
		mone.add(hthree);
		mtwo.add(one);
		mtwo.add(two);
		mtwo.add(three);
		//����Ŀ¼�ֱ���ӵ�һ��Ŀ¼
		mone1.add(mone);
		mtwo1.add(mtwo);
		//��Ŀ¼�������
		root.add(mone1);
		root.add(mtwo1);
		root.display();
		
	}

}
