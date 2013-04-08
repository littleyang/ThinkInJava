package concurrence.multiple.task.first.result;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainTest {

	public static void main(String[] args) {
		String username = "test";
		String password = "test";
		UserValidate ldapValidator = new UserValidate("LDAP");
		UserValidate dbValidator = new UserValidate("DataBase");
		ValidateTask ldapTask = new ValidateTask(ldapValidator, username,password);
		ValidateTask dbTask = new ValidateTask(dbValidator, username, password);
		List<ValidateTask> taskList = new ArrayList<>();
		taskList.add(ldapTask);
		taskList.add(dbTask);
		ExecutorService executor = (ExecutorService) Executors.newCachedThreadPool();
		String result;
		try {
			result = executor.invokeAny(taskList);
			System.out.printf("Main: Result: %s\n", result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		executor.shutdown();
		System.out.printf("Main: End of the Execution\n");

	}

}
