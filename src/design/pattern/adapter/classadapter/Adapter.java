package design.pattern.adapter.classadapter;

/**
 * object adapter will call Existing class'method do some thing in Target class 
 * @author jenny
 *
 */

public class Adapter extends TargetClass  {
	
	// create a instance for Existing class
	
	@Override
	public void doSomeThing(){
		System.out.println("this is the obejct adapter mode,call Exist class in target class to to do some work");
		ExistingClass exist = new ExistingClass();
		exist.doExistClassMethod();
	}

}
