package javadesign.pattern.intend.composites.treeprogram;

/**
 * main test
 * @author jenny
 *
 */
public class MainTest {
	
	public static void main(String[] args){
		// 具体对象科幻
		Program one = new Program("钢铁侠1");
		Program two = new Program("钢铁侠2");
		Program three = new Program("钢铁侠3");
		// 具体对象神话
		Program  hone = new Program("倩女幽魂1");
		Program htwo = new Program("倩女幽魂2");
		Program hthree = new Program("倩女幽魂3");
		Program tone = new Program("变形金刚");
		Program ttwo = new Program("少林寺");
		
		//目录对象
		// 二级目录
		CompsiteMoive mone = new CompsiteMoive("国内");
		CompsiteMoive mtwo = new CompsiteMoive("国外");
		//一级目录
		CompsiteMoive mone1 = new CompsiteMoive("科幻");
		CompsiteMoive mtwo1 = new CompsiteMoive("神话");
		// 根目录
		CompsiteMoive root = new CompsiteMoive("root");
		// 一级目录添加内容
		mone1.add(ttwo);
		mtwo1.add(tone);
		// 二级目录添加内容
		mone.add(hone);
		mone.add(htwo);
		mone.add(hthree);
		mtwo.add(one);
		mtwo.add(two);
		mtwo.add(three);
		//二级目录分别添加到一级目录
		mone1.add(mone);
		mtwo1.add(mtwo);
		//根目录添加内容
		root.add(mone1);
		root.add(mtwo1);
		root.display();
		
	}

}
