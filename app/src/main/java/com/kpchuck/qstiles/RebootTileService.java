package com.kpchuck.qstiles;

/**
 * Created by Karol Przestrzelski on 05/09/2017.
 */

public class RebootTileService extends android.service.quicksettings.TileService {

    public void onClick(){

        new ShellHelpOut().runShellCommands(new String[]{"reboot"});
    }
}
