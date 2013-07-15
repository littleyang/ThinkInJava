package javadesign.pattern.intend.Commander;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-15
 * Time: 上午10:25
 * To change this template use File | Settings | File Templates.
 */
public interface MaroCommander extends AudoCommander {

    public  void addCommand(AudoCommander cmd);

    public  void removeCommand(AudoCommander cmd);

}
