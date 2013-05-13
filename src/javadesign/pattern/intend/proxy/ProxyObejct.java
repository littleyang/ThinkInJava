package javadesign.pattern.intend.proxy;

public class ProxyObejct implements Common {

	// create an proxy object
	private RealObject object;
	// constructor
	public ProxyObejct(RealObject object) {
		// TODO Auto-generated constructor stub
		this.object = object;
	}
	@Override
	public void saveInfo() {
		// TODO Auto-generated method stub
		System.out.println("Begin: This is the proxy obejct and begin to excute!");
		object.saveInfo();
		System.out.println("After: after the execute!");
	}

}
