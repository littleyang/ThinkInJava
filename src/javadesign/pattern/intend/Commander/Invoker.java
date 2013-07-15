package javadesign.pattern.intend.Commander;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-15
 * Time: 上午10:13
 * To change this template use File | Settings | File Templates.
 */
public class Invoker{

    private  PlayCommand playCommand;
    private  StopCommander stopCommander;
    private RewindCommander rewindCommander;


    public void setRewindCommander(RewindCommander rewindCommander) {
        this.rewindCommander = rewindCommander;
    }

    public void setStopCommander(StopCommander stopCommander) {
        this.stopCommander = stopCommander;

    }

    public void setPlayCommand(PlayCommand playCommand) {

        this.playCommand = playCommand;
    }

    public  void play(){
        playCommand.execute();
    }

    public void rewind(){
        rewindCommander.execute();
    }

    public void stop(){
        stopCommander.execute();
    }

}
