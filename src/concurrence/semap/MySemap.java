package concurrence.semap;

import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-5
 * Time: 下午4:41
 * To change this template use File | Settings | File Templates.
 */
public class MySemap implements Runnable {
    private Semaphore semaphore;
    private int id;

    public MySemap(Semaphore semaphore,int i) {
        this.semaphore = semaphore;
        this.id = i;
    }

    @Override
    public void run() {
        //To change body of implemented methods use File | Settings | File Templates.
        try {
            if(semaphore.availablePermits()>0){
                System.out.println("availiable for:  " +id);
            }else{
                 System.out.println("Not available for:  "+id);
            }
            semaphore.acquire();
            System.out.println(id +" is running!!");
            Thread.sleep(10000);
            System.out.println(id +" is finshed!!!");
            semaphore.release();
        }   catch (Exception e){
            e.printStackTrace();
        }
    }
}
