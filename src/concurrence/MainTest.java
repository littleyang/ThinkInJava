package concurrence;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread.State;

public class MainTest {

	// main test method
	public static void main(String[] args) {

		// define the thread array
		Thread[] threads = new Thread[10];
		Thread.State[] status = new Thread.State[10];

		for (int i = 0; i < 10; i++) {
			// 创建10新进程，装进threads数组里面
			threads[i] = new Thread(new ImplementThreadAndGetInfo(i));
			// 根据特定的条件设置现线程的优先级，priority
			if (i % 2 == 0) {
				threads[i].setPriority(Thread.MAX_PRIORITY);
			} else {
				threads[i].setPriority(Thread.NORM_PRIORITY);
			}
			threads[i].setName("thread" + i);

		}

			// define the log file
			FileWriter fw = null;
			try {
				fw = new FileWriter("./log.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PrintWriter pw = new PrintWriter(fw);
			// write the thread info loop
			for (int i = 0; i < 10; i++) {
				pw.println("Main : Status of Thread " + i + " : "
						+ threads[i].getState());
				status[i] = threads[i].getState();
			}

			// start the thread

			for (int i = 0; i < 10; i++) {
				threads[i].start();
			}
			//until teen thread end ,else check and log the status 
			boolean finish = false;
			while (!finish) {
				for (int i = 0; i < 10; i++) {
					if (threads[i].getState() != status[i]) {
						writeThreadInfo(pw, threads[i], status[i]);
						status[i] = threads[i].getState();
					}
				}
				finish = true;
				for (int i = 0; i < 10; i++) {
					finish = finish && (threads[i].getState() == State.TERMINATED);
				}
			}
	}

	// define the output info method
	public static void writeThreadInfo(PrintWriter pw, Thread thread,
			State state) {
		pw.printf("Main : Id %d - %s\n", thread.getId(), thread.getName());
		pw.printf("Main : Priority: %d\n", thread.getPriority());
		pw.printf("Main : Old State: %s\n", state);
		pw.printf("Main : New State: %s\n", thread.getState());
		pw.printf("Main : ************************************\n");
	}

}
