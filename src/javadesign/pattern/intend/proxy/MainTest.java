package javadesign.pattern.intend.proxy;

public class MainTest {
	
	public static void main(String[] args){
		// test
		RealObject rObject = new RealObject();
		// proxy
		ProxyObejct pObejct = new ProxyObejct(rObject);
		
		pObejct.saveInfo();
	}

}
