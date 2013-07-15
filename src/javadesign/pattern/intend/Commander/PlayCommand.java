package javadesign.pattern.intend.Commander;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-15
 * Time: 上午10:06
 * To change this template use File | Settings | File Templates.
 */
public class PlayCommand implements AudoCommander {


    AudoPlayer player;

    public PlayCommand(AudoPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        //To change body of implemented methods use File | Settings |
        player.play();
    }
}
