package javadesign.pattern.intend.Commander;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-15
 * Time: 上午10:06
 * To change this template use File | Settings | File Templates.
 */
public class StopCommander implements AudoCommander {

    AudoPlayer audoPlayer;

    public StopCommander(AudoPlayer audoPlayer) {
        this.audoPlayer = audoPlayer;
    }

    @Override
    public void execute() {
        //To change body of implemented methods use File | Settings | File Templates.
        audoPlayer.stop();

    }
}
