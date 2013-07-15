package javadesign.pattern.intend.Commander;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-15
 * Time: 上午10:07
 * To change this template use File | Settings | File Templates.
 */
public class AudoPlayer {

    public void play(){
        System.out.println("Playing!");
    }

    public void stop(){
        System.out.println("Stopping");
    }

    public void rewind(){
        System.out.println("Rewind!");
    }
}
