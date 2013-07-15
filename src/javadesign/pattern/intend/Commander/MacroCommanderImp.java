package javadesign.pattern.intend.Commander;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jenny
 * Date: 13-7-15
 * Time: 上午10:26
 * To change this template use File | Settings | File Templates.
 */
public class MacroCommanderImp implements MaroCommander {

    private List<AudoCommander> commanders = new ArrayList<AudoCommander>();

    @Override
    public void addCommand(AudoCommander cmd) {
        //To change body of implemented methods use File | Settings | File Templates.
        commanders.add(cmd);
    }

    @Override
    public void removeCommand(AudoCommander cmd) {
        //To change body of implemented methods use File | Settings | File Templates.
        commanders.remove(cmd);
    }

    @Override
    public void execute() {
        //To change body of implemented methods use File | Settings | File Templates.
        for(AudoCommander cmd : commanders){
            cmd.execute();
        }
    }
}
