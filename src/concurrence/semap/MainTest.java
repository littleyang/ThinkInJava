package concurrence.semap;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-5
 * Time: 下午4:41
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {

    public static void main(String[] args){
       ExecutorService service = Executors.newCachedThreadPool();

       Semaphore semaphore = new Semaphore(2);

       for(int i =0;i<10;i++){
           service.submit(new MySemap(semaphore,i+1));
       }

       service.shutdown();

       semaphore.acquireUninterruptibly();
       System.out.println("释放信号量！");
       semaphore.release();


    }
}
