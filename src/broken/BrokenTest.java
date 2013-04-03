package broken;

import java.util.concurrent.CyclicBarrier;

public class BrokenTest {

	public static void main(String[] args){
		CyclicBarrier cb = new CyclicBarrier(7, new MainTask());
		new SubTask("A", cb).start();
		new SubTask("B", cb).start();
		new SubTask("C", cb).start();
		new SubTask("D", cb).start();
		new SubTask("E", cb).start();
		new SubTask("F", cb).start();
		new SubTask("G", cb).start();
	}
}
